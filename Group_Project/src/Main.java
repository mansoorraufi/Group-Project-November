public class Main {
    public static int countVowels(String s) {

        int count = 0;
        char[] array = s.toLowerCase().toCharArray();

        for(int i = 0; i < array.length; i++){
            if(array[i]=='a' || array[i]=='e' || array[i]=='i' || array[i]=='o' || array[i]=='u'){
                count++;
            }
        }
        return count;
    }
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}

