
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {1,9,3,6,4,-1};
		
		Selection sl = new Selection();
		sl.sort(array);
		System.out.println(Arrays.toString(array));

	}

}
