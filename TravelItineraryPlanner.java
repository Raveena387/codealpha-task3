import java.util.ArrayList;
import java.util.Scanner;
public class TravelItineraryPlanner {
static class Destination {
String name;
String startDate;
String endDate;
String preferences;
public Destination(String name, String startDate, String endDate, String preferences) {
this.name = name;
this.startDate = startDate;
this.endDate = endDate;
this.preferences = preferences;
}
@Override
public String toString() {
return "Destination: " + name + "\n" +
"Travel Dates: " + startDate + " to " + endDate + "\n" +
"Preferences: " + preferences;
}
}
private ArrayList<Destination> itinerary = new ArrayList<>();
private double budget;
public void addDestination(String name, String startDate, String endDate, String preferences) {
Destination destination = new Destination(name, startDate, endDate, preferences);
itinerary.add(destination);
System.out.println("Destination added successfully!\n");
}
public void displayItinerary() {
if (itinerary.isEmpty()) {
System.out.println("No destinations in the itinerary yet!");
return;
}
System.out.println("\nYour Travel Itinerary:");
for (int i = 0; i < itinerary.size(); i++) {
System.out.println("---- Destination " + (i + 1) + " ----");
System.out.println(itinerary.get(i));}}
public void setBudget(double budget) {
if (budget > 0) {
this.budget = budget;
System.out.println("Budget set to $" + budget);
} else {
System.out.println("Invalid budget amount!");
}
}
public void showMap(String location) {
System.out.println("Map information for " + location + " (Placeholder - integrate with APIs like Google Maps)");
}
public void showWeather(String location) {
System.out.println("Weather information for " + location + " (Placeholder - integrate with APIs like OpenWeatherMap)");}
public void showMenu() {
Scanner scanner = new Scanner(System.in);
int choice;
do {
System.out.println("\nTravel Itinerary Planner");
System.out.println("1. Add Destination");
System.out.println("2. View Itinerary");
System.out.println("3. Set Budget");
System.out.println("4. Show Map");
System.out.println("5. Show Weather");
System.out.println("6. Exit");
System.out.print("Enter your choice: ");
choice = scanner.nextInt();
scanner.nextLine(); 
switch (choice) {
case 1:
System.out.print("Enter destination name: ");
String name = scanner.nextLine();
System.out.print("Enter start date (YYYY-MM-DD): ");
String startDate = scanner.nextLine();
System.out.print("Enter end date (YYYY-MM-DD): ");
String endDate = scanner.nextLine();
System.out.print("Enter preferences (e.g., sightseeing, food, adventure): ");
String preferences = scanner.nextLine();
addDestination(name, startDate, endDate, preferences);
break;
case 2:
displayItinerary();
break;
case 3:
System.out.print("Enter your travel budget: ");
double budget = scanner.nextDouble();
setBudget(budget);
break;
case 4:
System.out.print("Enter location for map info: ");
String mapLocation = scanner.nextLine();
showMap(mapLocation);
break;
case 5:
System.out.print("Enter location for weather info: ");
String weatherLocation = scanner.nextLine();
showWeather(weatherLocation);
break;
case 6:
System.out.println("Thank you for using the Travel Itinerary Planner. Safe travels!");
break;
default:
System.out.println("Invalid choice! Please try again.");
}
} while (choice != 6);
scanner.close();
}
public static void main(String[] args) {
TravelItineraryPlanner planner = new TravelItineraryPlanner();
planner.showMenu();
}
}
