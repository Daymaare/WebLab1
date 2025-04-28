import se.iths.java24.service.SortingService;
import se.iths.java24.bubblesorter.BubbleSort;

module se.iths.java.bubblesorter {
    requires se.iths.java.service;
    provides SortingService with BubbleSort;
}
