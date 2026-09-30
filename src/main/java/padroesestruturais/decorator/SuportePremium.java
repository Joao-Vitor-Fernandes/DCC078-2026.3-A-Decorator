package padroesestruturais.decorator;

public class SuportePremium implements ServicoCloudDecorator {

    public SuportePremium(ServicoCloud servico) {
        super(servico);
    }

    public float getPercentualAcrescimo() {
        return 15.0f;
    }

    public String getNomeRecurso() {
        return "Suporte Premium";
    }
}
