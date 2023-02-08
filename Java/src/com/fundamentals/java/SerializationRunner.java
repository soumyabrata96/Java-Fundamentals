package com.fundamentals.java;

import java.io.*;
import java.util.logging.Logger;

class Demo1 implements Serializable {
    @Serial
    private static final long serialVersionUID= -1953958332315551243L;
    int id;
    String name;
    Demo1(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Demo1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class ChildDemo extends Demo1{
    @Serial
    private static final long serialVersionUID = 2104304947227937723L;
    String dept;
    transient long phoneNo;
    ChildDemo(int id, String name,String dept,long phoneNo) {
        super(id, name);
        this.dept=dept;
        this.phoneNo=phoneNo;
    }

    @Override
    public String toString() {
        return "ChildDemo{" +
                "dept='" + dept + '\'' +
                ", phoneNo=" + phoneNo +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class SerializationRunner {
    public static Logger logger=Logger.getLogger(SerializationRunner.class.getName());
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Demo1 demo=new Demo1(1,"Soumya");
        String filename="Serial.ser";
        writeObjectToFile(demo,filename);
        Demo1 demo1=readObjectFromFile(filename);
        System.out.println("Object %s is deserialized as %s !!".formatted(demo1.getClass(),demo1.toString()));

        ChildDemo childDemo=new ChildDemo(1,"Amit","API SUPPORT",8765312345L);
        String filename1="Serial-child.ser";
        writeObjectToFile(childDemo,filename1);
        Demo1 childDemo1=readObjectFromFile(filename1);
        System.out.println("Object %s is deserialized as %s !!".formatted(childDemo1.getClass(),childDemo1.toString()));
    }

    private static Demo1 readObjectFromFile(String filename) throws IOException, ClassNotFoundException {
        logger.info("******* Deserialization *******");
        FileInputStream fileIn=new FileInputStream(filename);
        ObjectInputStream objectIn=new ObjectInputStream(fileIn);
        Demo1 demo1= (Demo1) objectIn.readObject();
        fileIn.close();
        objectIn.close();
        return demo1;
    }

    private static void writeObjectToFile(Demo1 demo,String filename) throws IOException {
        logger.info("******* Serialization *******");
        FileOutputStream fileOs=new FileOutputStream(filename);
        ObjectOutputStream objectOs=new ObjectOutputStream(fileOs);
        objectOs.writeObject(demo);
        fileOs.close();
        objectOs.close();
        System.out.println("Object %s is serialized in file %s !!".formatted(demo.getClass(),filename));
    }
}
