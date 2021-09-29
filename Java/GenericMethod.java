class GenericMethod
{
	//generic method printArray
	<E> void printArray(E[] inputArray)
	{
		// Display array elements
		for(E element:inputArray)
		{
			System.out.println(element +"\t");		//1 2 3 _ _ _ _
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		// Create arrays of Integer,Double & Character
		GenericMethod m=new GenericMethod();
		Integer[] intArray={1,2,3,4,5};
		Double[] doubleArray={1.1,2.2,3.3,4.4};
		Character[] charArray={'H','E','L','L','O'};
		
		System.out.println("Array integerArray contains: ");
		m.printArray(intArray);		// pass an Integer Array
		
		System.out.println("\nArray doubleArray contains: ");
		m.printArray(doubleArray);	// pass an Integer Array
		
		System.out.println("\nArray characterArray contains: ");
		m.printArray(charArray);	// pass an Integer Array
	}
}
	