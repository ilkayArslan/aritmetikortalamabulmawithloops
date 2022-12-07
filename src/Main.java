import  java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int numb = input.nextInt();
        int sum=0,sayi=0;
        for (int i = 1;i<numb;i++){
            if(i%3==0 && i%4==0){
                sayi++;
                sum += i ;
            }
        }
        System.out.println(numb+" sayısına kadar 3 ve 4de bölünebilen sayıların aritmetik ortalması : " + sum/sayi);
    }
}