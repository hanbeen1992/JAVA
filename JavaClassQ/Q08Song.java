package javaClass;

public class Q08Song {
	   private String title;
	   private String artist;
	   private int year;
	   private String country;
	   Q08Song() {
	      this("title","artist",0000,"country");
	   }
	   Q08Song(String title, String artist, int year, String country) {
	      this.title = title;
	      this.artist = artist;
	      this.year = year;
	      this.country = country;
	   }
	   public void show() {
	      System.out.println(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	   }
}
