package DSArefresg;

public class _3T_F_linear {

    static boolean search(String name, char target){
        if (name.length() == 0){
            return false;
        }

        for (int i =0; i < name.length(); i++){
            if (target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "saklain";
        char ch = 'k';
        System.out.println(search(str,ch));
    }
}
