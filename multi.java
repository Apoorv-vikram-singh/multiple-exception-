//multi threading 
class thread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<15;i++)
			{
				System.out.println("raman .."+i);
				sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{
		try
		{
			for(int j=60;j<100;j=j+2)
			{
				System.out.println("manisha.."+j);
				sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class multi 
{
	public static void main(String args[])
	{
		thread1 obj=new thread1();
		thread2 obj1=new thread2();
		obj.start();
		obj1.start();
	}
}