package eshop;

import org.testng.annotations.Test;

public class PaymentEx
{
	@Test(groups = {"smoke","sanity"})
	public void creditcard()
	{
		System.out.println("Running Credit Card..");
	}
	
	@Test
	public void debitcard()
	{
		System.out.println("Running Debit Card..");
	}
	
	@Test(groups = "sanity")
	public void cod()
	{
		System.out.println("Running COD..");
	}
	
}
