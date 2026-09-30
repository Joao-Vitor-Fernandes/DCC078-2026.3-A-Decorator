package padroesestruturais.decorator;

public class ServidorBasico implements ServicoCloud {

    public float precoBase;

    public ServidorBasico() {
    }

    public ServidorBasico(float precoBase) {
        this.precoBase = precoBase;
    }

    public float getPreco() {
        return precoBase;
    }

    public String getDescricao() {
        return "Servidor Básico";
    }
}
