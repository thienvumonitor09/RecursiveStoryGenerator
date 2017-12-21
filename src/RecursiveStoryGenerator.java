import java.util.List;

public class RecursiveStoryGenerator 
{	
	/**
	 * This method is used to generate String string from list of string
	 * If actor list is null or empty, the program will let users know whether the list is null or empty.
	 * If actor list only contains one string or one character, the program will let uses know that there is not enough character.
	 * @param actorList
	 * @return  String from List of String "actors"
	 */
	public static String storyGenerate(List<String> actorList)
	{
		if(actorList == null)
			return "The actor list is null.";
		else if(actorList.size() == 0)
			return "The actor list is empty.";
		else if(actorList.size() == 1)
			return "The actor list does not have enough character.";
		//actor list is not empty
		StringBuilder sb = new StringBuilder();
		helper(actorList, 0,sb);
		return sb.toString();
		
	}
	
	/*
	 * This helper method uses recursion to append String to StringBuilder sb
	 */
	private static void helper(List<String> actorList,int pos, StringBuilder sb)
	{
		String firstStory = "%s couldn't sleep, so the %s's mother told a story about a little %s,%n";
		String secondStory = "...and the little %s fell asleep.%n";
		//The loop is used to add a number of whitespace leading each sentences
		for(int i = 0 ; i < pos ; i++ )
		{
			firstStory = " " + firstStory;
			secondStory = " " + secondStory;
		}
		
		if(pos > (actorList.size()-1) )
			return;
		if(pos == 0 )
			sb.append(String.format(firstStory, "A " + actorList.get(pos),actorList.get(pos),actorList.get(pos+1)));
		else if(pos < (actorList.size()-1))
			sb.append(String.format(firstStory, "who",actorList.get(pos),actorList.get(pos+1)));
		helper(actorList,pos+1,sb);
		sb.append(String.format(secondStory, actorList.get(pos)));
	}
}
