package padroesestruturais.decorator;

public class MemoriaExtra implements ServicoCloudDecorator{

    public MemoriaExtra(ServicoCloud servico) {
        super(servico);
    }

    public float getPercentualAcrescimo() {
        return 20.0f;
    }

    public String getNomeRecurso() {
        return "Memória Extra";
    }
}
