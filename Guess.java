import java.util.*;
public class Guess {
    public static void main(String[] args)
    {
        int count=5;
        int number=(int)Math.floor(Math.random()*(100)+1);
        System.out.println("guess the number between 1-100");
        Scanner sc = new Scanner(System.in);
        while(count>=0)
        {
        System.out.println("enter your guess between 1-100");
        int inputnumber = sc.nextInt();
        if(inputnumber == number)
        {
            System.out.println("yeah buddy u got it"+number);
        }
        else
        {
            System.out.println("sorry buddy try again dont lose hope");
            if(inputnumber<number)
            {
                System.out.println("the number is lesser than ur guessed number");
            }
            else
            {
                System.out.println("the number is greater than ur guessed number");
            }
        }
        count--;
        } 
    System.out.println("the correct number is "+number);
    }
}
