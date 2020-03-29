package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{

	@Override
	public boolean checkBlogTitle(Blog blog) {
		if(!(offensivewords(blog.getBlogTitle())))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean checkBlogDescription(Blog blog) {
		if(!(offensivewords(blog.getBlogDescription())))
		{
			return true;
		}
		else
		{
		    return false;
		}
	}

	@Override
	public boolean checkBlog(Blog blog) {
		if(checkBlogTitle(blog) && checkBlogDescription(blog))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	public boolean offensivewords(String title)
	{
		String titles[] = title.split("");
		String[] array1 = new String[]{"shit","anal","asshole","worst","bad","arian"};
		
		for(int index=0; index<titles.length;index++)
		{
			for(int index1=0;index1<array1.length;index1++)
			{
				if(titles[index].contentEquals(array1[index1]))
				{
					return true;
				}
			}
		}
		return false;
	}
	
}
