package part2basicprogramming;

class drawXYZ {
    private static void DrawXYZ(int n){
        int x=0;
        for (int i=0; i<n; i++){
            for (int j=0;j<n;j++){
                x+=1;
                if (x % 3 ==0){
                    System.out.print("X ");
                } else {
                    if(x%2 ==0){
                        System.out.print("Z ");
                    }
                    else{
                        System.out.print("Y ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);
    }
}