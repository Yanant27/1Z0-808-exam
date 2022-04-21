package exceptions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * Two types of exception
 * 1. checked exception (extends Exception, not RuntimeException, don't need to handle or declare)
 * 2. unchecked exception (extends RuntimeException, need to handle or declare)
 * Error - allowed to be declare but not a good idea
 * 
 * Must include curly braces {}
 * 
 * Be aware of uncaught exceptions
 * 
 * Exception order - 1st most specified (subclass) -> least specified (superclass)
 * 
 * unchecked Exceptions, , Errors, thrown by JVM
 * ExceptionInInitializerError
 * ArrayIndexOutOfBoundsException, NullPointerException
 * IllegalArgumentException, NumberFormatException
 * 
 * Common Error
 * StackOverflowError, ExceptionInInitializerError
 * 
 * subclass/ child class
 * doesn't allow broader Exception
 * allow RuntimeException to throw
 * 
 * Checked exceptions are allowed/required to be handled or declared.
 * Errors are allowed to be handled or declared.
 * Runtime exceptions are allowed to be handled or declared.
 * 
 * The same exception can't be specified in two different catch blocks.
 * 
 * @author Htoo Yanant Khin
 *
 */
public class TestException {
	public static void main(String[] args) throws Exception {
		Map<Long, String> buyItems = new HashMap<Long, String>();
		buyItems.put(1L, "orange");
		buyItems.put(2L, "mango");
		
//		if (!buyItems.containsKey(3L)) {
//			throw new BuyItemNotFoundException("No Buy Item !");
//		}
		Map<Long, String> sellItems = new HashMap<Long, String>();
		sellItems.put(1L, "shirt");
		sellItems.put(2L, "pant");
		try {
			checkSellItems(sellItems, 3L);
		} catch (SellItemNotFoundException e) {
			System.out.println("1st catch exception is thrown"); // subclass
		} catch (ItemNotFoundException e) { // superclass
			System.out.println("2nd catch exception is thrown"); // superclass
		}
//		catch (SellItemNotFoundException e) { // subclass, unreachable catch block
//			// TODO: handle exception
		
		
//		}
	}
	
	private static void checkSellItems(Map<Long, String> map, Long key) throws Exception{
		if (!map.containsKey(key)) {
			throw new SellItemNotFoundException("Sell Items Not Found !");
		}
	}
}

class ItemNotFoundException extends RuntimeException {
	public ItemNotFoundException() {}
	public ItemNotFoundException(String message) {
		System.out.println(message);
		
	}
}

class BuyItemNotFoundException extends ItemNotFoundException {
	public BuyItemNotFoundException() {}
	public BuyItemNotFoundException(String message) {
		super(message);
	}
}

class SellItemNotFoundException extends ItemNotFoundException {
	public SellItemNotFoundException() {}
	public SellItemNotFoundException(String message) {
		super(message);
	}
}

interface Parent {
	void treat() throws Exception;
}

class Child implements Parent {
public void treat() throws IOException { // child class -> broader visibility, more specific Exception
		
	}
}