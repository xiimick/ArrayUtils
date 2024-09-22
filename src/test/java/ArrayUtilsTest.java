import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testMergeSort() {
        int[] array = {3, 6, 1, 5, 2, 4};
        ArrayUtils.mergeSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array);
    }

    @Test
    public void testBinarySearchFound() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int index = ArrayUtils.binarySearch(array, 4);
        assertEquals(3, index);
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int index = ArrayUtils.binarySearch(array, 10);
        assertEquals(-1, index);
    }
}
