class MultiThreading implements Runnable
{
	public synchronized void Print(){
		try{
			for(int i = 0; i < 5; i++)
			{
				System.out.println(Thread.currentThread());
				System.out.println(i);

				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void run(){
		Print();
	}

	public static void main(String[] args)
	{
		MultiThreading mt = new MultiThreading();

		Thread t1 = new Thread(mt, "First Thread");
		Thread t2 = new Thread(mt, "Second Thread");
		Thread t3 = new Thread(mt, "Third Thread");

		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(10);

		t1.start();
		t2.start();
		t3.start();
	}
}