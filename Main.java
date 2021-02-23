package Poised;
import java.util.*;


public class Main {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

            // Capturing values and storing them in the Person class' attributes.

            System.out.println("Enter the contractor's name: ");
            String name = input.nextLine();

            System.out.println("Enter a telephone number: ");
            String telephoneNum = input.nextLine();

            System.out.println("Enter an email: ");
            String email = input.nextLine();

            System.out.println("Enter the contractor's address: ");
            String address = input.nextLine();


            Person Architect = new Person(name, telephoneNum, email, address);

            System.out.println(Architect);

            // Capturing data and saving them as attributes that belong to the Project class.

        System.out.println("Enter project number: ");
        int projectNum = input.nextInt();
        input.nextLine();

        System.out.println("Enter project name: ");
        String projectName = input.nextLine();

        System.out.println("Enter building type: ");
        String buildingType = input.nextLine();

        System.out.println("Enter the building address: ");
        String buildingAddress = input.nextLine();

        System.out.println("Please enter the ERF number: ");
        String erfNum = input.nextLine();

        System.out.println("What is the project fee? ");
        long projectFee = input.nextLong();


        System.out.println("What is the amount paid to date? ");
        long paidToDate = input.nextLong();
        input.nextLine();

        System.out.println("What is the deadline?");
        String deadline = input.nextLine();

        Project Poised = new Project(projectNum, projectName, buildingType, buildingAddress, erfNum, projectFee, paidToDate, deadline);

        System.out.println(Poised);


        System.out.println("Menu: ");
        System.out.println("uc = update contractor details ");
        System.out.println("ua = update amount paid ");
        System.out.println("ud = update deadline: ");


        String menu = input.nextLine();

        // Updating contractor details.

        if (menu.equals("uc")) {
            System.out.println("Enter the contractor's name: ");
            String newName = input.nextLine();

            System.out.println("Enter a telephone number: ");
            String newTelephoneNum = input.nextLine();

            System.out.println("Enter an email: ");
            String newEmail = input.nextLine();

            System.out.println("Enter the contractor's address: ");
            String newAddress = input.nextLine();
            // Updating the object attribute values.
            Architect.setName(newName);
            Architect.setTelephoneNum(newTelephoneNum);
            Architect.setEmail(newEmail);
            Architect.setAddress(newAddress);

            System.out.println(Architect);

        }

            // If this control structure is activated the user will be prompted to enter a new amount.
            // We then use the setter setPaidToDate to update the attribute value.
        if(menu.equals("ua")) {
            System.out.println("Enter the up-to-date amount: ");
            long newPaidToDate = input.nextLong();
            Poised.setPaidToDate(newPaidToDate);
            System.out.println(Poised);
        }

            // This control structure updates the deadline attribute.
        if (menu.equals("ud")) {
                System.out.println("Enter new deadline: ");
                String newDeadline = input.nextLine();
                // Update the deadline with the setDeadline method
                Poised.setDeadline(newDeadline);
                System.out.println(Poised);
            }
        }
    }