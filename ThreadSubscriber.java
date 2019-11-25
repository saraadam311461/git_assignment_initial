public abstract class ThreadSubscriber extends Thread implements ISubscriber {
    Topic topic;

    public ThreadSubscriber(){

    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    @Override
    public abstract void notifySubscriber();
    public abstract String execute();

    @Override
    public void run() {
        notifySubscriber();
    }
}
