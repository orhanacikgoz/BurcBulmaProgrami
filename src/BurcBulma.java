import java.util.Scanner;



public class BurcBulma {
    public static void main(String[] args) {
        int day;
        String mont;
        Scanner inp = new Scanner(System.in);
        System.out.print("Hangi Ayda Dogdunuz?: ");
        mont = inp.nextLine();
        System.out.print("Hangi Gun?: ");
        day = inp.nextInt();

        if (day <= 31 && day >= 1) {
            if (mont.equals("Ocak")) {
                if (day <= 21) {
                    System.out.println("Burcunuz Oglak");
                } else {
                    System.out.println("Burcunuz Kova");
                }
            }
            else if (mont.equals("Subat")){
                if (day <= 19) {
                    System.out.println("Burcunuz Kova");
                } else {
                    System.out.println("Burcunuz Balik");
                }
            }
            else if (mont.equals("Mart")){
                if (day<=20){
                    System.out.println("Burcunuz Balik");
                }else {
                    System.out.println("Burcunuz Koc");
                }
            }
            else if (mont.equals("Nisan")){
                if (day<=20){
                    System.out.println("Burcunuz Koc");
                }else {
                    System.out.println("Burcunuz Boga");
                }
            }
            else if (mont.equals("Mayis")){
                if (day<=21){
                    System.out.println("Burcunuz Boga");
                }else {
                    System.out.println("Burcunuz İkizler");
                }
            }
            else if (mont.equals("Haziran")){
                if (day<=22){
                    System.out.println("Burcunuz İkizler");
                }else {
                    System.out.println("Burcunuz Yengec");
                }
            }
            else if (mont.equals("Temmuz")){
                if (day<=20){
                    System.out.println("Burcunuz Yengec");
                }else {
                    System.out.println("Burcunuz ASLAN");
                }
            }
            else if (mont.equals("Agustos")){
                if (day<=22){
                    System.out.println("Burcunuz Aslan");
                }else {
                    System.out.println("Burcunuz Basak");
                }
            }
            else if (mont.equals("Eylul")){
                if (day<=22){
                    System.out.println("Burcunuz Basak");
                }else {
                    System.out.println("Burcunuz Terazi");
                }
            }
            else if (mont.equals("Ekim")){
                if (day<=22){
                    System.out.println("Burcunuz Terazi");
                }else {
                    System.out.println("Burcunuz AKREP");
                }
            }
            else if (mont.equals("Kasim")){
                if (day<=21){
                    System.out.println("Burcunuz Akrep");
                }else {
                    System.out.println("Burcunuz Yay");
                }
            }
            else if (mont.equals("Aralik")){
                if (day<=21){
                    System.out.println("Burcunuz Yay");
                }else {
                    System.out.println("Burcunuz Oglak");
                }
            }
    } else  {
            System.out.println("Gecersiz bir deger girdiniz");
        }
}}

