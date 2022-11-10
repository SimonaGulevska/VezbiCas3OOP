package fikt.oop.inki895.zad3;

public class PC {
	public int memorija;
	public String tipNaMemorija;
	public int SSD;
	public String golemina="GB";
	
	public PC() {
		memorija=2;
		tipNaMemorija="DDR4";
		SSD=256;
	}
	public void prvMetod(int zgolemiMemorija, int novSSD) {
		System.out.println("Memorijata bese "+memorija+golemina+", sega iznesuva "+(zgolemiMemorija+memorija)+golemina+".");
		System.out.println("Tipot na memorijata e "+tipNaMemorija+".");
		System.out.println("SSD ima golemina od "+novSSD+golemina+". Prethodno iznesuvase "+SSD+golemina+".");
	}
}
