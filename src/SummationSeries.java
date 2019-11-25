public class SummationSeries extends ThreadSubscriber implements ObserverTest {
    double input;

    @Override
	public void notifySubscriber() {
        input = topic.getInput();
        System.out.println("The sum of the first "+ (int) input +" numbers equals "+ execute());   
	}

    @Override
    public String execute() {
    	int sum = 0;
        for (int i = 1 ; i <= input ; i++)
        	sum += i;
        return String.valueOf(sum);
    }

    @Override
    public Boolean test() {
    	input = 3;
        return (execute().equals("6"));
    }
}