import java.util.Scanner;
public class VowelsConsonants {
    static boolean isVowel(char ch){ ch = Character.toLowerCase(ch); return "aeiou".indexOf(ch) >= 0; }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int vowels=0, consonants=0, digits=0, spaces=0;
        for(char ch: line.toCharArray()){
            if(Character.isDigit(ch)) digits++;
            else if(Character.isWhitespace(ch)) spaces++;
            else if(Character.isLetter(ch)) { if(isVowel(ch)) vowels++; else consonants++; }
        }
        System.out.println("vowels: "+vowels);
        System.out.println("consonants: "+consonants);
        System.out.println("digits: "+digits);
        System.out.println("whitespaces: "+spaces);
    }
}
