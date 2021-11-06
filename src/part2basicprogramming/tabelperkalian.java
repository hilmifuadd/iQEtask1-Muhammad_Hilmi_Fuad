package part2basicprogramming;

class tabelperkalian {
    private static void cetakTablePerkalian(int n){
        int hasil =0;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                hasil=i*j;
                System.out.print(hasil + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        cetakTablePerkalian(3);
    }
}
