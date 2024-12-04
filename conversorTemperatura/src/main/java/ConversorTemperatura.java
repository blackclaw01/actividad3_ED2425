import java.util.Scanner;
public class ConversorTemperatura {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tBienvenido al conversor de temperatura\n");
	System.out.print("introduce el valor que quieras convertir: ");
	float value = scan.nextFloat();
	System.out.println("  uno para convertir de celsius a faranhi....");
	System.out.println("  uno para convertir de fareinh a celsius....");
	System.out.print("\nintroduce el valor...   ");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.print("tu conversor es este.. "+value1+"�F");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("tu conversor esta aquí.. "+value3+"�C");
		}
	System.out.println("\n\tgracias!!..");
	}
}
