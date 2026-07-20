package normalImportantQuestions;

public class leftAlignedStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Outer Loop for rows
		for(int i=1;i<=5;i++) {
		// Inner Loop for printing star
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			// Row Khatam -> Next Line
			System.out.println();
		}
	}

}
