package coo.tdd.exercicio.um.classes.categorias;

import coo.tdd.exercicio.um.classes.veiculos.VeiculoMovidoACombustao;
import coo.tdd.exercicio.um.enums.Estado;

public class Carro extends VeiculoMovidoACombustao{

    // @Override
    public void acelerar() {
        if (tanqueDeCombustivelNaoEstiverVazio()) {
			aumenteAVelocidade();
		} else {
			System.out.println("Carro sem combustivel. Nao pode acelerar.\nCombustivel: " + this.litrosCombustivel);
		}
        
    }
    
    // @Override
    public void frear() {
        if (calculoDeFrearNaoResultarEmValorNegativo()) {
            diminuaAVelocidade();
        } else {
            pareOCarro();
        }
        
    }

    private void aumenteAVelocidade() {
        this.velocidade += Estado.ACELERACAO_CARRO.getEstado();
    }

    private boolean tanqueDeCombustivelNaoEstiverVazio() {
        return this.litrosCombustivel > Estado.MINIMO_DE_COMBUSTIVEL.getEstado();
    }

    private void pareOCarro() {
        this.velocidade = Estado.PARADO.getEstado();
    }

    private void diminuaAVelocidade() {
        this.velocidade -= Estado.ACELERACAO_CARRO.getEstado();
    }

    private boolean calculoDeFrearNaoResultarEmValorNegativo() {
        return (this.velocidade - Estado.ACELERACAO_CARRO.getEstado()) >= Estado.PARADO.getEstado();
    }
}
