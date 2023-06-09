package hust.soict.ict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	private static int nbDigitalVideoDisc = 0;

	public DigitalVideoDisc(String title) {
		super(title);
		nbDigitalVideoDisc++;
		setId(DigitalVideoDisc.nbDigitalVideoDisc);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
		nbDigitalVideoDisc++;
		setId(DigitalVideoDisc.nbDigitalVideoDisc);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost, director);
		nbDigitalVideoDisc++;
		setId(DigitalVideoDisc.nbDigitalVideoDisc);
	}
	public DigitalVideoDisc(String title, String category, float cost, String director, int length, int id) {
		super(title, category, cost, director, length, id);
		nbDigitalVideoDisc++;
		setId(DigitalVideoDisc.nbDigitalVideoDisc);
	}
	
	public boolean isMatch(String title) {
		if (getTitle().contentEquals(title)) {
			return true;
		}
		else return false;
	}
	public boolean isMatch(int id) {
		if (getId() == id) {
			return true;
		}
		else return false;
	}
	
	@Override
	public String toString() {
		return getId() + ". DVD - "+ getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + "$";
	}
	
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

}
