package Ejercicio4;

import Ejercicio1.Personaje;

/**
 * Clase Combate
 * En esta clase se crean e inicializan los personajes C1 y C2 mediante los atributos de la clase Personaje
 * @author yassirelbadribenjelloun
 * @version 1.0
 */
public class Combate {
    private  Personaje C1;
    private  Personaje C2;

    /**
     * Constuctor por defecto que inicializa los personajes C1 y C2
     * @see Personaje
     */

    public Combate(){
        C1 = new Personaje();
        C2 = new Personaje();
    }

    /**
     * Establece los atributos del personaje C1
     * @param nombre (Nombre del personaje C1)
     * @param pv1 (Puntos de vida del personaje C1)
     * @param niv1 (Puntos de Nivel del perosnaje C1)
     * @param def1 (Puntos de Defensa del personaje C1)
     * @param atq1 (Puntos de Ataque del personaje C1)
     * @param niv1 (Puntos de Nivel del personaje C1)
     */

    public void C1(String nombre, int pv1,int niv1, int def1,int atq1 ) {
        C1.setNombre(nombre);
        C1.setpv(pv1);
        C1.setatq(atq1);
        C1.setdef(def1);
        C1.setNivel(niv1);

    }

    /**
     * Establece los atributos del personaje C2
     * @param nombre2 (Nombre del personaje C2)
     * @param pv2 (Puntos de vida del personaje C2)
     * @param niv2 (Puntos de Nivel del perosnaje C2)
     * @param def2 (Puntos de Defensa del personaje C2)
     * @param atq2 (Puntos de Ataque del personaje C1)
     * @param niv2 (Puntos de Nivel del personaje C2)
     */

    public void C2(String nombre2,int pv2,int niv2, int def2,int atq2 ) {
        C2.setNombre(nombre2);
        C2.setpv(pv2);
        C2.setatq(atq2);
        C2.setdef(def2);
        C2.setNivel(niv2);


    }

}
