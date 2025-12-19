package Ejercicio1;

import Ejercicio3.trampa;
import java.util.Random;

/**
 * Clase Personajes donde se usan los atributos de Sting nombre, pv (Puntos de Vida), atq (Puntos de Ataque), def (Puntos de Defensa), nivel (Puntos de Nivel)
 * para la creación y definición de un personaje.
 * @author YassirElBadriBenjelloun
 * @version 1.0
 */


public class Personaje {
    private String nombre; /** atributo de tipo String que almacena el nombre del personaje. */
    private int pv; /** atributo de tipo int que almacena los puntos de vida del personaje. */
    private int atq;  /** atributo de tipo int que almacena los puntos de ataque del personaje. */
    private int def;  /** atributo de tipo int que almacena los puntos de defensa del personaje. */
    private int nivel;  /** atributo de tipo int que almacena los puntos de nivel del personaje. */

    /**
     * Constructor por defecto que pone todos los valores a 0 o vacío
     */

    public Personaje(){
        pv = 0;
        atq = 0;
        def = 0;
        nivel = 0;
        nombre = "";
    }


    /**
     * Gueter donde su función es devolver el nombre del personaje
     * @return nombre
     */

    public String getNombre(){
        return nombre;
    }

    /**
     * Gueter donde su función es devolver los pv del personaje
     * @return nombre
     */

    public int getpv(){
        return pv;
    }

    /**
     * Gueter donde su función es devolver el atq del personaje
     * @return nombre
     */

    public int getAtq(){
        return atq;
    }

    /**
     * Gueter donde su función es devolver la def del personaje
     * @return nombre
     */

    public int getdef(){
        return def;
    }

    /**
     * Gueter donde su función es devolver el nivel del personaje
     * @return nombre
     */

    public int getNivel(){
        return nivel;
    }

    /**
     * Seter que se encarga de establecer restricciones a la hora de establecer en nombre del personaje.
     * Restricciones: El nombre no puede estar vacio, No permite que el nombre contenga los caracteres GM ni tampoco el numero 2.
     * @param n
     */

    public void setNombre(String n){
        if( n.equals("") || n.equals("GM") || n.equals("2") ){
            System.err.println("Error. El nombre no es correcto");
        }else System.out.println("Hola: "+n+", Bienvenido");
    }

    /**
     * Seter encargado de establecer restricciones a la hora de indicar los Puntos de Vida.
     * Restricciones: Puntos de vida no pueden ser inferior a 0.
     * @param puntosVida
     */

    public void setpv(int puntosVida){
        if (puntosVida < 0){
            System.err.println("Error. Pv no puede ser menor de cero");
        }else{
            pv = puntosVida;
            System.out.println("Tienes: "+pv+" Puntos de vida");
        }

    }

    /**
     * Seter encargado de establecer restricciones a la hora de indicar los Puntos de Ataque.
     * Restricciones: Puntos Atq no puede ser menor a 0.
     * @param puntosAtq
     */

    public void setatq(int puntosAtq){
        if(puntosAtq < 0){
            System.err.println("Error. EL atque no puede ser menor que cero");
        }else{
            atq = puntosAtq;
            System.out.println("Tienes: "+atq+" Puntos de ataque");
        }

    }

    /**
     * Seter encargado de establecer restricciones a la hora de indicar los Puntos de Defensa.
     * Restricciones: Puntos de Def no puede ser menos a 0.
     * @param puntosDef
     */

    public void setdef(int puntosDef){
        if(puntosDef < 0){
            System.err.println("Error. La defensa no puede ser menor que 0");
        }else{
            def = puntosDef;
            System.out.println("Tienes: "+def+" Puntos de defensa");
        }

    }

    /**
     * Seter encargado de establecer restricciones a la hora de indicar los Puntos de Nivel.
     * Restricciones: Puntos de Nivel no puede ser menor a 1 ni mayor a 100.
     * @param puntosNivel
     */

    public void nivel(int puntosNivel){
        if(puntosNivel < 1 || nivel > 100){
            System.err.println("Error. El nivel no es correcto");
        }else{
            nivel = puntosNivel;
            System.out.println("Tu nivel es de: "+nivel);
        }
    }

