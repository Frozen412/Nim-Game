 import java.util.*;
 class ToughNim
 {
     public static void main(String[] args) throws InterruptedException 
     {
            int a=0,p=0,k =0,ch =0,cc=0,c=0 ,r=0;
            while (c==0)
            {
            a = randomNumberInRange(3, 7);
            System.out.println("You Can Only Remove Up To " + (a+1) + " Sticks At A Time");
            System.out.println("Your Goal Is To Remove The Last Stick");
            System.out.println("To Remove A Stick Enter A Number");
            System.out.println("Enter 1 if User wants to play first");
            System.out.println("Enter 2 if User wants computer to play first");
            System.out.println("Enter 3 to quit");
            
            Scanner sc = new Scanner (System.in);
            ch = sc.nextInt();
                       
            int n = randomNumberInRange(40, 80);
            System.out.println("Number of sticks = " + n);
                            
            while ( n>0)
            {
                if (a>7)
                {
                    a=3;
                }
                
            if (ch ==1 )
            {
                if (n<=a)
                {
                     System.out.println("User wins"); c=0; break;
                }
                else 
                {
                   System.out.println("Enter A Number");
                r = sc.nextInt();
                if (r>0 && r<=a)
                {
                n = n -r;
                System.out.println("Number of sticks left after user's turn = " + n);
                ch = 2 ;
                }
                p=p+1;
                if (p%2==0 && p>0)
                 {
                     System.out.println("You Can Only Remove Up To " + a + " Sticks At A Time");
                     a=a+1;
                    }
            }
            }
            else if (ch == 2 )
            {
                if (n<=a)
                {
                     System.out.println("Computer wins"); c=0; break;
                }
                
                 k = randomNumberInRange(1, a);
                 n = n-k;
                 System.out.println("Number of sticks left after computer's turn = " + n);
                 ch = 1;
                 p=p+1;
                 if (p%2==0 && p>0)
                 {
                     System.out.println("You Can Only Remove Up To " + a + " Sticks At A Time");
                     a=a+1;
                    }
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
            