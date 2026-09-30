package padroesestruturais.decorator;

public class ArmazenamentoExtra extends ServicoCloudDecorator {

    public ArmazenamentoExtra(ServicoCloud servico) {
        super(servico);
    }

    public float getPercentualAcrescimo() {
        return 10.0f;
    }

    public String getNomeRecurso() {
        return "Armazenamento Extra";
    }
}
