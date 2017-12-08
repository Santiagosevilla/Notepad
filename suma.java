import java.util.Scanner;
public class suma {
  public static void main(String[] args) {
	int numero1;
	int numero2;
	int resultado;
    System.out.println("Ingrese el primer numero: ");
	Scanner numero1Escaner=new Scanner(System.in);
	numero1=numero1Escaner.nextInt();
	System.out.println("\nIngrese el segundo numero: ");
	Scanner numero2Escaner=new Scanner(System.in);
	numero2=numero2Escaner.nextInt();
	resultado=numero1+numero2;
	System.out.println("\n\nLa suma de los dos numeros es: "+resultado);
  }
}