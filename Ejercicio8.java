import java.util.*;

public class Ejercicio8{
     
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();
        String salir = " ";
        int random = 0;
        
        do{
            random = aleatorio.nextInt(100 - 1) * 5;
            System.out.println("El número random multiplo de 5 es: " + random);
            System.out.print("Escriba << e >> para salir,de lo contrario escriba otra letra: ");
            salir = scanner.nextLine();
        } while(!salir.equals("e"));

        System.out.println("cerrar programa");
       
    }
}


