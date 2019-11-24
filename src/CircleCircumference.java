public class CircleCircumference extends ThreadSubscriber implements ObserverTest {
	double input;

	@Override
	public void notifySubscriber()
	{
		input = topic.getInput();
		System.out.println("Circle Circumference: " + (2 * input * 3.14));
	}

	@Override
	public String execute() {
		return null;
	}

	@Override
	public Boolean test() {
		return true;
	}
}
