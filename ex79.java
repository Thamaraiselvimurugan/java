import java.util.Arrays; 

 public class thams79 {

 public static void main(String[] args)

 {

    int[] array_nums = {50, 60, 80};

	System.out.println("Original Array: "+Arrays.toString(array_nums)); 

	int[] new_array_nums = {array_nums[1], array_nums[2], array_nums[0]};

	System.out.println("Rotated Array: "+Arrays.toString(new_array_nums)); 	 

 }

}