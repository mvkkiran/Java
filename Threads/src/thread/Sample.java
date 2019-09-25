package thread;
import java.lang.Thread;;

public class Sample extends Thread {
	
	public static void main(String args[])
	{
		Thread[] t=new Thread[2];
		
		for(int count=0;count<t.length;count++)
		{
			t[count]=new Thread(new Runnable() {
				
				@Override
				public void run() {
				
					count();
				}
			});
			t[count].start();
		}
			
		
	}
	
	public static void count()
	{
		try{
		for(double count=1;count<1000;count++){
			System.out.println(count+ " ");
			Thread.sleep(1000);
		
		}
		}
		catch (InterruptedException e) {
			System.out.println();
		}
	}
}
