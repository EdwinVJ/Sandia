import java.util.Scanner;

public class mi_sandia {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int peso=0;
		System.out.print("Ingrese el peso de la Sandía: " );
		peso = sc.nextInt();	
		if (peso>=1 && peso<=100) {
			pesoSandia (peso);
		}else {
			System.out.println("El número no se encuentra entre 1 y 100");
		}
		sc.close();
	}
	public static void pesoSandia(int peso) {
		
		int res = peso%2;
		if (peso>=4 && res==0) {
			System.out.println("SI");	
		}else if(peso  ==2) {
			System.out.println("NO");
		}
		else {
			System.out.println("NO");
		}
	}
 
}
