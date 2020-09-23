public class Jia {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;
        while (i <= 100){
            sum +=i;
            i++;
            System.out.println(sum);
        }
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
    }
}
