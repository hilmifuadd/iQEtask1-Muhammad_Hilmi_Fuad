package part1basicprogramming;

class palindrome {
    private static boolean palindrome(String value)  {
        String pali = "";
        for(int i=value.length(); i>0; i--){
            String teks = value.substring(i-1, i);
            pali += teks;
        }
        if(value.equals(pali)){
            System.out.println("Input :"+value);
            System.out.print("Output : ");
            return true;
        }else{
            System.out.println("Input :"+value);
            System.out.print("Output : ");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}
