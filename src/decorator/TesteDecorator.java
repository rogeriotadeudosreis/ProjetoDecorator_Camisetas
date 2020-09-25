package decorator;

import modelos_concretos.CamisetaStandart;
import modelos_concretos.CamisetaPersonalizada;
import modelos_concretos.CamisetaEstampada;

public class TesteDecorator {

    public static void main(String[] args) {

        CamisetaStandart camiseta = new CamisetaStandart();
        CamisetaEstampada estampada = new CamisetaEstampada(new CamisetaStandart());
        CamisetaPersonalizada customizada = new CamisetaPersonalizada(camiseta);

        System.out.println(camiseta);
        System.out.println(estampada);
        System.out.println(customizada);

    }

}
