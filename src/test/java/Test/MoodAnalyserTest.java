package Test;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
		@Test
	public void testMoodAnalysis() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a SAD message");
		Assert.assertThat(mood,CoreMatchers.is("SAD"));
		
	}

		@Test
		public void testHappyMoods() throws Exception {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			String mood = moodAnalyser.analyseMood("This is a HAPPY message");
			Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
			
}
}