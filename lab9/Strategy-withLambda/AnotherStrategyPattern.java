import java.util.Arrays;
import java.util.List;

public class AnotherStrategyPattern {
	public static void main(String[] args) {

		List<Computation<Integer>> computations = Arrays.asList(
		(n, m) -> {
			System.out.println("Addition: "+ n+ " + "+m);
			return n + m;
		}, 
		(n, m) -> {
			System.out.println("Product "+ n+ " * "+m);
			return n * m;
		}, 
		(n, m) -> {
			System.out.println("Difference "+ n+ " - "+m);
			return n - m;
		});

		for (Computation comp : computations) {
			System.out.println(comp.compute(20, 2));
		}
	}
}
