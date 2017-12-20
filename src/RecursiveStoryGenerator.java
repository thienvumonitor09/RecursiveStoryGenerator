import java.util.ArrayList;
import java.util.List;

public class RecursiveStoryGenerator 
{	
	private static void helper(List<String> actorList,int pos)
	{
		//String s1 = " couldn't sleep, so the ";
		//String s2 = "'s mother told a story about a little ";
		//String c1 = " ";
		String firstStory = "%s couldn't sleep, so the %s's mother told a story about a little %s,%n";
		//String firstFinal = c1 + s1 + c1 + s2;
		//String whiteSpace = "";
		String secondStory = "...and the little %s fell asleep.%n";
		for(int i = 0 ; i < pos ; i++ )
		{
			//whiteSpace += " ";
			firstStory = " " + firstStory;
			secondStory = " " + secondStory;
		}
		
		//System.out.println(String.format("%1$" + index + "s", "dsf"));
		//int n =5;
		//System.out.println(String.format("%1$" + 4 + "s", "asdf"));
		if(pos > (actorList.size()-1) )
			return;
		if(pos == 0 )
		{
			//String s3 = "A " + actorList.get(index) 
			//+ s1 + actorList.get(index) + s2
			//+ actorList.get(index+1);
			//System.out.println("A " + actorList.get(index) 
			//+ s1 + actorList.get(index) + s2
			//+ actorList.get(index+1));
			//c1 = "child";
			//System.out.println(whiteSpace + firstFinal);
			
			System.out.printf(firstStory, "A " + actorList.get(pos),actorList.get(pos),actorList.get(pos+1));
		}
			
		else if(pos < (actorList.size()-1))
			//System.out.println(whiteSpace +"who" 
			//+ s1 + actorList.get(index) + s2
			//+ actorList.get(index+1));
			//System.out.println(actorList.get(index) + " " + actorList.get(index+1));
			System.out.printf(firstStory, "who",actorList.get(pos),actorList.get(pos+1));
		
		
		helper(actorList,pos+1);
		//System.out.println(whiteSpace+"..."+actorList.get(index));
		System.out.printf( secondStory, actorList.get(pos));
	}

	
	public static void main(String[] args) 
	{
		List<String> actorList = new ArrayList<String>();
		actorList.add("child");
		actorList.add("frog");
		actorList.add("bear");
		actorList.add("weasel");
		helper(actorList,0);
		
		
	}

}
