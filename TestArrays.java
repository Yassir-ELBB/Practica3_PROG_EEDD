/**
 * Clase TestArrays, donde se practican diferentes tipos de ejercicios a cerca del Array.
 * @author yassirelbadribenjelloun
 * @version 1.0
 */
public class TestArray {

        private int[] array; /* Array que almacena valores de numeros enteros. */

    /**
     * Tamano inicial del Array.
     */
        private int tamano;

    /**
     *Constructor que inicializa el Array a 5 por defecto.
     */
        public TestArray() {
        }

    /**
     * Gueter que devuelve tamano del Array
      * @return tamano del Array
     */
        public int getTamano() {
            return tamano;
        }

    /**
     * Seter con un entero tamano que inicializa un tamano
      * @param tamano
     */

        public void setTamano(int tamano) {
            this.tamano = tamano;
        }

    /**
     * Metodo que inicializa o resetea el Array
      */
        public void inicializarArray() {
        }

    /**
     *Metodo que muestra por pantalla el Array
      */
         public void mostrarArray() {
         }

    /**
     * Metodo que devuelve el numero en la posicion -1
     * @param posicion posicion del numero dentro del array
     * @return numero en la posicion del Array -1
     */
        public int recuperarElemento(int posicion) {
            return -1;
        }

    /**
     * Metodo que anade un elemento al final del Array
     * @param elemento que se va a anadir al final del array
     */
        public void anadirElemento(int elemento) {
        }

    /**
     * Metodo que elimina el ultimo elemento del Array
     */
        public void eliminarUltimo() {
        }

    /**
     * Metodo que anade un numero introducido primero, a la posicion del Array introducida a continuacion de este
     * @param elemento que se va a anadir al array
     * @param posicion donde se va a guardar el elemento insertado
     */
        public void anadir(int elemento, int posicion) {
        }

    /**
     * Metodo que elimina la primera primera ocurrencia del elemento obtenido mediante el parametro int elemento
      * @param elemento que se va a eliminar su primera ocurrencia
     */
        public void eliminarElemento(int elemento) {
        }

    /**
     * Metodo que elimina el elemento ubicado en la posicion obtenida mediante el parametro int posicion
     * @param posicion donde se almacena el elemento a eliminar
     */
        public void eliminarPosicion(int posicion) {
        }

    /**
     *Metodo que elimina todas la ocurrencias del elemento introducido por parametros
     * @param elemento del que se va a eliminar todas las ocurrencias
     */
        public void eliminarElementoTotal(int elemento) {
        }

    /**
     * Metodo que ordena los Array en funcion de un criterio especifico
     */
    public void ordenar() {
        }
}
