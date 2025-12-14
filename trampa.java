package Ejercicio3;

import java.util.Random;

/**
 * Clase trampa
 * En esta clase se establecen las diferentes trampas, perjuicio y categoria de estas donde puede caer el jugador.
 * @author yassirelbadribenjelloun
 * @version 1
 */

public class trampa {
    private String categoria;
    private int perjuicio;
    private double fracaso;

    /**
     * Constructor por defecto que inicializa la categoria a vacia, perjuicio a 0 y fracaso a 0.
     */

    public trampa(){
        categoria = "";
        perjuicio = 0;
        fracaso = 0;
    }

    /**
     * Getter que devuelve la catgoría de la trampa.
     * @return categoria
     */

    public String getCategoria(){
        return categoria;
    }

    /**
     * Getter que devuelve el perjuicio de la trampa.
     * @return perjuicio
     */

    public int getPerjuicio() {
        return perjuicio;
    }

    /**
     * Getter que devuleve la probabilidad de fracaso.
     * @return fracaso
     */

    public double getFracaso() {
        return fracaso;
    }

    /**
     * Seter que establece la categoría de la trampa entre las opciones de: Pinchos, Brea y Serpientes.
     * @param Pcategoria
     */

    public void setCategoria(String Pcategoria) {
        switch (Pcategoria){
            case "Pinchos":
                System.out.println("La categoria de trampa es: Pinchos");
                break;
            case "Brea":
                System.out.println("La categoria de la trampa es: Brea");
                break;
            case "Serpientes":
                System.out.println("La categoria de la trampa es: Serpientes");
                break;

            default:
                System.err.println("Elije un tipo de trampa correcto");
        }
            categoria = Pcategoria;
    }

    /**
     * Seter que establece restricciones a la hora de indicar la cantidad de perjuicio
     * Restricciones: El perjuicio no puede ser menor de 5 ni mayor a 20.
     * @param Cperjuicio
     */

    public void setPerjuicio(int Cperjuicio) {
        if(Cperjuicio < 5 || Cperjuicio > 20){
            System.err.println("Por favor elija un valor entre 5 y 20");
        } else System.out.println("Tu prejuicio es de: "+Cperjuicio);
        perjuicio = Cperjuicio;
    }

    /**
     * Método fracaso calcula la probabilidad de que la trampa fracase de forma aleatoria.
     * @param Pfracaso
     */

    public void Fracaso(double Pfracaso) {
        Random f = new Random();
        double random;
        random = (f.nextDouble()*0.75)*100;
        System.out.println("La probabilidad de que la trampa fracase es de: "+ random+" %");

        fracaso = random;

    }

    /**
     * Método que activa la trampa de forma aleatoria y devolviendo si se ha caido en ella o no.
     * @return caido
     */

    public boolean activarTrampa(){
        double AT;
        Random T = new Random();
        AT = (T.nextDouble())*100;
        boolean caido;
        if(fracaso > AT){
            caido = true;

        }else caido = false;


        if(caido == true){
            System.out.println("Felicidades, te has salvado de caer en la trampa, la probabilidad de caer esta de: "+AT+" %");
        }else System.err.println("Has caido en la trampa, con un porcentaje de: "+ AT +" % y con un perjuicio de: "+perjuicio);

        return caido;
    }
}
