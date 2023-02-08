package com.fundamentals.java;

class Test{
    private String name;
    private static int count=0;
    public static final int MY_AGE=26;

    Test(String name){
        this.name=name;
        count++;
    }
    public static int getCount(){
        return count;
    }
}
public class StaticModifier {
    private int i;
    public int getI(){return i;}
    private static int j;
    public static int getJ(){return j;}

    /**
     * Class within another class is called Inner Class. We can't instantiate inner classes without instantiate
     * the outer class before. Outer class members static or non-static are accessible within inner class.
     */
    class InnerClass{
       public void method(){
           i=5;
           j=6;
           getI();
           getJ();
       }
    }

    /**
     * Static inner classes are called Static Nested Class. They can be instantiated without instantiating the
     * outer class. Only static members of outer class are accessible within static nested class.
     */
    static class StaticNestedClass{
        public void method(){
            j=5;
            getJ();
        }
    }
    public static void main(String[] args){
        Test test1=new Test("Messi");
        System.out.println(Test.getCount());
        Test test2=new Test("Neymar");
        System.out.println(Test.getCount());
        System.out.println(Test.MY_AGE);

        StaticNestedClass staticNestedClass=new StaticNestedClass();
        StaticModifier staticModifier=new StaticModifier();
        InnerClass innerClass=staticModifier.new InnerClass();
    }
}
