import java.util.*;

class Customer {
    private String firstName;
    private String lastName;
    private String phone;
    private double serviceCost;
    private String service;
    private String stylistName;

    /**
     * Constructor for Customer class.
     * @param firstName the first name of the customer
     * @param lastName the last name of the customer
     * @param phone the phone number of the customer
     * @param serviceCost the cost of the service
     * @param service the service provided
     * @param stylistName the name of the stylist
     */
    Customer(String firstName, String lastName, String phone, double serviceCost, String service, String stylistName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.serviceCost = serviceCost;
        this.service = service;
        this.stylistName = stylistName;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getStylistName() {
        return stylistName;
    }

    public void setStylistName(String stylistName) {
        this.stylistName = stylistName;
    }
}

class Stylist {
    private int stylistID;
    private String name;
    private String title;

    /**
     * Constructor for Stylist class.
     * @param stylistID the ID of the stylist
     * @param name the name of the stylist
     * @param title the title of the stylist
     */
    Stylist(int stylistID, String name, String title) {
        this.stylistID = stylistID;
        this.name = name;
        this.title = title;
    }

    // Getters and Setters
    public int getStylistID() {
        return stylistID;
    }

    public void setStylistID(int stylistID) {
        this.stylistID = stylistID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

class Service {
    private int serviceID;
    private String serviceName;
    private double price;

    /**
     * Constructor for Service class.
     * @param serviceID the ID of the service
     * @param serviceName the name of the service
     * @param price the price of the service
     */
    Service(int serviceID, String serviceName, double price) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.price = price;
    }

    // Getters and Setters
    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class finalPreWork {
    static List<Customer> customerList;
    static List<Stylist> stylists;
    static List<Service> services;

    /**
     * Main method to execute all tasks.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        customerList = initializeCustomers();
        stylists = initializeStylists();
        services = initializeServices();

        boolean exit = false;
        while (!exit) {
            System.out.println("===== MENU =====");
            System.out.println("1. Take user input data");
            System.out.println("2. Generate sample report of customers served by each stylist");
            System.out.println("3. Sort all customers by service cost (highest cost first)");
            System.out.println("4. Sort alphabetically all customers by their last name");
            System.out.println("5. Calculate cost of service for each service type");
            System.out.println("6. Search and identify the customer who has paid the highest service cost");
            System.out.println("7. Search and identify the customer who has paid the lowest service cost");
            System.out.println("8. Take user input (stylist name) - find the allocated customers to stylist with their required services");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    takeUserInput(scanner);
                    break;
                case 2:
                    generateReportByStylist(customerList);
                    break;
                case 3:
                    sortCustomersByServiceCost(customerList);
                    break;
                case 4:
                    sortCustomersByLastName(customerList);
                    break;
                case 5:
                    calculateServiceCost(customerList);
                    break;
                case 6:
                    findCustomerWithHighestCost(customerList);
                    break;
                case 7:
                    findCustomerWithLowestCost(customerList);
                    break;
                case 8:
                    String stylistName = readStylistName(scanner);
                    findAllocatedCustomersForStylist(stylistName);
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 9.");
            }
        }

        System.out.println("Exiting program.");
        scanner.close();
    }

    /**
     * Initializes the list of customers.
     * @return a list of initial customers
     */
    public static List<Customer> initializeCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("James", "Roberts", "(49) 123-4567", 20, "Haircut", "Georgia"));
        customers.add(new Customer("Ali", "Akbar", "(49) 123-4576", 30, "Hair Colouring", "Richard"));
        customers.add(new Customer("Maria", "Dawson", "(49) 123-4675", 35, "Styling", "Georgia"));
        customers.add(new Customer("Emmett", "Miller", "(49) 1235674", 50, "Perming", "Georgia"));
        customers.add(new Customer("Lily", "Taylor", "(49) 12-45673", 45, "Treatment", "Richard"));
        customers.add(new Customer("Peter", "Harley", "(49) 23-45671", 55, "Hair cut, Styling", "Bill"));
        return customers;
    }

    /**
     * Initializes the list of stylists.
     * @return a list of initial stylists
     */
    public static List<Stylist> initializeStylists() {
        List<Stylist> stylists = new ArrayList<>();
        stylists.add(new Stylist(1, "Georgia", "Senior Stylist"));
        stylists.add(new Stylist(2, "Richard", "Stylist"));
        stylists.add(new Stylist(3, "Bill", "Stylist"));
        return stylists;
    }

