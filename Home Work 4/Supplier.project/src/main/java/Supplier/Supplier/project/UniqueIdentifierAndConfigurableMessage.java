package Supplier.Supplier.project;

import java.util.function.Supplier;

public class UniqueIdentifierAndConfigurableMessage {

    public static String generateUniqueIdentifier(Supplier<String> identifierSupplier) {
        return identifierSupplier.get();
    }

    //  configurable messages based on a condition
    public static void displayMessage(Supplier<String> messageSupplier, boolean condition) {
        if (condition) {
            System.out.println(messageSupplier.get());
        }
    }
}

