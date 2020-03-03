public class SphereArea extends ThreadSubscriber implements ObserverTest{
    double input;
    double Area;
    String res;

    @Override
    public void notifySubscriber() {
        input = topic.getInput();
        System.out.println("Sphere area = " + execute());
    }
    @Override
    public String execute(){
        Area = 4*3.14*input*input;
        res=""+Area;
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
