import java.util.ArrayList;
import java.util.List;

public class Topic {
	
	private List<ThreadSubscriber> subscribers;
	double input;
	
	public Topic() {
		subscribers = new ArrayList<ThreadSubscriber>();
	}
	
	public void addSubscriber(ThreadSubscriber sub) {
		subscribers.add(sub);
	}
	
	public List<ThreadSubscriber> getSubscribers() {
		return subscribers;
	}

	public double getInput() {
		return input;
	}

	public void setInput(double input) {
		this.input = input;
	}

	public void dispatchEvent() {
		for (ThreadSubscriber sub : this.getSubscribers()) {
			sub.start();
		}
	}
}
