package enClase;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Map.Entry;
import java.io.*;

public class MariaLucia {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    String[] diaSemana = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
    String[][] lunesd, martesd, miercolesd, juevesd, viernesd, sabadod,
        domingod = new String[100][5];


    for (int i = 0; i < 100; i++) {
      FileReader fr = null;
      BufferedReader br = null;
      try {
        bufferedReader fr = new FileReader(diaSemana[i] + ".txt");
        String linea = "id;amount;tipoE;tipoR;hora";
        linea.split(";");
        while ((linea = br.readLine()) != null) {
          System.out.println(linea);
        }

      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.println("no se puede leer el archivo");
      } finally {
        try {
          if (null != fr) {
            fr.close();
          }
        } catch (Exception e2) {
          System.out.println(e2.getMessage());
          ;

          if

        }
      }
    }
    Scanner.close();
  }

}
