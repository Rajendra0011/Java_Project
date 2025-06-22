package logical_programs;

public class DuplicateElementArrays {
	public static void main(String[] args) {


		int nums[]= {3,5,6,8,7,2,9,4,6,8};

		for(int i=0;i<nums.length;i++) {

			for(int j=i+1;j<nums.length;j++) {

				if(nums[i]==nums[j]) {

					System.out.println("Duplicates elements array : "+nums[i]);
				}
			}
		}

	}

}
