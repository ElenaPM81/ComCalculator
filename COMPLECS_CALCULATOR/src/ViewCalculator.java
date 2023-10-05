import java.util.Scanner;

public  class ViewCalculator {
    public static  void main(String[]args) {


        Scanner a = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = a.nextDouble();
        Scanner b = new Scanner(System.in);
        System.out.println("Введите второе число:");
        double num2 = b.nextDouble();

        Scanner x = new Scanner(System.in);
        System.out.println("Введите команду (+, *, /) :");
        String comanda = x.nextLine();

        Scanner c = new Scanner(System.in);
        System.out.println("Введите третье число:");
        double num3 = c.nextDouble();
        Scanner d = new Scanner(System.in);
        System.out.println("Введите четвертое число:");
        double num4 = d.nextDouble();
        System.out.println("Результат:");


        Calculator com = new Calculator(num1, num2, num3, num4);
        while (true) {
            if (comanda.equals("+")) {
                com.sum(com);
                System.out.println(com.getReal() + " + " + com.getImaginary() + "i");
                break;
            }
            if (comanda.equals("*")) {
                com.multiply(com);
                System.out.println(com.getReal() + " + " + com.getImaginary() + "i");
                break;

            }
            if (comanda.equals("/")) {
                com.divide(com);
                System.out.println(com.getReal() + " + " + com.getImaginary() + "i");
                break;
            }
        }
    }

}
