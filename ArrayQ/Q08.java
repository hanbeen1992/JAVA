package arrQ;

public class Q08 {

	public static void main(String[] args) {
		//a의 값과 b의 값을 번갈아가면서 c에 저장
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int[] c = new int[6];
		int index=0;
		for(int i =0; i<a.length;i++) {
			c[index]=a[i];
			c[index+1]=b[i];
			index += 2;
		}
		System.out.println("c배열 값: ");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}
}