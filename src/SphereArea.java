public class SphereArea extends ThreadSubscriber implements ObserverTest{
    double input;

    @Override
    public void notifySubscriber() {
        input = topic.getInput();
        System.out.println("Sphere area = " + execute());
    }
    @Override
    public String execute(){
        String res = String.valueOf(4*22*input*input/7);
        return res;
    }
    @Override
    public Boolean test(){
        input = 1;

        if(!execute().equals("12.56")) {
            return false;
        }
        return true;
    }
}
