package Java;
import java.util.Scanner;

public class Weatherapp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherAPI weatherAPI = new WeatherAPI(); // Simulated weather API
        
        while (true) {
            System.out.println("Weather App Menu:");
            System.out.println("1. Get Temperature");
            System.out.println("2. Get Wind Speed");
            System.out.println("3. Get Pressure");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter date with time (yyyy-MM-dd HH:mm:ss): ");
                    String dateTime = scanner.nextLine();
                    double temperature = weatherAPI.getTemperature(dateTime);
                    System.out.println("Temperature on " + dateTime + ": " + temperature + "°C");
                    break;
                case 2:
                    System.out.print("Enter date with time (yyyy-MM-dd HH:mm:ss): ");
                    dateTime = scanner.nextLine();
                    double windSpeed = weatherAPI.getWindSpeed(dateTime);
                    System.out.println("Wind Speed on " + dateTime + ": " + windSpeed + " km/h");
                    break;
                case 3:
                    System.out.print("Enter date with time (yyyy-MM-dd HH:mm:ss): ");
                    dateTime = scanner.nextLine();
                    double pressure = weatherAPI.getPressure(dateTime);
                    System.out.println("Pressure on " + dateTime + ": " + pressure + " hPa");
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

class WeatherAPI {
    // Simulated API methods
    public double getTemperature(String dateTime) {
        // Replace with actual temperature retrieval logic
        return Math.random() * 30; // Random temperature between 0 and 30°C
    }

    public double getWindSpeed(String dateTime) {
        // Replace with actual wind speed retrieval logic
        return Math.random() * 20; // Random wind speed between 0 and 20 km/h
    }

    public double getPressure(String dateTime) {
        // Replace with actual pressure retrieval logic
        return 1000 + Math.random() * 50; // Random pressure between 1000 and 1050 hPa
    }
}