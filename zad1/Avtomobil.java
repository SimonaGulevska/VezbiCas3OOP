package fikt.oop.inki895.zad1;

public class Avtomobil {
	public String marka;
	public String model;
	public String boja;
	public double pominatiKm;
	public int godNaProizvodstvo;
	public String registracija;
	
	public Avtomobil(String marka,String model,String boja,double pominatiKm,int godNaProizvodstvo,String registracija) {
		this.marka=marka;
		this.model=model;
		this.boja=boja;
		this.pominatiKm=pominatiKm;
		this.godNaProizvodstvo=godNaProizvodstvo;
		this.registracija=registracija;
	}
	public void prvMetod() {
		System.out.println("Марка: "+marka+", модел: "+model+", боја: "+boja+", поминати км: "+pominatiKm+", година на производство: "+godNaProizvodstvo+", регистрација: "+registracija);
	}
	public double vtorMetod() {
		double pKm;
		pKm=pominatiKm+1520.25;
		return pKm;
	}

}
