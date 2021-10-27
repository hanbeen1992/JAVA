package javaClass;

public class Q01Main {
	public static void main(String[] args) {
		//1. �떎�쓬 main硫붿냼�뱶�쓽 �궡�슜�씠 �떎�쓬怨� 媛숈� 寃곌낵媛� �굹�삤�룄濡� Card�겢�옒�뒪�쓽 �궡�슜�쓣 梨꾩슦�꽭�슂. 
		Q01Card card1 = new Q01Card(3,false);
		Q01Card card2 = new Q01Card();

		    System.out.println(card1.info());
		    System.out.println(card2.info());
	}
}
