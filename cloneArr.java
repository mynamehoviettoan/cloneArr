package test.cloneArr;

public class cloneArr {
    public static void main(String[] args) {
        // tạo mảng ban đầu
        int[] src = { 2, 3, 5 };
        // khai báo mảng kết quả bằng với độ dài mảng ban đầu
        int[] dst = new int[src.length];
        // tạo vòng lặp,lấy và gán từng phần tử của mảng củ và gán vào mảng kết quả
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i];
        }
        // kiểm tra mảng kết quả
        for (int i = 0; i < dst.length; i++) {
            System.out.printf("\ndst[%d] = %d", i, dst[i]);
        }
    }
}
