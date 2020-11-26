import java.util.Scanner;

public class BubbleSort {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen");
        int size = sc.nextInt();
        int[]list = new int[size];
        System.out.println(" Nhap " + list.length + " gia tri");
        for (int i = 0; i< list.length ; i++){
            list[i]= sc.nextInt();
        }
        System.out.println("Ban nhap danh sach");
        for (int i =0; i<list.length ; i++){
            System.out.println(list[i]);

        }
        boolean needNextPass =true;
        for (int k= 1 ;k<list.length && needNextPass ; k++){
            needNextPass = false;
            for (int i = 0; i<list.length-k ; i++){
                if (list[i] > list[i+1]){
                    System.out.println(" Hoan doi "+ list[i] + " voi " +list[i+1] );
                    int temp = list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                    needNextPass =true;
                }
            }
            if (needNextPass == false){
                System.out.println("Mang sap xep ");
                break;
            }
            System.out.print(" Liet ke " + k+ " sort : ");
            for (int j =0; j <list.length;j++){
                System.out.print(list[j]);
            }
            System.out.println();

        }
        System.out.print("Sau khi sap xep : " );
        for (int i=0; i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
