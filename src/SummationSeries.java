public class SummationSeries extends ThreadSubscriber {
	@Override
	public void notifySubscriber() {
        double input = topic.getInput();
        int sum = 0;
        for (int i = 1 ; i <= input ; i++)
        	sum += i;
        System.out.println("The sum of the first "+ input +" numbers equals "+ sum);   
	}
}