import java.util.Scanner;
import java.util.HashMap;

public class SeleccionDeCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> carros = new HashMap<>();
        carros.put("1", "Sedan");
        carros.put("2", "SUV");
        carros.put("3", "Camioneta");

        boolean seguir = true;
        while (seguir) {
            System.out.println("Seleccione el tipo de carro:");
            for (String opcion : carros.keySet()) {
                System.out.println(opcion + ". " + carros.get(opcion));
            }
            System.out.print("Ingrese el número de opción (o 0 para salir): ");
            int opcion = scanner.nextInt();
            if (opcion == 0) {
                seguir = false;
            } else if (carros.containsKey(String.valueOf(opcion))) {
                System.out.println("Usted ha seleccionado: " + carros.get(String.valueOf(opcion)));
            } else {
                System.out.println("Opción inválida.");
            }
        }
    }
}