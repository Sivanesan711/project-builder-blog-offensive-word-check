package utility;

import model.Blog;

abstract class OffensiveWordsChecker{
	
	public abstract boolean checkBlog(Blog blog);

	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}
}

