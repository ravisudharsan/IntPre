package Question;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrder {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,2,7,5,9,54,67,67);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("reverseorder"+list);
		Integer max=list.stream().max(Comparator.naturalOrder()).get();
		Integer max1=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("secondmax :"+max1);
		System.out.println("firstmax :"+max);
		Collections.sort(list);
		System.out.println("ascendingorder"+list);
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
		List<String> date=Arrays.asList("raja","pooja","yogi","pooja");
		List<String>n=date.stream().distinct().collect(Collectors.toList());
		System.out.println(n);
	}

}
