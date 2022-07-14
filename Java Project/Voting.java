import java.util.*;
class Voting
{
 public static void main(String[]args)
 {
   Scanner Sc=new Scanner(System.in);
   System.out.println("Enter your age:");
   System.out.println("Enter your name:");
   int i=Sc.nextInt();
   String K=Sc.next();
   if(i<18)
   {
     System.out.println("your are not eligible for voting " );
     System.out.println(K);
    }
     else if(i>=18)
      {
        System.out.println( i +"your are eligible for voting  ");
        System.out.println(K);
       }else{
        System.out.println("sorry your not eligible");
       }
   }
}