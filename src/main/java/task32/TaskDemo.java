package task32;

import task12.Car;
import task12.Manufacturer;
import task12.TypSilnika;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskDemo {
    public static void main(String[] args) throws IOException {
        Path resourceDir = Paths.get("src", "main", "resources");
        Path inputFile = resourceDir.resolve("cars.txt");
        File file = new File(String.valueOf(inputFile));
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "BMW", 2000, 2012, new ArrayList<>
                (Arrays.asList(new Manufacturer("BNW", LocalDate.now(), "Germany"))), TypSilnika.S3));
        writeObjectToFile(cars, file);
        System.out.println(downloadObjectFromFile(file));
    }

    public static void writeObjectToFile(List<?> elements, File file) {
        try {
            ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream(file));
            in.writeObject(elements);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public static List<?> downloadObjectFromFile(File file) {
        List<?> items;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            items = (List) in.readObject();
            in.close();
            return items;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {
            System.out.println("Nie znaleziono klasy");
        }
        return new ArrayList<>();
    }
}
