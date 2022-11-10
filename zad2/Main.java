package fikt.oop.inki895.zad2;

public class Main {

	public static void main(String[] args) {
		Fakultet f1=new Fakultet();
		f1.nazivNaFakultet="ФИКТ";
		f1.brojNaSmerovi=2;
	    f1.brojNaStudenti=400;
	    f1.dekan="Александар Марковски";
	    f1.sediste="Битола";
	    f1.prvMetod();
	    System.out.println("Бројот на студентите после намалувањето: "+f1.vtorMetod(50)+".");
	    f1.tretMetod();
	    Fakultet f2=new Fakultet();
		f2.nazivNaFakultet="Биотехнички факултет";
		f2.brojNaSmerovi=6;
	    f2.brojNaStudenti=760;
	    f2.dekan="Живко Ѓоргиевски";
	    f2.sediste="Битола";
	    f2.prvMetod();
	    System.out.println("Бројот на студентите после намалувањето: "+f2.vtorMetod(50)+".");
	    f2.tretMetod();

	}

}
