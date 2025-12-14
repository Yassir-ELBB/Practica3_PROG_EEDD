package Ejercicio2;
import java.util.Random;
import Ejercicio3.trampa;
public class Area {

    private String area;
    private String bioma;
    private int nivel;

    public Area(){
        area = "??";
        bioma = "Pradera";
        nivel = 1;
    }



    public int getNivel() {
        return nivel;
    }

    public String getArea() {
        return area;
    }

    public String getBioma() {
        return bioma;
    }


    public void setArea(String ponerArea) {
        if (ponerArea.equals("") || ponerArea.equals("_")) {
            System.err.println("Error. El nombre de Area no es correcto");
        } else System.out.println("Tu Area es : " + ponerArea);
    }

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
                if (subida2 == 0.8) {
                    System.out.println("Se te restan 10 puntos de vida");

                } else System.out.println("Felicidades se te aumenta la vida en un total de 20 puntos de vida");
                break;
            default:
                System.err.println("POrfavor introduzca un bioma valido");
        }
            return subida;

    }







}
