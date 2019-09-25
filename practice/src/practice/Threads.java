package practice;



public class Threads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		samplethreads t=new samplethreads();
		Thread th=new Thread(t);
		th.start();
		

	}

}
class samplethreads implements Runnable{
	
	public void run(){
		while(true){
			System.out.println("kiran");
		}
	}

}
