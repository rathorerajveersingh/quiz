
import java.util.Scanner;

public class quiz {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String [] questions= {"Q.1 what is capital of India?\nA> Delhi\nB> Jaipur\nC> Lucknow\nD> Mumbai\n","Q.2 who invented java?\nA> Dennis Ritchie\nB> Albert Einstien\nC> thommas\nD> Grammbell\n","Q.3 How many planets are there in our solar systema?\nA> 7\nB> 8\nC> 1\nD> 2\n","Q.4 How many continents are there in the world?\nA> 1\nB> 3\nC> 7\nD> 9\n","Q.5 which is biggest ocean in the world?\nA> Pacific ocean\nB> Atlantic ocean\nC> arctic ocean\nD> Southern ocean"};

        char[] answers= {'A','A','B','C','A'};
        int score=0;
        System.out.println("QUIZ GAME HERE!!!!!!!!!");
        System.out.println("Start");
        System.out.println();
        for(int i=0;i<questions.length;i++) {
            System.out.println(questions[i]);
            System.out.println();
            System.out.println("Enter your answer(A/B/C/D)");
            char useranswer=sc.next().toUpperCase().charAt(0);
            if(useranswer==answers[i]) {
                System.out.println("correct answer");
                score++;
                System.out.println();

            }else {
                System.out.println("wrong Abnswer");
                System.out.println(" Correct answer is "+answers[i]);
                System.out.println("Here's next question");

            }



        }
        System.out.println(("quiz ends!!!!!!!!!!").toUpperCase());
        System.out.println("score is "+score+"/"+ questions.length);
        System.out.println("congratulations!!");
        sc.close();


    }
}
