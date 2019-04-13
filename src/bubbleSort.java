public class bubbleSort {
    public static int[] bubbleSorter (int[] tab) {
        boolean change;
        int tmp;
        do{
            change = false;
            for(int i = 1; i < tab.length; i++){
                if(tab[i - 1] > tab[i]){
                    tmp = tab[i -1];
                    tab[i -1] = tab[i];
                    tab[i] = tmp;
                    change = true;
                }
            }
        }while (change);
        return tab;
    }
}
