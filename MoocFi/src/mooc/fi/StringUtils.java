package mooc.fi;

public class StringUtils {

    
    public static boolean included(String word, String searched) {
	
	if(searched == null || searched.isEmpty()) {
	    return false;
	}

	word = word.toLowerCase().trim();
	searched = searched.toLowerCase().trim();
	
	
	if(word.contains(searched))
	{
	    return true;
	}
	else {
	    return false;
	}
    
    }
}
