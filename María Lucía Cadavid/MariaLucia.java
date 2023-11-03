mport java.util.HashMap;
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

