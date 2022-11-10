package fikt.oop.inki895.zad1;

public class Main {

	public static void main(String[] args) {
		Avtomobil a=new Avtomobil("Porsche","911 Carrera S","црна",220.34,2015,"BT-0257-AF");
		a.prvMetod();
		System.out.println("Зголемувањето на поминатите километри за 1520,25 изнесува: "+a.vtorMetod()+" km.");

	}

}
