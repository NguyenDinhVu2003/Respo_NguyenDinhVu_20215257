
public class TestPassingParameter {
public static void main(String[] args) {
	DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
	DigitalVideoDisc cinderellaDVD=new DigitalVideoDisc("cinderellaDVD");	
	swap(jungleDVD,cinderellaDVD);
	System.out.println("jungle dvd tittle:"+jungleDVD.getTitle());
	System.out.println("cinderella dvd tittle:"+cinderellaDVD.getTitle());
	changeTiltle(jungleDVD,cinderellaDVD.getTitle());
	System.out.println("jungle dvd title: "+jungleDVD.getTitle());
}
public static void swap(Object o1,Object o2) {
	Object tmp=o1;
	o1=o2;
	o2=tmp;
}
public static void changeTiltle(DigitalVideoDisc dvd,String title) {
	String oldTittle=dvd.getTitle();
	dvd.setTitle(title);
	dvd=new DigitalVideoDisc(oldTittle);
}
}

