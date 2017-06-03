import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by Андрей on 03.06.2017.
 */
public class SolutionTest{
    final public static int ARRAY_OVERSIZE_ERROR_CODE = -1;
    final public static int ARRAY_NULL_ERROR_CODE = -3;


    Solution solution = new Solution();

    //несколько тестов на проверку правильности поиска решений
    @Test
    public void testOnPositiveExpectedValues(){
        int[] array1 = {0, 1, 2, 2, 1, 2, 1, 2, 5, 6, 6, 6, 6, 6};
        assertEquals(6, solution.solution(array1));
        int[] array2 = {0, 1, 2, 3, 4, 4, 5 , 5, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        assertEquals(8, solution.solution(array2));
        int[] array3 = {1};
        assertEquals(0, solution.solution(array3));
        int[] array4 = {1, 2, 4, 1, 2, 4, 5, 7, 8, 9, 11, 13, 14, 15, 16};
        assertEquals(3, solution.solution(array4));
        array4[2] = -2;
        assertEquals(2, solution.solution(array4));
     }

    //тест на нулевое количество элементов массива
    @Test
    public void testArrayNullSize() {
        int[] array = new int[0];
        assertEquals(ARRAY_NULL_ERROR_CODE, solution.solution(array));
    }


    //Тест на превышение размера массива выше допустимого значения.
    @Test
    public void testConditionsOnOversize(){
        int[] array = new int[150001];
        assertEquals(ARRAY_OVERSIZE_ERROR_CODE, solution.solution(array));
    }


}