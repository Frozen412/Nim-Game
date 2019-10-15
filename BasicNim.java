 import java.util.*;
 class BasicNim
 {
     public static void main(String[] args) throws InterruptedException 
     {
            int k =0,ch =0,cc=0,c=0 ,r=0;
            while (c==0)
            {
            System.out.println("You Can Only Remove Up To 3 Sticks At A Time");
            System.out.println("Your Goal Is To Remove The Last Stick");
            System.out.println("To Remove A Stick Either Enter 1, 2 or 3");
            System.out.println("Enter 1 if User wants to play first");
            System.out.println("Enter 2 if User wants computer to play first");
            System.out.println("Enter 3 to quit");
            
            Scanner sc = new Scanner (System.in);
            ch = sc.nextInt();
                       
            int n = randomNumberInRange(40, 80);
            System.out.println("Number of sticks = " + n);
                            
            while ( n>0)
            {
            if (ch ==1 )
            {
                if (n<=3)
                {
                     System.out.println("User wins"); c=0; break;
                }
                else 
                {
                   System.out.println("Enter 1 , 2 or 3");
                r = sc.nextInt();
                if (r>0 && r<=3)
                {
                n = n -r;
                System.out.println("Number of sticks left after user's turn = " + n);
                ch = 2 ;
                }
            }
            }
            else if (ch == 2 )
            {
                if (n<=3)
                {
                     System.out.println("Computer wins"); c=0; break;
                }
                
                 k = randomNumberInRange(1, 3);
                 n = n-k;
                 System.out.println("Number of sticks left after computer's turn = " + n);
                 ch = 1;
               
            }
            else if (ch==3)
            {
                System.out.println("The user wants to quit"); 
                c=1;
                break;
            }
            else
            {
                System.out.println("Invalid choice"); 
                c=1;break;
            }
          }
        }
      }
     public static int randomNumberInRange(int min, int max) 
     {
          Random random = new Random();
          return random.nextInt((max - min) + 1) + min;
     }
}
            