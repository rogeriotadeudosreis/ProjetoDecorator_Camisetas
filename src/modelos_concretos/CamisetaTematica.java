package modelos_concretos;

import decorator.DecoratorDeCamiseta;
import interface_camiseta.I_Camiseta;

/**
 *
 * @author roger
 */
public class CamisetaTematica extends DecoratorDeCamiseta{
    
    protected double precoTematico = 50.0;
    
    public CamisetaTematica(I_Camiseta produto) {
        super(produto);
    }

    public double getPrecoTematico() {
        return this.precoTematico;
    }

   @Override
    public String tipoDeCamiseta() {
        return this.produto.tipoDeCamiseta() + ", no valor de R$: " + produto.precoDaCamiseta()
                + "\n+ Tema Especial"
                + ", no valor de R$: " + this.precoTematico + "\n";
    }

    @Override
    public double precoDaCamiseta() {
        return this.produto.precoDaCamiseta() + this.getPrecoTematico();
    }

    @Override
    public String toString() {
        return "Camiseta do Tipo: " + this.tipoDeCamiseta()
                + "\nPreço Total R$: " + this.precoDaCamiseta();
    }
    
    
}
