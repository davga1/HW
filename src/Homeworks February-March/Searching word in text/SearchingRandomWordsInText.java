package StringsHomeworksAndExercises;

import java.util.Scanner;

public class SearchingRandomWordsInText {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your text");
        String text = s.nextLine();
        System.out.println("Enter the word for searching");
        String word = s.nextLine();
        String keyword = ("There is " + For(text, word) + " word " + word);
        if (For(text, word) == -1) {
            System.out.println(keyword);
            System.out.println("It means that you haven't the word \"" + word + "\" in your text");
        } else if (For(text, word) == -2) {
            System.out.println(keyword);
            System.out.println("It means that you haven't any letter in your text or word");
        } else System.out.println(keyword);
// Second part ---------------------------------------------------------------------------------------------------------
        System.out.println("Enter some text and I should answer how many times you are used the word \"String\"");
        String wordForStringSearch = s.nextLine();
        String keywordForStrings = ("There is " + For(wordForStringSearch,"String") + " words named \"String\"");
        if (For(wordForStringSearch,"String") == -2) {
            System.out.println(keywordForStrings);
            System.out.println("It means your text is empty");
        } else if (For(wordForStringSearch,"String") == -1) {
            System.out.println(keywordForStrings);
            System.out.println("You have no word \"String\" here");
        } else System.out.println("There is " + For(wordForStringSearch,"String") + " words named \"String\"");
    }
    static int For (String text,String word){
        int counter = 0;
        String[] e = text.split(" ");
        for (int i = 0; i < e.length; i++) {
            if (e[i].equals(word))
                counter++;
        }
        if (text.isEmpty() || word.isEmpty()) return -2;
        else if (counter == 0) return -1;
        return counter;
    }
}
