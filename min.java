import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
 public class min{

    
        static Scanner scan = new Scanner(System.in);
        static ArrayList<String> Question = new ArrayList<>();
        static Set<Integer> unique = new HashSet<>();
        static ArrayList<String> Choices = new ArrayList<>();
        static ArrayList<String> answer = new ArrayList<>();
    
        public static void multipleChoice2() {
            //اجابات اليوزر
            int correctAnswer = 0;
            int inCorrectAnswer = 0;
            // عدد الاسئله اللتي تظهر للمختبر
            int question = 3;
    
            //الاسئله
            Question.add("What is the name of the heaviest animal in the world?");
            Question.add("In which country is there the highest fountain in the world? ");
            Question.add("In which country is the Statue of Liberty located? ");
            Question.add("In which country is the largest forest in the world located? ");
            Question.add("How many teeth does an adult human have? ");
            Question.add("What is the chemical name of chalk?");
            Question.add("Who invented the light bulb?");
            // الاختيارات
            Choices.add("\nA.Gorilla \nB.Elephant \nC.Blue Whale \n");
            Choices.add(" \nA.Jeddah \nB.Paris\nC.Dubai\n");
            Choices.add("\nA.Washington\nB.England\nC.New York\n");
            Choices.add(" \nA.India\nB.Russia \nC.Germany \n");
            Choices.add("\nA.29\nB.32 \nC.40 \n");
            Choices.add ("\nA.Calcium Carbonate \nB.Chlorate \nC.Sulfide\n");
            Choices.add("\nA.Thomas Lemar \nB.Thomas Friedman \nC.Thomas Alva Edison\n");
            // الاجابه الصحيحه
            answer.add("C");
            answer.add("A");
            answer.add("C");
            answer.add("B");
            answer.add("B");
            answer.add("A");
            answer.add("A");
            // متغيرات لاظهار اعدد عشوائيه

            int minVal = 1;
            int maxVal = Question.size();
            int i = 0;
    
            String[] user_ans = new String[(int) question];
    
            while (unique.size() != 3) {
                int randInt = (ThreadLocalRandom.current().nextInt(minVal, maxVal));
    
                System.out.println("Q" + (i + 1) + ". " + Question.get(randInt - 1) + " " + Choices.get(randInt - 1));
    
                user_ans[i] = String.valueOf(scan.nextLine().charAt(0));
    
                if(i < question){

                 if (answer.get(randInt - 1).equals(user_ans[i].toUpperCase())) {
    
                    System.out.println("\n correct Answer");
    
                    correctAnswer++;
    
                } else{
    
                    System.out.println("\n incorrect. the correct Answer is " + answer.get(randInt - 1));
    
                    inCorrectAnswer++;
    
                }
            }
               
                    i++;
                
    
                unique.add(randInt);
    
            }
    
            System.out.println(unique);
    
            while (i < 3);
            System.out.println("\n");
            System.out.println("\t ==== DISPLAY RESULTS ====");
            System.out.println("\n");
            System.out.println("\n number of  correct Answer: " + correctAnswer);
            System.out.println("\n number of  incorrect Answer: " + inCorrectAnswer);
            System.out.println("\n cpercentage: " + (correctAnswer * 100) / question + "%");
    
            System.out.println("\t End of program");
    
        }
    
        public static void main(String[] args) {
    
            System.out.print("\n");
            System.out.print("-------------welcome to my program------------------ ");
            System.out.print("\n");
            System.out.print("\n");
    
            System.out.print("-------------This test is simple consisting of three questions please enter the correct answer A,B or C------------------ ");
            System.out.print("\n");
            System.out.print("\n");
            System.out.println("please enter your name");
            String name = scan.nextLine();
            System.out.println("hello " + name);
            System.out.print("\n");
            System.out.print("\n");
    
            multipleChoice2();
        }
    }