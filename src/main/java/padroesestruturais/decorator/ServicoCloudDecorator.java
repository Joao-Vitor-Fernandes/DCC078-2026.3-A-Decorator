package padroesestruturais.decorator;

public abstract class ServicoCloudDecorator implements ServicoCloud {

    private ServicoCloud servico;
    public String descricao;

    public ServicoCloudDecorator(ServicoCloud servico) {
        this.servico = servico;
    }

    public ServicoCloud getServico() {
        return servico;
    }

    public void setServico(ServicoCloud servico) {
        this.servico = servico;
    }

    public abstract float getPercentualAcrescimo();

    public float getPreco() {
        return this.servico.getPreco() * (1 + (this.getPercentualAcrescimo() / 100));
    }

    public abstract String getNomeRecurso();

    public String getDescricao() {
        return this.servico.getDescricao() + " + " + this.getNomeRecurso();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
