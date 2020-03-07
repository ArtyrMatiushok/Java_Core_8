package les8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month;
		boolean flag = true;
		while (flag) {
			System.out.println("Choose option: ");
			System.out.println("A - Check for a month");
			System.out.println("B - Output all the months with the same time of year");
			System.out.println("C - Print all months that have the same number of days");
			System.out.println("D - Displays all months that have fewer days");
			System.out.println("E - Display all months that have more days");
			System.out.println("F - Show next time of year");
			System.out.println("G - Display the previous time of year");
			System.out.println("H - Displays all months that have an even number of days");
			System.out.println("I - Displays all months that have an odd number of days");
			System.out.println("J - Displaying the month or month entered from "
					+ "the console has an even number of days");
			System.out.println("Q - exit");
			String str = in.nextLine();
			switch(str) {
			case "A":
			case "a":
				System.out.println("Enter month: ");
				month = in.nextLine();
				for (Months m : Months.values())
					if (month.equalsIgnoreCase(m.name()))
						System.out.println("Your month is " + month);
				break;
			case "B":
			case "b":
				System.out.println("Enter month: ");
				month = in.nextLine();
				Months m1 = null;
				for (Months m : Months.values())
					if (month.equalsIgnoreCase(m.name()))
						m1 = m;
				for (Months m : Months.values())
					if (m1.getSeason() == m.getSeason())
						System.out.println(m);
				break;
			case "C":
			case "c":
				System.out.println("Enter month: ");
				month = in.nextLine();
				Months m2 = null;
				for (Months m : Months.values())
					if (month.equalsIgnoreCase(m.name()))
						m2 = m;
				for (Months m : Months.values())
					if (m2.getDays() == m.getDays())
						System.out.println(m);
				break;
			case "D":
			case "d":
				System.out.println("Enter month: ");
				month = in.nextLine();
				Months m3 = null;
				for (Months m : Months.values())
					if (month.equalsIgnoreCase(m.name()))
						m3 = m;
				for (Months m : Months.values())
					if (m3.getDays() > m.getDays())
						System.out.println(m);
				break;
			case "E":
			case "e":
				System.out.println("Enter month: ");
				month = in.nextLine();
				Months m4 = null;
				for (Months m : Months.values())
					if (month.equalsIgnoreCase(m.name()))
						m4 = m;
				for (Months m : Months.values())
					if (m4.getDays() < m.getDays())
						System.out.println(m);
				break;
			case "F":
			case "f":
				System.out.println("Enter month: ");
				month = in.nextLine();
				Months m5 = null;
				for (Months m : Months.values())
					if (month.equalsIgnoreCase(m.name()))
						m5 = m;
				switch(m5.getSeason()) {
				case Winter: 
					System.out.println("Next time of year: " + Seasons.Spring);
					break;
				case Spring: 
					System.out.println("Next time of year: " + Seasons.Summer);
					break;
				case Summer: 
					System.out.println("Next time of year: " + Seasons.Fall);
					break;
				case Fall: 
					System.out.println("Next time of year: " + Seasons.Winter);
					break;
				}
				break;
			case "G":
			case "g":
				System.out.println("Enter month: ");
				month = in.nextLine();
				Months m6 = null;
				for (Months m : Months.values())
					if (month.equalsIgnoreCase(m.name()))
						m6 = m;
				switch(m6.getSeason()) {
				case Winter: 
					System.out.println("Previous time of year: " + Seasons.Fall);
					break;
				case Spring: 
					System.out.println("Previous time of year: " + Seasons.Winter);
					break;
				case Summer: 
					System.out.println("Previous time of year: " + Seasons.Spring);
					break;
				case Fall: 
					System.out.println("Previous time of year: " + Seasons.Summer);
					break;
				}
				break;
			case "H":
			case "h":
				for (Months m : Months.values())
					if (m.getDays() % 2 == 0)
						System.out.println(m);
				break;
			case "I":
			case "i":
				for (Months m : Months.values())
					if (m.getDays() % 2 != 0)
						System.out.println(m);
				break;
			case "J":
			case "j":
				System.out.println("Enter month: ");
				month = in.nextLine();
				Months m7 = null;
				for (Months m : Months.values())
					if (month.equalsIgnoreCase(m.name()))
						m7 = m;
				if (m7.getDays() % 2 == 0)
					System.out.println(m7 + " has an even number of day");
				else
					System.out.println(m7 + " has an odd number of day");
				break;
			case "Q":
			case "q":
				System.out.println("Exit");
				flag = false;
				break;
			default:
				System.out.println("Error");
			}
		}
	}

}

enum Seasons {
	Winter,
	Spring,
	Summer,
	Fall
}

enum Months {
	January(31, Seasons.Winter),
	February(28, Seasons.Winter),
	March(31, Seasons.Spring),
	April(30, Seasons.Spring),
	May(31, Seasons.Spring),
	June(30, Seasons.Summer),
	July(31, Seasons.Summer),
	August(31, Seasons.Summer),
	September(30, Seasons.Fall),
	October(31, Seasons.Fall),
	November(30, Seasons.Fall),
	December(31, Seasons.Winter);
	
	private int days;
	private Seasons season;
	
	private Months(int days, Seasons season) {
		this.setDays(days);
		this.setSeason(season);
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public Seasons getSeason() {
		return season;
	}

	public void setSeason(Seasons season) {
		this.season = season;
	}
}