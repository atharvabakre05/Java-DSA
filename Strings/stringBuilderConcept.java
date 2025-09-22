import java.util.*;
public class stringBuilderConcept{

    public static void main(String args[]) {
        //USING STRINGS O(26 * n^2)
        // String str = "Tony";
        // for(char ch='a'; ch<='z'; ch++){
        //     str += ch;
        // }
        // System.out.println(str);
        // System.out.println(str.length());

        //STRINGBUILDER
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());


    }
}