package methods;

public class methods {
    static void showList(int start, String ...s){
        for (int i = 0; i < s.length; i++){
            System.out.println(start+" . "+s[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        showList(5,"Roman","Saklain","Niggesh","Heera");
    }
}
