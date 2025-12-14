package Ejercicio2;
import java.util.Random;
import Ejercicio3.trampa;

/**
 * Clase Area
 * En esta clase se crea la zona donde se va a desarrollar el juego donde se cuenta con un area de juego, un Bioma y un nivel
 * representados por los atributos de String area, String bioma y int nivel.
 * @author Yassir El Badri Benjelloun
 * @version 1.0
 */

public class Area {

    private String area;
    private String bioma;
    private int nivel;

    /**
     *Costructor por defecto que pone valores por defecto como area a ??, bioma a pradera y nivel a 1.
     */

    public Area(){
        area = "??";
        bioma = "Pradera";
        nivel = 1;
    }


    /**
     * Gueter que devuelve el nivel del area.
     * @return nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Gueter que devuelve el area.
     * @return area
     */

    public String getArea() {
        return area;
    }

    /**
     * Gueter que devuelve el nombre del bioma.
     * @return bioma
     */

    public String getBioma() {
        return bioma;
    }

    /**
     *Seter que establece restricciones a la hora de poner el nombre del Area
     * Restricciones: El nombre no puede estar vacio ni tampoco tener espacios.
     * @param ponerArea
     */

    public void setArea(String ponerArea) {
        if (ponerArea.equals("") || ponerArea.equals(" ")) {
            System.err.println("Error. El nombre de Area no es correcto");
        } else System.out.println("Tu Area es : " + ponerArea);
    }

    /**
     * Seter que establece el tipo de Bioma entre las diferentes opciones: Pradera, jungla, Desierto, Montaña, Mazmorra
     * @param ponerBioma
     */

    public void setBioma(String ponerBioma) {

        switch (ponerBioma) {
            case "Pradera":
                System.out.println("Has elegido Pradera");
                break;
            case "Jungla":
                System.out.println("Has elegido Jungla");
                break;
            case "Desierto":
                System.out.println("Has elegido Desierto");
                break;
            case "Montaña":
                System.out.println("Has elegido Montaña");
                break;
            case "Mazmorra":
                System.out.println("Has elegido Mazmorra");
                break;

            default:
                System.err.println("Por favor seleccione un bioma correcto");
        }
    }

    /**
     * Método asignarNivel encargado de asignar un nivel en funcion del tipo de bioma elejido.
     * @param AsignadoNivel
     */

    public void asignarNivel(String AsignadoNivel) {
        switch (AsignadoNivel) {
            case "Pradera":
                System.out.println("La Pradera tiene un nivel entre 1 y 10.");
                break;
            case "Jungla":
                System.out.println("La Jungla tiene un nivel entre 11 y 30.");
                break;
            case "Desierto":
                System.out.println("El Desierto tiene un nivel entre 31 y 60");
                break;
            case "Montaña":
                System.out.println("La Montaña tiene un nivel entre 61 y 90.");
                break;
            case "Mazmorra":
                System.out.println("La Mazmorra tiene un nivel entre 91 y 105.");
                break;
            default:
                System.err.println("Introduzca un bioma valido");
        }

    }

    /**
     * Método generarPcion que establece una subida en función del bioma.
     * El bioma Pradera tiene una subida de 15 puntos de vida.
     * El bioma Jungla sube una cantidad aleatoria entre 10 y 15 puntos de vida.
     * El bioma Desierto sube una cantidad aleatoria entre 1 y 30 puntos de vida.
     * El bioma Montaña sube una cantidad de 30 puntos de vida.
     * El bioma Mazmorra da una probabilidad del 20% a que se resten 10 puntos de vida o 80% a que se aumenten 20.
     * @param Pocionbioma
     * @return subida
     */

    public int generarPocion(String Pocionbioma) {
        int subida = 0;
        Random randomsubida = new Random();
        switch (Pocionbioma) {
            case "Pradera":
                 subida = 15;
                break;

            case "Jungla":
                subida = randomsubida.nextInt(10) + 15;
                break;

            case "Desierto":
                subida = randomsubida.nextInt(30) + 1;
                break;

            case "Montaña":
                 subida = 30;
                break;

            case "Mazmorra":
                int subida2 = 0;
                Random randomsubida2 = new Random();
                subida2 = randomsubida2.nextInt();
                if (subida2 == 0.2) {
                    System.out.println("Se te restan 10 puntos de vida");

                } else System.out.println("Felicidades se te aumenta la vida en un total de 20 puntos de vida");
                break;
            default:
                System.err.println("POrfavor introduzca un bioma valido");
        }
            return subida;

    }

}
