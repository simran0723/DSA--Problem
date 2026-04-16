public class Easy_Pronounce {
    public static void main(String[] args) {
        String s = "cry";
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch =='e'|| ch =='i' || ch == 'o'|| ch == 'u'){
                count =0;
                break;
            }else {
                count++;
            }

        }
        if(count == 4){
            System.out.println("No");
        }
        System.out.println("yes");
    }
}
