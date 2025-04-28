package se.iths.java24.sortingrunner.main;

import se.iths.java24.service.SortingService;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 0;
        while (true) {
            try {
                System.out.print("""
                        Hello!
                        Please enter the size of the array:\s""");
                size = scanner.nextInt();
                if (size > 0) break;
                System.out.println("\nSize must be a positive number.");
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input! Please enter a valid number.");
                scanner.next();
            }
        }

        int[] array = new int[size];
        System.out.println("\nPlease enter " + size + " numbers to the array");
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.print("Number " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("\nInvalid number! Please enter a valid integer.");
                    scanner.next();
                }
            }
        }

        ServiceLoader<SortingService> loader = ServiceLoader.load(SortingService.class);
        List<SortingService> services = new ArrayList<>();
        for (SortingService service : loader) {
            services.add(service);
        }

        System.out.println("\nPlease choose a sorting algorithm");
        for (int i = 0; i < services.size(); i++) {
            System.out.println((i + 1) + ". " + services.get(i).getClass().getSimpleName());
        }

        int choice = -1;
        while (true) {
            try {
                System.out.println("\nYour choice: ");
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= services.size()) break;
                System.out.print("\nInvalid choice! Please enter a number between 1 and " + services.size());
            } catch (InputMismatchException e) {
                System.out.print("\nInvalid input! Please enter a valid number.");
                scanner.next();
            }
        }

        SortingService selectedService = services.get(choice - 1);
        System.out.print("\nYou chose: " + selectedService.getClass().getSimpleName());
        int[] sortedArray = selectedService.execute(Arrays.copyOf(array, array.length));

        // Visa sorterad array
        System.out.print("\nSorted Array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
