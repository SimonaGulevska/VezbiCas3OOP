package fikt.oop.inki895.zad2;

public class Fakultet {
	public String nazivNaFakultet;
	public int brojNaSmerovi;
	public int brojNaStudenti;
	public String dekan;
	public String sediste;
	
	public void prvMetod() {
		System.out.println("Бројот на студентите по зголемувањето: "+brojNaStudenti+50);
	}
	public int vtorMetod(int namali) {
		int namalenaVrednost;
		namalenaVrednost=brojNaStudenti-namali;
		return namalenaVrednost;
	}
	public void tretMetod() {
		System.out.println("Назив на факултет: "+nazivNaFakultet+", со седиште: "+sediste);
	}

}
