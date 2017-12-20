import java.util.ArrayList;
import java.util.List;

public class StoryGeneratorTest 
{
	public static void main(String[] args) 
	{
		List<String> actorList = new ArrayList<String>();
		actorList.add("child");
		actorList.add("frog");
		actorList.add("bear");
		actorList.add("weasel");
		String story = RecursiveStoryGenerator.storyGenerate(actorList,0);
		System.out.println(story);
	}
}
