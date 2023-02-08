package com.fundamentals.java;

import java.util.Objects;

class Client{
    private int id;
    private String clientName;

    public Client(int id, String clientName) {
        this.id = id;
        this.clientName = clientName;
    }

    /**
    * Hashcode is the hashing function. Objects are stored in buckets based on hashing function.
    * Objects will be stored in same bucket if hashcode is equal. Objects should be distributed in
    * all buckets evenly.
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && clientName.equals(client.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientName);
    }
}
public class EqualsAndHashCodeRunner {
    public static void main(String[] args){
        Client c1=new Client(1,"Client1");
        Client c2=new Client(1,"Client2");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        Client c3=new Client(3,"Client3");
        System.out.println(c3.hashCode());
        System.out.println(c1.equals(c3));
    }
}
