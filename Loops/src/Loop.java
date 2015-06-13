
public class Loop {

	public static void main(String[] args){
			Loop loop = new Loop();

			
			int [] age = {10, 11, 30, 11, 85, 11, 52, 10, 105, 72};

			int ageToFind = 11; 

			loop.search(age, ageToFind); 

			loop.searchValue(age, ageToFind); 
		}

		public void search(int[] elements, int integer) {
			
			for (int i = 0; i < elements.length; i++) {
				if (elements[i] == integer) {
					System.out.println("Index: " + i + " contains the find age: " + integer);
					break;
				}
			}

		}

		
		public void searchValue(int[] elements, int integer) {
			
			int numberOfOccurences = 0;

			
			for (int i = 0; i < elements.length; i++) {
				if (elements[i] == integer) {
					numberOfOccurences++;			
				}
			}

			System.out.println("The value: " + integer + " occurs " + numberOfOccurences + " times in the array.");
		}

	}

