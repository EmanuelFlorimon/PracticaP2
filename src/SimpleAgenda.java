import java.util.Scanner;

public class SimpleAgenda {
    public static void main(String[] args) {
        //agregarContacto();
        removerContacto(5);
    }
        public static void agregarContacto() {
            String contacts;
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese un contacto a agregar");
            contacts = sc.next();

            if (contacts.length() >= 4 && contacts.length() <= 8) {
                System.out.println("Contacto agregado con éxito");
            } else if (contacts.length() > 8 && contacts.length() <= 30) {
                System.out.println("Agregado, contiene entre 8-30 caracteres");
            } else {
                System.out.println("Nombre muy largo");
            }
        }

        public static void removerContacto(int id) {
            if (id >= 1000 && id <= 9999) {
                System.out.println("Verificando contacto a eliminar...");
            } else {
                System.out.println("ID inválido");
            }

        }

        public static String actualizarContacto(int a) {
            return "N/A";
        }

        public static void mostrarContactos() {
            System.out.println("Mostrando contactos...");

        }

}
