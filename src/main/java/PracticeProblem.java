public class PracticeProblem {

	public static void main(String args[]) {

	}
//Question 1
public static String[] selectionSortName(String[] names, int[] ages) {
	for (int i = 0; i < names.length - 1; i++) {
		String min = names[i];
		int indexOfMin = i;
		for (int j = i + 1; j < names.length; j++) {
			if(names[j].compareToIgnoreCase(min) < 0) {
				min = names[j];
				indexOfMin = j;
			}
		}
		String temp = names[i];
		names[i] = names[indexOfMin];
		names[indexOfMin] = temp;
		
		int temp2 = ages[i];
		ages[i] = ages[indexOfMin];
		ages[indexOfMin] = temp2;
		}
	return names;
}
//Question 2
public static int[] selectionSortAge(String[] names, int[] ages)  {
	for (int i = 0; i < ages.length - 1; i++) {
		int min = ages[i];
		int indexOfMin = i;
		for (int j = i + 1; j < ages.length; j++) {
			if(ages[j] < min) {
				min = ages[j];
				indexOfMin = j;
			}
		}
		int temp = ages[i];
		ages[i] = ages[indexOfMin];
		ages[indexOfMin] = temp;
		
		String temp2 = names[i];
		names[i] = names[indexOfMin];
		names[indexOfMin] = temp2;
		}
	return ages;
}
}

	


