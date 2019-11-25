public class CircleVolum extends ThreadSubscriber implements  ObserverTest 
{
      double input;
      
      public void notifySubscriber() {
    	  input=topic.getInput();
    	  System.out.println("Volume = " + execute());
      }
@Override
  public String execute()
     {   
            double  volume= (4*22*input*input*input)/(3*7);
            
            String result=String.valueOf(volume);
            
            return result;
      }
@Override
public Boolean test() {
	input = 5;
	if (execute().equals("523.8095238095239"))
	return true;
	else
		return false;
	
}
}