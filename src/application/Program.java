package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.println();
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		sc.nextLine();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		sc.nextLine();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		sc.nextLine();
		Champion ch1 = new Champion(name,life,attack,armor);
		
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.println();
		System.out.print("Nome: ");
		String name2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		sc.nextLine();
		Champion ch2 = new Champion(name2,life2,attack2,armor2);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");		
		
		int n = sc.nextInt();
	
		for(int i = 0; i < n; i++) {	
			ch1.takeDamage(ch2);
			ch2.takeDamage(ch1);
			
			System.out.println();
			System.out.println("Resultado do turno " + (i + 1) + ": ");
			System.out.println(ch1.status());
			System.out.println(ch2.status() + "\n");
		   
		  if (ch1.getLife() <= 0 || ch2.getLife() <= 0) {
			  break;
		  }	
			
		}
		 
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}

}
