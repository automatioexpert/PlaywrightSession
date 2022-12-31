package tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Play1 {

	public static void main(String[] args) {
		System.out.println("started");
		Playwright playwright = Playwright.create();
		Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.google.com");
		System.out.println(page.title());
		System.out.println(page.content());
		System.out.println(page.url());
		System.out.println("ended");
		page.close();
		playwright.close();
		
		
	}

}
