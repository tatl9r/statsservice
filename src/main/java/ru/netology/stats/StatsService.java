package ru.netology.stats;

public class StatsService {
    public int amountSales(int[] sales) {
        int amountSales = 0;
        for (int sale : sales) {
            amountSales += sale;
        }
        return amountSales;
    }

    public long averageAmount(int[] sales) {
        int averageAmount = 0;
        for (int sale : sales) {
            averageAmount = amountSales(sales) / sales.length;
        }
        return averageAmount;
    }

    public long maxSales(int[] sales) {
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales;
    }

    public long minSales(int[] sales) {
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSales]) {
                minSales = i;
            }
        }
        return minSales;
    }

    public long belowAverage(int[] sales) {
        int belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount(sales)) {
                belowAverage = i;
            }
        }
        return belowAverage;
    }

    public long aboveAverage(int[] sales) {
        int aboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount(sales)) {
                aboveAverage = i;
            }
        }
        return aboveAverage;
    }
}

