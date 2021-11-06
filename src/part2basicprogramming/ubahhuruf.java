package part2basicprogramming;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Locale;

class ubahhuruf {
    private static String ubahHuruf(String s) {
        String[] alfabet = new String[]{"a","b","c","d","e","f","g","h","i",
                                        "j","k","l","m","n","o","p","q","r","s","t",
                                        "u","v","w","x","y","z"};
        Integer indexAlfa = null;
        String output= "";
        for (int i=0; i<s.length(); i++){
            for (int j=0; j< alfabet.length; j++){
                if(s.substring(i,i+1).equalsIgnoreCase(alfabet[j])){
                    indexAlfa=j+10;
                    if(indexAlfa>25){
                        indexAlfa -= 26;
                    }
                    output += alfabet[indexAlfa];
                }
            }
            if(s.substring(i,i+1).equals(" ")){
                output += " ";
            }
        }
        return output.toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println(ubahHuruf("SEPULSA OKE"));
        System.out.println(ubahHuruf("ALTERRA ACADEMY"));
        System.out.println(ubahHuruf("INDONESIA"));
        System.out.println(ubahHuruf("GOLANG"));
        System.out.println(ubahHuruf("PROGRAMMER"));
    }
}
