package com.bookticket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Movie ID: ");
			int movieId = sc.nextInt();

			System.out.print("Enter Movie Name: ");
			String movieName = sc.next();

			System.out.print("Enter Ticket Price: ");
			double ticketPrice = sc.nextDouble();

			System.out.print("Enter Available Seats: ");
			int availableSeats = sc.nextInt();
					
			Movie movie=new Movie(movieId,movieName,ticketPrice,availableSeats);
			
			int choice=0;
			do
			{
				System.out.println("  ");
				System.out.println("===== Movie Ticket Booking System =====");
				System.out.println("Ticket Booking system");
				System.out.println("1.view movie details");
				System.out.println("2.Book Ticket");
				System.out.println("3.Cancel Ticket");
				System.out.println("4.Exit");
				System.out.print("enter your choice: ");
				System.out.println(" ");
			
				try
				{
				
				choice=sc.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("movie details");
					movie.showMovieDetails();
					break;
				case 2:
					System.out.print("Enter number of tickets to book: ");
					int bookTickets=sc.nextInt();
					movie.bookTickets(bookTickets);
				break;
				case 3:
					System.out.print("Enter number of tickets to cancel: ");
					int cancelTickets=sc.nextInt();
					movie.cancelTickets(cancelTickets);
					break;
				case 4:
					System.out.println("Thank you");
					break;
				default :
					System.out.println("Invalid Menu Choice");
				}
				
				
				}
				
				
				catch(InputMismatchException e)
				{
					System.out.println("Enter Valid Number");
					
					sc.nextLine();
				}
			
				
			}while(choice != 4);
		}

	
}
}
