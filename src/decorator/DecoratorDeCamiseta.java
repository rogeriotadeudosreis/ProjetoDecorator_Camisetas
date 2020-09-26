
package decorator;

import interface_prod.I_Camiseta;

public class DecoratorDeCamiseta implements I_Camiseta {
    
   protected I_Camiseta produto;
    
    public DecoratorDeCamiseta (I_Camiseta produto){
             this.produto = produto;   
    }

     @Override
    public String tipoDeCamiseta() {
        return this.produto.tipoDeCamiseta();
    }

    @Override
    public double precoDaCamiseta() {
        return this.produto.precoDaCamiseta();
    }
    
}
