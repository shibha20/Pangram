import java.util.HashSet;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution sol = new Solution();
		System.out.println(sol.checkIfPangram("jumpsoverthelazydog"));

	}
	
}


class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet <Character> charCount = new HashSet<>(); 
        for (int i =0 ; i < sentence.length(); i++){
            charCount.add(sentence.charAt(i));
        }
        
        //System.out.println(charCount);
        
        return (charCount.size() == 26);
    }
    
}