import java.util.Arrays;

public class SortClass {
    int[] liste;
    int start, end;

    public  SortClass(int[] array) {
        this.liste = array;
        this.start = 0;
        this.end = (array.length - 1);

        resolve(0,this.end);
    }

    @Override
    public String toString() {
        return "SortClass{" +
                "liste=" + Arrays.toString(liste) +
                '}';
    }
    public void resolve(int begin,
                           int end) {
        if (begin < end) {
            int index = partition(this.liste,begin, end);
            resolve( begin, index-1);
            resolve(index+1, end);
        }

    }

    public int partition(int[] arr,int begin, int end) {
        int get_end = arr[end]; // listenin en sonundaki elamanı alıyor 72

        int i = (begin-1);

        // for 7 kez döncek
        for (int j = begin; j < end; j++) {
            if (arr[j] <= get_end) {

                i++;
                int ctemp= arr[i];

                arr[i] = arr[j];

                arr[j] = ctemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    }

