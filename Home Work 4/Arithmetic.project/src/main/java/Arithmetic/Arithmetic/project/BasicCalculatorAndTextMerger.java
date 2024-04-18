package Arithmetic.Arithmetic.project;

import java.util.function.BiFunction;

public class BasicCalculatorAndTextMerger {

    //   integers using a BiFunction<Integer, Integer, Integer>
    public static int calculate(int num1, int num2, BiFunction<Integer, Integer, Integer> operation) {
        return operation.apply(num1, num2);
    }

    //  length using a BiFunction<String, String, Integer>
    public static int mergeAndAnalyze(String str1, String str2, BiFunction<String, String, Integer> mergeFunction) {
        return mergeFunction.apply(str1, str2);
    }

    public static void main(String[] args) {
        //  calculator
        int operand1 =10;
        int operand2 = 10;
        System.out.println("Addition: " + calculate(operand1, operand2, Integer::sum));
        System.out.println("Subtraction: " + calculate(operand1, operand2, Integer::min));
        System.out.println("Multiplication: " + calculate(operand1, operand2,Integer::remainderUnsigned));
        System.out.println("Division: " + calculate(operand1, operand2, Integer::divideUnsigned));
        
        String word1 = "AWSED";
        String word2 = "SWADER";
        System.out.println("Total length of merged strings: " +
                mergeAndAnalyze(word1, word2, (s1, s2) -> s1.length() + s2.length()));
    }
}


//  remainderUnsigned can this be used instead of this (a,b)->(a*b)
