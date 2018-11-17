package withoutLambda;

public class Isro implements LandingObserver {
	@Override
	public void observeLanding(final String name) {
		if (name.contains("Chandrayan")) {
			System.out.println("ISRO: We made it!");
		}
	}
}
