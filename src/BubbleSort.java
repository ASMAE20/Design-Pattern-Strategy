import java.util.ArrayList;

public class BubbleSort implements Strategy {
	public void sort (int[] numbers) {
	
        System.out.println("sorting array using bubble sort strategy");
        System.out.println(" le tableau avant le tri à bulles ");
        for(int i=0; i < numbers.length; i++){
            System.out.print("   "+numbers[i] + " ");
        }
       
        int temp = 0;
        for(int i=0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("\n le tableau apès le tri à bulles");
        for(int i=0; i < numbers.length; i++){
            System.out.print("   "+numbers[i] + " ");
        }
        System.out.println();

    }
	

}
