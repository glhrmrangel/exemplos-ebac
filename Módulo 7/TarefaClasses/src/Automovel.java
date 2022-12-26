/*
Author: Guilherme Rangel
 */

public class Automovel {

    private int idade;
    private String marca;
    private int velocidade;
    private String placa;

    public int getIdade() {
        return idade;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public int acelerar(int velocidade){
        velocidade = velocidade * 3;
        return velocidade;
    }

    public int desacelerar(int velocidade){
        velocidade = velocidade/2;
        return velocidade;
    }
}
