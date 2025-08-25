package test;

import org.junit.Test;
import service.ReservaService;

import java.sql.Connection;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class ReservaServiceTest {

    // ===== Teste de valor total =====
    @Test
    public void testCalcularValorTotal() {
        ReservaService s = new ReservaService((Connection) null, null);

        // 5 dias * 200 = 1000
        assertEquals(1000.0, s.calcularValorTotal(
                LocalDate.of(2025, 1, 10),
                LocalDate.of(2025, 1, 15),
                200.0), 0.01);

        // 1 dia * 150 = 150
        assertEquals(150.0, s.calcularValorTotal(
                LocalDate.of(2025, 2, 1),
                LocalDate.of(2025, 2, 2),
                150.0), 0.01);
    }

    // ===== Teste de CPF (formato) =====
    @Test
    public void testValidarCpfFormato() {
        assertTrue(validarCpf("123.456.789-00"));
        assertFalse(validarCpf("12345678900"));
        assertFalse(validarCpf("abc.def.ghi-jk"));
        assertFalse(validarCpf(null));
    }

    private boolean validarCpf(String cpf) {
        return cpf != null && cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    }

    // ===== Teste de nome =====
    @Test
    public void testValidarNome() {
        assertFalse(validarNome(null));
        assertFalse(validarNome(""));
        assertFalse(validarNome("   "));
        assertTrue(validarNome("Luis Felipe"));
    }

    private boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    // ===== Teste de telefone =====
    @Test
    public void testValidarTelefone() {
        assertTrue(validarTelefone("1234-5678"));
        assertFalse(validarTelefone("12345678"));
        assertFalse(validarTelefone("abcd-efgh"));
        assertFalse(validarTelefone(null));
    }

    private boolean validarTelefone(String telefone) {
        return telefone != null && telefone.matches("\\d{4}-\\d{4}");
    }

    // ===== Teste de check-in =====
    @Test
    public void testCheckInPassado() {
        LocalDate ontem = LocalDate.now().minusDays(1);
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = LocalDate.now().plusDays(1);

        assertFalse(validarCheckIn(ontem));
        assertTrue(validarCheckIn(hoje));
        assertTrue(validarCheckIn(amanha));
    }

    private boolean validarCheckIn(LocalDate checkIn) {
        return checkIn != null && !checkIn.isBefore(LocalDate.now());
    }

    // ===== Teste de check-out anterior ao check-in =====
    @Test
    public void testCheckOutAntesCheckIn() {
        LocalDate checkIn = LocalDate.now().plusDays(2);
        LocalDate checkOut = LocalDate.now().plusDays(1); // anterior ao check-in
        LocalDate checkOutValido = LocalDate.now().plusDays(5); // posterior ao check-in

        assertFalse(validarCheckOut(checkIn, checkOut));
        assertTrue(validarCheckOut(checkIn, checkOutValido));
    }

    private boolean validarCheckOut(LocalDate checkIn, LocalDate checkOut) {
        return checkOut != null && checkOut.isAfter(checkIn);
    }
}
