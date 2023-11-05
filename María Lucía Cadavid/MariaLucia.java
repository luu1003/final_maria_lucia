import java.util.Scanner;
import java.io.*;

public class MariaLucia {
  public static void MejorHora(String[][] valor) {
    double MaximoHorasV = Double.MIN_VALUE;

    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < valor[i].length; j++) {
        if (valor[i][j] != null) {
          String[] parts = valor[i][j].split(";");
          if (parts.length >= 5) {
            try {
              double valorHoras = Double.parseDouble(parts[4]);
              if (valorHoras > MaximoHorasV) {
                MaximoHorasV = valorHoras;
              }
            } catch (NumberFormatException e) {
            }
          }
        }
      }
    }

    System.out.println("La hora es: " + maxHorasValor);
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String[] diaSemana = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
    String[][] datos = new String[7][100];

    for (int i = 0; i < 7; i++) {
      String dia = diaSemana[i];
      String archivo = "C:\\Users\\cadav\\Onedrive\\GitHub\\taller4\\Log_prog\\Enclase\\" + dia + ".txt";

      try {
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        int a = 0;
        while ((linea = br.readLine()) != null) {
          datos[i][a] = linea;
          a++;
        }
        br.close();
      } catch (Exception e) {
        System.out.println("Error al leer el archivo de " + dia + ": " + e.getMessage());
      }
    }
    while (true) {
      System.out.println("Bienvenido, ¿qué deseas hacer?");
      System.out.println("1. Día de la semana con mayor movimiento de dinero");
      System.out.println("2. Hora del día con más movimiento");
      System.out.println("3. ver datos");
      System.out.println("4. Salir");

      int opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1:
          double maxValor = Double.MIN_VALUE;
          String diaMaxValor = "";

          for (int i = 0; i < 7; i++) {
            for (int j = 0; j < datos[i].length; j++) {
              if (datos[i][j] != null) {
                String[] parts = datos[i][j].split(";");
                if (parts.length >= 2) {
                  double valor = Double.parseDouble(parts[1]);
                  if (valor > maxValor) {
                    maxValor = valor;
                    diaMaxValor = diaSemana[i];
                  }
                }
              }
            }
          }

          if (!diaMaxValor.isEmpty()) {
            System.out.println("El día de la semana con el mayor valor de transacción es " + diaMaxValor);
            System.out.println("El valor máximo es: " + maxValor);
          }
          break;
        case 2:
          laMejorHora(datos);
          break;
        case 3:
          System.out.println("Ingrese la cantidad de datos que desea ver de cada dia:");
          int cantidadDatosAVer = scanner.nextInt();
          System.out.println("Datos disponibles:");
          for (int i = 0; i < 7; i++) {
            System.out.println(diaSemana[i] + ": ");
            for (int a = 0; a < datos[i].length && a < cantidadDatosAVer; a++) {
              if (datos[i][a] != null) {
                System.out.println(datos[i][a]);

              }
            }
          }
          scanner.close();
      }
    }
  }
}