    /**
     * Initializes the list of services.
     * @return a list of initial services
     */
    public static List<Service> initializeServices() {
        List<Service> services = new ArrayList<>();
        services.add(new Service(1, "Haircut", 20));
        services.add(new Service(2, "Hair Colouring", 30));
        services.add(new Service(3, "Styling", 35));
        services.add(new Service(4, "Perming", 50));
        services.add(new Service(5, "Treatment", 45));
        return services;
    }

    /**
     * Takes user input data for a new customer.
     * @param scanner Scanner object to read user input
     */
    public static void takeUserInput(Scanner scanner) {
        String firstName = "";
        while (firstName.isEmpty()) {
            System.out.print("First Name: ");
            firstName = scanner.nextLine().trim();
            if (firstName.isEmpty()) {
                System.out.println("Error: First name cannot be empty. Please enter a valid first name.");
            }
        }

        String lastName = "";
        while (lastName.isEmpty()) {
            System.out.print("Last Name: ");
            lastName = scanner.nextLine().trim();
            if (lastName.isEmpty()) {
                System.out.println("Error: Last name cannot be empty. Please enter a valid last name.");
            }
        }

        String phone = "";
        while (phone.isEmpty() || !isValidPhoneNumber(phone)) {
            System.out.print("Phone Number (Format: XXXXXXXXXX or XXX-XXXXXXX): ");
            phone = scanner.nextLine().trim();
            if (phone.isEmpty() || !isValidPhoneNumber(phone)) {
                System.out.println("Error: Invalid phone number format. Please enter a valid phone number.");
            }
        }
        phone = formatPhoneNumber(phone);

        double serviceCost = 0.0;
        while (serviceCost <= 0) {
            System.out.print("Service Cost (Positive number only): ");
            try {
                serviceCost = Double.parseDouble(scanner.nextLine());
                if (serviceCost <= 0) {
                    System.out.println("Error: Service cost must be a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
            }
        }

        System.out.print("Service: ");
        String servicesInput = scanner.nextLine().trim();

        // Split services by comma and trim spaces
        String[] services = servicesInput.split("\\s*,\\s*");

        System.out.print("Stylist Name: ");
        String stylistName = scanner.nextLine().trim();

        // Add each service separately
        for (String service : services) {
            Customer newCustomer = new Customer(firstName, lastName, phone, serviceCost, service, stylistName);
            customerList.add(newCustomer);
        }

        System.out.println("Customer data added successfully.");
    }

    /**
     * Checks if the provided phone number string is in a valid format.
     * @param phoneNumber the phone number string to validate
     * @return true if the phone number is valid, false otherwise
     */
    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{9}|\\d{3}-\\d{7}");
    }

    /**
     * Formats the provided phone number string into (XX) XXX-XXXX or (XX) XXX-XXXXX format.
     * @param phoneNumber the phone number string to format
     * @return the formatted phone number
     */
    private static String formatPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("\\d{9}")) {
            return "(" + phoneNumber.substring(0, 2) + ") " + phoneNumber.substring(2, 5) + "-" + phoneNumber.substring(5);
        } else if (phoneNumber.matches("\\d{3}-\\d{7}")) {
            return "(" + phoneNumber.substring(0, 2) + ") " + phoneNumber.substring(2, 5) + "-" + phoneNumber.substring(6);
        }
        // Default return if not matching any expected format
        return phoneNumber;
    }

    /**
     * Generates a sample report of customers served by each stylist.
     * @param customers the list of customers
     */
    public static void generateReportByStylist(List<Customer> customers) {
        Map<String, List<Customer>> stylistCustomerMap = new HashMap<>();

        for (Customer customer : customers) {
            String stylistName = customer.getStylistName();
            stylistCustomerMap.putIfAbsent(stylistName, new ArrayList<>());
            stylistCustomerMap.get(stylistName).add(customer);
        }

        System.out.println("===== REPORT: Customers Served by Each Stylist =====");
        for (Map.Entry<String, List<Customer>> entry : stylistCustomerMap.entrySet()) {
            String stylistName = entry.getKey();
            List<Customer> stylistCustomers = entry.getValue();

            System.out.println("Stylist: " + stylistName);
            for (Customer customer : stylistCustomers) {
                System.out.println("- " + customer.getFirstName() + " " + customer.getLastName());
            }
        }
    }

