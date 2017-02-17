
public class VideoStoreApp {

	public static void main(String[] args) {

		Movie regular = new RegularMovie("WCCI", "regular");
		Movie childrens = new ChildrensMovie("Up", "childrens");
		Movie newRelease = new NewRelease("Dr Strnage", "new release");
		
		System.out.println("regular");
		System.out.println("amount due = " + regular.calculateFees(2));
		System.out.println("amount due = " + regular.calculateFees(3));
		System.out.println("amount due = " + regular.calculateFees(5));
		
		System.out.println("\nChildrens");
		System.out.println("amount due = " + childrens.calculateFees(2));
		System.out.println("amount due = " + childrens.calculateFees(4));
		System.out.println("amount due = " + childrens.calculateFees(5));

		System.out.println("\nnewRelease");
		System.out.println("amount due = " + newRelease.calculateFees(2));
		System.out.println("amount due = " + newRelease.calculateFees(5));

		
	}

}
