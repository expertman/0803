
public class Sort {
	void bubbleSorting(Student [] array) {
		for(int i = 0 ; i < array.length -1 ; i++) {
			for(int j = 0 ; j < array.length -1 ; j++) {
				if(array[j].tot < array[j+1].tot) {
					Student temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
