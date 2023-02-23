package coo.tdd.exercicio.dois.enums;

public enum ImpostoDeProduto {

    IMPOSTO_10(0.1), IMPOSTO_25(0.25), IMPOSTO_45(0.45);

    private double valor;

    ImpostoDeProduto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
