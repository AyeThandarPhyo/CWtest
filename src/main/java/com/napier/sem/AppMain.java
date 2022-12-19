package com.napier.sem;

public class AppMain {

    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();

        // Get info from city table
        City cty = a.getCity(1);
        // Display results
        a.displayCity(cty);

        // Disconnect from database
        a.disconnect();
    }

}
