public class MultiplicationSeries extends ThreadSubscriber implements ObserverTest {
    double input;

    @Override
    public void notifySubscriber() {
        input = topic.getInput();
        System.out.println("Factorial of "+input+": "+execute());
    }

    @Override
    public String execute() {
        int fact = 1;
        for(int i = 1; i<= input; i++)
            fact*=i;
        String res = String.valueOf(fact);
        return res;
    }

    @Override
    public Boolean test() {
        input = 1;
        if(!execute().equals("1"))
            return false;
        input=5;
        if(!execute().equals("120"))
            return false;
        return true;
    }
}
