public class Main {

    public static void main(String[] args) {
        String s = "develop";
        System.out.println(s);
        int[] tabelka = {13,11,12,1,2,6,5,4,3,9,7,8};

        for(int tmp : tabelka){
            System.out.print(tmp + " ");
        }
        System.out.println();
        bubbleSort.bubbleSorter(tabelka);

        for(int tmp : tabelka){
            System.out.print(tmp + " ");
        }


    }
}
