import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String phrase;
        
        System.out.println("Escreva uma frase");
        phrase = s.nextLine();

        Pattern patternFunny = Pattern.compile(":-\\)");
        Pattern patternSad = Pattern.compile(":-\\(");
        Matcher matcherFunny = patternFunny.matcher(phrase);
        Matcher matcherSad = patternSad.matcher(phrase);

        int countHappiness = 0;
        int countSadness = 0;

        while(matcherFunny.find()) countHappiness++;
        while(matcherSad.find()) countSadness++;

        if(countHappiness > countSadness){
            System.out.println("Humor da frase: divertido");
        }
        if(countHappiness < countSadness){
            System.out.println("Humor da frase: chateado");
        }
        if(countHappiness == countSadness){
            System.out.println("Humor da frase: neutro");
        }

    }

   
}