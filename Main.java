import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventManager manager = new EventManager();
        int choice;

        do {
            System.out.println("\n📅 Event Management System");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Update Event");
            System.out.println("4. Delete Event");
            System.out.println("5. Search Event by Name");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Event ID: ");
                     String id = sc.next();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Location: ");
                    String location = sc.nextLine();
                    System.out.print("Enter Date (DD-MM-YYYY): ");
                    String date = sc.nextLine();
                    System.out.print("Enter Time (HH:MM): ");
                    String time = sc.nextLine();
                    manager.addEvent(new Event(id, name, location, date, time));
                    break;

                case 2:
                    manager.viewEvents();
                    break;

                case 3:
                    System.out.print("Enter Event ID to update: ");
                    String uid = sc.next(); sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String uname = sc.nextLine();
                    System.out.print("Enter New Location: ");
                    String ulocation = sc.nextLine();
                    System.out.print("Enter New Date: ");
                    String udate = sc.nextLine();
                    System.out.print("Enter New Time: ");
                    String utime = sc.nextLine();
                    manager.updateEvent(uid, uname, ulocation, udate, utime);
                    break;

                case 4:
                    System.out.print("Enter Event ID to delete: ");
                    String did = sc.next();
                    manager.deleteEvent(did);
                    break;

                case 5:
                    System.out.print("Enter name to search: ");
                    String keyword = sc.nextLine();
                    manager.searchEventByName(keyword);
                    break;

                case 0:
                    System.out.println("👋 Exiting...");
                    break;

                default:
                    System.out.println("❌ Invalid choice.");
            }

        } while (choice != 0);
    }
}
