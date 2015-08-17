package practice;

public class TwiceThread extends Thread {
	public void run(){
		System.out.println("Run");
	}
		public static void main(String[] args){
			Thread t=new Thread();
		t.start();
		t.start();/**It is never legal to start a thread more than once. In particular,
		a thread may not be restarted once it has completed execution.**/
		}
	}


