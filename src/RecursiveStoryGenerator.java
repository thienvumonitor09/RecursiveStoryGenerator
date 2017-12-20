import java.util.List;

public class RecursiveStoryGenerator 
{	
	public static String storyGenerate(List<String> actorList,int pos)
	{
		StringBuilder sb = new StringBuilder();
		helper(actorList, pos,sb);
		return sb.toString();
		
	}
	private static void helper(List<String> actorList,int pos, StringBuilder sb)
	{
		String firstStory = "%s couldn't sleep, so the %s's mother told a story about a little %s,%n";
		String secondStory = "...and the little %s fell asleep.%n";
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
