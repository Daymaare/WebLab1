import se.iths.java24.service.SortingService;
import se.iths.java24.quicksorter.QuickSort;

module se.iths.java.quicksorter {
    requires se.iths.java.service;
    provides SortingService with QuickSort;
}
