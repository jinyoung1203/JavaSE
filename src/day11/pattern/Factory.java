package day11.pattern;

public class Factory {

private static Factory instance;
	
	private Factory() {
	}
	
	public static Factory getInstance() {
		return new Factory();
		}
		
		
	}
	
	

