import java.util.*;

public class Main{
    public static void main(String[]args){


   
    Scanner input = new Scanner(System.in);  //scanner class
    
    System.out.println("Enter any Sentence");
    String sentence = input.nextLine();
    System.out.println("Enter any Letter");
    String letter = input.nextLine();

    int index = sentence.indexOf(letter);
    
    if(index == -1){
        System.out.println("The letter does not exist in the sentence");
    }else{
        System.out.println(sentence.substring(index+1));
    }

} 
}
