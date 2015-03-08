package com.java.javaconcepts;
import java.lang.Thread;

public class ThreadingConcept {
	
	public static void main(String[] args)
	{
		Racer racer = new Racer();
		Thread tortoiseThread = new Thread(racer,"Tortoise");
		Thread hareThread = new Thread(racer,"Hare");
		
		tortoiseThread.start();
		hareThread.start();
	}
}


class Racer implements Runnable
{
	private static boolean winner= false;
	private int distance=0;
	@SuppressWarnings("static-access")
	void race()
	{
		
			for(int i=1;i<=100;i++)
			{
				if(Thread.currentThread().getName().equalsIgnoreCase("Hare") && i ==5)
				{
					try
					{
						System.out.println("Going into sleep mode....");
						Thread.currentThread().sleep(1000*5);
					}
					catch(InterruptedException ie)
					{
						ie.printStackTrace();
					}
					
				}
				System.out.println("Distance covered by "+Thread.currentThread().getName() + " " + i + " meters");
				distance++;
				
				if(winner== true){
					break;
				}
				else if(i >=100 )
				{
						System.out.println("current winner is "+ Thread.currentThread().getName());
						winner = true;
						break;	
				}
			}
		
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.race();
	}
	
}