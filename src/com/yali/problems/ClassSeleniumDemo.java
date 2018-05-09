package com.yali.problems;

class Assertion {
	WebDriver d;

	Assertion(WebDriver d) {
		this.d = d;
	}

	void until(ExpectedCondition condition) {
		System.out.println(condition.apply(d));
	}
}

class WebDriver {
	String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
interface ExpectedCondition {
	public Boolean apply(WebDriver d);
}

class WebDriverWait {
	WebDriver webDriver;
	int timeout;

	public WebDriverWait(WebDriver webDriver, int timeout) {
		super();
		this.webDriver = webDriver;
		this.timeout = timeout;
	}

}

class Excetp implements ExpectedCondition
{

	public Boolean apply(WebDriver d) { return
	 d.getTitle().equals("我眼中软件工程人员该有的常识");
	 }
}
public class ClassSeleniumDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new WebDriver();
		ClassSeleniumDemo cs = new ClassSeleniumDemo();
		
		assertTrue("The page title should be chagned as expected", 
				new WebDriverWait(driver, 3))
				.until(new ExpectedCondition() {

					@Override
					public Boolean apply(WebDriver d) {
						return d.getTitle().equals("我眼中软件工程人员该有的常识");
					}
				});
	}

	public static Assertion assertTrue(String message, WebDriverWait driverWait) {
		return new Assertion(null);
	}
}

