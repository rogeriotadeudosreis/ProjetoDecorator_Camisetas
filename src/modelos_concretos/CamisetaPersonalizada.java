
package modelos_concretos;

import interface_camiseta.I_Camiseta;
import decorator.DecoratorDeCamiseta;

public class CamisetaPersonalizada extends DecoratorDeCamiseta{
    
     protected double precoPersonalizado = 30.0;
    
    public CamisetaPersonalizada(I_Camiseta produto) {
        super(produto);
    }

    public double getPrecoPersonalizado() {
        return this.precoPersonalizado;
    }

   @Override
    public String tipoDeCamiseta() {
        return this.produto.tipoDeCamiseta() + ", no valor de R$: " + produto.precoDaCamiseta()
                + "\n+ Personalização"
                + ", no valor de R$: " + this.precoPersonalizado + "\n";
    }

    @Override
    public double precoDaCamiseta() {
        return this.produto.precoDaCamiseta() + this.getPrecoPersonalizado();
    }

    @Override
    public String toString() {
        return "Camiseta do Tipo: " + this.tipoDeCamiseta()
                + "\nPreço Total R$: " + this.precoDaCamiseta();
    }
}
