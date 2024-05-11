package com.queue;

import java.time.LocalDate;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			DoublyLinearList<Movie> list = new DoublyLinearList<Movie>();
			int choice =0;
			do {
				System.out.println("\n1.push"
						+ "\n2.pop"
						+ "\n3.peek"
						+ "\n4. find all movie published after given year"
						+ "\n5. reverse queue"
						+ "\n6. print queue");
				System.out.println("Enter your choice");
				choice = sc.nextInt();

				try {
					switch(choice) {

					case 1:
						//int movie_id, String movie_name, String actor, String director, LocalDate release_date
						System.out.println("Enter movie name");
						String movie_name = sc.next();
						System.out.println("Enter actor name");
						String actor = sc.next();
						System.out.println("Enter director name");
						String director = sc.next();
						System.out.println("Enter movie release date");
						LocalDate date = LocalDate.parse(sc.next());
						Movie movie = new Movie(movie_name,actor,director,date);
						list.push(movie);
						break;

					case 2:
						list.pop();
						break;

					case 3:

						System.out.println(list.peek());
						break;

					case 4:
						System.out.println("enter year");
						LocalDate dateYear = LocalDate.parse(sc.next());
						Node<Movie> temp = list.head;
						while(temp != null) {
							if(temp.data.getRelease_date().isAfter(dateYear)) {
								System.out.println(temp.data.getMovie_name());
								
							}
							temp = temp.next;
						}
						break;
					case 5:

						list = list.reverse();
						for(Node n = list.head; n != null; n = n.next) {
							System.out.print(n.data.toString());
						}
						break;
					case 6:
						list.print();
						break;
					}

				}catch(Exception e) {
					System.err.println(e.getMessage());
				}


			}while(choice != 0);

		}
	}

}
