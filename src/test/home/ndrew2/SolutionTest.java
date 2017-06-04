package home.ndrew2;


import org.junit.Test;

import static home.ndrew2.Solution.ARRAY_NULL_ERROR_CODE;
import static home.ndrew2.Solution.ARRAY_OVERSIZE_ERROR_CODE;
import static home.ndrew2.Solution.ELEMENT_OF_ARRAY_OUT;
import static org.junit.Assert.assertEquals;



/**
 * Created by Андрей on 03.06.2017.
 */
public class SolutionTest{

    Solution solution = new Solution();

    //несколько тестов на проверку правильности поиска решений
    @Test
    public void testOnPositiveExpectedValues(){
        long[] array1 = {0, 1, 2, 2, 1, 2, 1, 2, 5, 6, 6, 6, 6, 6};
        assertEquals(6, solution.solution(array1));
        long[] array2 = {0, 1, 2, 3, 4, 4, 5 , 5, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        assertEquals(8, solution.solution(array2));
        long[] array3 = {1};
        assertEquals(0, solution.solution(array3));
        long[] array4 = {1, 2, 4, 1, 2, 4, 5, 7, 8, 9, 11, 13, 14, 15, 16};
        assertEquals(3, solution.solution(array4));
        array4[2] = -2;
        assertEquals(2, solution.solution(array4));
     }

    //тест на нулевое количество элементов массива
    @Test
    public void testArrayNullSize() {
        long[] array = new long[0];
        assertEquals(ARRAY_NULL_ERROR_CODE, solution.solution(array));
    }


    //Тест на превышение размера массива выше допустимого значения.
    @Test
    public void testArraayOutOfRange(){
        long[] array = new long[150001];
        assertEquals(ARRAY_OVERSIZE_ERROR_CODE, solution.solution(array));
    }

    @Test
    public void testElementInRange() {
        long[] array = {0, 2147483648l, 0};
        long[] array1 = {0, -2147483649l, 0};
        assertEquals(ELEMENT_OF_ARRAY_OUT, solution.solution(array));
        assertEquals(ELEMENT_OF_ARRAY_OUT, solution.solution(array1));

    }
}