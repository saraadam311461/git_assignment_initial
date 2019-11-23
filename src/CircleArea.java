public class CircleArea extends ThreadSubscriber {

	@Override
	public void notifySubscriber() {
        double input = topic.getInput();
        System.out.println("Area of the circle is  "+3.14159265359*input*input +" in centimetres squared");
        
	}

}
