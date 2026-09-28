/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package report;

/**
 *
 * @author Fentsey Oliphant
 */
public class Report {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        // Declare and populate single-dimensional array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
     
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };
        
        // Array to store the total sales for each city
        int[] cityTotals = new int[cities.length];
        
        // Variables to track the city with the most sales
        int maxSales = 0;
        String topCity = "";

        //PRINT REPORT HEADER 
        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        
        // Print console column headers
        System.out.printf("%-16s %-10s %-10s %-10s%n", "", "PS5", "XBOX", "SWITCH");
        
        // PRINT DATA AND CALCULATE TOTALS 
        for (int i = 0; i < sales.length; i++) {
            // Print the city name
            System.out.printf("%-16s", cities[i]);
            
            int rowTotal = 0;
            
            // Loop through the columns (consoles) for the current city
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-10d", sales[i][j]);
                rowTotal += sales[i][j]; // Add to city's total
            }
            
            // Store the calculated total in the single-dimensional array
            cityTotals[i] = rowTotal;
            System.out.println(); // Move to next line for the next city
        }
        
        // --- PRINT TOTALS SECTION ---
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-16s %d%n", cities[i], cityTotals[i]);
            
            // Determine the city with the most sales
            if (cityTotals[i] > maxSales) {
                maxSales = cityTotals[i];
                topCity = cities[i];
            }
        }
        
        // --- PRINT TOP CITY ---
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("--------------------------------------------------");
    }
}