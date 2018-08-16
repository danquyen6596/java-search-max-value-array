package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class SearchMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;

        do{
            System.out.print("Nhập vào kích thước mảng(tối đa 20): ");
            size = scanner.nextInt();
        } while(size > 20);

        array = new int[size];
        System.out.println("Nhập vào danh sách các giá trị: ");
        int i = 0;
        while (i < size)
        {
            System.out.print("Giá trị thứ ["+(i+1)+"]= ");
            array[i] = scanner.nextInt();
            i++;
        }

        int max = array[0];
        int index = 0;
        for (int j = 1; j < array.length; j++)
        {
            if(array[j] > max) {
                max = array[j];
                index = j+1;
            }
        }

        System.out.print("GTLN trong mảng là: "+max+ " tại vị trí: "+ index);
    }
}
