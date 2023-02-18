public class MedianOf3PivotSelector implements PivotSelector{
    
    public int choosePivotIndex(int[] array, int first, int last) {
        int firstItem = array[first];
        int lastItem = array[last];
        int mid = (first+last)/2;
        int midItem = array[mid];
        if (firstItem >= Math.min(midItem, lastItem) && firstItem <= Math.max(midItem, lastItem))
        {
            return first;
        }

        else if (midItem >= Math.min(firstItem, lastItem) && midItem <= Math.max(firstItem, lastItem)) {
            return mid;
        }

        else {
            return last;
        }
    }

    public static void main(String[] args) {
        int[] test = {8,5,3,100,8,10,25};
        MedianOf3PivotSelector select = new MedianOf3PivotSelector();
        System.out.println(select.choosePivotIndex(test, 1, 5));
    }
}

