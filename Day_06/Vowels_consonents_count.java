package Day_6;

public class Vowels_consonents_count {
    public static void main(String[] args) {
        String str="hello ";
        int vowel =0;
        int con=0;
        int space=0;
        str=str.toLowerCase();
        char [] ch=str.toCharArray();
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowel++;
            }
            else if (str.charAt(i) == ' ') {
                space++;
            }
            else {
                con++;
            }

        }
        System.out.println("vowels is "+vowel);
        System.out.println("consonents is "+con);
        System.out.println("spaces is "+space);
    }
}