    /**
     * Método beberPocion que al ejecutarse este incrementa los putntos de vida del personaje.
     * Los puntos de vida extra aumentados dependen del valor de Pocion (int pocion).
     * @param pocion
     */

    public void beberPocion(int pocion){
       if(pv < 30){
       pv += pocion;
           System.out.println("Has bebido la pocion, ahora tienes: "+ pv +" puntos de vida");
       }else System.err.println("No puedes beber la pocion ya que tu vida es mayor de 30 puntos");
    }

    /**
     * Método Inspirar que al ejecutarse incrementa el atq (Puntos de Ataque) o def (Puntos de Defensa) en función de
     * lo que se ha puesto en el atributo de tipo (String tipo) y una cantida concreta indicada en el atributo cantidad (int cantidad)
     * @param cantidad
     * @param tipo
     */

    public void inspirar(int cantidad, String tipo) {
        if (tipo == "atq") {
        atq += cantidad;
            System.out.println("Has aumentado: "+tipo+" En una cantidad de: "+cantidad+" puntos, ahora tienes: "+atq+" Puntos de defensa");
        } else if (tipo == "def") {
        def += cantidad;
            System.out.println("Has aumentado: "+tipo+" En una cantidad de: "+cantidad+" puntos, ahora tienes: "+def+" Puntos de defensa");
        } else {
            System.err.println("Error. No es correcto, elija entre atq o def");
        }
    }

    /**
     * Método subirnivel que al ejecutarse este sube un punto extra a los atributos de pv, atq o def de forma aleatoria.
     */

    public void subirnivel(){
        Random r = new Random();
        int aleatorio;
        aleatorio = r.nextInt(3) ;

        if(aleatorio == 1){
            pv++;
            System.out.println("Felicidades, tienes un punto de vida extra, ahora tienes: "+ pv);
        } else if (aleatorio == 2) {
            atq++;
            System.out.println("Felicidades, tienes un punto de ataque extra, ahora tienes: "+ atq);
        } else{
            def++;
            System.out.println("Felicidades, tienes un punto de defensa extra, ahora tienes: "+ def );
        }

    }

    /**
     * Método estaMuerto que al ejecutarse indica si el personaje esta vivo o muerto en funcion de su pv (Puntos de Vida)
     */

    public void estaMuerto() {
            if(pv < 0){
                System.out.println("Analizando tu vida se determina que estas muerto");
            }else System.out.println("Analizando tu vida se determina que sigues vivo");

    }

    /**
     *Método caerTrampa que al ejecutarse junto a la clase trampa, al ejecutarse el método activarTrampa de la clase trampa
     * determina si el jugador cae en ella o no, todo de forma aleatoria.
     * Este método tambien contiene el tipo (String Tipo) que indica el tipo de trampa y Quita (int Quita) que indica
     * la cantidad de vida que se le resta a los puntos de vida del jugador mediante el perjuicio.
     * @param t
     * @see trampa
     */

    public void caerTrampa(trampa t){

        boolean AC = t.activarTrampa();
        String Tipo = t.getCategoria();
        int Quita = t.getPerjuicio();


        if (AC == true){
            switch (Tipo){
                case "Pinchos":
                    System.out.println("Estacas afiladas salen de la superficie cercana y atraviesan a: "+nombre+" por un prejuicio de: "+Quita+" puntos de daño");
                    pv -= Quita;
                    break;
                case "Brea":
                    System.out.println("Aceite biscoso le cae de pronto a: "+nombre+" impidiendo que se mueva con libertad, por un prejuicio de: "+Quita+" puntos de daño");
                    def -= Quita;
                    break;
                case "Serpientes":
                    System.out.println("Un nido de viboras y culebras aparecen frente a: "+nombre+" La vision es tan terrorifica que pierde las ganas de continuar , por un prejuicio de: "+Quita+" puntos de daño");
                    atq -= Quita;
                    break;

            }

        }else System.out.println("Felicidades, "+nombre+" !escapaste indemne¡");


    }


}
