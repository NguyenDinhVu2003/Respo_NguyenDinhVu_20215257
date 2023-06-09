package hust.soict.ict.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
	
	@Override
	public int compare(Media m1, Media m2) {
		float cost1 = m1.getCost();
		float cost2 = m2.getCost();
		
		if (cost1 > cost2) {
			return -1;
		} else if (cost1 < cost2) {
			return 1;
		}
		 String title1 = m1.getTitle();
	     String title2 = m2.getTitle();

	        int length = Math.min(title1.length(), title2.length());
	        for (int i = 0; i < length; i++) {
	            char char1 = title1.charAt(i);
	            char char2 = title2.charAt(i);
	            if (char1 != char2) {
	                return char1 - char2;
	            }
	        }

	        return title1.length() - title2.length();
	    }
	}
