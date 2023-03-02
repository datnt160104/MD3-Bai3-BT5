package rikkei.acdemy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int SIZE = 5;
        int[] arr = new int[SIZE];

        // Nhập giá trị cho các phần tử trong mảng từ bàn phím
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giá trị cho các phần tử trong mảng:");
        for (int i = 0; i < SIZE; i++) {
            arr[i] = input.nextInt();
        }

        // Tìm phần tử có giá trị nhỏ nhất trong mảng
        int minValue = arr[0];
        for (int i = 1; i < SIZE; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        // In ra giá trị nhỏ nhất
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);

        }
    }