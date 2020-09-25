package modelos_concretos;

import decorator.DecoratorDeCamiseta;
import interface_prod.I_Camiseta;

public class CamisetaEstampada extends DecoratorDeCamiseta {

    protected double precoEstampa = 20.0;

    public CamisetaEstampada(I_Camiseta produto) {
        super(produto);
    }

    public double getPrecoEstampa() {
        return this.precoEstampa;
    }

    @Override
    public String tipoDeCamiseta() {
        return this.produto.tipoDeCamiseta() + ", no valor de R$: " + produto.precoDaCamiseta()
                + "\n+ Estampa"
                + ", no valor de R$: " + this.precoEstampa + "\n";
    }

    @Override
    public double precoDaCamiseta() {
        return this.produto.precoDaCamiseta() + this.getPrecoEstampa();
    }

    @Override
    public String toString() {
        return "Camiseta do Tipo: " + this.tipoDeCamiseta()
                + "\nPreço Total R$: " + this.precoDaCamiseta();
    }

}
