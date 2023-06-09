package hust.soict.ict.aims.media;

import java.util.Objects;

public class Track implements Playable{
	
	private String title;
	private int length;

	//Getter & setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	//Constructor
	public Track(String title) {
		this.title = title;
	}
	
	public Track(int length) {
		this.length = length;
	}
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Track otherTrack = (Track) obj;
        return Objects.equals(title, otherTrack.title) && length == otherTrack.length;
    }

}
