package com.example;
public class Ex {
  public static void main(String[] args) {
    int a,b;

    a=8;
    b=6;
    String name="vinay";
    
    int c= sub(a,b);
    System.out.println(c);
    greet(name);

  }
  public static void greet(String name){
    System.out.println("Hello  "+name);
  }
  public static int sub(int a,int b){
    int sub=a-b;
    return sub;
  }
}
