
public class Selection {
	public void sort(int[] array) { // Fazer de novo
		for(int i = 0; i < array.length - 1; i++) {
			int min =  i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					int aux = array[j];
					array[j] = array[min];
					array[min] = aux;
				}
			}
		}
	}
}
