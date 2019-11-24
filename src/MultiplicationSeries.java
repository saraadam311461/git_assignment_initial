public class MultiplicationSeries extends ThreadSubscriber {
    @Override
    public void notifySubscriber() {
        double input = topic.getInput();
        int fact = 1;
        for(int i = 1; i<= input; i++)
            fact*=i;
        System.out.println("Factorial of "+input+": "+fact);
    }
}
