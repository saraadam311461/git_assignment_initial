public class SphereArea extends ThreadSubscriber implements ObserverTest{
    double input;

    @Override
    public void notifySubscriber() {
        input = topic.getInput();
        System.out.println("Sphere area = " + execute());
    }
    @Override
    public String execute(){
        String res = String.valueOf(4*3.14*input*input);
        return res;
    }
    @Override
    public Boolean test(){
        input = 1;

        if(!execute().equals("12.56")) {
            System.out.println("Sphere area = " + execute());
            return false;
        }
        return true;
    }
}
