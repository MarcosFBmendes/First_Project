package mainprocess;

import java.util.Scanner;

public class Main {
  
	public static void main (String[] args){
		
		Scanner sc = new Scanner (System.in);
		
		double c, k, f;
		
System.out.println("Digite a temperatura em celsius");

c = sc.nextDouble();

f = c*1.8+32;

k = c+273.15;		
		
		
System.out.println("A temperatura em Fahrenheit:" + f);
			
System.out.println("A temperatura em Kelvin:" + k);
}
}
