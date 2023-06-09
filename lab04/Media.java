package hust.soict.ict.aims.media;

import java.util.Comparator;

public abstract class Media {
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	private int id;
	private String title;
	private String category;
	private float cost;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	public Media(String title) {
		this.title = title;
	}
	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public Media(String title, String category, float cost, int id) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public boolean isMatch(String title) {
        if (this.title.equals(title)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMatch(int id) {
        if (this.id == id) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Media) {
            Media otherMedia = (Media) obj;
            if (title != null && title.equals(otherMedia.getTitle())) {
                return true;
            }
        }
        return false;
    }
	
}
