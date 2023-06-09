package hust.soict.ict.aims.cart;
import java.util.ArrayList;
import java.util.Collections;

import hust.soict.ict.aims.media.Media;


public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public Cart() {
		itemsOrdered = new ArrayList<Media>();
	}
	
	public float totalCost() {
		float total = 0;
		for (Media e : itemsOrdered) {
			total += e.getCost();
		}
		return total;
	}
	
	public void print() {
		System.out.println("*******************CART*******************");
		System.out.println("Ordered Items:");
		for (Media e : itemsOrdered) {
			System.out.println(e.getId() + ".DVD-" + e.getTitle() + "-" + e.getCategory() + ":" + e.getCost() + "$"	);
		}
		System.out.println("Total cost: " + totalCost());
	}
	
	public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                return media;
            }
        }
        System.out.println("No media match!");
        return null;
    }
	
	public ArrayList<Media> filterByID(int id) {
        ArrayList<Media> filteredItems = new ArrayList<Media>();
        for (Media media : itemsOrdered) {
            if (media.isMatch(id)) {
                filteredItems.add(media);
            }
        
        }
        for (Media media: filteredItems) {
        	System.out.println(media.toString());
        }
        return filteredItems;
    }
	
	public ArrayList<Media> filterByTitle(String title) {
        ArrayList<Media> filteredItems = new ArrayList<Media>();
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                filteredItems.add(media);
            }
        }
        for (Media media: filteredItems) {
        	System.out.println(media.toString());
        }
        return filteredItems;
    }
	
	public void searchByID(int id) {
        boolean check = false;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            Media media = itemsOrdered.get(i);
            if (media.isMatch(id)) {
                System.out.println(media.toString());
                check = true;
                return;
            }
        }
        if (!check) {
            System.out.println("The DVD you are searching is not currently in the cart!");
        }
    }
	
	public void addMedia(Media media) {
		if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			if (itemsOrdered.contains(media)) {
				System.out.println("This media already exists!");
				return;
			}
			itemsOrdered.add(media);
			System.out.println("Media added to cart: " + media.getTitle());
			return;    
        } else {
            System.out.println("The cart is now full!");
        }
		return;
	}
	
	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("Media removed from cart: " + media.getTitle());
			return;
		}
		System.out.println("Item not found!");
		return;
	}
	
	public boolean removeMedia(String mediaName) {
	    for (int i = 0; i < itemsOrdered.size(); i++) {
	        Media item = itemsOrdered.get(i);
	        if (item.getTitle().equalsIgnoreCase(mediaName)) {
	        	itemsOrdered.remove(i);
	            System.out.println("The media item successfullt removed from the store!");
	            return true;
	        }
	    }
	    System.out.println("Media not found!");
	    return false;
	}
	
	public void sortByTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Media sorted by title and cost:");
    }
	
	public void sortByCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        System.out.println("Media sorted by cost and title:");

    }
}
