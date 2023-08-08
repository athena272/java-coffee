import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTest {
    private static final int NUM_OPERATIONS = 100000;
    private static final int[] LIST_SIZES = {1000, 10000, 100000};

    public static void main(String[] args) {
        for (int size : LIST_SIZES) {
            System.out.println("Testing list size: " + size);
            
            List<Integer> arrayList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();

            // Test insertion performance
            long startTime = System.nanoTime();
            for (int i = 0; i < NUM_OPERATIONS; i++) {
                arrayList.add(i);
            }
            long endTime = System.nanoTime();
            double arrayInsertTime = (endTime - startTime) / 1e6;
            System.out.println("ArrayList insertion time: " + arrayInsertTime + " ms");
            System.out.println("ArrayList insertions per second: " + (NUM_OPERATIONS / (arrayInsertTime / 1000)));

            startTime = System.nanoTime();
            for (int i = 0; i < NUM_OPERATIONS; i++) {
                linkedList.add(i);
            }
            endTime = System.nanoTime();
            double linkedInsertTime = (endTime - startTime) / 1e6;
            System.out.println("LinkedList insertion time: " + linkedInsertTime + " ms");
            System.out.println("LinkedList insertions per second: " + (NUM_OPERATIONS / (linkedInsertTime / 1000)));

            // Test search performance
            startTime = System.nanoTime();
            for (int i = 0; i < NUM_OPERATIONS; i++) {
                arrayList.contains(i);
            }
            endTime = System.nanoTime();
            double arraySearchTime = (endTime - startTime) / 1e6;
            System.out.println("ArrayList search time: " + arraySearchTime + " ms");
            System.out.println("ArrayList searches per second: " + (NUM_OPERATIONS / (arraySearchTime / 1000)));

            startTime = System.nanoTime();
            for (int i = 0; i < NUM_OPERATIONS; i++) {
                linkedList.contains(i);
            }
            endTime = System.nanoTime();
            double linkedSearchTime = (endTime - startTime) / 1e6;
            System.out.println("LinkedList search time: " + linkedSearchTime + " ms");
            System.out.println("LinkedList searches per second: " + (NUM_OPERATIONS / (linkedSearchTime / 1000)));

            // Test removal performance
            startTime = System.nanoTime();
            for (int i = 0; i < NUM_OPERATIONS; i++) {
                arrayList.remove(arrayList.size() - 1);
            }
            endTime = System.nanoTime();
            double arrayRemoveTime = (endTime - startTime) / 1e6;
            System.out.println("ArrayList removal time: " + arrayRemoveTime + " ms");
            System.out.println("ArrayList removals per second: " + (NUM_OPERATIONS / (arrayRemoveTime / 1000)));

            startTime = System.nanoTime();
            for (int i = 0; i < NUM_OPERATIONS; i++) {
                linkedList.remove(linkedList.size() - 1);
            }
            endTime = System.nanoTime();
            double linkedRemoveTime = (endTime - startTime) / 1e6;
            System.out.println("LinkedList removal time: " + linkedRemoveTime + " ms");
            System.out.println("LinkedList removals per second: " + (NUM_OPERATIONS / (linkedRemoveTime / 1000)));

            System.out.println();
        }
    }
}
