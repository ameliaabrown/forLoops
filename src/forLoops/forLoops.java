package forLoops;

public class forLoops {

	public static void main(String[] args) {
	challengeOne();
	challengeTwo();
	challengeThree();
	challengeFour();
	//challengeFive();
	//challengeSix();
	//challengeSeven();
	//challengeEight();
	}

	public static void challengeOne(){
		for (int i = 1; i<6; i++)
			System.out.println(i);
	}
	
	public static void challengeTwo(){
		for (int i = 2; i<=10; i = i +2)
			System.out.println(i + ". I love Mullen");
	}
	
	public static void challengeThree(){
		for (int i = 1; i<6; i++)
			System.out.print(i);
	}
	//need to seperate the 10 from the above assignment challenge two
	
	public static void challengeFour(){
		for (int i =10; i>0; i--)
			System.out.println(i);
		System.out.println("Liftoff!");
	}
	
	public static void challengeFive(){
		for (int i =5; i<=100; i=i+5)
			System.out.println(i);
	}
	public static void challengeSix() {
		System.out.println("Please give an upperbound number.");
		System.out.println("Please give a lowerbound number.");
		//need Scanner
	}
	public static void challengeSeven() {
		
	}
	
	public static void challengeEight() 
	{
		System.out.print("*********");
		for (int i =0; i<7; i++) 
		{
		System.out.println("*       *");	
		}
		System.out.println("*********");
	}
}
