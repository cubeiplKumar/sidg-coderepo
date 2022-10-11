/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

 class main
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
		//create a file object for the current location
		File devfile1=new File("deployment.java");
		try{
			//trying to create a file based on theobject
			boolean value=file.createNewFile();
			if(value){
				System.out.println("The new file is created");
			}
			else
			{
				System.out.println("file already exists");
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}

	#feature302 changes by Vivek on Aug31 on Login module
	public static void sampleMethod(int a, int b) throws ArithmeticException{
		System.out.println("Hello , its a sample method");
		int c=a/b;int c=4/2 which gets calculated as 2
		System.out.println("c:"+c);
	catch (Exception){
		e.getStackTrace();
	}
	
	}

	#feature 301 changes done by Hemanth on Aug31 for the module FileRegistration
	//reads all data from inputfile.txt
	{
	sourceFile.read(array);
	//writes all data to newFile
	destFile.write(array);
	System.out.println("The input.txt file is copied to newFile");
	}
	

}