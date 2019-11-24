public class MainTest {
    private static ObserverTest subscribers [] = {
            new SphereArea() ,
            new CircleArea(),
            new CircleCircumference(),
            new SummationSeries(),
            new MultiplicationSeries()
    };
    public static void main(String[] args) {
        for (ObserverTest sub : subscribers){
            Boolean res = sub.test();
            if(res!=null && res==false){
                System.exit(1);
            }
        }
    }
}
