/*
Task: Given a string str, reverse it omitting all non-alphabetic characters.

Example: For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".
*/

public  String reverseLetter(final String str) {
		
		String word = "";
		
		for(int i = str.length()-1; i >=0; i-- )
			{
				word += str.charAt(i);
				
			}
		
        return word.toString(); //coding and coding..
    }
