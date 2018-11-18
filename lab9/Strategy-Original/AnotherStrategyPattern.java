import java.util.Arrays;
import java.util.List;

public class AnotherStrategyPattern {
	public static void main(String[] args) {

		List<Computation> computations = Arrays.asList(new IntSum(), new IntDifference(), new IntProduct());

		for (Computation comp : computations) {
			System.out.println(comp.compute(20, 2));
		}
	}
}
