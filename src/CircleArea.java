public class CircleArea extends ThreadSubscriber implements ObserverTest {
	double input;

	@Override
	public void notifySubscriber() {
        input = topic.getInput();
        System.out.println("Area of the circle is  "+execute()+" in centimetres squared");
        
	}

	@Override
	public String execute() {
  	 	String res = String.valueOf(3.14159265359*input*input);
        return res;	
	}

	@Override
	public Boolean test() {
	        input = 1;		
	return execute().equals(3.14159265359);
	}
}
