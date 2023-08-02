package entornos.unHilo.impaciente;

public class Main {

    public static void main(String[] args) {

        // imprimimos el hashcode del objeto EagleSingleton (el codigo «hash» es único para cada objeto)
        System.out.println("Codigo hash EagleSingleton " + EagleSingleton.getInstance().hashCode());
    }
}
