public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (disc == null) {
		} else {
			if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is full!");
			} else {
				itemsOrdered[qtyOrdered] = disc;
				if (qtyOrdered == (MAX_NUMBERS_ORDERED - 1)) {
					System.out.println("The cart is almost full!");
				} else {
					System.out.println("The disc '" + itemsOrdered[qtyOrdered].getTitle() + "' has been added!");
				}
				qtyOrdered++;
			}
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		
		if (disc == null) {
			return;
		} else {
			for (int i = 0; i < qtyOrdered; i++) {
				if (itemsOrdered[i] == disc) {
					System.out.println("The disc '" + itemsOrdered[i].getTitle() + "' has been removed!");
					for (int j = i; j < qtyOrdered; j++) {
						itemsOrdered[j] = itemsOrdered[j + 1];
					}
					qtyOrdered--;
				}
			}
		}
	}
	

	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
}
