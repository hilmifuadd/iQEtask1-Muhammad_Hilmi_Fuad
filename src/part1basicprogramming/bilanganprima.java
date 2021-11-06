package part1basicprogramming;
class bilanganprima {
    private static boolean primeNumber(int number){
        int counter=0;
        for (int i = number; i>0; i--) {
            if (number%i ==0) {
                counter =counter+1;
            }
        }
        if(counter == 2) {
            System.out.println(number+" adalah bilangan prima.");
            System.out.print("Output : ");
            return true;
        } else{
            System.out.println(number+" bukan bilangan prima.");
            System.out.print("Output : ");
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
}
