import java.util.Scanner;
    public class Yasas{
        public static void main(String args[]){

            Scanner read = new Scanner(System.in);
                System.out.println("Hello There What IS your name ?");
                String name=read.nextLine();
               System.out.println("Hello "+name+" Fellow programmer "+"\n What is your age?");

               int age=read.nextInt();
               System.out.println("YOUR age is :"+age);

               if(age < 25){
                   System.out.println("BOY YOU ARE WAY TOO YOUNG");
               }
               else if (age < 30){
                   System.out.println("why?");
               }
               else{
                   System.out.println("Damn YOUR old");
               }
        }  
    }