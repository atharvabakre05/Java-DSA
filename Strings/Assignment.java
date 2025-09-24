public class Assignment {
    //Q1
    public static int lowerVowels(String str){
        // StringBuilder sb = new StringBuilder("");
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u' ){
                count++;
            }
        }
        return count;
    }

    //Q2
    

    public static void main(String args[]){
        String str = "Atharva atharva";
        System.out.println(lowerVowels(str));
    }
}
