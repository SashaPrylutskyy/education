import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Main main = new Main();
        main.summ(a, b);
    }

    public int summ(int a, int b){
        return a+b;
    }
}
