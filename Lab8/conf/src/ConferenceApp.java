
import java.util.Scanner;
import utils.*;

public class ConferenceApp {
    public static void main(String[] args) {
        AttendeeDAO attendeeDAO = new AttendeeDAO();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conference Management System");
        System.out.println("1. Add Attendee");
        System.out.println("2. Delete Attendee");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter full name:");
                String fullName = scanner.next();
                System.out.println("Enter email:");
                String email = scanner.next();
                System.out.println("Enter contact number:");
                String contactNumber = scanner.next();
                System.out.println("Enter country:");
                String country = scanner.next();
                attendeeDAO.addAttendee(new Attendee(fullName, email, contactNumber, country));
                break;

            case 2:
                System.out.println("Enter Attendee ID to delete:");
                int id = scanner.nextInt();
                attendeeDAO.deleteAttendee(id);
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
