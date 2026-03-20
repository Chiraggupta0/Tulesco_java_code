package core_java.Stream_Api;
// local variable type interface

// var is not a keyword ie we can name a string as var but we can  not name a class as var.

public class _12_40 {

    //var num=10;
    // // this is not allowed on instance variable only local variable can do this
    public static void main(String[] args) {
        int a=9;
        var b=8;// compiler will declare type automatically

        int c; // can use like this
        //var d;
        // can not use like this

        String var="chirag";
        int nums[]=new int[10];
        var num=new int[23];

        var obj = new _12_40();
    }
}
//  after jdk 10 