import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach cac phan tu cua mang: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + "");
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap chi so cua mot phan tu bat ky: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so : " + x + " la: " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Vuot qua chi so cua mang!");
        }
    }
}
