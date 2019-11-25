public class CircleCircumference extends ThreadSubscriber implements ObserverTest {
	double input;

	@Override
	public void notifySubscriber()
	{
		input = topic.getInput();
		System.out.println("Circle Circumference: " + execute());
	}

	@Override
	public String execute() {
		return String.valueOf(2 * input * 3.14);
	}

	@Override
	public Boolean test() {
		input = 0.5;
		return execute().equals("3.14");
	}
}
