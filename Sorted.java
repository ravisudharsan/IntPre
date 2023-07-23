package Test1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(10,20,30,40,50,40,30);
		List<Integer> b=Arrays.asList(56,89,40);
		List<List<Integer>> num=Arrays.asList(a,b);
		List<Integer> nums=num.stream().distinct().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(nums);
		
		Collections.sort(nums);
		System.out.println(nums);
		 
//		nums.sort(Comparator.reverseOrder());
//		System.out.println(nums);
//		
		Integer max=nums.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(max);
		Integer min=nums.stream().distinct().sorted().findFirst().get();
		System.out.println(min);
	}

}
