import com.sun.xml.internal.fastinfoset.util.CharArray;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class InterviewQuestions {

    @Test
    public void evenLoop() {
        for(int i=1; i<10; i++){
            if (i % 2 == 0) System.out.println(i);
        }
    }

    @Test
    public void testSwap2Numbers() {
        int[] testArray = {1, 2, 3, 4};
        for (int element: testArray
             ) {
            System.out.print(element+" ");
        }
        System.out.println();

        swapArray(testArray, 0, 1);

        /*for(int element : testArray){
            System.out.print(element+" ");
        }*/
        System.out.println(Arrays.toString(testArray));
    }

    private void swapArray(int[] arr, int indexL, int indexR){
        int temp = arr[indexL];
        arr[indexL] = arr[indexR];
        arr[indexR] = temp;
    }

    @Test
    public void testReverseArray() {
        int[] testArray = {1, 2, 3, 4, 5, 6};
        reverseArray(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    private void reverseArray(int[] arr){
        int temp;
        int len = arr.length;
        len--;

        for(int i = 0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[len-i];
            arr[len-i] = temp;
        }


    }

    @Test
    public void testNumberOfLetters() {
        String testText = "hello world";
        char letterToFind = 'l';
        int numberExpected = 3;
        int numberActual = solutionNumberOfLetters(testText, letterToFind);
        //System.out.println(number);

        Assert.assertEquals(numberActual, numberExpected);
    }

    private int solutionNumberOfLetters(String text, char letterToFind){
        int numberOfOccurrences = 0;
        for(char letter: text.toCharArray()){
            if (letter == letterToFind) numberOfOccurrences++;
        }

        return numberOfOccurrences;
    }
}
