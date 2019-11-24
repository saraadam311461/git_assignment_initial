public class CircleArea extends ThreadSubscriber implements ObserverTest {
	double input;

	@Override
	public void notifySubscriber() {
        input = topic.getInput();
        System.out.println("Area of the circle is  "+3.14159265359*input*input +" in centimetres squared");
        
	}

	@Override
	public String execute() {
		return null;
	}

	@Override
	public Boolean test() {
		return false;
	}
}
