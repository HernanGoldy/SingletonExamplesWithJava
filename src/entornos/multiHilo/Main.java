package entornos.multiHilo;

public class Main {

    public static void main(String[] args) {

        // Creamos dos hilos: thread1 y thread2
        // Esto generaría dos instancias (objetos) diferentes, algo que el patrón Singleton no debe permitir.
        // Para evitar esto debemos utilizar synchronized en el método getInstance().
        Thread thread1 = new Thread(new Runnable() {
            // sobreescribimos el método run
            @Override
            public void run() {
                // generamos la instancia de un nuevo objeto de tipo threadSafeSingleton1
                TheadSafeSingleton threadSafeSingleton1 = TheadSafeSingleton.getInstance();
                // imprimimos el hashcode del objeto threadSafeSingleton1 (el codigo «hash» es único para cada objeto)
                System.out.println("Codigo hash " + threadSafeSingleton1.hashCode());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            // sobreescribimos el método run
            @Override
            public void run() {
                // generamos la instancia de un nuevo objeto de tipo threadSafeSingleton2
                TheadSafeSingleton threadSafeSingleton2 = TheadSafeSingleton.getInstance();
                // imprimimos el hashcode del objeto threadSafeSingleton2 (el codigo «hash» es único para cada objeto)
                System.out.println("Codigo hash " + threadSafeSingleton2.hashCode());
            }
        });

        thread1.start();
        thread2.start();
    }
}
