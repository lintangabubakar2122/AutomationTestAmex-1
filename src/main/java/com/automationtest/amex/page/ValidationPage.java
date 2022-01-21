package com.automationtest.amex.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationtest.amex.driver.DriverSingleton;

public class ValidationPage {
	
private WebDriver driver;
	
	public ValidationPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#sidebar > div > div > ul > li")
	private List<WebElement> btnValidation;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div[1]/div/a/i")
	private WebElement btnMinimizevalidation;
	
	@FindBy(xpath = "//*[@id=\"data-worklist_next\"]/a")
	private WebElement btnNextvalidation;
	
	@FindBy(xpath = "//*[@id=\"data-worklist_previous\"]/a")
	private WebElement btnPreviousvalidation;
	
	@FindBy(xpath = "/html/body/a/i")
	private WebElement btnTopvalidation;
	
	@FindBy(id="City")
	private WebElement textFiltervalidation;
	
	@FindBy(id="btn-filter")
	private WebElement btnFiltervalidation;
	
	@FindBy(css="#data-worklist_filter > label > input")
	private WebElement textSearchvalidation;
	
	@FindBy(xpath = "//*[@id=\"form_validasi\"]/div/span[1]")
	private WebElement btnretrun;
	
	@FindBy(xpath = "//*[@id=\"modal_form2\"]/div/div/div[3]/button[2]")
	private WebElement btncancelretrune;
	
	@FindBy(xpath = "//*[@id=\"form_return\"]/div[2]/div/textarea")
	private WebElement noteretrune;
	
	@FindBy(xpath = "//*[@id=\"form_validasi\"]/div/span[2]")
	private WebElement btnreject;
	
	@FindBy(css = "#modal_form2 > div > div > div.modal-footer > button.btn.btn-danger.pull-left")
	private WebElement btncancelreject;
	
	@FindBy(xpath = "//*[@id=\"form_return\"]/div[2]/div/textarea")
	private WebElement notereject;
	
	@FindBy(id="btnApproved")
	private WebElement btnValidatevalidation;
	
	

	@FindBy(xpath = "//*[@id=\"data-worklist\"]/tbody/tr/td")
	private WebElement txtArea;
	@FindBy(xpath = "//*[@id=\"data-worklist\"]/tbody/tr/td[1]")
	private WebElement txtnomer;
	@FindBy(xpath = "//*[@id=\"data-worklist\"]/tbody/tr[1]/td[3]")
	private WebElement txtmerchan;
	@FindBy(xpath = "//*[@id=\"data-worklist\"]/tbody/tr[1]/td[4]")
	private WebElement txtalamat;
	@FindBy(xpath = "//*[@id=\"data-worklist\"]/tbody/tr[1]/td[5]")
	private WebElement txtofficer;
	
	//bates
	
	//=====================FUNGSI GET TEXT=====================\\
		
		public String getTxtNomerData() {
			return txtnomer.getText();
			}
		public String getTxtJAKARTA() {
			return txtArea.getText();
			}
		public String getTxtMerchan() {
			return txtmerchan.getText();
			}
		public String getTxtAlamat() {
			return txtArea.getText();
			}
		public String getTxtOfficer() {
			return txtArea.getText();
			}
		public String getTxtFilterBEKASI() {
			return txtArea.getText();
			}

		//
		
	
	public void hapus() {
		textSearchvalidation.clear();
		}
	
	public void delay() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		}

	public void validation() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnValidation.get(4).click();
	}

	public void showValidation() {
		delay();
		btnMinimizevalidation.click();
		delay();
		btnMinimizevalidation.click();
		delay();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,10000)");
		delay();;
		btnNextvalidation.click();
		delay();
		btnPreviousvalidation.click();
		delay();
		btnTopvalidation.click();
		delay();
//		Utils.takeScreenshot();
	}
	
	public void filterValidation(int selection) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textFiltervalidation.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
		//Utils.takeScreenshot();
		btnFiltervalidation.click();
	}
	
	public void searchValidation() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textSearchvalidation.sendKeys("6");
		//Utils.takeScreenshot();
		textSearchvalidation.sendKeys(Keys.ENTER);
		delay();
		hapus();
		delay();
		textSearchvalidation.sendKeys("RUBY ANJASMORO");
		//Utils.takeScreenshot();
		textSearchvalidation.sendKeys(Keys.ENTER);
		delay();
		hapus();
		delay();
		textSearchvalidation.sendKeys("JAKARTA");
		//Utils.takeScreenshot();
		textSearchvalidation.sendKeys(Keys.ENTER);
		delay();
		hapus();
		delay();
		textSearchvalidation.sendKeys("Blok A");
		//Utils.takeScreenshot();
		textSearchvalidation.sendKeys(Keys.ENTER);
		delay();
		hapus();
		delay();
		textSearchvalidation.sendKeys("Bakmi Jawa");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textSearchvalidation.sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void validateValidation() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnretrun.click();
		delay();
		noteretrune.sendKeys("TEST RETURN");
		delay();
		btncancelretrune.click();
		delay();
		btnreject.click();
		delay();
		notereject.sendKeys("TEST REJECT");
		delay();
		btncancelreject.click();
		delay();
		btnValidatevalidation.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().alert().accept();
	}

}
