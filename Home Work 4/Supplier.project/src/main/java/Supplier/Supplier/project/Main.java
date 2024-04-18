package Supplier.Supplier.project;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.Supplier;

import static Supplier.Supplier.project.UniqueIdentifierAndConfigurableMessage.displayMessage;
import static Supplier.Supplier.project.UniqueIdentifierAndConfigurableMessage.generateUniqueIdentifier;

public class Main {

    public static void main(String[] args) {

            Supplier<String> uniqueIdentifierSupplier = () -> {
                LocalTime currentTime = LocalTime.now();
                Random random = new Random();
                int randomElement = random.nextInt(12);
                return currentTime + "-" + randomElement;
            };

            String uniqueId1 = generateUniqueIdentifier(uniqueIdentifierSupplier);
            System.out.println("Generated Unique Identifiers:");
            System.out.println("Identifier 1: " + uniqueId1);



            Supplier<String> messageSupplier = () -> {
                LocalTime currentTime = LocalTime.now();
                if (currentTime.getHour() < 12) {
                    return "Good morning!";
                } else if (currentTime.getHour() < 18) {
                    return "Good afternoon!";
                } else {
                    return "Good evening!";
                }
            };

            displayMessage(messageSupplier, true);


        }
}
