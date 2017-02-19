import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class RentalStatement {
	Collection<Rental> rentals = new ArrayList<Rental>();
	
	public void add(Rental toAdd) {
		rentals.add(toAdd);
	}
	
	public void print() {
		for (Rental rental : rentals) {
			System.out.println("\nprice code: " + rental.getPriceCode() +
					 "\nTitle - " + rental.getTitle() + "\nFees - $" + rental.calculateFees() + "\n");
		}
		
	}
	
	public void printToText() throws Exception {
		
		FileOutputStream fileOutput = new FileOutputStream("VideoRecords.txt");
		PrintStream printOutput = new PrintStream(fileOutput);
		
		printOutput.println("Collection of rented movie...");
		
		for (Rental rental : rentals) {
			
			printOutput.println("\nprice code: " + rental.getPriceCode() +
					 "\nTitle - " + rental.getTitle() + "\nFees - $" + rental.calculateFees() + "\n");
			
		}
		
		fileOutput.close();
		printOutput.close();
		
	}


}
