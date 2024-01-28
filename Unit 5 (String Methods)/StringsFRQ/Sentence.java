package StringsFRQ;
public class Sentence {

	private String currSent;

	/** Constructs a new Sentence object. */
	public Sentence(String p) {
		currSent = p;
	}

	/** Returns a string containing the current sentence. */
	public String toString() {
		return currSent;
	}
	


	/** Returns the index of the nth occurrence of str in the current sentence;
	 * returns -1 of the nth occurrence does not exist.
	 * Precondition:  str.length() > 0 and n > 0
	 * Postcondition: the current sentence if not modified.
	 */
	public int findNthTime(String str, int n) {
		int ind = currSent.indexOf(str);
        for(int i = 1; i<=n;i++){
            if(n==1) return ind;
			else if (ind != -1) ind = currSent.indexOf(str, ind+str.length()-1);
			else return -1;
        }
        return ind;
	}

	/** Modifies the current sentence by replacing the nth occurrence of str with repl
	 * If the nth occurrence does not exist, the current sentence is unchanged.
	 * Precondition: str.length() > 0 and n > 0
	 *
	 */
	public void replaceNthTime(String str, int n, String repl) {
        int index = findNthTime(str, n);
        if(index != -1){
		currSent =  currSent.substring(0, index) + repl + currSent.substring(index+str.length());
		}
	}

	/** Returns the index of the last occurrence of str in the current sentence:
	 * returns -1 if str is not found.
	 * Precondition:  str.length() > 0
	 * Postcondition: the current sentence is not modified.
	 */
	public int findLastTime(String str) {
		if(findNthTime(str, 1)==-1) return -1;
		int c = 1;
		int res = 1;
		while(res != -1) {
			res = findNthTime(str, c);
			c++;
		}
		return findNthTime(str, c--);
	}

	public static void main(String[] args) {
		Sentence sentence1 = new Sentence("A cat ate late.");
		System.out.println(sentence1.findNthTime("at",1));
		sentence1.replaceNthTime("at", 1, "rane");
		System.out.println(sentence1);
		System.out.println();

		Sentence sentence2 = new Sentence("A cat ate late.");
		System.out.println(sentence2.findNthTime("at",6));
		sentence2.replaceNthTime("at", 6, "xx");
		System.out.println(sentence2);
		System.out.println();

		Sentence sentence7 = new Sentence("A cat ate late.");
		System.out.println(sentence7.findNthTime("at",3));
		sentence7.replaceNthTime("at", 3, "xx");
		System.out.println(sentence7);
		System.out.println();
		
		Sentence sentence3 = new Sentence("A cat ate late.");
		System.out.println(sentence3.findNthTime("bat",2));
		sentence3.replaceNthTime("bat", 2, "xx");
		System.out.println(sentence3);
		System.out.println();
		
		Sentence sentence4 = new Sentence("aaaa");
		sentence4.replaceNthTime("aa", 1, "xx");
		System.out.println(sentence4);
		System.out.println();
		
		Sentence sentence5 = new Sentence("aaaa");
		System.out.println(sentence5.findNthTime("aaa", 2));
		sentence5.replaceNthTime("aaa", 2, "bbb");
		System.out.println(sentence5);
		
		// Sentence sentence6 = new Sentence("A cat ate late.");
		// System.out.println(sentence6.findLastTime("at"));
		// System.out.println(sentence6.findLastTime("cat"));
		// System.out.println(sentence6.findLastTime("bat"));
	}

}