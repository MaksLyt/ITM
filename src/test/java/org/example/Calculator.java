import org.example.Main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
 class MainTest {
    @Test
    void testAddMatrices() {
        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };
        int[][] matrix2 = {
                {5, 6},
                {7, 8}
        };
        int[][] expected = {
                {6, 8},
                {10, 12}
        };
        int[][] result = Main.addMatrices(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    @Test
    void testMultiplyMatrices() {
        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };
        int[][] matrix2 = {
                {5, 6},
                {7, 8}
        };
        int[][] expected = {
                {19, 22},
                {43, 50}
        };
        int[][] result = Main.multiplyMatrices(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    @Test
    void testAddMatricesWithDifferentDimensions() {
        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };
        int[][] matrix2 = {
                {5, 6, 7},
                {8, 9, 10}
        };
        // Очікується виняток, оскільки матриці мають різний розмір
        assertThrows(IllegalArgumentException.class, () ->
                Main.addMatrices(matrix1, matrix2));
    }
    @Test
    void testMultiplyMatricesWithInvalidDimensions() {
        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };
        int[][] matrix2 = {
                {5, 6, 7},
                {8, 9, 10}
        };
        // Очікується виняток, оскільки матриці не можнаперемножити через невідповідність розмірів
        assertThrows(IllegalArgumentException.class, () ->
                Main.multiplyMatrices(matrix1, matrix2));
    }
}
