public class MultiplicationSeries extends ThreadSubscriber implements ObserverTest {
    double input;

    @Override
    public void notifySubscriber() {
        input = topic.getInput();
        int fact = 1;
        for(int i = 1; i<= input; i++)
            fact*=i;
        System.out.println("Factorial of "+input+": "+fact);
    }

    @Override
    public String execute() {
        return null;
    }

    @Override
    public Boolean test() {
        return null;
    }
}
