/*
Author: Guilherme Rangel
 */

public class Application {

    public static void main (String[] args){
        Automovel automovel = new Automovel();
        automovel.setIdade(12);
        automovel.setMarca("Ford");
        automovel.setPlaca("POW1234");
        automovel.setVelocidade(40);

        automovel.acelerar(automovel.getVelocidade());
    }
}
