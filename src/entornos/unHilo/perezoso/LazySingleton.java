package entornos.unHilo.perezoso;

/*
Lazy: perezoso.
TODO: Singleton de «carga perezosa»
 Aquí instanciamos la clase, la primera vez que se necesita.
 Es decir, no se crea si no la invocamos explícitamente en el cuerpo del método getInstance().
 */

public class LazySingleton {

    // atributo estático de tipo LazySingleton
    private static LazySingleton instance; // no inicializamos en esta línea sino en el cuerpo del método getInstance()

    // constructor vacío
    private LazySingleton() {}

    public static LazySingleton getInstance() {

        // ponemos aquí la lógica de creación
        if (instance == null) { // si es null
            instance = new LazySingleton();
        }
        return instance; // si no es null
    }
}
