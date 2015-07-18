package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayStructures {

    public int[] myArray = new int[20];
    int arraySize = 10;

    public void fillRandomNumbers() {
        for(int i=0; i< arraySize; i++) {
            myArray[i] = (int)(Math.random()*10) + 10;
        }
    }

    public void printOutPut() {
        System.out.println("---------");
        for (int i=0;i<arraySize;i++) {
            System.out.println("| " + i + " | " + myArray[i] + " |");
        }
        System.out.println("---------");
    }

    public int getValueAtIndex(int index) {
        int ret = -1;
        if (index < arraySize) {
            ret = myArray[index];
        }
        return ret;
    }

    public boolean doesArrayContainThisValue(int val) {
        boolean contain = false;
        for(int i=0; i<arraySize;i++) {
            if (myArray[i] == val) {
                contain = true;
            }
        }
        return contain;
    }

    public List<Integer> getIndexOfSearchVal(int val) {
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for(int i=0; i<arraySize;i++) {
            if (myArray[i] == val) {
                list.add(count, i);
                count++;
            }
        }
        return list;
    }

    public boolean deleteAnItem(int index) {
        boolean ret = false;
        if (index < arraySize) {
            for(int i=index;i<arraySize;i++) {
                myArray[i] = myArray[i+1];
            }
            arraySize--;
        }
        return ret;
    }

    public void usingRandomGeneratorNumber() {
        int[] array = new int[10];
        Random ran = new Random();
        ran.setSeed(System.currentTimeMillis());

        for(int i=0; i<array.length;i++ ) {
            array[i] = ran.nextInt(100);
        }

        int[] newarray = Arrays.copyOf(array,array.length);
        System.out.println("Are arrays equal: " + Arrays.equals(array, newarray));
        Arrays.sort(array);
        System.out.println("Are arrays equal: " + Arrays.equals(array, newarray));
        System.out.println("newarray: " + Arrays.toString(newarray));
        System.out.println("array: " + Arrays.toString(array));
        
    }

    public void insertAnItem(int val) {
        if (arraySize < 20) {
            myArray[arraySize] = val;
        }
        arraySize++;
    }

    public void bubbleSort() {
        for(int i=arraySize-1;i>0;i--) {
            for(int j=0;j<i;j++) {
                if (myArray[j] > myArray[j+1]) {
                    swapVal(j, j+1);
                }
            }
        }
    }

    public void swapVal(int firstVal, int secVal) {
        int temp = myArray[firstVal];
        myArray[firstVal] = myArray[secVal];
        myArray[secVal] = temp;
    }

    public void binarySearch(int val) {
        int lowerIndex = 0;
        int higherIndex = arraySize -1;
        int count = 0;

        while(lowerIndex <= higherIndex) {
            int middleIndex = (lowerIndex + higherIndex)/2;
            if(myArray[middleIndex] < val) {
                lowerIndex = middleIndex + 1;
            } else if(myArray[middleIndex] > val) {
                higherIndex = lowerIndex - 1;
            } else {
                System.out.println("\nFound a match for " + val + " at Index " + middleIndex);
                lowerIndex = higherIndex + 1;
            }
            count++;
        }
        System.out.println("Processing complexity: " + count);
    }

    public void selectionSort() {
        int count = 0;
        for(int i=0; i<arraySize; i++) {
            int min = i;
            for(int j=i;j<arraySize; j++) {
                if (myArray[min] > myArray[j]) {
                    min = j;
                }
            }
            swapVal(i, min);
        }
    }

    public boolean isMatched(String expression) {
        final String opening = "{([";
        final String closing = "})]";

        Stack<Character> buff = new LinkedStack<>();

        for(char c : expression.toCharArray()) {
            if (opening.indexOf(c) != -1) {
                buff.push(c);
            } else if (closing.indexOf(c) != -1) {
                if (buff.isEmpty()) {
                    return false;
                }
                if ((closing.indexOf(c) != opening.indexOf(buff.pop()))) {
                    return false;
                }
            }
        }
        return buff.isEmpty();
    }

    public static void main(String[] args) {
        ArrayStructures arrayst = new ArrayStructures();
        arrayst.fillRandomNumbers();
        arrayst.printOutPut();
        arrayst.usingRandomGeneratorNumber();
        ArrayStack<String> myStack = new ArrayStack<String>();
        myStack.push("test1");
        myStack.push("test2");
        System.out.println("Elements in stack: " + myStack.top());
        myStack.pop();
        System.out.println("Elements in stack: " + myStack.top());
        myStack.pop();
        System.out.println("Elements in stack: " + myStack.top());
        System.out.println("Elements in stack: " + myStack.size());
        System.out.println("expression matched ? : " + arrayst.isMatched("{[{[]}]}"));
        
    }

}
