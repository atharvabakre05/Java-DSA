public class Assignment {

    public static boolean repeatValues(int num[]) {
        for(int i=0; i<num.length; i++) {
            for(int j=i+1; j<num.length; j++) {
                if(num[i] == num[j]){
                    return true;
                }

            }
        }
        return false;


    }
    public static void main(String[] args) {

        int num[] = {1,3,5,77,89};
        System.out.println(repeatValues(num));
    }
    
}
