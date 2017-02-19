
public class VideoStoreApp {

	public static void main(String[] args) {

		RentalStatement statement = new RentalStatement();
		
		
		Movie regular = new RegularMovie("WCCI");
		Movie childrens = new ChildrensMovie("Up");
		Movie newRelease = new NewRelease("Dr Strange");
		
		Rental regualarMovie = new Rental(regular, 3);
		Rental childrensMovie = new Rental(childrens, 3);
		Rental newReleaseMovie = new Rental(newRelease, 3);
		
		statement.add(regualarMovie);
		statement.add(childrensMovie);
		statement.add(newReleaseMovie);

		System.out.println("Movies rented for 5 days");
		statement.print();
		
		//this will print to the text file called videoRecords.txt
		try {
			statement.printToText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
