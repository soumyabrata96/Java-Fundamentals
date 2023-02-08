package com.fundamentals.abstractAndinterface;

@FunctionalInterface
interface FirstFunctionalInterface{
    public Integer sum(Integer num1,Integer num2);
    default Integer multiply(Integer num1,Integer num2){
        return num1*num2;
    }
    static Integer divide(Integer num1,Integer num2){
        return num1/num2;
    }
}
public class InterfaceRunner {
    public static void main(String[] args) {
        FirstFunctionalInterface firstFunctionalInterface = new FirstFunctionalInterface() {

            @Override
            public Integer sum(Integer num1, Integer num2) {
                return num1 + num2;
            }
        };
        FirstFunctionalInterface firstFunctionalInterface1 = (n1, n2) -> n1 + n2;
        System.out.println(firstFunctionalInterface1.sum(5,5));
    }
}
