// // abstract class Computer{
// //     public abstract void code();
// // }
// // class Desktop extends Computer{
// //     public void code(){
// //         System.out.println("Code, Compile, Run : Faster");
// //     }
// // }
// // class Laptop extends Computer{
// //     public void code(){
// //         System.out.println("Code, Compile, Run");
// //     }
// // }

// // class Developer{
// //     public void devApp(Computer com){
// //         com.code();
// //     }
// // }

// // class temp
// // {
// //     public static void main(String[] args){
// //         Computer lap = new Laptop();
// //         Computer desk = new Desktop();
// //         Developer dev = new Developer();
// //         dev.devApp(lap);

// //     }
// // }
// enum Status{
//     Running, Failed, Pending, Success;
// }
// public class temp{
//     public static void main(String[] args) {
//         Status s[] = Status.values();
//         System.out.println(s[0]);
//     }
// }

// @FunctionalInterface
// interface A{
//     int add(int i, int j);
// }
// public class temp{
//     public static void main(String[] args) {
//         A obj = (int i, int j) -> i+j;
//         int res = obj.add(4,5);
//         System.out.println(res);
//     }
// }

// public class temp {

//     public static void main(String[] args) {
//         int a = 20;
//         int b = 0;
//         try{
//             System.out.println(a/b);
//         }
//         catch(Exception e){
//             System.out.println("Error" + e);
//         }
//     }
// }
// class A{
//     public void show() throws ClassNotFoundException{
//         // try
//             Class.forName("temp");
//         // catch(Exception e){
//         //     System.out.println("Not able to find class" + e);
//         // }
//     }
// }
// public class temp{
//     static{
//         System.out.println("class loaded");
//     }
//     public static void main(String[] args) {
//         A obj = new A();
//         try {
//             obj.show();
//         } catch (ClassNotFoundException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//     }
// }
// class A{
//     int a;
//     public void seta(int a){
//         this.a = a;
//     }
//     public int geta(){
//         return a;
//     }
//     public void showA(){
//         System.out.println("in A");
//     }
// }
// class B extends A{
//     int b;
//     public void setb(int b){
//         this.b = b;
//     }
//     public int getb(){
//         return b;
//     }
// }
// public class temp {

//     public static void main(String[] args) {
//         A obj = new A();
//         obj.seta(5);
//         int a = obj.geta();
//         System.out.println(a);
//     }
// }
// class A extends Thread{
//     public void run(){
//         for(int i=0; i<100; i++)
//         System.out.println("in class A");
//     }
// }
// class B extends Thread{
//     public void run(){
//         for(int i=0; i<100; i++)
//         System.out.println("in class B");
//     }
// }
// public class temp {

//     public static void main(String[] args) {
//         A obj1 = new A();
//         B obj2 = new B();
//         obj1.start();
//         obj2.start();
//     }
// }

//========================================================

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;
// public class temp {

//     public static void main(String[] args) {
//         List<Integer> nums = new ArrayList<Integer>();
//         nums.add(-2);
//         nums.add(3);
//         nums.add(-5);
//         nums.add(4);
//         Iterator<Integer> values = nums.iterator();
//         // while(values.hasNext()){
//         //     System.out.println(values.next());
//         // }
//         for(int i=0; i<nums.size(); i++){
//             System.out.println(nums.get(i));
//         }
        
//         nums.forEach(n -> System.out.println(n));
        
        

//     }
// }s

public class temp { 

    public static void main(String[] args) {
        String str = "Deepak";
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(charArray));
    }
}

