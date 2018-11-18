 

public class Aliens implements LandingObserver {
	@Override
	public void observeLanding(final String name) {
		if (name.contains("asteroid")) {
			System.out.println("ALIENS: They're distracted, lets invade earth!");
		}
	}
}
