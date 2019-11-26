import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while(true) {
			ThreadSubscriber subscribers [] = {
					new SphereArea() ,
					new CircleArea(),
					new CircleCircumference(),
					new SummationSeries(),
					new MultiplicationSeries(),
					new CircleVolum(),
					new LucasSeries(),
					new Fibonacci(),
					new twoPowerN()
			};

			Topic mathTopic = new Topic();
			for (ThreadSubscriber sub : subscribers) {
				mathTopic.addSubscriber(sub);
				sub.setTopic(mathTopic);
			}
			Scanner sc = new Scanner(System.in);
			double input = sc.nextDouble();
			mathTopic.setInput(input);
			mathTopic.dispatchEvent();
		}
	}
}
