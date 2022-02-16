package Operator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A;
        int B;
        double Q;
        double C;
        double D;
        double E;
        double F;
        Scanner reader = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        A = reader.nextInt();
        if (A != 1 && A != 2) {
            System.out.println("Ну там же всего два варианта...");
        }
        if (A == 1) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна");
            B = reader.nextInt();
            System.out.println("Введите число: ");
            Q = reader.nextDouble();
            if (B == 1) {
                C = Q;
                D = Q / 1000;
                E = Q / 100000;
                F = Q / 1000000;
                System.out.print("Результат:\nГрамм: " + C + "\nКилограмм: " + D + "\nЦентнеров: " + E + "\nТонн: " + F);
            } else if (B == 2) {
                C = Q * 1000;
                D = Q;
                E = Q / 100;
                F = Q / 1000;
                System.out.println("Результат:\nГрамм: " + C + "\nКилограмм: " + D + "\nЦентнеров: " + E + "\nТонн: " + F);
            }
            else if (B == 3 ) {
                C = Q * 100000;
                D = Q * 100;
                E = Q;
                F = Q / 10;
                System.out.println("Результат:\nГрамм: " + C + "\nКилограмм: " + D + "\nЦентнеров: " + E + "\nТонн: " + F);
            }
            else if (B == 4) {
                C = Q * 1000000;
                D = Q / 1000;
                E = Q / 10;
                F = Q;
                System.out.println("Результат:\nГрамм: " + C + "\nКилограмм: " + D + "\nЦентнеров: " + E + "\nТонн: " + F);
            }
            else {
                System.out.println("Выберите единицу измерения из предложенных!");
            }

        }
        else if (A == 2) {
            System.out.println("Выберите единицу измерения: 1 - сантиметр, 2 - дюйм, 3 - фут, 4 - ярд");
            B = reader.nextInt();
            System.out.println("Введите число: ");
            Q = reader.nextDouble();
            if (B == 1) {
                C = Q;
                D = Q * 2.54;
                E = Q * 30.48;
                F = Q * 91.44;
                System.out.println("Результат:\nСантиметров: " + C + "\nДюймов: " + D + "\nФутов: " + E + "\nЯрдов: " + F);
            }
            else if (B == 2) {
                C = Q * 2.54;
                D = Q;
                E = Q * 0.0833;
                F = Q * 0.0278;
                System.out.println("Результат:\nСантиметров: " + C + "\nДюймов: " + D + "\nФутов: " + E + "\nЯрдов: " + F);
            }
            else if (B == 3) {
                C = Q * 30.48;
                D = Q * 12;
                E = Q;
                F = Q * 0.3333;
                System.out.println("Результат:\nСантиметров: " + C + "\nДюймов: " + D + "\nФутов: " + E + "\nЯрдов: " + F);
            }
            else if (B == 4) {
                C = Q * 91.44;
                D = Q * 36;
                E = Q * 3;
                F = Q;
                System.out.println("Результат:\nСантиметров: " + C + "\nДюймов: " + D + "\nФутов: " + E + "\nЯрдов: " + F);
            }
            else {
                System.out.println("Выберите единицу измерения из предложенных!");
            }
        }
    }
}
