package javaClass;

public class Q06tv {
	   private String brand;
	   private int year;
	   private int inch;  
	   
	   Q06tv(String brand, int year, int inch) {
	      this.brand = brand;
	      this.year = year;
	      this.inch = inch;
	   }
	   public void show() {
	      System.out.println(brand+"���� ���� "+year+"���� "+inch+"��ġ TV");
	   }
}
