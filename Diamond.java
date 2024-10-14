import java.util.*;
public class Diamond {
  public static void main(String[] args) {
    System.out.println("Enter a number");
    //Initiate the scanner
    Scanner sc=new Scanner(System.in);
    int no=sc.nextInt();

    int count=1;
    for(int values=1;values<=2*no-1;values++) {
      for(int firstincrmnt=count;firstincrmnt<=no;firstincrmnt++) {
        System.out.print(" ");
      }
      for(int secondincrmnt=1;secondincrmnt<=count*2-1;secondincrmnt++) {
        System.out.print("*");
      }
      if(values<no)
      //If 
              count++;
              else
              count--;
                    System.out.println("");
    }
  
  }
}
