import java.util.Arrays;
import java.util.List;

public class Java8 {

public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.stream().filter((e) -> e % 2 != 0)
				.forEach((n) -> {
					System.out.println(n);
				});
		System.out.println("Bhanu");
	}
}
