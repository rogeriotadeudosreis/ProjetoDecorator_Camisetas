/*
Segundo criamos uma classe concreta implementando a interface produto
herdando seus métodos getNome() e getPreco()
 */
package modelos_concretos;

import interface_camiseta.I_Camiseta;

public class CamisetaStandart implements I_Camiseta {

    private String tipo = "";
    private double preco = 0.0;

    public CamisetaStandart() {
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String tipoDeCamiseta() {
        return this.tipo;
    }

    @Override
    public double precoDaCamiseta() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "Camiseta Tipo: " + this.tipoDeCamiseta() + ""
                + "\nPreco R$: " + this.precoDaCamiseta();
    }

}
