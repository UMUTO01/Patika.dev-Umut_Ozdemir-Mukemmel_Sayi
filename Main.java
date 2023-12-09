import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int a = scan.nextInt();

        int temp = 0;



        for(int i = 1; i<a;i++){

            if(a%i==0){
                temp+= i;
            }
        }

        if( temp == a){
            System.out.println(a+" is a perfect number");
        }
        else {
            System.out.println(a+" is not a perfect number");
        }

    }
    }
