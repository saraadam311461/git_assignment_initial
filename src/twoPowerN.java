

public class twoPowerN extends ThreadSubscriber implements ObserverTest {
	double input;
	public void notifySubscriber() {
        input = topic.getInput();
        System.out.println("2 Power of "+input+ "=" +execute() );  
	}
	@Override
    public String execute(){
		int x=2;
        double res =Math.pow(x, input );
        String result=String.valueOf(res);
        return result;
    }
    @Override
    public Boolean test() {
    	input=2;
    	if(!execute().equals("4"))
    	     return false;
    	else
    		
    	   return true;
    	
}
	
}
