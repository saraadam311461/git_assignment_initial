public class SphereArea extends ThreadSubscriber{
    @Override
    public void notifySubscriber() {
        double input = topic.getInput();
        System.out.println("Sphere area = " + 4*3.14*input*input);
    }
}
