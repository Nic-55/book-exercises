/*  
 * Yuhe Wang 301090121 Formative Exercise
 * Problems chosen:
 *     1.	The total sales for each department per quarter i.e. “2nd Quarter totals: Electrical, £208,000”
 *     2.	The name of the best and worst performing department per quarter, 
 *          with its respective monthly sales i.e. “2nd Quarter best: Electrical, £67,000, £63,000, £78,000” 
 *          for the second quarter.
 *     4.	Given the total sales for each quarter, calculate the tax that needs to be paid at 17%.
 */

public class Quarterly_Report {
    // Hardcoded sales data in a 2D array
    int[][] salesData = {
            {67, 65, 63, 18, 16}, // April
            {63, 67, 63, 24, 23}, // May
            {78, 56, 65, 22, 21}, // June
            {78, 45, 71, 19, 19}, // July
            {104, 56, 73, 17, 20}, // August
            {103, 72, 69, 16, 19} // September
    };

    // A list of all departments (5 in total)
    String[] departments = {"Electrical", "Kitchen", "Bathroom", "Soft Furnishing", "Accessories"};
    // Declare 2 arrays to store sales info by quarter
    int[] secondQuarterTotalSales = new int[departments.length];
    int[] thirdQuarterTotalSales = new int[departments.length];

    // execution starts here in main
    public static void main(String[] args) {
        // Create an instance of quarterlyReport to access non-static members
        Quarterly_Report report = new Quarterly_Report();
        
//Problem 1   
        // call the method that calculates the quarterly sales
        calculateQuarterlySales(report.salesData, report.departments.length, report.secondQuarterTotalSales, report.thirdQuarterTotalSales);

        // Print the quarterly sales result
        printQuarterlylySales(report);
    
//Problem 2   
     // Find max and max & min values for second & third quarter total sales
        int maxSecondQuarterSales = findMax(report.secondQuarterTotalSales);
        int minSecondQuarterSales = findMin(report.secondQuarterTotalSales);
        int maxThirdQuarterSales = findMax(report.thirdQuarterTotalSales);
        int minThirdQuarterSales = findMin(report.thirdQuarterTotalSales);
     // Print the best and worst department with their monthly sales for each quarter
        System.out.println( );
        System.out.println("***Best and Worst***:");
        printBestAndWorstDepartments(report.secondQuarterTotalSales, maxSecondQuarterSales, minSecondQuarterSales, "2nd Quarter");
        printBestAndWorstDepartments(report.thirdQuarterTotalSales, maxThirdQuarterSales, minThirdQuarterSales, "3rd Quarter");
    
//Problem 3
        // Calculate and print the tax for each quarter
        System.out.println();
        System.out.println("***Tax for each quarter***:");
        calculateAndPrintTax(report.secondQuarterTotalSales, "2nd Quarter");
        calculateAndPrintTax(report.thirdQuarterTotalSales, "3rd Quarter");
    }
        
        
// ============Methods from here
    // Calculate the quarterly sales
    public static void calculateQuarterlySales(int[][] salesData, int numberOfDepartments, int[] secondQuarterTotalSales, int[] thirdQuarterTotalSales) {
        // Calculate the totals for the second quarter (April, May, June)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < numberOfDepartments; j++) { // 5 departments
                secondQuarterTotalSales[j] += salesData[i][j];
            }
        }
        
    // Calculate the totals for the third quarter (July, August, September)
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < numberOfDepartments; j++) {
                thirdQuarterTotalSales[j] += salesData[i][j];
            }
        }
    }
    
    // Print quarterly sales 
    public static void printQuarterlylySales(Quarterly_Report report) {
    	System.out.println("***Quarterly Sales***:");
        for (int i = 0; i < report.departments.length; i++) {
            System.out.println(report.departments[i] + " department 2nd Quarter totals: " + "£" + report.secondQuarterTotalSales[i] * 1000);
            System.out.println(report.departments[i] + " department 3rd Quarter totals: " + "£" + report.thirdQuarterTotalSales[i] * 1000);
        }
    }

    // Find the max value in an array
    public static int findMax(int[] array) {
        int max = array[0]; // Initialize max with the first element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    // Find the min value in an array
    public static int findMin(int[] array) {
        int min = array[0]; // Initialize min with the first element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    // Print the best and worst department with their monthly sales for a quarter
    public static void printBestAndWorstDepartments(int[] quarterlyTotalSales, int maxSales, int minSales, String quarter) {
    	// Create an instance of quarterlyReport to access non-static members
    	Quarterly_Report report = new Quarterly_Report();
        
    	System.out.println(quarter + " best: ");
        for (int i = 0; i < quarterlyTotalSales.length; i++) {
            if (quarterlyTotalSales[i] == maxSales) {
                System.out.println("  " + report.departments[i] + ", ");
                printMonthlySales(quarter, i);
                System.out.println();
            }
        }
        System.out.println(quarter + " worst: ");
        for (int i = 0; i < quarterlyTotalSales.length; i++) {
            if (quarterlyTotalSales[i] == minSales) {
                System.out.println("  " + report.departments[i] + ", ");
                printMonthlySales(quarter, i);
                System.out.println();
            }
        }
    }
    
    // Print monthly sales for a department in a quarter
    public static void printMonthlySales(String quarter, int departmentIndex) {
    	// Create an instance of quarterlyReport to access non-static members
    	Quarterly_Report report = new Quarterly_Report();
    	int startMonth;
    	if (quarter.equals("2nd Quarter")) {
    	    startMonth = 0;
    	} else {
    	    startMonth = 3;
    	}
        int endMonth = startMonth + 3;
        for (int i = startMonth; i < endMonth; i++) {
            System.out.print("£" + report.salesData[i][departmentIndex] * 1000);
            if (i < endMonth - 1) {
                System.out.print(", ");
            }
        }
    }
   
    // Calculate and print tax for each quarter
    public static void calculateAndPrintTax(int[] quarterlyTotalSales, String quarter) {
    	double totalSales = 0;
        for (int sales : quarterlyTotalSales) {
            totalSales += sales;
        }
        double taxRate = 0.17; //set a variable so it's easy to change
        double tax = totalSales * taxRate;
        System.out.println(quarter + " tax: £" + tax * 1000);
    }


}
