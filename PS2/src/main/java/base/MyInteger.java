package base;

public class MyInteger {

	private int iValue;
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue(){
		return iValue;
	}
	
	protected boolean isEven(){
		return (iValue % 2 == 0) ? true : false;
	}

	protected static boolean isEven(int value){
		return (value % 2 == 0) ? true : false;
	}
	
	protected static boolean isEven(MyInteger i){
		return (i.iValue % 2 == 0) ? true : false;
	}
	
	protected boolean isOdd(){
		return (iValue % 2 != 0) ? true : false;
	}
	
	protected static boolean isOdd(int value){
		return (value % 2 != 0) ? true : false;
	}
	
	protected static boolean isOdd(MyInteger i){
		return (i.iValue % 2 != 0) ? true : false;
	}
	
	protected boolean isPrime(){
		boolean prime = true;
		int counter = 2;
		while(counter < iValue){
			if(iValue % counter == 0){
				prime = false;
			}
			counter++;
		}
		return prime;
	}
	
	
	protected static boolean isPrime(int value){
		boolean prime = true;
		int counter = 2;
		while(counter < value){
			if(value % counter == 0){
				prime = false;
			}
			counter++;
		}
		return prime;
	}
	
	protected static boolean isPrime(MyInteger i){
		boolean prime = true;
		int counter = 2;
		while(counter < i.iValue){
			if(i.iValue % counter == 0){
				prime = false;
			}
			counter++;
		}
		return prime;
	}
	
	protected boolean isEqual(int value){
		return (value == iValue) ? true : false;
	}
	
	protected boolean isEqual(MyInteger i){
		return (i.iValue == iValue) ? true: false;
	}
}
