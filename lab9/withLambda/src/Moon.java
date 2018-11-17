
import java.awt.List;
import java.util.ArrayList;

public final class Moon {

	public static void main(final String[] args) {
		final Moon moon = new Moon();
		moon.startSpying(event -> {
			if (event.contains("Apollo")) {
				System.out.println("NASA: We made it!");
			}
		});
		moon.startSpying(event -> {
			if (event.contains("Chandrayan")) {
				System.out.println("ISRO: We made it!");
			}
		});
		moon.startSpying(event -> {
			if (event.contains("asteroid")) {
				System.out.println("ALIENS: They're distracted, lets invade earth!");
			}
		});

		moon.land("Apollo 11");
		moon.land("Chandrayan 1");
		moon.land("An asteroid");
	}

	private final ArrayList<LandingObserver> observers = new ArrayList<LandingObserver>();

	public void land(final String name) {
		System.out.println("\nEvent: " + name);
		for (final LandingObserver observer : this.observers) {
			observer.observeLanding(name);
		}
	}

	public void startSpying(final LandingObserver observer) {
		this.observers.add(observer);

	}

}