import java.util.Scanner;

public class Main {
	private static ThreadSubscriber subscribers [] = {
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
	
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ThreadSubscriber sub : subscribers){
			mathTopic.addSubscriber(sub);
			sub.setTopic(mathTopic);
		}
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		mathTopic.setInput(input);
		mathTopic.dispatchEvent();
	}
}
