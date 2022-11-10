package fikt.oop.inki895.zad4;

import java.util.Scanner;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {
		Brojach brojNaPismo=new Brojach();
		Brojach brojNaGlava=new Brojach();
		int brojNaFrlanja;
		Scanner sc=new Scanner(System.in);
		System.out.println("Внесете број на фрлања за паричката:");
		brojNaFrlanja=sc.nextInt();
		while(brojNaFrlanja>0) {
			brojNaPismo.resetiranje();
			brojNaGlava.resetiranje();
			for(int i=0;i<=brojNaFrlanja;i++) {
				if(Math.random()<0.8)
					brojNaPismo.zgolemi();
				else
					brojNaGlava.zgolemi();
			}	
			System.out.println("За "+brojNaFrlanja+" фрлања се добиваат следните резулатати:");
			System.out.println("Број на писма: "+brojNaPismo.brojach+".");
			System.out.println("Број на глави: "+brojNaGlava.brojach+".");
			System.out.println("За повторен обид, повторно венсете број на фрлања:");
			brojNaFrlanja=sc.nextInt();
		}
        sc.close();
	}

}
