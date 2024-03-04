import java.util.Scanner;


public class SimpleAgenda {
    private static String[] contactos = new String[10];

    public static void main(String[] args) {
        agregarContacto();
        removerContacto();
        mostrarContactos();
    }

    public static void agregarContacto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un contacto a agregar");
        String nuevoContacto = sc.next();

        if (existeContacto(nuevoContacto)) {
            System.out.println("Ya se ha agregado anteriormente.");
        } else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] == null) {
                    contactos[i] = nuevoContacto;
                    System.out.println("Agregado satisfactoriamente.");
                    break;
                }
            }
        }
    }

    public static void removerContacto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un contacto a remover");
        String contactoRemover = sc.next();

        if (existeContacto(contactoRemover)) {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null && contactos[i].equals(contactoRemover)) {
                    contactos[i] = null;
                    System.out.println("El contacto " + contactoRemover + " fue removido exitosamente!");
                    break;
                }
            }
        } else {
            System.out.println("No existe tal contacto.");
        }
    }

    public static void mostrarContacto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un contacto a mostrar");
        String contactoMostrar = sc.next();

        if (existeContacto(contactoMostrar)) {
            System.out.println("El contacto " + contactoMostrar + ".");
        } else {
            System.out.println("No existen registros de este contacto.");
        }
    }

    public static void mostrarContactos() {
        System.out.println("Mostrando contactos...");

        for (String contacto : contactos) {
            if (contacto != null) {
                System.out.println(contacto);
            }
        }
    }

    private static boolean existeContacto(String contacto) {
        for (String c : contactos) {
            if (c != null && c.equals(contacto)) {
                return true;
            }
        }
        return false;
    }
}
