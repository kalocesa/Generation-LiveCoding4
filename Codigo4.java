package LiveCodingJAVA;
//Se importa el método Scanner
import java.util.Scanner;
//Se renombra el archivo de la clase para que quede igual que la clase
public class Codigo4 {
	
	//Se agrega el main para encerrar el código 
	public static void main(String[] args) {
//Se agrega System.in, para que el scanner se utilice en la consola
    Scanner s = new Scanner(System.in);
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    
    String j1 = s.nextLine();
    //Se cambia a turno de jugador 2
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    //Se agrega System.in dentro del método Scanner
    Scanner s2 = new Scanner(System.in);
    //Se pasa el nombre de la variable correcta a s2
    String j2 = s2.nextLine();
    
    //Se les agrega equals para comparar entre 2 Strings y encerrar el string entre paréntesis
    //Si lo del j1 y j2 es igual es empate 
    if (j1.equals(j2)) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals ("tijeras")) {
            g = 1;
           }
          break;
        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
           }
          break;
        //Se nombra tijeras para tener coherencia
        case "tijeras":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        //Se agrega un imprimir en la consola que es un elemento inválido
         default:
        	 System.out.println("Es un elemento inválido");
        	 return;
      }
      System.out.println("Gana el jugador " + g);
    } 
    //Se cierran los scanners de ambos jugadores
  s.close();
  s2.close();
}
}