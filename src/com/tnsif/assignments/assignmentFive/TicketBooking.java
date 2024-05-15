package com.tnsif.assignments.assignmentFive;

public class TicketBooking 
{
   private String stageEvent;
   private String customer;
   private Integer noOfSeats;
   
   TicketBooking()
   {
	   this.stageEvent = "Example";
	   this.customer = "user";
	   this.noOfSeats = 0;
   }
   TicketBooking( String stageEvent,String customer,Integer noOfSeats)
   {
	   this.stageEvent = stageEvent;
	   this.customer = customer;
	   this.noOfSeats = noOfSeats;
   }
String getStageEvent() {
	return stageEvent;
}
void setStageEvent(String stageEvent) {
	this.stageEvent = stageEvent;
}
String getCustomer() {
	return customer;
}
void setCustomer(String customer) {
	this.customer = customer;
}
Integer getNoOfSeats() {
	return noOfSeats;
}
void setNoOfSeats(Integer noOfSeats) {
	this.noOfSeats = noOfSeats;
}
private void printBasic()
{
	System.out.println("\n --------- Transaction Details ---------");
 System.out.println("Stage Event : "+stageEvent);	
 System.out.println("Customer : "+customer);
 System.out.println("Number of Seats : "+noOfSeats);
}

  public void makePayment(Double amount)
  {
	  //cash payment
	  printBasic();
	
	  System.out.printf("Amount %.1f paid in cash",amount);
	  
  }
  public void makePayment(String walletNumber,Double amount)
  {
	  //wallet payment
	  printBasic();
	  System.out.printf("Amount %.1f paid using wallet number %s",amount,walletNumber);
  }
  public void makePayment(String name,Double amount,String creditCardName,String ccv) 
  {
	  //credit card payment
	  printBasic();
	  System.out.printf("Holder name : %s\nAmount %.1f paid using %s Card\nCCV : %s",name,amount,creditCardName,ccv);
  }
   
}
