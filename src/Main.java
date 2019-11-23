import java.util.Scanner;

public class Main {
	private static ThreadSubscriber subscribers [] = {
			new SphereArea() ,
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
