
package se.iths.java24.sortingrunner;

import se.iths.java24.service.SortingService;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Please enter numbers to the array: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Number: ");
            array[i] = scanner.nextInt();
        }

        ServiceLoader<SortingService> loader = ServiceLoader.load(SortingService.class);
        List<SortingService> services = new ArrayList<>();
        for (SortingService service : loader) {
            services.add(service);
        }

        System.out.println("\nPlease choose sorting algorithm: ");
        for (int i = 0; i < services.size(); i++) {
            System.out.println((i + 1) + ". " + services.get(i).getClass().getSimpleName());
        }

        System.out.println("\nYour Choice: ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > services.size()) {
            System.out.println("Invalid choice.");
        } else {
            SortingService selectedService = services.get(choice - 1);
            System.out.println("\nYou choose " + selectedService.getClass().getSimpleName());
            int[] sortedArray = selectedService.execute(Arrays.copyOf(array, array.length));

            System.out.println("Sorted Array: ");
            for (int num : sortedArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
