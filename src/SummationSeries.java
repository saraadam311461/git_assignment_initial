public class SummationSeries extends ThreadSubscriber implements ObserverTest {
    double input;

    @Override
	public void notifySubscriber() {
        input = topic.getInput();
        int sum = 0;
        for (int i = 1 ; i <= input ; i++)
        	sum += i;
        System.out.println("The sum of the first "+ (int) input +" numbers equals "+ sum);   
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