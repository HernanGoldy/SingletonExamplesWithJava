package entornos.unHilo.impaciente;

/*
Eagle: impaciente, ansioso.
TODO: Singleton de llamada «inicialización impaciente».
 El problema que surge en este caso es que se crea la instancia aunque la aplicación no lo necesite en ese momento.
 */

public class EagleSingleton {

    // atributo estático de tipo EagleSingleton
    private static EagleSingleton instance = new EagleSingleton(); // se instanciará al momento de creación de la clase

    // constructor vacío
    private EagleSingleton() {}

    // devolvemos la instancia de nuestra clase EagleSingleton
    public static EagleSingleton getInstance() {

        return instance;
    }
}
