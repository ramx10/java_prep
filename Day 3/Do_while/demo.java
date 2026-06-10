public class demo {
    static int Increment(int num) {
        num++;
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {

        int data = 10;

        System.out.println(data);// pass by value -> copy

        int result = Increment(data);

        System.out.println(result);

    }
}