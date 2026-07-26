package com.bookticket;//blc(business logic class)

public class Movie {
	private int movieId;
	private String movieName;
	private double ticketPrice;
	private int availableSeats;
	
	public Movie(int movieId, String movieName ,double ticketPrice,int availableSeats)
	{
		this.movieId=movieId;
		this.movieName=movieName;
		this.ticketPrice=ticketPrice;
		this.availableSeats=availableSeats;
	}
	
	//setters
	public void setMovieId(int movieId)
	{
		this.movieId=movieId;
	}
	
	public void setMovieName(String movieName)
	{
		this.movieName=movieName;
	}
	
	public void setTicketPrice(double ticketPrice)
	{
		this.ticketPrice=ticketPrice;
	}
	
	public void setAvailableSeats(int availableSeats)
	{
		this.availableSeats=availableSeats;
	}
	
	//getters
	public int getMovieId()
	{
		
	return movieId;
	}
	
	public String getMovieName()
	{
		return movieName;
	}
	
	public double getTicketPrice()
	{
		return ticketPrice;
	}
	
	public int getAvailableSeats()
	{
		return availableSeats;
	}
	
	//business logic
	public void showMovieDetails()
	{
		System.out.println(movieId);
		System.out.println(movieName);
		System.out.println(ticketPrice);
		System.out.println(availableSeats);
	}
	
	public void bookTickets(int bookTickets)
	{
		if(bookTickets<=0)
		{
		    throw new IllegalArgumentException("Invalid number of tickets.");
		}
		
		else if(bookTickets>availableSeats)
		{
		    throw new IllegalArgumentException("Seats not available.");
		}
		
		else
		{
			System.out.println(bookTickets+" tickets booked");
			availableSeats=availableSeats-bookTickets;
			double totalAmount=bookTickets*ticketPrice;
			System.out.println("total Amount: "+totalAmount);
			System.out.println("Tickets Sucessfully Booked");
			System.out.println("Remaining Seats: " + availableSeats);
		}
	}
	
	public void cancelTickets(int cancelTickets)
	{
		if(cancelTickets<=0)
		{
			throw new IllegalArgumentException("invalid number of tickets");
		}
		else
		{
			availableSeats=availableSeats+cancelTickets;
			System.out.println(cancelTickets+" tickets cancelled");
			System.out.println("ticket cancellation sucess");
			System.out.println("Remaining Seats: " + availableSeats);
		}
		
	}
	
	

}
