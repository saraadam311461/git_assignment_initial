public class CircleCircumference extends ThreadSubscriber
{
	@Override
	public void notifySubscriber()
	{
		double input = topic.getInput();
		System.out.println("Circle Circumference: " + (2 * input * 3.14));
	}
}
