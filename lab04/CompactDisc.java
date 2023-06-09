package hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			System.out.println("This track already exsists!");
			return;
		}
		tracks.add(track);
		System.out.println("The track: " + track + " added to list!");
		return;
	}
	
	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
			return;
		}
		System.out.println("The track: " + track + " added to list");
		return;
	}
	
	public int getLength() {
		int totalLength = 0;
		for (Track e  : tracks) {
			totalLength += e.getLength();
		}
		return totalLength;
	}
	
	public CompactDisc(int id, String title, String category, float cost, int length, String director,
					   String artist, List<Track> track) {
		super(title, category, cost, id, length, director);
		this.artist = artist;
		this.tracks = track;
	}
	
	public CompactDisc(int id, String title, String category, float cost) {
		super(title, category, cost, id);
	}
	
	public CompactDisc(String title) {
		super(title);
	}

	@Override
	public void play() {
		System.out.println("Number of tracks: " + this.getLength() + ".");
		System.out.println("Artist: " + this.artist + ".");
		for (Track e : tracks) {
			e.play();
		}	
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Compact Disc Information:\n");
	    sb.append("Title: ").append(getTitle()).append("\n");
	    sb.append("Category: ").append(getCategory()).append("\n");
	    sb.append("Cost: ").append(getCost()).append("\n");
	    sb.append("Artist: ").append(artist).append("\n");
	    sb.append("Number of Tracks: ").append(tracks.size()).append("\n");
	    sb.append("Total Length: ").append(getLength()).append(" minutes").append("\n");
	    return sb.toString();
	}
}
