package part2basicprogramming;

class asterisk {
    private static void playWithAsterik(int n){
        for(int t=1; t<=n; t++){
            for(int s=t; s<n; s++){
                System.out.print(" ");
            }
            for(int b=1; b<=t; b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        playWithAsterik(5);
    }
}