    /**
     * Sorts all customers by service cost (highest cost first).
     * @param customers the list of customers to be sorted
     */
    public static void sortCustomersByServiceCost(List<Customer> customers) {
        customers.sort(Comparator.comparingDouble(Customer::getServiceCost).reversed());

        System.out.println("===== Customers Sorted by Service Cost (Highest Cost First) =====");
        for (Customer customer : customers) {
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " - Service Cost: $" + customer.getServiceCost());
        }
    }

    /**
     * Sorts all customers alphabetically by their last name.
     * @param customers the list of customers to be sorted
     */
    public static void sortCustomersByLastName(List<Customer> customers) {
        customers.sort(Comparator.comparing(Customer::getLastName));

        System.out.println("===== Customers Sorted Alphabetically by Last Name =====");
        for (Customer customer : customers) {
            System.out.println(customer.getFirstName() + " " + customer.getLastName());
        }
    }

    /**
     * Calculates the total cost of each service type.
     * @param customers the list of customers
     */
    public static void calculateServiceCost(List<Customer> customers) {
        Map<String, Double> serviceCostMap = new HashMap<>();

        for (Customer customer : customers) {
            String service = customer.getService();
            double cost = customer.getServiceCost();
            serviceCostMap.put(service, serviceCostMap.getOrDefault(service, 0.0) + cost);
        }

        System.out.println("===== Total Cost of Each Service Type =====");
        for (Map.Entry<String, Double> entry : serviceCostMap.entrySet()) {
            System.out.println("Service: " + entry.getKey() + " - Total Cost: $" + entry.getValue());
        }
    }

    /**
     * Searches and identifies the customer who has paid the highest service cost.
     * @param customers the list of customers
     */
    public static void findCustomerWithHighestCost(List<Customer> customers) {
        Customer highestCostCustomer = customers.stream()
            .max(Comparator.comparingDouble(Customer::getServiceCost))
            .orElse(null);

        if (highestCostCustomer != null) {
            System.out.println("Customer with the Highest Service Cost: " + highestCostCustomer.getFirstName() + " " + highestCostCustomer.getLastName() + " - Service Cost: $" + highestCostCustomer.getServiceCost());
        } else {
            System.out.println("No customers found.");
        }
    }

    /**
     * Searches and identifies the customer who has paid the lowest service cost.
     * @param customers the list of customers
     */
    public static void findCustomerWithLowestCost(List<Customer> customers) {
        Customer lowestCostCustomer = customers.stream()
            .min(Comparator.comparingDouble(Customer::getServiceCost))
            .orElse(null);

        if (lowestCostCustomer != null) {
            System.out.println("Customer with the Lowest Service Cost: " + lowestCostCustomer.getFirstName() + " " + lowestCostCustomer.getLastName() + " - Service Cost: $" + lowestCostCustomer.getServiceCost());
        } else {
            System.out.println("No customers found.");
        }
    }

    /**
     * Reads the stylist name from user input.
     * @param scanner Scanner object to read user input
     * @return the stylist name entered by the user
     */
    public static String readStylistName(Scanner scanner) {
        System.out.print("Enter Stylist Name: ");
        return scanner.nextLine().trim();
    }

    /**
     * Finds and prints the customers allocated to a given stylist.
     * @param stylistName the name of the stylist
     */
    public static void findAllocatedCustomersForStylist(String stylistName) {
        List<Customer> allocatedCustomers = new ArrayList<>();

        for (Customer customer : customerList) {
            if (customer.getStylistName().equalsIgnoreCase(stylistName)) {
                allocatedCustomers.add(customer);
            }
        }

        if (allocatedCustomers.isEmpty()) {
            System.out.println("No customers found for stylist: " + stylistName);
        } else {
            System.out.println("Customers allocated to stylist " + stylistName + ":");
            for (Customer customer : allocatedCustomers) {
                System.out.println("- " + customer.getFirstName() + " " + customer.getLastName() + " - Service: " + customer.getService());
            }
        }
    }

    /**
     * Adds a new stylist to the list if it does not already exist.
     * @param name the name of the stylist to add
     * @param title the title of the stylist
     */
    public static void addNewStylist(String name, String title) {
        for (Stylist stylist : stylists) {
            if (stylist.getName().equalsIgnoreCase(name)) {
                return; // Stylist already exists
            }
        }
        stylists.add(new Stylist(stylists.size() + 1, name, title));
        System.out.println("New stylist added: " + name);
    }

    /**
     * Adds a new service to the list if it does not already exist.
     * @param serviceName the name of the service to add
     * @param price the price of the service
     */
    public static void addNewService(String serviceName, double price) {
        for (Service service : services) {
            if (service.getServiceName().equalsIgnoreCase(serviceName)) {
                return; // Service already exists
            }
        }
        services.add(new Service(services.size() + 1, serviceName, price));
        System.out.println("New service added: " + serviceName);
    }

}
