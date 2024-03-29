package week9;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountriesExample {
    public static ArrayList<String> readFile(String filename){
        try {
            return new ArrayList<>(Files.readAllLines(Paths.get(filename)));
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }
    public static void writeFile(String filename,HashMap<String,
            ArrayList<City>> data){
        try {
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static HashMap<String,ArrayList<City>> loadCountriesAbove(
            String filename,int threshold){
        HashMap<String,ArrayList<City>> countries=new HashMap<>();
        ArrayList<String> lines=readFile(filename);
        lines.remove(0);
        for (String line : lines) {
            //System.out.println(line);
            ArrayList<String> splits = new ArrayList<>(Arrays.asList(line.split(",")));
            String country = splits.get(0);
            String name = splits.get(1);
            String region = splits.get(2);
            int population = Integer.parseInt(splits.get(3));
            double latitude = Double.parseDouble(splits.get(4));
            double longitude = Double.parseDouble(splits.get(5));

            Location location = new Location(latitude, longitude);
            City city = new City(name, region, country, population, location);
            if (population>=threshold) {
                if (!countries.containsKey(country)) {
                    countries.put(country, new ArrayList<>());
                }
                countries.get(country).add(city);
            }
        }
        return countries;
    }
    public static HashMap<String,ArrayList<City>> loadCountries(String filename){
        return loadCountriesAbove(filename,0);
    }

    public static void main(String[] args) {
        HashMap<String,ArrayList<City>> countries=
                loadCountries("data/cities_test_2.csv");
        System.out.println(countries);
        writeFile("data/classTest.csv",countries);
    }
}
