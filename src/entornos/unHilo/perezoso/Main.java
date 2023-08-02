package entornos.unHilo.perezoso;

public class Main {

    public static void main(String[] args) {

        // generamos la instancia de un nuevo objeto de tipo lazySingleton
        LazySingleton lazySingleton = LazySingleton.getInstance();

        // imprimimos el hashcode del objeto lazySingleton (el codigo «hash» es único para cada objeto)
        System.out.println("Codigo hash lazySingleton " + lazySingleton.hashCode());
    }
}
