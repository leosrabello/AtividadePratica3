import java.util.ArrayList;

public class Main {

    private static EmpList empList = new EmpList();

    public static void main(String[] args) {

        while (true) {

            System.out.println("Main Menu: ");
            System.out.println("1 - Add a new Employee");
            System.out.println("2 - Seach Employee By Name");
            System.out.println("3 - Search Employee By ID");
            System.out.println("4 - Show All Employees");
            System.out.println("5 - Remove Employees By Name");
            System.out.println("6 - Remove Employee By ID");
            System.out.println("0 - Quit\n");

            int op = Console.readInt();

            switch (op) {

                case 1:
                    addEmp();
                    break;

                case 2:

                    deleteByName();
                    break;

                case 3:

                    deleteById();
                    break;

                case 4:
                
                    showEmps();
                    break;

                case 5:

                    searchByName();
                    break;

                case 6:
                
                    searchByID();
                    break;

                case 0:

                    System.out.println("Quitting");
                    System.exit(0);
                    break;

                default:

                    System.out.println("Choose a valid option.");
            }
        }
    }

    private static void addEmp() {

        System.out.println("Choose an Employee:");
        System.out.println("1 - Intern");
        System.out.println("2 - Developer");
        System.out.println("3 - Manager\n");

        int EmployeeOpt = Console.readInt();

        System.out.println("Employee's name:\n ");
        String name = Console.readString();

        System.out.println("Employee's ID:\n");
        int id = Console.readInt();

        switch (EmployeeOpt) {
            
            case 1:
            
            System.out.println("Type how many worked hours the intern has:");
            int wrkdHrs = Console.readInt();
            
            System.out.println("Type the Intern's supervisor:");
            String supervisor = Console.readString();
            
            Intern intern = new Intern(name, id, supervisor, wrkdHrs);
            empList.addEmp(intern);
            break;
            
            case 2:
            
            Developer developer = new Developer(name, id, new ArrayList<>());
            empList.addEmp(developer);
            break;
            
            case 3:
            
                System.out.println("Manager's Team:");
                String team = Console.readString();

                System.out.println("Manager's Yealy Bonus: ");
                double YearlyBonus = Console.readDouble();

                Manager manager = new Manager(name, id, YearlyBonus, team);
                empList.addEmp(manager);
                break;

            default:

                System.out.println("Error !\n Choose one of the options.");

        }

    }

    private static void deleteByName() {

        System.out.println("Type an Employee's name: ");
        String name = Console.readString();
        empList.deleteByName(name);

    }

    private static void deleteById() {

        System.out.println("Type an Employee's ID: ");
        int id = Console.readInt();
        empList.deleteById(id);

    }

    private static void showEmps() {

        System.out.println("Employee's List:");
        empList.showEmps();

    }


    private static void searchByName() {

        System.out.println("Type an Employee's name: ");
        String name = Console.readString();
        Employee empTrue = empList.searchByName(name);

        if (empTrue != null) {
            System.out.println("Employee: " + empTrue.name);
        } else {
            System.out.println("This employee does not exist");
        }

    }

    private static void searchByID() {

        System.out.println("Type an Employee's ID:");
        int id = Console.readInt();

        Employee empTrue = empList.searchById(id);

        if (empTrue != null) {
            System.out.println("Employee: " + empTrue.name);
        } else {
            System.out.println("This employee does not exist");
        }
    }
}
