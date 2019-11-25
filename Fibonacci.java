public class Fibonacci extends ThreadSubscriber implements ObserverTest {
	double input;
	@Override
	public void notifySubscriber() {
		input = Topic.getInput();
		System.out.println("Result of Fibonacci series at "+input+": "+execute());
	}
	@Override
	public String execute() {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		for(int i=0 ; i < input ; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		String str = String.valueOf(sum);
		
	    return str;
	}
	@Override
	
	public Boolean test() {
		input = 4;
		if(!execute().equals("3")) {
			return false;
		}
		input = 10;
		if(!execute().equals("55")) {
			return false;
		}
		return true;
		
	}
}

