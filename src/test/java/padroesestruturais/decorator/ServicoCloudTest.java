package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoCloudTest {

    @Test
    void deveRetornarPrecoServidorBasico() {
        ServicoCloud servico = new ServidorBasico(100.0f);
        assertEquals(100.0f, servico.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoComArmazenamentoExtra() {
        ServicoCloud servico = new ArmazenamentoExtra(new ServidorBasico(100.0f));
        assertEquals(110.0f, servico.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoComMemoriaExtra() {
        ServicoCloud servico = new MemoriaExtra(new ServidorBasico(100.0f));
        assertEquals(120.0f, servico.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoComSuportePremium() {
        ServicoCloud servico = new SuportePremium(new ServidorBasico(100.0f));
        assertEquals(115.0f, servico.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoComArmazenamentoEMemoria() {
        ServicoCloud servico = new ArmazenamentoExtra(new MemoriaExtra(new ServidorBasico(100.0f)));
        assertEquals(132.0f, servico.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoComArmazenamentoESuporte() {
        ServicoCloud servico = new ArmazenamentoExtra(new SuportePremium(new ServidorBasico(100.0f)));
        assertEquals(126.5f, servico.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoComMemoriaESuporte() {
        ServicoCloud servico = new MemoriaExtra(new SuportePremium(new ServidorBasico(100.0f)));
        assertEquals(138.0f, servico.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoComTodosOsRecursos() {
        ServicoCloud servico = new ArmazenamentoExtra(new MemoriaExtra(new SuportePremium(new ServidorBasico(100.0f))));
        assertEquals(151.8f, servico.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoServidorBasico() {
        ServicoCloud servico = new ServidorBasico();
        assertEquals("Servidor Básico", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComArmazenamentoExtra() {
        ServicoCloud servico = new ArmazenamentoExtra(new ServidorBasico());
        assertEquals("Servidor Básico + Armazenamento Extra", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComMemoriaExtra() {
        ServicoCloud servico = new MemoriaExtra(new ServidorBasico());
        assertEquals("Servidor Básico + Memória Extra", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComSuportePremium() {
        ServicoCloud servico = new SuportePremium(new ServidorBasico());
        assertEquals("Servidor Básico + Suporte Premium", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComArmazenamentoEMemoria() {
        ServicoCloud servico = new ArmazenamentoExtra(new MemoriaExtra(new ServidorBasico()));
        assertEquals("Servidor Básico + Memória Extra + Armazenamento Extra", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComArmazenamentoESuporte() {
        ServicoCloud servico = new ArmazenamentoExtra(new SuportePremium(new ServidorBasico()));
        assertEquals("Servidor Básico + Suporte Premium + Armazenamento Extra", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComMemoriaESuporte() {
        ServicoCloud servico = new MemoriaExtra(new SuportePremium(new ServidorBasico()));
        assertEquals("Servidor Básico + Suporte Premium + Memória Extra", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComTodosOsRecursos() {
        ServicoCloud servico = new ArmazenamentoExtra(new MemoriaExtra(new SuportePremium(new ServidorBasico())));
        assertEquals("Servidor Básico + Suporte Premium + Memória Extra + Armazenamento Extra", servico.getDescricao());
    }
}
