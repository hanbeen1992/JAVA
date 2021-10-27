package arrQ;

public class Q05 {

	public static void main(String[] args) {
		//최대값과 해당 인덱스를 구해서 출력해봅시다.
		int[] nums = new int[] {78,54,89,57,84,95,74,91,84,67,52,94,82};
		int max =0;
		int index =0;
		for(int i =0;i<nums.length;i++) {
			if(max<nums[i]) {
				max=nums[i];
				index = i;
			}
		}
		System.out.println("최댓값: " + max);
		System.out.println("해당 인덱스: " + index);
		
	}

}