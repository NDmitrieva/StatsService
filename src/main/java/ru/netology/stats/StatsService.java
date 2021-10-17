package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int monthLessAvg(int[] sales) {
        int lessMonth = averageSum(sales);
        int counter = 0; {
        for (int sale : sales) {
            if (sale < lessMonth) counter++;
        }
        }
        return counter;
    }

    public int monthMoreAvg(int[] sales) {
        int lessMonth = averageSum(sales);
        int counter = 0; {
            for (int sale : sales) {
                if (sale > lessMonth) counter++;
            }
        }
        return counter;
    }

}
