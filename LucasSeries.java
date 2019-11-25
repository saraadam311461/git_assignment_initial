public class LucasSeries extends ThreadSubscriber implements ObserverTest {
       double input;

       @Override
       public void notifySubscriber() {
            input = topic.getInput();
            System.out.println("Lucas Series of " + (int) input + " = " + execute());
       }

       @Override
       public String execute() {
            if ((int) input == 0)
                return "2";

            int fn_2 = 2, fn_1 = 1;
            for (int i = 2; i <= (int) input; ++i) {
                int temp = fn_1;
                fn_1 = fn_1 + fn_2;
                fn_2 = temp;
            }
            
            return String.valueOf(fn_1);
       }

       @Override
       public Boolean test() {
           input = 5;
           return execute().equals("11");
       }
}