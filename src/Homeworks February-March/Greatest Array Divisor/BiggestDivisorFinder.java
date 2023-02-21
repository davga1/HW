package GreatestArrayDivisor;

public class BiggestDivisorFinder {

    BiggestDivisorFinder(int[] arr) {
        int[] finalArray = new int[arr.length];
        for (int i = 0; i < finalArray.length; i++) {
            if (finalArray[i] < 0)finalArray[i] *=-1;
            else finalArray[i] = arr[i];
        }
        int minNum = finalArray[0];
        int divider = 2;
        int greatestDivisor = 1;
        for (int i = 0; i < finalArray.length; i++) {
            if (finalArray[i] == 0) finalArray[i] = 1;
            if (finalArray[i] < minNum) {
                minNum = finalArray[i];
            }
        }
            for (int j = 0; j <= minNum; j++) {
                if (minNum % divider != 0) divider++;
                if (minNum % divider == 0) {
                    minNum /= divider;
                    greatestDivisor *= divider;
                }
            }
        int div2 = 2;
        for (int i = 1; i < finalArray.length; i++) {
            if (greatestDivisor != 0) {
                if (arr[i] % greatestDivisor == 0) continue;
                if (arr[i] % greatestDivisor != 0) {
                    if (greatestDivisor / div2 != 0) {
                        div2++;
                    }
                    greatestDivisor /= div2;
                }
            }
        }
        if (greatestDivisor == 0)greatestDivisor = 1;
        System.out.print("result:"+greatestDivisor + "\n");
    }
}

