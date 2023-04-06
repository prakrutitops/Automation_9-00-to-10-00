package com.a64;

class Sender
{
	
	void send(String msg) 
	{
		// TODO Auto-generated constructor stub
		System.out.println("sending "+msg);
		
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println(msg+" sent ");
	}
	
}

class Threadsend extends Thread
{
	Sender sender;
	String msg;
	
	public Threadsend(String msg,Sender sender) 
	{
		// TODO Auto-generated constructor stub
		this.msg=msg;
		this.sender=sender;
	}
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		//super.run();
		synchronized (sender) 
		{
			sender.send(msg);
		}
		
	}
	
}

public class SyncDemo 
{
	public static void main(String[] args)
	{
		Sender s1 =new Sender();
		
		Threadsend t1 =new Threadsend("Hii",s1);
		Threadsend t2 =new Threadsend("Byee",s1);
		
		t1.start();
		t2.start();
	}
}
