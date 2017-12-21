import java.util.ArrayList;
import java.util.List;
/**
 * The program generates bedtime story from List of String "actors"
 * 
 * @author Vu Nguyen
 *
 */
public class StoryGeneratorTest 
{
	public static void main(String[] args) 
	{
		List<String> actorList = new ArrayList<String>();
		actorList.add("child");
		actorList.add("frog");
		actorList.add("bear");
		actorList.add("weasel");
		String story = RecursiveStoryGenerator.storyGenerate(actorList);
		System.out.println(story);
	}
}
