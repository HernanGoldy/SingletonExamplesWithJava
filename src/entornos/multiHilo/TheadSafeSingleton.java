package entornos.multiHilo;

/*
Thread safe: Hilo seguro
TODO: en el caso de «sistemas multihilos», puede darse el siguiente problema:
 Cuando dos hilos se encuentran comprobando (al mismo tiempo) si existe la instancia creada por primera vez, podría ocurrir que tengan instancias distintas.
 En este caso debemos hacer que solo un hilo (a la vez) tenga acceso al código. Para ello usamos la palabra clave synchronized.
 */

public class TheadSafeSingleton {

    // atributo estático de tipo TheadSafeSingleton
    private static TheadSafeSingleton instance; // no la inicializamos aquí sino en el cuerpo del método getInstance()

    // constructor vacío
    private TheadSafeSingleton() { }

    public static synchronized TheadSafeSingleton getInstance() { // synchronized evita que varios hilos tengan acceso a la vez

        // ponemos aquí la lógica de creación
        if (instance == null) { // si es null
            instance = new TheadSafeSingleton();
        }
        return instance; // si no es null
    }
}
