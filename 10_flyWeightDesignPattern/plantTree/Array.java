class Array {
	private int arr[];
	private int count;
	public Array(int length) { arr = new int[length]; }
	public void printArray()
	{
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void insert(int element)
	{

		if (arr.length == count) {
			int newArr[] = new int[2 * count];
			for (int i = 0; i < count; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}

		arr[count++] = element;
	}
}

// public class GFG {

// 	// Main driver method
// 	public static void main(String[] args)
// 	{

// 		// Creating object of Array(user-defined) class
// 		Array numbers = new Array(3);

// 		// Adding elements more than size specified above
// 		// to the array to illustrate dynamic nature
// 		// using the insert() method

// 		// Custom input elements
// 		numbers.insert(10);
// 		numbers.insert(30);
// 		numbers.insert(40);
// 		numbers.insert(50);

// 		// Calling the printArray() method to print
// 		// new array been dynamically created
// 		numbers.printArray();
// 	}
// }
