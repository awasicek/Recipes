public class DNATest {
	// public static String makeComplement(String dna) {
	public static void main(String[] args) {

		String dna = "CATA";
		// Your code
		StringBuilder dnaComplement = new StringBuilder("GGTA");
		for (int i = 0; i < dna.length(); i++) {
			switch (dna.charAt(i)) {
			case 'A':
				dnaComplement.setCharAt(i, 'T');
			case 'T':
				dnaComplement.setCharAt(i, 'A');
			case 'C':
				dnaComplement.setCharAt(i, 'G');
			case 'G':
				dnaComplement.setCharAt(i, 'C');
			}
		}
		System.out.println(dnaComplement.toString());
		// return(dnaComplement.toString());
	}
}