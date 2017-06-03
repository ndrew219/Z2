import java.util.ArrayList;

/**
 * Created by Андрей on 28.05.2017.
 */
public class Solution {

    final private static int ARRAY_OVERSIZE_ERROR_CODE = -1;
    final private static int ARRAY_NULL_ERROR_CODE = -3;
    final private static int ARRAY_MAXSIZE = 150000;
    final private static int ELEMENT_OF_ARRAY_OUT = - 2;
    final private static int LEFT_BOUNDARY = -2147483648;
    final private static int RIGHT_BOUNDARY = 2147483647;



    public static int solution(int[] A){
        int maxSize, sizeA, index;
        ArrayList<Integer> array = new ArrayList<Integer>();

        if (A.length > ARRAY_MAXSIZE) {
            return ARRAY_OVERSIZE_ERROR_CODE;
        } else if (A.length == 0) {
            return ARRAY_NULL_ERROR_CODE;
        } else {
            maxSize = 1;
            index = 0;
            sizeA = A.length;

            for (int i=0; i < sizeA-1; i++) {
                if (A[i] < LEFT_BOUNDARY || A[i] > RIGHT_BOUNDARY) {
                    return ELEMENT_OF_ARRAY_OUT;
                } else {
                    if (A[i] < A[i+1]) {
                        array.add(i);
                        if (maxSize < (array.size()+1)){
                            maxSize = array.size()+1;
                            index = array.get(0);
                        }
                    } else {
                        array.clear();
                    }
                }
            }
        return index;
        }
    }


    public static void main(String[] args) {
        int[] array = new int[0];
        int result = solution(array);
        switch (result){
            case ARRAY_OVERSIZE_ERROR_CODE:
                System.out.println("Количество элементов массива больше чем 150 000");
                break;
            case ELEMENT_OF_ARRAY_OUT:
                System.out.println("Один из элементов массива является недопустимым числом");
                break;
            case ARRAY_NULL_ERROR_CODE:
                System.out.println("Массив состоит из 0 элементов");
                break;
            default:
                System.out.println("Индекс - " + result);
        }

    }
}