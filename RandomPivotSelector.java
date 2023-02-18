import java.util.Random;

/**
* Chooses a random index for pivot selection
*/
public class RandomPivotSelector implements PivotSelector {
    private Random randomNumberGenerator = new Random();

    /**
     * Returns a random pivot index between the integers first and last (inclusive).
     */
     public int choosePivotIndex(int[] array, int first, int last) {
         return first + randomNumberGenerator.nextInt(last - first + 1);        
     }

}