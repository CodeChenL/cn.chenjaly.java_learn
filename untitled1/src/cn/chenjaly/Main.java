package cn.chenjaly;

public class Main {

    public void out(){
        System.out.println("hello world");
    }
    public static void info(){
        System.out.println("hello world,使用静态方法");
    }
    public static void main(String[] args) {
        // write your code here
        //static方法只能调用静态方法,或用对象实例化
        Main nb = new Main();
        nb.out();

        info();
    }
}
