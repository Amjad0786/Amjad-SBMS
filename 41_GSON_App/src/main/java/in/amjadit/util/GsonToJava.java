package in.amjadit.util;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import in.amjadit.binding.Pessenger;
import in.amjadit.binding.Address;

public class GsonToJava {

    public static void main(String[] args) {
        Gson gson = new Gson();
        String fileName = "pessenger.json";

        try {
            // Check if file exists
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File does not exist. Creating file...");
                file.createNewFile();

                // Create a sample Pessenger object with Address
                Address address = new Address();
                address.setCity("Delhi");
                address.setState("Delhi");
                address.setCountry("India");

                Pessenger newPessenger = new Pessenger();
                newPessenger.setName("Amjad");
                newPessenger.setFrom("Mumbai");
                newPessenger.setTo("Delhi");
                newPessenger.setGender("Male");
                newPessenger.setAddr(address);

                // Write object to JSON file
                try (FileWriter writer = new FileWriter(file)) {
                    gson.toJson(newPessenger, writer);
                    System.out.println("File created with default content.");
                }
            }

            // Read the file and convert JSON to Java object
            Pessenger p = gson.fromJson(new FileReader(file), Pessenger.class);
            System.out.println("Deserialized object: " + p);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
