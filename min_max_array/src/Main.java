public class Main {

    public static void main(String[] args) {

        int[] array = {10,23, 42,3, 20};

        int max = array[0];
        int min = array[0];
        for(int i = 1; i< array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i]< min ){
                min = array[i];
            }
        }
        System.out.println("Max Nr.: " + max);
        System.out.println("Min Nr.: " + min);
    }
}
