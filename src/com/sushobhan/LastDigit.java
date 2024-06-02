package com.sushobhan;

public class LastDigit {
    public static void main(String[] args) {
        System.out.println("last digit : " + findLastDigit(127));
        System.out.println("Second last digit : " + secondLastDigit(1325));
        System.out.println("Second last digit : " + secondLastDigit(3421234));
    }

    static int findLastDigit(int number) {
        if (number < 0)
            number = (-1) * number;
        return number % 10;
    }

    static int secondLastDigit(int number) {
        if (number < 0)
            number = (-1) * number;
        int c = 0;
        int length = Integer.toString(number).length();
        int r = 0;
        if (length == 1)
            return -1;
        else {
            while (number > 0) {
                r = number % 10;
                c++;
                number /= 10;
                if (c == 2)
                    break;
            }
            return r;
        }
    }

    static int findLastAndSecondLastDigit(int number) {
        String s = number + "";
        System.out.println("String form of number : " + s);
        int r = 0;
        int c = 0;
        while (number > 0) {
            r = number % 10;
            c++;
            // get the remaining digit
            number = number / 10;
            if (c == 2)
                break;
        }
        return r;
    }
}
