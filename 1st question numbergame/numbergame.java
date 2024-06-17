import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int attempts =10;
        int finalscore=0;
        boolean playagain=true;
        System.out.println("hello");
        System.out.println("you have" + attempts+ "to win");
        while (playagain) {
            int random =getrandomN(1,100);
            boolean guess=false;
            for (int i = 0; i<attempts; i++) 
            {
                System.out.println( "attempts"+(i+1)+"enter your guess:");
                int user=sc.nextInt();
                if(user==random){
                    guess=true;
                    finalscore+=1;
                    System.out.println("congratulations.you won");
                    break;

                }
                else if(user<random){
                    System.out.println("sorry! the guess is too low");
                }
                else{
                    System.out.println("sorry! the guess is too high");
                }
                }
             if(guess==false){
                System.out.println(" sorry you have lost your attempts"+random);
             }
             System.out.println("restart the game(yes/no)");
             String pa=sc.next();
             playagain=pa.equals("yes");

            }
            System.out.println("you have completed");
            System.out.println("the score is"+finalscore);



            
        }
         public static int getrandomN(int min,int max)
         {
                return (int)(Math.random()*(max-min+1)+min);
         }
    }
    

