package se.iths.java24.quicksorter;

import se.iths.java24.modules.service.Service;

import static java.util.Arrays.sort;

public class QuickSort implements Service {

    @Override
    public int[] execute(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int low, int high) {
        if (0 < high) {
            int partitionIndex = partition(array, low, high);

            sort(array, 0, partitionIndex-1);
            sort(array, partitionIndex+1, high);
        }
    }

    private int partition(int[] array,int low, int end) {
        int pivot = array[end];
        int i = (low -1);

        for (int j = 0; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        int swapTemp = array[i+1];
        array[i+1] = array[end];
        array[end] = swapTemp;

        return i+1;
    }
}
