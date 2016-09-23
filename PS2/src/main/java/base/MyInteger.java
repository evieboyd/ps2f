package base;

public class MyInteger {
	
	private int iValue;
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	
	public int getIValue(MyInteger n) {
		return this.iValue;
	}
	
	public boolean isEven() {
		
		if(iValue % 2 == 0)
		return true;
		return false;
	}

	public boolean isOdd() {
		
		if(iValue % 2 == 0)
		return false;
		return true;
	}

	public boolean isPrime() {
		
		if(iValue % 2 == 0)
		return false;
		for(int n = 3; n * n <= iValue; n += 2) {
			if (iValue % n == 0)
				return false;
		}
		return true;
	}
	
public static boolean isEven(int i) {
		
		if(i % 2 == 0)
		return true;
		return false;
	}

	public static boolean isOdd(int i) {
		
		if(i % 2 == 0)
		return false;
		return true;
	}

	public static boolean isPrime(int i) {
		
		if(i % 2 == 0)
		return false;
		for(int n = 3; n * n <= i; n += 2) {
			if (i % n == 0)
				return false;
		}
		return true;
	}
	
public static boolean isEven(MyInteger j) {
		
		if(j.iValue % 2 == 0)
		return true;
		return false;
	}

	public static boolean isOdd(MyInteger j) {
		
		if(j.iValue % 2 == 0)
		return false;
		return true;
	}

	public static boolean isPrime(MyInteger j) {
		
		if(j.iValue % 2 == 0)
		return false;
		for(int n = 3; n * n <= j.iValue; n += 2) {
			if (j.iValue % n == 0)
				return false;
		}
		return true;
	}
	
	
	public boolean equals(int i, int v) {
		
		if(i == v)
			return true;
		return false;
		
	}
	
	public boolean equals(MyInteger i, int v) {
		
		if(i.iValue == v)
			return true;
		return false;
		
	}
	
}