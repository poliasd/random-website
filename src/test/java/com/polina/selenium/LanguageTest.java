/*******************************************************************************
 * Basic functionality tests for testing 
 * the localization of Qumram website
 *
 ******************************************************************************/

package com.polina.selenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class LanguageTest extends BaseTests{
	
	/**
	 * Verifies the default English text of Product page.
	 */
	@Test
	public void testDefaultLanguageProducts() {
		
		clickLink("Products");
		String pageSource = waitForElement(By.tagName("body")).getText();
		assertTrue(pageSource.contains("Qumram - The Big Data platform"));
		
	}
	
	/**
	 * Verifies the default English text of Success Stories page.
	 */
	@Test
	public void testDefaultLanguageSuccessStories() {
		
		clickLink("Success Stories");
		String pageSource = waitForElement(By.tagName("body")).getText();
		assertTrue(pageSource.contains("Compelling business results powered by great software technology"));
		
	}
	
	/**
	 * Verifies the default English text of Contacts page.
	 */
	@Test
	public void testDefaultLanguageContacts() {
		
		clickLink("Company");
		clickLink("Contact");
		String pageSource = waitForElement(By.tagName("body")).getText();
		assertTrue(pageSource.contains("Let's talk"));
	}
	
	/**
	 * Verifies if the link "READ MORE" exists in Blogs page.
	 */
	
	@Test
	public void testDefaultLanguageBlogs() {
		
		clickLink("Company");
		clickLink("Blog");
	    String blogLink = waitForElement(By.cssSelector(".link")).getText();
		assertEquals("READ MORE", blogLink);
	}
	
	/**
	 * Verifies the default English text of Blogs page.
	 */
	@Test
	public void testDefaultLanguageAboutUs() {
		
		clickLink("Company");
		clickLink("About us");
		String pageSource = waitForElement(By.tagName("body")).getText();
		assertTrue(pageSource.contains("Our passion is to explore and go beyond."));
	}
	
	
	/**
	 * Verifies German text in De Mehrwert page.
	 */
	@Test
	public void testLanguageDeMehrwert() {
		
		clickLink("De");
		clickLink("Ihr Mehrwert");
		String pageSource = waitForElement(By.tagName("body")).getText();
		assertTrue(pageSource.contains("Transparenz, Sicherheit und Vertrauen in " +
				"die Online-Aktivitäten ihrer Kunden und ihrer Organisation"));
		
	}
	
	/**
	 * Verifies German text in De Produkte page.
	 */
	@Test
	public void testLanguageDeProdukte() {
		
		clickLink("De");
		clickLink("Produkte");
		String pageSource = driver.findElement(By.tagName("body")).getText();
		
		assertTrue(pageSource.contains("Qumram - Die Big Data Plattform"));
		
	}
	
	/**
	 * Verifies German text in De Kundenreferenzen page.
	 */
	@Test
	public void testLanguageDeKundenreferenzen() {
		
		clickLink("De");
		clickLink("Kundenreferenzen");
		String pageSource=waitForElement(By.tagName("body")).getText();
		assertTrue(pageSource.contains("Überzeugende Ergebnisse durch hervorragende" +
				" Software-Technologie"));
		
	}
	
	/**
	 * Verifies German text in De Kontakt page.
	 */
	@Test
	public void testLanguageDeKontakt() {
		
		clickLink("De");
		clickLink("Firma");
		clickLink("Kontakt");
		String pageSource=waitForElement(By.tagName("body")).getText();
		assertTrue(pageSource.contains("Es geht um"));
		
	}
	
	/**
	 * Verifies German text in De Blog page.
	 */
	@Test
	public void testLanguageDeBlog() {
		
		clickLink("De");
		clickLink("Firma");
		clickLink("Blog");
		String blogLink = waitForElement(By.cssSelector(".link")).getText();
		assertEquals("WEITERLESEN", blogLink);
		
	}
	
	/**
	 * Verifies German text in De Uberuns page.
	 */
	@Test
	public void testLanguageDeUberuns() {
		
		clickLink("De");
		clickLink("Firma");
		clickLink("Über uns");
		String pageSource=waitForElement(By.tagName("body")).getText();
		assertTrue(pageSource.contains("Unsere Leidenschaft ist zu erforschen und weiter zu denken."));
		
	}
	
	/**
	 * Verifies that text is switched to English.
	 */
	@Test
	public void testLanguageDeEnglish() {
		
		clickLink("De");
		clickLink("Firma");
		clickLink("En");
		String pageSource=waitForElement(By.tagName("body")).getText();
		assertTrue(pageSource.contains("Why Qumram?"));
		
	}
}
