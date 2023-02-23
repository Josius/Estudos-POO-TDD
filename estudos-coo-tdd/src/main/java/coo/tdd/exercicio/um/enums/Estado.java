package coo.tdd.exercicio.um.enums;

public enum Estado {

    MINIMO_DE_COMBUSTIVEL(0), MAXIMO_DE_COMBUSTIVEL(60), PARADO(0), ACELERACAO_CARRO(20), ACELERACAO_MOTO(20), ACELERACAO_BICICLETA(20);

    private int estado;

    Estado(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }
}
