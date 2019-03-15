package com.rsr.basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class Java8 {

    public Java8() {
    }

    static {
        try{
            int i = 10/1;
            System.out.println("EX");
        }catch (Exception e)
        {
            System.out.println("E");
            throw new NullPointerException();
        }


    }

    public  static void main (String[] args)
    {
        //arrayList();
        //stack();
        //queue();
        //stringReverse();
        //System.out.println(findFactoricalRecursive(6));
        System.out.println("SSS");
        /*ConcurrentHashMap map = new ConcurrentHashMap();
        map.elements();
        map.entrySet();*/
    }

    private static int findFactoricalRecursive(int i)
    {
        if (i>1){
            return i * findFactoricalRecursive(i-1);
        }else
        {
            return i;
        }
        /*int fact = i;
        while(i>1){
            fact = fact*(i-1);
            i--;
        }*/
    }

    private static void stringReverse() {
        String s = "my name is ravi";

        while(s.lastIndexOf(" ")!=-1)
        {
            int index = s.lastIndexOf(" ");
            String sub = s.substring(index+1);
            s = s.substring(0, index);
            System.out.println(sub);
        }
        System.out.println(s);
    }

    private static void queue() {
        Queue q = new LinkedBlockingQueue();

        q.add("kara");
        q.add("dhar");
        q.add("zzzz");
        q.add("puru");

        System.out.println(q.toString());

        System.out.println(q.peek());
    }

    private static void stack() {
        Stack s = new Stack();
        s.add("rsr");
        s.push("rar");
        s.push("dhar");

        System.out.println(s.toString());



        System.out.println(s.peek());
        System.out.println(s.search("rar"));
        System.out.println(s.capacity());
    }

    private static void arrayList() {
        ArrayList list = new ArrayList();

        /*list.add("rsr");
        list.add("dha");
        list.add("appy");*/
        list.add(123);
        list.add("appy");

        System.out.println(list.get(0).getClass().getCanonicalName());
        System.out.println(list.get(1).getClass().getCanonicalName());

        list.remove("dha");
        list.remove("dhaa");

        //System.out.println(list.toString());

        LinkedList linkedList = new LinkedList();

        linkedList.add(125);
        linkedList.add("rsr");
        linkedList.add("dhar");

        //linkedList.remove("rsr");

        linkedList.get(2);

        System.out.println(linkedList.peek());


        linkedList.push("tarak");

        System.out.println(linkedList.pop());
        System.out.println(linkedList.peek());
    }
}



