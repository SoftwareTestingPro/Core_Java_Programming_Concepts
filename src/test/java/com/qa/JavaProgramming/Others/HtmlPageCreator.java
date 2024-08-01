package com.qa.JavaProgramming.Others;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.testng.annotations.Test;

public class HtmlPageCreator {
	
	public String HTMLFilePath = System.getProperty("user.dir") + "/target/generated_page.html";

	@Test
	public void CreateHTMLPage() {
		String htmlContent = "<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "    <meta charset=\"UTF-8\">\n"
				+ "    <title>Java Generated HTML</title>\n" + "</head>\n" + "<body>\n" + "    <h1>Hello, World!</h1>\n"
				+ "    <p>This HTML page was created using Java code.</p>\n" + "</body>\n" + "</html>";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(HTMLFilePath))) {
			writer.write(htmlContent);
			System.out.println("HTML page generated successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}