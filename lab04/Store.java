package hust.soict.ict.aims.store;
import java.util.ArrayList;

import hust.soict.ict.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if (itemsInStore.contains(media)) {
			System.out.println("This media already exists!");
			return;
		}
		itemsInStore.add(media);
		System.out.println("Media added!");
		return;
	}
	
	public void removeMedia(Media media) {
		if (itemsInStore.contains(media)) {
			itemsInStore.remove(media);
			System.out.println("Media item removed!");
			return;
		}
		System.out.println("Media item not found!");
		return;
	}
	
	public boolean removeMedia(String mediaName) {
	    for (int i = 0; i < itemsInStore.size(); i++) {
	        Media item = itemsInStore.get(i);
	        if (item.getTitle().equalsIgnoreCase(mediaName)) {
	            itemsInStore.remove(i);
	            System.out.println("Media item removed!");
	            return true;
	        }
	    }
	    System.out.println("Media item not found!");
	    return false;
	}
	
	public Media searchByTitle(String title) {
	    for (Media media : itemsInStore) {
	        if (media.isMatch(title)) {
	            return media;
	        }
	    }
	    System.out.println("Media item not found!");
	    return null;
	}
	
	public Media searchByID(int id) {
	    for (Media media : itemsInStore) {
	        if (media.isMatch(id)) {
	            return media;
	        }
	    }
	    System.out.println("Media item not found!");
	    return null;
	}
	
	public void print() {
		for (Media e : itemsInStore) {
			System.out.println(e.toString());
		}
	}
}
