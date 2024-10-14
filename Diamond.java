import java.util.*;
public class Diamond {
  public static void main(String[] args) {
    System.out.println("Enter a number");
    //Initiate the scanner
    Scanner sc=new Scanner(System.in);
    int no=sc.nextInt();

    int count=1;
    for(int incrmntvalues=1;incrmntvalues<=2*no-1;incrmntvalues++) {
      for(int secondincrmnt=count;secondincrmnt<=no;secondincrmnt++) {
        System.out.print(" ");
      }
      for(int thirdincrmnt=1;thirdincrmnt<=count*2-1;thirdincrmnt++) {
        System.out.print("*");
      }
      if(incrmntvalues<no)
      //If 
              count++;
              else
              count--;
                    System.out.println("");
    }
  
  }
}
