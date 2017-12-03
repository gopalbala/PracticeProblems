/**
 * Created by fax6 on 02/12/17.
 */
public class Anagrams {
    public static void main(String[] args) {
        System.out.println(checkAnagrams("asdf","fdsa"));
    }
    static boolean checkAnagrams(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] letters = new int[1<<8];
        for (char c : s1.toCharArray()){
            letters[c]++;
        }
        for (char c: s2.toCharArray()) {
            letters[c]--;
        }
        for (int i:letters){
            if (i!=0)
                return false;
        }
        return true;
    }
}
