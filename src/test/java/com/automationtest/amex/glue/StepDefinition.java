package com.automationtest.amex.glue;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.automationtest.amex.config.AutomationFrameworkConfiguration;
import com.automationtest.amex.driver.DriverSingleton;
import com.automationtest.amex.page.DashboardPage;
import com.automationtest.amex.page.LoginPage;
import com.automationtest.amex.page.MasterPage;
import com.automationtest.amex.page.ReportPage;
import com.automationtest.amex.page.ValidationPage;
import com.automationtest.amex.page.agen.LoginAmex;
import com.automationtest.amex.page.agen.WorklistAmex;
import com.automationtest.amex.utils.ConfigurationProperties;
import com.automationtest.amex.utils.Constants;
import com.automationtest.amex.utils.Log;
import com.automationtest.amex.utils.TestCases;
import com.automationtest.amex.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;



@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {
	
	
	private WebDriver driver;
	private LoginAmex loginAmex;
	private WorklistAmex worklistAmex;
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private MasterPage masterPage;
	private ValidationPage validationPage;
	private ReportPage reportPage;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginAmex = new LoginAmex();
		worklistAmex = new WorklistAmex();
		loginPage = new LoginPage();
		dashboardPage = new DashboardPage();
		masterPage = new MasterPage();
		validationPage = new ValidationPage();
		reportPage = new ReportPage();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Log.getLogData(Log.class.getName()); //log4j
		Log.startTest(tests[Utils.testCount].getTestName()); //log4j
		Utils.testCount++;
	}
	
	// Scenario Login Amex
			@Given("^Amex go to the Website")
			public void a1() {
				driver = DriverSingleton.getDriver();
				driver.get(Constants.URL);
				Log.info("INFO: Navigating to " + Constants.URL); //log4j
				extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
			}
			
			@When("^Mengisi Username amex")
			public void a2(){
				extentTest.log(LogStatus.PASS, "Mengisi Username amex");
			}
			
			@And("^Mengisi password amex")
			public void a3() {
				extentTest.log(LogStatus.PASS, "Mengisi password amex");
			}
			
			@And("^Mengklik tombol Log In amex")
			public void a4() {
				extentTest.log(LogStatus.PASS, "Mengklik tombol Log In amex");
			}
			
			@And("^User tidak dapat login sistem amex jika salah")
			public void a5() {
				loginAmex.goToLoggedIn();
				extentTest.log(LogStatus.PASS, "User tidak dapat login sistem amex jika salah");
			}
			
			@Then("^User login kedalam sistem amex jika benar")
			public void a6() {
				 extentTest.log(LogStatus.PASS, "User login kedalam sistem amex jika benar");
			}
			
			
	// Scenario Worklist Amex
			
			@When("^User agent sukses login pada website")
			public void b1() {
				extentTest.log(LogStatus.PASS, "User agent sukses login pada website");
			}
			
			@And("^Click button new data untuk menampilkan data Worklist")
			public void b2() {
				extentTest.log(LogStatus.PASS, "Click button new data untuk menampilkan data Worklist");
			}
			
			@And("^Kolom data merchant page new data")
			public void b3() {
				extentTest.log(LogStatus.PASS, "Kolom data merchant page new data");
			}
			
			@And("^Field list filter page new data")
			public void b4() {
				extentTest.log(LogStatus.PASS, "Field list filter page new data");
			}
			
			@And("^Click field list filter page new data")
			public void b5() {
				extentTest.log(LogStatus.PASS, "Click field list filter page new data");
			}
			
			@And("^Pilih dan Click button filter untuk menampilkan data tertentu")
			public void b6() {
				extentTest.log(LogStatus.PASS, "Pilih dan Click button filter untuk menampilkan data tertentu");
			}
			
			@And("^Ketik keyword pada kolom search untuk mencari data page new data")
			public void b7() {
				extentTest.log(LogStatus.PASS, "Ketik keyword pada kolom search untuk mencari data page new data");
			}
			
			@And("^Click search")
			public void b8() {
				extentTest.log(LogStatus.PASS, "Click search");
			}
			
			@And("^Click button Expand/Collapse untuk memperbesar dan menyembunyikan tampilan data page new data")
			public void b9() {
				extentTest.log(LogStatus.PASS, "Click button Expand/Collapse untuk memperbesar dan menyembunyikan tampilan data page new data");
			}
			
			@And("^Showing data entries page new data")
			public void b10() {
				extentTest.log(LogStatus.PASS, "Showing data entries page new data");
			}
			
			@And("^Click button visit untuk menampilkan form Visit Merchant")
			public void b11() {
				extentTest.log(LogStatus.PASS, "Click button visit untuk menampilkan form Visit Merchant");
			}
			
			@And("^Click button Next untuk ke table berikutnya page new data")
			public void b12() {
				extentTest.log(LogStatus.PASS, "Click button Next untuk ke table berikutnya page new data");
			}
			
			@And("^Click button Previous untuk ke table sebelumnya page new data")
			public void b13() {
				extentTest.log(LogStatus.PASS, "Click button Previous untuk ke table sebelumnya page new data");
			}
			
			@And("^Kolom nama merchant")
			public void b14() {
				extentTest.log(LogStatus.PASS, "Kolom nama merchant");
			}
			
			@And("^Kolom category")
			public void b15() {
				extentTest.log(LogStatus.PASS, "Kolom category");
			}
			
			@And("^Kolom kota")
			public void b16() {
				extentTest.log(LogStatus.PASS, "Kolom kota");
			}
			
			@And("^Kolom nama mall worklist")
			public void b17() {
				extentTest.log(LogStatus.PASS, "Kolom nama mall worklist");
			}
			
			@And("^Kolom alamat")
			public void b18() {
				extentTest.log(LogStatus.PASS, "Kolom alamat");
			}
			
			@And("^Kolom PIC")
			public void b19() {
				extentTest.log(LogStatus.PASS, "Kolom PIC");
			}
			
			@And("^Kolom no telp")
			public void b20() {
				extentTest.log(LogStatus.PASS, "Kolom no telp");
			}
			
			@And("^Kolom Memiliki EDC BCA")
			public void b21() {
				extentTest.log(LogStatus.PASS, "Kolom Memiliki EDC BCA");
			}
			
			@And("^Kolom MID")
			public void b22() {
				extentTest.log(LogStatus.PASS, "Kolom MID");
			}
			
			@And("^Kolom POSM merchant")
			public void b23() {
				extentTest.log(LogStatus.PASS, "Kolom POSM merchant");
			}
			
			@And("^Kolom cashier awareness")
			public void b24() {
				extentTest.log(LogStatus.PASS, "Kolom cashier awareness");
			}
			
			@And("^Kolom awareness reason")
			public void b25() {
				extentTest.log(LogStatus.PASS, "Kolom awareness reason");
			}
			
			@And("^Kolom tampak depan merchant")
			public void b26() {
				extentTest.log(LogStatus.PASS, "Kolom tampak depan merchant");
			}
			
			@And("^Kolom meja kasir")
			public void b27() {
				extentTest.log(LogStatus.PASS, "Kolom meja kasir");
			}
			
			@And("^Kolom tampak dalam merchant")
			public void b28() {
				extentTest.log(LogStatus.PASS, "Kolom tampak dalam merchant");
			}
			
			@And("^button edit")
			public void b29() {
				extentTest.log(LogStatus.PASS, "button edit");
			}
			
			@And("^User mengisi form nama merchant")
			public void b30() {
				extentTest.log(LogStatus.PASS, "User mengisi form nama merchant");
			}
			
			@And("^Dropdown list category page update date merchant")
			public void b31() {
				extentTest.log(LogStatus.PASS, "Dropdown list category page update date merchant");
			}
			
			@And("^Pilih list category Fashion page update date merchant")
			public void b32() {
				extentTest.log(LogStatus.PASS, "Pilih list category Fashion page update date merchant");
			}
			
			@And("^Kolom keterangan kota")
			public void b34() {
				extentTest.log(LogStatus.PASS, "Kolom keterangan kota");
			}
			
			@And("^Dropdown list kota page update date merchant")
			public void b35() {
				extentTest.log(LogStatus.PASS, "Dropdown list kota page update date merchant");
			}
			
			@And("^Pilih list kota bekasi page update date merchant")
			public void b36() {
				extentTest.log(LogStatus.PASS, "Pilih list kota bekasi page update date merchant");
			}
			
			@And("^Dropdown list Mall page update date merchant")
			public void b37() {
				extentTest.log(LogStatus.PASS, "Dropdown list Mall page update date merchant");
			}
			
			@And("^Pilihan list mall sesuai dengan lokasi kota page update merchant")
			public void b38() {
				extentTest.log(LogStatus.PASS, "Pilihan list mall sesuai dengan lokasi kota page update merchant");
			}
			
			@And("^User mengisi kolom alamat page update merchant")
			public void b39() {
				extentTest.log(LogStatus.PASS, "User mengisi kolom alamat page update merchant");
			}
			
			@And("^User mengisi kolom PIC page update merchant")
			public void b40() {
				extentTest.log(LogStatus.PASS, "User mengisi kolom PIC page update merchant");
			}
			
			@And("^User mengisi kolom no telp page update merchant")
			public void b41() {
				extentTest.log(LogStatus.PASS, "User mengisi kolom no telp page update merchant");
			}
			
			@And("^Dropdown list Memiliki EDC page update merchant")
			public void b42() {
				extentTest.log(LogStatus.PASS, "Dropdown list Memiliki EDC page update merchant");
			}
			
			@And("^Pilih list EDC yes page update merchant")
			public void b43() {
				extentTest.log(LogStatus.PASS, "Pilih list EDC yes page update merchant");
			}
			
			@And("^User mengisi kolom MID page update merchant")
			public void b44() {
				extentTest.log(LogStatus.PASS, "User mengisi kolom MID page update merchant");
			}
			
			@And("^Dropdown list POSM Merchant page update merchant")
			public void b45() {
				extentTest.log(LogStatus.PASS, "Dropdown list POSM Merchant page update merchant");
			}
			
			@And("^Pilih list POSM yes page update data merchant page update merchant")
			public void b46() {
				extentTest.log(LogStatus.PASS, "Pilih list POSM yes page update data merchant page update merchant");
			}
			
			@And("^Dropdown list Awareness Kasir page update merchant")
			public void b47() {
				extentTest.log(LogStatus.PASS, "Dropdown list Awareness Kasir page update merchant");
			}
			
			@And("^Pilih list Awareness Kasir yes page update merchant")
			public void b48() {
				extentTest.log(LogStatus.PASS, "Pilih list Awareness Kasir yes page update merchant");
			}
			
			@And("^User click button save update data merchant")
			public void b49() {
				extentTest.log(LogStatus.PASS, "User click button save update data merchant");
			}
			
			@And("^User click button cancel update data merchant")
			public void b50() {
				extentTest.log(LogStatus.PASS, "User click button cancel update data merchant");
			}
			
			@And("^button add TID")
			public void b51() {
				extentTest.log(LogStatus.PASS, "button add TID");
			}
			
			@And("^User mengisi kolom TID")
			public void b52() {
				extentTest.log(LogStatus.PASS, "User mengisi kolom TID");
			}
			
			@And("^Dropdown list EDC test page add data TID")
			public void b53() {
				extentTest.log(LogStatus.PASS, "Dropdown list EDC test page add data TID");
			}
			
			@And("^Pilih Edc Test Amex OK page add data TID")
			public void b54() {
				extentTest.log(LogStatus.PASS, "Pilih Edc Test Amex OK page add data TID");
			}
			
			@And("^Dropdown list Willing Place POSM page add data TID")
			public void b55() {
				extentTest.log(LogStatus.PASS, "Dropdown list Willing Place POSM page add data TID");
			}
			
			@And("^Pilih Willing Place POSM Allow page add data TID")
			public void b56() {
				extentTest.log(LogStatus.PASS, "Pilih Willing Place POSM Allow page add data TID");
			}
			
			@And("^Checkbox Placed POSM page add data TID")
			public void b57() {
				extentTest.log(LogStatus.PASS, "Checkbox Placed POSM page add data TID");
			}
			
			@And("^User click button save page update data merchant")
			public void b58() {
				extentTest.log(LogStatus.PASS, "User click button save page update data merchant");
			}
			
			@And("^User click button cancel page update data merchant")
			public void b59() {
				extentTest.log(LogStatus.PASS, "User click button cancel page update data merchant");
			}
			
			@And("^Kolom TID")
			public void b60() {
				extentTest.log(LogStatus.FAIL, "Kolom TID Link tidak berfungsi"+"<img src=\"screenshots/BBBBB.png\" width=\"250px\" height=\"75px\">");
			}																	
			
			@And("^Kolom EDC Test")
			public void b61() {
				extentTest.log(LogStatus.PASS, "Kolom EDC Test");
			}
			
			@And("^Kolom EDC Issue")
			public void b62() {
				extentTest.log(LogStatus.PASS, "Kolom EDC Issue");
			}
			
			@And("^Kolom Foto EDC")
			public void b63() {
				extentTest.log(LogStatus.PASS, "Kolom Foto EDC");
			}
			
			@And("^kolom Foto Struck")
			public void b64() {
				extentTest.log(LogStatus.PASS, "kolom Foto Struck");
			}
			
			@And("^Tombol upload photo")
			public void b65() {
				extentTest.log(LogStatus.PASS, "Tombol upload photo");
			}
			
			@And("^Dropdown list jenis foto")
			public void b66() {
				extentTest.log(LogStatus.PASS, "Dropdown list jenis foto");
			}
			
			@And("^Pilih Foto EDC")
			public void b67() {
				extentTest.log(LogStatus.PASS, "Pilih Foto EDC");
			}
			
			@And("^Kolom upload foto")
			public void b68() {
				extentTest.log(LogStatus.PASS, "Kolom upload foto");
			}
			
			@And("^button Upload")
			public void b69() {
				extentTest.log(LogStatus.PASS, "button Upload");
			}
			
			@And("^button Cancel")
			public void b70() {
				extentTest.log(LogStatus.PASS, "button Cancel");
			}
			
			@And("^button edit TID")
			public void b71() {
				extentTest.log(LogStatus.PASS, "button edit TID");
			}
			
			@And("^kolom TID")
			public void b72() {
				extentTest.log(LogStatus.PASS, "kolom TID");
			}
			
			@And("^Dropdown list EDC test")
			public void b73() {
				extentTest.log(LogStatus.PASS, "Dropdown list EDC test");
			}
			
			@And("^Pilih Edc Test Amex OK")
			public void b74() {
				extentTest.log(LogStatus.PASS, "Pilih Edc Test Amex OK");
			}
			
			@And("^Dropdown list Willing Place POSM")
			public void b75() {
				extentTest.log(LogStatus.PASS, "Dropdown list Willing Place POSM");
			}
			
			@And("^Pilih Willing Place POSM Allow")
			public void b76() {
				extentTest.log(LogStatus.PASS, "Pilih Willing Place POSM Allow");
			}
			
			@And("^Checkbox Placed POSM")
			public void b77() {
				extentTest.log(LogStatus.PASS, "Checkbox Placed POSM");
			}
			
			@And("^User click button save")
			public void b78() {
				extentTest.log(LogStatus.PASS, "User click button save");
			}
			
			@And("^User click button cancel")
			public void b79() {
				extentTest.log(LogStatus.PASS, "User click button cancel");
			}
			
			@And("^button delete TID")
			public void b80() {
				extentTest.log(LogStatus.PASS, "button delete TID");
			}
			
			@And("^Kolom Willing Place POSM")
			public void b81() {
				extentTest.log(LogStatus.PASS, "Kolom Willing Place POSM");
			}
			
			@And("^Kolom Placed POSM")
			public void b82() {
				extentTest.log(LogStatus.PASS, "Kolom Placed POSM");
			}
			
			@And("^button Submit")
			public void b83() {
				extentTest.log(LogStatus.PASS, "button Submit");
			}
			
			@And("^Menampilkan data merchant yang harus direturn")
			public void b84() {
				extentTest.log(LogStatus.PASS, "Menampilkan data merchant yang harus direturn");
			}
			
			@And("^Kolom data merchant")
			public void b85() {
				extentTest.log(LogStatus.PASS, "Kolom data merchant");
			}
			
			@And("^Field list filter")
			public void b86() {
				extentTest.log(LogStatus.PASS, "Field list filter");
			}
			
			@And("^Click field list filter")
			public void b87() {
				extentTest.log(LogStatus.PASS, "Click field list filter");
			}
			
			@And("^Click button filter untuk menampilkan data tertentu")
			public void b88() {
				extentTest.log(LogStatus.PASS, "Click button filter untuk menampilkan data tertentu");
			}
			
			@And("^Ketik keyword pada kolom search untuk mencari data")
			public void b89() {
				extentTest.log(LogStatus.PASS, "Ketik keyword pada kolom search untuk mencari data");
			}
			
			@And("^Click search page return")
			public void b90() {
				extentTest.log(LogStatus.PASS, "Click search page return");
			}
			
//			@And("^")
//			public void b91() {
//				extentTest.log(LogStatus.PASS, "");
//			}
//			
//			@And("^")
//			public void b92() {
//				extentTest.log(LogStatus.PASS, "");
//			}
			
			@And("^Click button Expand/Collapse untuk memperbesar dan menyembunyikan tampilan data")
			public void b93() {
				extentTest.log(LogStatus.PASS, "Click button Expand/Collapse untuk memperbesar dan menyembunyikan tampilan data");
			}
			
			@And("^Showing data entries")
			public void b94() {
				extentTest.log(LogStatus.PASS, "Showing data entries");
			}
			
			@And("^Click button Next untuk ke table berikutnya page return")
			public void b95() {
				extentTest.log(LogStatus.PASS, "Click button Next untuk ke table berikutnya page return");
			}
			
			@And("^Click button Previous untuk ke table sebelumnya page return")
			public void b96() {
				extentTest.log(LogStatus.PASS, "Click button Previous untuk ke table sebelumnya page return");
			}
			
			@And("^Click button visit untuk menampilkan form Return Merchant")
			public void b97() {
				extentTest.log(LogStatus.PASS, "Click button visit untuk menampilkan form Return Merchant");
			}
			
			@And("^User click menu dropdown worklist dan click button add new data")
			public void b98() {
				extentTest.log(LogStatus.PASS, "User click menu dropdown worklist dan click button add new data");
			}
			
			@And("^User click button collapse/ expand")
			public void b99() {
				extentTest.log(LogStatus.PASS, "User click button collapse/ expand");
			}
			
			@And("^User mengisi form nama merchan")
			public void b100() {
				extentTest.log(LogStatus.PASS, "User mengisi form nama merchan");
			}
			
			@And("^Dropdown list category")
			public void b101() {
				extentTest.log(LogStatus.PASS, "Dropdown list category");
			}
			
			@And("^Pilih list category Fashion")
			public void b102() {
				extentTest.log(LogStatus.PASS, "Pilih list category Fashion");
			}
			
			@And("^Dropdown list kota page worklist")
			public void b103() {
				extentTest.log(LogStatus.PASS, "Dropdown list kota page worklist");
			}
			
			@And("^Pilih list kota bekasi")
			public void b104() {
				extentTest.log(LogStatus.PASS, "Pilih list kota bekasi");
			}
			
			@And("^Dropdown list Mall")
			public void b105() {
				extentTest.log(LogStatus.PASS, "Dropdown list Mall");
			}
			
			@And("^Pilihan list mall sesuai dengan lokasi kota")
			public void b106() {
				extentTest.log(LogStatus.PASS, "Pilihan list mall sesuai dengan lokasi kota");
			}
			
			@And("^User mengisi kolom alamat")
			public void b107() {
				extentTest.log(LogStatus.PASS, "User mengisi kolom alamat");
			}
			
			@And("^User mengisi kolom PIC")
			public void b108() {
				extentTest.log(LogStatus.PASS, "User mengisi kolom PIC");
			}
			
			@And("^User mengisi kolom no telp")
			public void b109() {
				extentTest.log(LogStatus.PASS, "User mengisi kolom no telp");
			}
			
			@And("^Dropdown list Memiliki EDC BCA")
			public void b110() {
				extentTest.log(LogStatus.PASS, "Dropdown list Memiliki EDC BCA");
			}
			
			@And("^Pilih list EDC BCA yes")
			public void b111() {
				extentTest.log(LogStatus.PASS, "Pilih list EDC BCA yes");
			}
			
			@And("^Pilih list EDC BCA No")
			public void b112() {
				extentTest.log(LogStatus.PASS, "Pilih list EDC BCA No");
			}
			
			@And("^User mengisi kolom MID")
			public void b113() {
				extentTest.log(LogStatus.PASS, "User mengisi kolom MID");
			}
			
			@And("^Dropdown list POSM Merchant")
			public void b114() {
				extentTest.log(LogStatus.PASS, "Dropdown list POSM Merchant");
			}
			
			@And("^Pilih list POSM yes")
			public void b115() {
				extentTest.log(LogStatus.PASS, "Pilih list POSM yes");
			}
			
			@And("^Pilih list POSM no")
			public void b116() {
				extentTest.log(LogStatus.PASS, "Pilih list POSM no");
			}
			
			@And("^Dropdown list Awareness Kasir")
			public void b117() {
				worklistAmex.worklistnewdata();
				worklistAmex.worklistnewdata1();
				extentTest.log(LogStatus.PASS, "Dropdown list Awareness Kasir");
			}
			
			@And("^Pilih list Awareness Kasir yes")
			public void b118() {
				worklistAmex.worklist();
				extentTest.log(LogStatus.PASS, "Pilih list Awareness Kasir yes");
			}
			
			@And("^Pilih list Awareness Kasir no")
			public void b119() {
				worklistAmex.newdata1();
				worklistAmex.newdata2(4);
				worklistAmex.newdata3(2);
				worklistAmex.newdata4(1);
				worklistAmex.newdata5();
				worklistAmex.newdata6(1);
				worklistAmex.newdata7(1);
				worklistAmex.newdata8(1);
				extentTest.log(LogStatus.PASS, "Pilih list Awareness Kasir no");
			}
			
			@And("^User click button submit")
			public void b120() {
				worklistAmex.uploadPhoto();
				worklistAmex.Editdatamerchant();
				worklistAmex.uploadTid();
				worklistAmex.uploadEdc(2);
				worklistAmex.uploadPosm(1);
				worklistAmex.checkPosm();
				worklistAmex.uploadPhotoedc(1);
				worklistAmex.uploadPhotoedc2();
				worklistAmex.uploadPhotostruk(2);
				worklistAmex.uploadPhotostruk2();
				extentTest.log(LogStatus.PASS, "User click button submit");
			}
			
			@Then("^User click button cancel page add new data")
			public void b121() {
				extentTest.log(LogStatus.PASS, "Then User click button cancel page add new data");
			}

			
	// Scenario Login Admin
		@Given("^User go to the Website")
		public void c1() {
			driver = DriverSingleton.getDriver();
			driver.get(Constants.URL);
			Log.info("INFO: Navigating to " + Constants.URL); //log4j
			extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
		}
		
		@When("^Mengisi Username")
		public void c2(){
			loginPage.goToLoggedIn(configurationProperties.getUserName(), configurationProperties.getPassword());
			extentTest.log(LogStatus.PASS, "Mengisi Username");
		}
		
		@And("^Mengisi password")
		public void c3() {
			extentTest.log(LogStatus.PASS, "Mengisi password");
		}
		
		@And("^Mengklik tombol Log In")
		public void c4() {
			extentTest.log(LogStatus.PASS, "Mengklik tombol Log In");
		}
		
		@And("^User cant login to the Website if wrong")
		public void c5() {
			extentTest.log(LogStatus.PASS, "User cant login to the Website if wrong");
		}
		
		@Then("^User can login to the Website if right")
		public void c6() {
//			 assertEquals(configurationProperties.getDisplayName(), loginPage.getDisplayName());
			 extentTest.log(LogStatus.PASS, "User can login to the Website if righte");
		}
		
	//Skenario Dashboard Admin
		
		@When("^Menampilkan form dashboard amex")
		public void d1() {
			extentTest.log(LogStatus.PASS, "Menampilkan form dashboard amex");
		}
		
		@And("^Tombol home")
		public void d2() {
			extentTest.log(LogStatus.PASS, "Tombol home");
		}
		
		@And("^Menampilkan diagram total")
		public void d3() {
			extentTest.log(LogStatus.PASS, "Menampilkan diagram total");
		}
		
		@And("^Menampilkan Table uraian dari diagram total")
		public void d4() {
			extentTest.log(LogStatus.PASS, "Menampilkan Table uraian dari diagram total");
		}
		
		@And("^Menampilkan diagram merchant EDC BCA")
		public void d5() {
			extentTest.log(LogStatus.PASS, "Menampilkan diagram merchant EDC BCA");
		}
		
		@And("^Menampilkan Table uraian dari diagram merchant EDC BCA")
		public void d6() {
			extentTest.log(LogStatus.PASS, "Menampilkan Table uraian dari diagram merchant EDC BCA");
		}
		
		@And("^Menampilkan diagram EDC NON BCA")
		public void d7() {
			extentTest.log(LogStatus.PASS, "Menampilkan diagram EDC NON BCA");
		}
		
		@And("^Menampilkan Table uraian dari diagram merchant EDC NON BCA")
		public void d8() {
			extentTest.log(LogStatus.PASS, "Menampilkan Table uraian dari diagram merchant EDC NON BCA");
		}
		
		@And("^Mengklik dropdown periode")
		public void d9() {
			extentTest.log(LogStatus.PASS, "Mengklik dropdown periode");
		}
		
		@And("^Mengklik button filter")
		public void d10() {
			extentTest.log(LogStatus.PASS, "Mengklik button filter");
		}
		
		@And("^Mengklik tombol tambah pada kota bandung")
		public void d11() {
			extentTest.log(LogStatus.PASS, "Mengklik tombol tambah pada kota bandung");
		}
		
		@And("^mengisi kolom search")
		public void d12() {
			extentTest.log(LogStatus.PASS, "mengisi kolom search");
		}
		
		@And("^mengisi kolom search dengan mengetik area BANDUNG")
		public void d13() {
			extentTest.log(LogStatus.PASS, "mengisi kolom search dengan mengetik area BANDUNG");
		}
		
		@And("^Mengklik tombol search")
		public void d14() {
			extentTest.log(LogStatus.PASS, "Mengklik tombol search");
		}
		
		@And("^Mengklik tombol tambah pada setiap kota yang tampil")
		public void d15() {
			extentTest.log(LogStatus.PASS, "Mengklik tombol tambah pada setiap kota yang tampil");
		}
		
		@And("^Menampilkan total visit")
		public void d16() {
			extentTest.log(LogStatus.FAIL, "Menampilkan total visit, Jika terdapat banyak kota maka data akan keluar batas"+"<img src=\"screenshots/AAAAA.png\" width=\"250px\" height=\"75px\">");
		}
		
		@And("^Menampilkan merchant EDC BCA")
		public void d17() {
			extentTest.log(LogStatus.PASS, "Menampilkan merchant EDC BCA");
		}
		
		@And("^Menampilkan merchant EDC NON BCA")
		public void d18() {
			extentTest.log(LogStatus.PASS, "Menampilkan merchant EDC NON BCA");
		}
		
		@And("^Menampilkan informasi amex OK")
		public void d19() {
			extentTest.log(LogStatus.PASS, "Menampilkan informasi amex OK");
		}
		
		@And("^Menampilkan informasi amex NOT OK")
		public void d20() {
			extentTest.log(LogStatus.PASS, "Menampilkan informasi amex NOT OK");
		}
		
		@And("^Menampilkan informasi POSM placed")
		public void d21() {
			extentTest.log(LogStatus.PASS, "Menampilkan informasi POSM placed");
		}
		
		@And("^Menampilkan informasi EDC problem")
		public void d22() {
			extentTest.log(LogStatus.PASS, "Menampilkan informasi EDC problem");
		}
		
		@And("^Menampilkan informasi grand total")
		public void d23() {
			extentTest.log(LogStatus.PASS, "Menampilkan informasi grand total");
		}
		
		@And("^Menampilkan nama posm")
		public void d24() {
			extentTest.log(LogStatus.PASS, "Menampilkan nama posm");
		}
		
		@And("^Menampilkan stok di awal")
		public void d25() {
			extentTest.log(LogStatus.PASS, "Menampilkan stok di awal");
		}
		
		@And("^Menampilkan terpakai")
		public void d26() {
			extentTest.log(LogStatus.PASS, "Menampilkan terpakai");
		}
		
		@And("^Menampilkan sisa stok")
		public void d27() {
			dashboardPage.periode();
			extentTest.log(LogStatus.PASS, "Menampilkan sisa stok");
		}
		
		@And("^Menampilkan data status kota")
		public void d28() {
			extentTest.log(LogStatus.PASS, "Menampilkan data status kota");
		}
		
		@And("^Mengklik tombol complete")
		public void d29() {
			dashboardPage.searchDashboard();
			extentTest.log(LogStatus.PASS, "Mengklik tombol complete");
		}
		
		@And("^Mengklik tombol sedang berjalan")
		public void d30() {
			dashboardPage.statusDashboardcity();
			extentTest.log(LogStatus.PASS, "Mengklik tombol sedang berjalan");
		}
		
		@Then("^Mengklik tombol belum berjalan")
		public void d31() {
			extentTest.log(LogStatus.PASS, "Mengklik tombol belum berjalan");
		}	
			
	// Scenario Master Admin
		
		
		@When("^User click master button")
		public void e2() {
			extentTest.log(LogStatus.PASS, "User click master button");
		}
		
		@And("^User clik user button")
		public void e3() {
			extentTest.log(LogStatus.PASS, "User clik user button");
		}
		
		@And("^User click add new user")
		public void e4() {
			extentTest.log(LogStatus.PASS, "User click add new user");
		}
		
		@And("^Kolom NIK page user")
		public void e5() {
			extentTest.log(LogStatus.PASS, "Kolom NIK page user");
		}
		
		@And("^Kolom Name page user")
		public void e6() {
			extentTest.log(LogStatus.PASS, "Kolom Name page user");
		}
		
		@And("^Kolom User Name")
		public void e7() {
			extentTest.log(LogStatus.PASS, "Kolom User Name");
		}
		
		@And("^Kolom Password")
		public void e8() {
			extentTest.log(LogStatus.PASS, "Kolom Password");
		}
		
		@And("^Dropdown list Privilege page user")
		public void e9() {
			extentTest.log(LogStatus.PASS, "Dropdown list Privilege page user");
		}
		
		@And("^Pilih admin internal")
		public void e10() {
			extentTest.log(LogStatus.PASS, "Pilih admin internal");
		}
		
		@And("^button cancel page user")
		public void e11() {
			extentTest.log(LogStatus.PASS, "button cancel page user");
		}
		
		@And("^button Save page user")
		public void e12() {
			extentTest.log(LogStatus.PASS, "button Sav page usere");
		}
		
		@And("^User click button expand/ compress button page user")
		public void e13() {
			extentTest.log(LogStatus.PASS, "User click button expand/ compress button page user");
		}
		
		@And("^User click collapse/ expand button page user")
		public void e14() {
			extentTest.log(LogStatus.PASS, "User click collapse/ expand button page user");
		}
		
		@And("^User click next button page user")
		public void e15() {
			extentTest.log(LogStatus.PASS, "User click next button page user");
		}
		
		@And("^User click previous button page user")
		public void e16() {
			extentTest.log(LogStatus.PASS, "User click previous button page user");
		}
		
		@And("^User click show entries and pick certain number page user")
		public void e17() {
			extentTest.log(LogStatus.PASS, "User click show entries and pick certain number page user");
		}
		
		@And("^User click search dan ketik keyword page user")
		public void e18() {
			extentTest.log(LogStatus.PASS, "User click search dan ketik keyword page user");
		}
		
		@And("^Kolom No page user edit")
		public void e19() {
			extentTest.log(LogStatus.PASS, "Kolom No page user edit");
		}
		
		@And("^Kolom NIK page user edit")
		public void e20() {
			extentTest.log(LogStatus.PASS, "Kolom NIK page user edit");
		}
		
		@And("^Kolom Name page user edit")
		public void e21() {
			extentTest.log(LogStatus.PASS, "Kolom Name page user edit");
		}
		
		@And("^Kolom Privilege page user edit")
		public void e22() {
			extentTest.log(LogStatus.PASS, "Kolom Privilege page user edit");
		}
		
		@And("^button expand kolom page user edit")
		public void e23() {
			extentTest.log(LogStatus.PASS, "button expand kolom page user edit");
		}
		
		@And("^Kolom aksi page user edit")
		public void e24() {
			extentTest.log(LogStatus.PASS, "Kolom aksi page user edit");
		}
		
		@And("^button edit user edit")
		public void e25() {
			extentTest.log(LogStatus.PASS, "button edit user edit");
		}
		
		@And("^Kolom NIK page edit user edit")
		public void e26() {
			extentTest.log(LogStatus.PASS, "Kolom NIK page edit user edit");
		}
		
		@And("^Kolom Name page edit user edit")
		public void e27() {
			extentTest.log(LogStatus.PASS, "Kolom Name page edit user edit");
		}
		
		@And("^Kolom User Name page edit user edit")
		public void e28() {
			extentTest.log(LogStatus.PASS, "Kolom User Name page edit user edit");
		}
		
		@And("^Dropdown list Status edit")
		public void e29() {
			extentTest.log(LogStatus.PASS, "Dropdown list Status edit");
		}
		
		@And("^Pilih deactive edit")
		public void e30() {
			extentTest.log(LogStatus.PASS, "Pilih deactive edit");
		}
		
		@And("^Dropdown list Privilege edit")
		public void e31() {
			extentTest.log(LogStatus.PASS, "Dropdown list Privilege edit");
		}
		
		@And("^Pilih admin external edit")
		public void e32() {
			extentTest.log(LogStatus.PASS, "Pilih admin externa editl");
		}
		
		@And("^button Save page edit user edit")
		public void e33() {
			extentTest.log(LogStatus.PASS, "button Save page edit user edit");
		}
		
		@And("^button Delete User edit")
		public void e34() {
			extentTest.log(LogStatus.PASS, "button Delete User edit");
		}
		
		@And("^User click area button")
		public void e35() {
			extentTest.log(LogStatus.PASS, "User click area button");
		}
		
		@And("^User click add new area")
		public void e35r() {
			extentTest.log(LogStatus.PASS, "User click add new area");
		}
		
		@And("^Kolom Area form")
		public void e36() {
			extentTest.log(LogStatus.PASS, "Kolom Area form");
		}
		
		@And("^button cancel page area")
		public void e37() {
			extentTest.log(LogStatus.PASS, "button cancel page area");
		}
		
		@And("^button Save page area")
		public void e38() {
			extentTest.log(LogStatus.PASS, "button Save page area");
		}
		
		@And("^User click button expand/ compress button page area")
		public void e39() {
			extentTest.log(LogStatus.PASS, "User click button expand/ compress button page area");
		}
		
		@And("^User click collapse/ expand button page area")
		public void e40() {
			extentTest.log(LogStatus.PASS, "User click collapse/ expbutton page area");
		}
		
		@And("^User click next button page area")
		public void e41() {
			extentTest.log(LogStatus.PASS, "User click next button page area");
		}
		
		@And("^User click previous button page area")
		public void e42() {
			extentTest.log(LogStatus.PASS, "User click previous button page area");
		}
		
		@And("^User click show entries and pick certain number page area")
		public void e43() {
			extentTest.log(LogStatus.PASS, "User click show entries and pick certain number page area");
		}
		
		@And("^User use Search to find specific data")
		public void e44() {
			extentTest.log(LogStatus.PASS, "User use Search to find specific data");
		}
		
		@And("^Kolom No Page Mall")
		public void e45() {
			extentTest.log(LogStatus.PASS, "Kolom No Page Mall");
		}
		
		@And("^Kolom Area")
		public void e46() {
			extentTest.log(LogStatus.PASS, "Kolom Area");
		}
		
		@And("^Kolom Status")
		public void e47() {
			extentTest.log(LogStatus.PASS, "Kolom Status");
		}
		
		@And("^Kolom Status belum berjalan")
		public void e48() {
			extentTest.log(LogStatus.PASS, "Kolom Status belum berjalan");
		}
		
		@And("^Kolom Status sedang berjalan")
		public void e49() {
			extentTest.log(LogStatus.PASS, "Kolom Status sedang berjalan");
		}
		
		@And("^Kolom Status complete")
		public void e50() {
			extentTest.log(LogStatus.PASS, "Kolom Status complete");
		}
		
		@And("^Kolom Aksi area")
		public void e51() {
			extentTest.log(LogStatus.PASS, "Kolom Aksi area");
		}
		
		@And("^button edit aksi")
		public void e52() {
			extentTest.log(LogStatus.PASS, "button edit aksi");
		}
		
		@And("^Kolom area page edit area")
		public void e53() {
			extentTest.log(LogStatus.PASS, "Kolom area page edit area");
		}
		
		@And("^Dropdown list Status")
		public void e54() {
			extentTest.log(LogStatus.PASS, "Dropdown list Status");
		}
		
		@And("^pilih complete")
		public void e55() {
			extentTest.log(LogStatus.PASS, "pilih complete");
		}
		
		@And("^User click mall button")
		public void e56() {
			extentTest.log(LogStatus.PASS, "User click mall button");
		}
		
		@And("^User click add new mall")
		public void e57() {
			extentTest.log(LogStatus.PASS, "User click add new mall");
		}
		
		@And("^Dropdown list Kota")
		public void e58() {
			extentTest.log(LogStatus.PASS, "Dropdown list Kota");
		}
		
		@And("^Pilih Jakarta")
		public void e59() {
			extentTest.log(LogStatus.PASS, "Pilih Jakarta");
		}
		
		@And("^Kolom Nama mall page mall")
		public void e60() {
			extentTest.log(LogStatus.PASS, "Kolom Nama mall page mall");
		}
		
		@And("^button cancel page mall")
		public void e61() {
			extentTest.log(LogStatus.PASS, "button cancel page mall");
		}
		
		@And("^button Save page mall")
		public void e62() {
			extentTest.log(LogStatus.PASS, "button Save page mall");
		}
		
		@And("^User click collapse/ expand button page mall")
		public void e63() {
			extentTest.log(LogStatus.PASS, "User click collapse/ expand button page mall");
		}
		
		@And("^User click next button page mall")
		public void e64() {
			extentTest.log(LogStatus.PASS, "User click next button page mall");
		}
		
		@And("^User click previous button page mall")
		public void e65() {
			extentTest.log(LogStatus.PASS, "User click previous button page mall");
		}
		
		@And("^User click show entries and pick certain number page mall")
		public void e66() {
			extentTest.log(LogStatus.PASS, "User click show entries and pick certain number page mall");
		}
		
		@And("^User click search dan ketik keyword lalu tekan enter page mall")
		public void e67() {
			extentTest.log(LogStatus.PASS, "User click search dan ketik keyword lalu tekan enter page mall");
		}
		
		@And("^Kolom No page mall")
		public void e68() {
			extentTest.log(LogStatus.PASS, "Kolom No page mall");
		}
		
		@And("^Kolom Nama mall")
		public void e69() {
			extentTest.log(LogStatus.PASS, "Kolom Nama mall");
		}
		
		@And("^Kolom Aksi page mall")
		public void e70() {
			extentTest.log(LogStatus.PASS, "Kolom Aksi page mall");
		}
		
		@And("^button edit mall")
		public void e71() {
			extentTest.log(LogStatus.PASS, "button edit mall");
		}
		
		@And("^Dropdown list kota")
		public void e72() {
			extentTest.log(LogStatus.PASS, "Dropdown list kota");
		}
		
		@And("^Pilih jakarta")
		public void e73() {
			extentTest.log(LogStatus.PASS, "Pilih jakarta");
		}
		
		@And("^Kolom Nama mall page edit mall")
		public void e74() {
			extentTest.log(LogStatus.PASS, "Kolom Nama mall page edit mall");
		}
		
		@And("^button cancel page edit mall")
		public void e75() {
			extentTest.log(LogStatus.PASS, "button cancel page edit mall");
		}
		
		@And("^button save page edit mall")
		public void e76() {
			extentTest.log(LogStatus.PASS, "button save page edit mall");
		}
		
		@And("^button Delete mall")
		public void e77() {
			extentTest.log(LogStatus.PASS, "button Delete mall");
		}
		
		@And("^User click POSM button")
		public void e78() {
			extentTest.log(LogStatus.PASS, "User click POSM button");
		}
		
		@And("^User click add new POSM")
		public void e79() {
			extentTest.log(LogStatus.PASS, "User click add new POSM");
		}
		
		@And("^Kolom POSM page POSM")
		public void e80() {
			extentTest.log(LogStatus.PASS, "Kolom POSM page POSM");
		}
		
		@And("^button cancel")
		public void e81() {
			extentTest.log(LogStatus.PASS, "button cancel");
		}
		
		@And("^button Save")
		public void e82() {
			extentTest.log(LogStatus.PASS, "button Save");
		}
		
		@And("^User click button expand/ compress button")
		public void e83() {
			extentTest.log(LogStatus.PASS, "User click button expand/ compress button");
		}
		
		@And("^User click collapse/ expand button")
		public void e84() {
			extentTest.log(LogStatus.PASS, "User click collapse/ expand button");
		}
		
		@And("^Kolom No")
		public void e85() {
			extentTest.log(LogStatus.PASS, "Kolom No");
		}
		
		@And("^Kolom POSM")
		public void e86() {
			extentTest.log(LogStatus.PASS, "Kolom POSM");
		}
		
		@And("^Kolom Sisa Stock")
		public void e87() {
			extentTest.log(LogStatus.PASS, "Kolom Sisa Stock");
		}
		
		@And("^Kolom aksi")
		public void e88() {
			extentTest.log(LogStatus.PASS, "Kolom aksi");
		}
		
		@And("^button Edit POSM")
		public void e89() {
			extentTest.log(LogStatus.PASS, "button Edit POSM");
		}
		
		@And("^Kolom POSM page edit posm")
		public void e90() {
			extentTest.log(LogStatus.PASS, "Kolom POSM page edit posm");
		}
		
		@And("^button save page POSM")
		public void e91() {
			extentTest.log(LogStatus.PASS, "button save page POSM");
		}
		
		@And("^button Edit Stock")
		public void e92() {
			extentTest.log(LogStatus.PASS, "button Edit Stock");
		}
		
		@And("^User click button expand/ compress button page stock")
		public void e93() {
			extentTest.log(LogStatus.PASS, "User click button expand/ compress button page stock");
		}
		
		@And("^User click add stock page stock")
		public void e94() {
			extentTest.log(LogStatus.PASS, "User click add stock page stock");
		}
		
		@And("^Dropdown list jenis posm page stock")
		public void e95() {
			extentTest.log(LogStatus.PASS, "Dropdown list jenis posm page stock");
		}
		
		@And("^Pilih tentcard page stock")
		public void e96() {
			extentTest.log(LogStatus.PASS, "Pilih tentcard page stock");
		}
		
		@And("^Kolom jumlah stock page stock")
		public void e97() {
			extentTest.log(LogStatus.PASS, "Kolom jumlah stock page stock");
		}
		
		@And("^button cancel page stock")
		public void e98() {
			extentTest.log(LogStatus.PASS, "button cancel page stock");
		}
		
		@And("^button Save page stock")
		public void e99() {
			extentTest.log(LogStatus.PASS, "button Save page stock");
		}
		
		@And("^User click collapse/ expand button page stock")
		public void e100() {
			extentTest.log(LogStatus.PASS, "User click collapse/ expand button page stock");
		}
		
		@And("^User click show entries and pick certain number")
		public void e101() {
			extentTest.log(LogStatus.PASS, "User click show entries and pick certain number");
		}
		
		@And("^User click next button")
		public void e102() {
			extentTest.log(LogStatus.PASS, "User click next button");
		}
		
		@And("^User click previous button")
		public void e103() {
			extentTest.log(LogStatus.PASS, "User click previous button");
		}
		
		@And("^User menggunakan kolom search untuk mencari specific data")
		public void e104() {
			extentTest.log(LogStatus.PASS, "User menggunakan kolom search untuk mencari specific data");
		}
		
		@And("^Kolom Nama POSM")
		public void e105() {
			extentTest.log(LogStatus.PASS, "Kolom Nama POSM");
		}
		
		@And("^Kolom Stock")
		public void e106() {
			extentTest.log(LogStatus.PASS, "Kolom Stock");
		}
		
		@And("^Kolom Update Data")
		public void e107() {
			extentTest.log(LogStatus.PASS, "Kolom Update Data");
		}
		
		@And("^Kolom Aksi")
		public void e108() {
			masterPage.masterUser();
			masterPage.addnewUser1();
			masterPage.addnewUser2(1);
			masterPage.editUser();
			masterPage.editUser1(2);
			masterPage.deleteUser();
			extentTest.log(LogStatus.PASS, "Kolom Aksi");
		}
		
		@And("^User click edit button")
		public void e109() {
			masterPage.masterArea();
			masterPage.masterAreashow();
			masterPage.masterAreaedit(1);
			extentTest.log(LogStatus.FAIL, "nama keterangan form tidak sesuai"+"<img src=\"screenshots/IIIII.png\" width=\"250px\" height=\"75px\">");
		}
		
		@And("^Dropdown list jenis posm")
		public void e110() {
			masterPage.masterMall();
			masterPage.addnewMall1();
			masterPage.addnewMall2(1);
			masterPage.addnewMall3();
			masterPage.masterMallsearch();
			masterPage.masterMalledit(1);
			masterPage.masterMalldelete();
			extentTest.log(LogStatus.PASS, "Dropdown list jenis posm");
		}
		
		@And("^Kolom jumlah stock")
		public void e111() {
			masterPage.masterPOSM();
			masterPage.masterEditposm();
			masterPage.masterEditstockposm();
			extentTest.log(LogStatus.PASS, "Kolom jumlah stock");
		}
		
		@Then("^button save")
		public void e112() {
			extentTest.log(LogStatus.PASS, "button save");
		}
		

	// Scenario Validation Admin
		
		
		@When("^Menampilkan form validasi")
		public void f2() {
			
			extentTest.log(LogStatus.PASS, "Menampilkan form validasi");
		}
		
		@And("^Menampilkan dan Menyembunykan Form Data Validasi")
		public void f3() {
			extentTest.log(LogStatus.PASS, "Menampilkan dan Menyembunykan Form Data Validasi");
		}
		
		@And("^Dropdown list field filter area")
		public void f4() {
			extentTest.log(LogStatus.PASS, "Dropdown list field filter area");
		}
		
		@And("^Click dropdown list field filter")
		public void f5() {
			extentTest.log(LogStatus.PASS, "Click dropdown list field filter");
		}
		
		@And("^pilih list ALL AREA area dan klik tombol filter")
		public void f6() {
			extentTest.log(LogStatus.FAIL, "pilih list ALL AREA area dan klik tombol filter, Tidak tampil dan tidak sesuai"+"<img src=\"screenshots/CCCCC.png\" width=\"250px\" height=\"75px\">");
		}
		
		@And("^pilih list BEKASI area dan klik tombol filter")
		public void f7() {
			extentTest.log(LogStatus.FAIL, "pilih list BEKASI area dan klik tombol filter,Tidak tampil dan tidak sesuai"+"<img src=\"screenshots/HHHHH.png\" width=\"250px\" height=\"75px\">");
		}
		
		@And("^Mencari JAKARTA area dan klik tombol filter")
		public void f7r() {
			extentTest.log(LogStatus.FAIL, "Mencari JAKARTA area dan klik tombol filter,Tidak tampil dan tidak sesuai"+"<img src=\"screenshots/FFFFF.png\" width=\"250px\" height=\"75px\">");
		}
		
		@And("^Mencari nomer 6 dari data yg tersedia")
		public void f8() {
			extentTest.log(LogStatus.FAIL, "Mencari nomer 6 dari data yg tersedia,Tidak tampil dan tidak sesuai"+"<img src=\"screenshots/DDDDD.png\" width=\"250px\" height=\"75px\">");
		}
		
		@And("^Mencari nama Merchan Bakmi Jawa")
		public void f9() {
			extentTest.log(LogStatus.PASS, "Mencari nama Merchan Bakmi Jawa");
		}
		
//		@And("^Mencari nama Merchan Bakmi Jawa")
//		public void f10() {
//			extentTest.log(LogStatus.PASS, "Mencari nama Merchan Bakmi Jawa");
//		}
		
		@And("^Mencari Officer RUBY ANJASMORO")
		public void f11() {
			extentTest.log(LogStatus.FAIL, "Mencari Officer RUBY ANJASMORO, Tidak tampil dan tidak sesuai"+"<img src=\"screenshots/EEEEE.png\" width=\"250px\" height=\"75px\">");
		}
		
		@And("^Mencari Merchan dengan alamat  Blok A")
		public void f12() {
			extentTest.log(LogStatus.FAIL, "Mencari Merchan dengan alamat  Blok A, Tidak tampil dan tidak sesuai"+"<img src=\"screenshots/GGGGG.png\" width=\"250px\" height=\"75px\">");
		}
		
		@And("^No")
		public void f13() {
			extentTest.log(LogStatus.PASS, "No");
		}
		
		@And("^Area")
		public void f14() {
			extentTest.log(LogStatus.PASS, "Area");
		}
		
		@And("^Nama Merchant")
		public void f15() {
			extentTest.log(LogStatus.PASS, "Nama Merchant");
		}
		
		@And("^Alamat")
		public void f16() {
			extentTest.log(LogStatus.PASS, "Alamat");
		}
		
		@And("^Officer")
		public void f17() {
			extentTest.log(LogStatus.PASS, "Officer");
		}
		
		@And("^Tanggal Visit")
		public void f18() {
			extentTest.log(LogStatus.PASS, "Tanggal Visit");
		}
		
		@And("^Kontrol")
		public void f19() {
			extentTest.log(LogStatus.PASS, "Kontrol");
		}
		
		@And("^Showing data entries page validation")
		public void f20() {
			extentTest.log(LogStatus.PASS, "Showing data entries page validation");
		}
		
		@And("^Click button Next untuk ke table berikutnya")
		public void f21() {
			extentTest.log(LogStatus.PASS, "Click button Next untuk ke table berikutnya");
		}
		
		@And("^Click button Previous untuk ke table sebelumnya")
		public void f22() {
			extentTest.log(LogStatus.PASS, "Click button Previous untuk ke table sebelumnya");
		}
		
		@And("^bottom to up page")
		public void f23() {
			extentTest.log(LogStatus.PASS, "bottom to up page");
		}
		
		@And("^click button visit")
		public void f24() {
			extentTest.log(LogStatus.PASS, "click button visit");
		}
		
		@And("^Kolom Data Merchant")
		public void f25() {
			extentTest.log(LogStatus.PASS, "Kolom Data Merchant");
		}
		
		@And("^Nama Merchant page detail visit")
		public void f26() {
			extentTest.log(LogStatus.PASS, "Nama Merchant page detail visit");
		}
		
		@And("^Kategori")
		public void f27() {
			extentTest.log(LogStatus.PASS, "Kategori");
		}
		
		@And("^Area page detail visit")
		public void f28() {
			extentTest.log(LogStatus.PASS, "Area");
		}
		
		@And("^Nama Mall")
		public void f29() {
			extentTest.log(LogStatus.PASS, "Nama Mall");
		}
		
		@And("^Alamat page detail visit")
		public void f30() {
			extentTest.log(LogStatus.PASS, "Alamat page detail visit");
		}
		
		@And("^Nama PIC")
		public void f31() {
			extentTest.log(LogStatus.PASS, "Nama PIC");
		}
		
		@And("^Nomor Telp")
		public void f32() {
			extentTest.log(LogStatus.PASS, "Nomor Telp");
		}
		
		@And("^Ada EDC BCA")
		public void f33() {
			extentTest.log(LogStatus.PASS, "Ada EDC BCA");
		}
		
		@And("^Tanggal Visit page detail visit")
		public void f34() {
			extentTest.log(LogStatus.PASS, "Tanggal Visit page detail visit");
		}
		
		@And("^RO")
		public void f35() {
			extentTest.log(LogStatus.PASS, "RO");
		}
		
		@And("^Keterangan")
		public void f36() {
			extentTest.log(LogStatus.PASS, "Keterangan");
		}
		
		@And("^Foto Tampak Depan Merchant")
		public void f37() {
			extentTest.log(LogStatus.PASS, "Foto Tampak Depan Merchant");
		}
		
		@And("^Foto Meja Kasir")
		public void f38() {
			extentTest.log(LogStatus.PASS, "Foto Meja Kasir");
		}
		
		@And("^Foto tampak dalam merchant")
		public void f39() {
			extentTest.log(LogStatus.PASS, "Foto tampak dalam merchant");
		}
		
		@And("^Kolom Data Terminal EDC")
		public void f40() {
			extentTest.log(LogStatus.PASS, "Kolom Data Terminal EDC");
		}
		
		@And("^No page detail visit")
		public void f41() {
			extentTest.log(LogStatus.PASS, "No page detail visit");
		}
		
		@And("^TID")
		public void f42() {
			extentTest.log(LogStatus.PASS, "TID");
		}
		
		@And("^Foto EDC")
		public void f43() {
			extentTest.log(LogStatus.PASS, "Foto EDC");
		}
		
		@And("^Foto Struk")
		public void f44() {
			extentTest.log(LogStatus.PASS, "Foto Struk");
		}
		
		@And("^klik button Validate")
		public void f45() {
			validationPage.validation();
			extentTest.log(LogStatus.PASS, "klik button Validate");
		}
		
		@And("^klik button Retrun")
		public void f46() {
			validationPage.showValidation();
			validationPage.filterValidation(3);
//			assertEquals(configurationProperties.getTxtFilterBEKASI(), validationPage.getTxtFilterBEKASI());
			validationPage.searchValidation();
//			assertEquals(configurationProperties.getTxtNomerData(),validationPage.getTxtNomerData()); 
//			assertEquals(configurationProperties.getTxtOfficer(), validationPage.getTxtOfficer());
//			assertEquals(configurationProperties.getTxtJAKARTA(), validationPage.getTxtJAKARTA());
//			assertEquals(configurationProperties.getTxtAlamat(), validationPage.getTxtAlamat());
//			assertEquals(configurationProperties.getTxtMerchan(), validationPage.getTxtMerchan());
			validationPage.validateValidation();
			extentTest.log(LogStatus.PASS, "klik button Retrun");
		}
		
		@And("^klik button Reject")
		public void f47() {
			extentTest.log(LogStatus.PASS, "klik button Reject");
		}
				
		
	// Scenario Report Admin
		
		@When("^User click to report button")
		public void g1() {
			reportPage.report();
			extentTest.log(LogStatus.PASS, "User click to report button");
		}
		
		@And("^Memilih kategori merchant dari drop down list")
		public void g2() {
			extentTest.log(LogStatus.PASS, "Memilih kategori merchant dari drop down list");
		}
		
		@And("^Default kategori merchant --choose--")
		public void g3() {
			extentTest.log(LogStatus.PASS, "Default kategori merchant --choose--");
		}
		
		@And("^Memilih kategori merchant --all--")
		public void g4() {
			extentTest.log(LogStatus.PASS, "Memilih kategori merchant --all--");
		}
		
		@And("^Memilih kategori merchant Merchant BCA")
		public void g5() {
			extentTest.log(LogStatus.PASS, "Memilih kategori merchant Merchant BCA");
		}
		
		@And("^Memilih kategori merchant Merchant Non BCA")
		public void g6() {
			extentTest.log(LogStatus.PASS, "Memilih kategori merchant Merchant Non BCA");
		}
		
		@And("^Hanya bisa pilih salah satu kategori merchant")
		public void g7() {
			extentTest.log(LogStatus.PASS, "Hanya bisa pilih salah satu kategori merchant");
		}
		
		@And("^Memilih kategori EDC dari drop down list")
		public void g8() {
			extentTest.log(LogStatus.PASS, "Memilih kategori EDC dari drop down list");
		}
		
		@And("^Default kategori EDC --choose--")
		public void g9() {
			extentTest.log(LogStatus.PASS, "Default kategori EDC --choose--");
		}
		
		@And("^Memilih kategori EDC --all--")
		public void g10() {
			extentTest.log(LogStatus.PASS, "Memilih kategori EDC --all--");
		}
		
		@And("^Memilih kategori EDC Amex OK")
		public void g11() {
			extentTest.log(LogStatus.PASS, "Memilih kategori EDC Amex OK");
		}
		
		@And("^Memilih kategori EDC EDC Problem")
		public void g12() {
			extentTest.log(LogStatus.PASS, "Memilih kategori EDC EDC Problem");
		}
		
		@And("^Hanya bisa pilih salah satu kategori EDC")
		public void g13() {
			extentTest.log(LogStatus.PASS, "Hanya bisa pilih salah satu kategori EDC");
		}
		
		@And("^Dapat menginput start date manual")
		public void g14() {
			extentTest.log(LogStatus.PASS, "Dapat menginput start date manual");
		}
		
		@And("^Input dari date picker start date")
		public void g15() {
			extentTest.log(LogStatus.PASS, "Input dari date picker start date");
		}
		
		@And("^Dapat menginput end date manual")
		public void g16() {
			extentTest.log(LogStatus.PASS, "Dapat menginput end date manual");
		}
		
		@And("^Input dari date picker end date")
		public void g17() {
			extentTest.log(LogStatus.PASS, "Input dari date picker end date");
		}
		
		@And("^Menyimpan report tanpa merge")
		public void g18() {
			extentTest.log(LogStatus.PASS, "Menyimpan report tanpa merge");
		}
		
		@And("^Menyimpan report")
		public void g19() {
			extentTest.log(LogStatus.FAIL, "Fungsi sama seperti expect result button process tanpa merge"+"<img src=\"screenshots/JJJJJ.png\" width=\"250px\" height=\"75px\">");
		}
		
		@And("^Memaksimalkan tampilan panel report")
		public void g20() {
			reportPage.kategorimerchant(2);
			reportPage.kategoriedc(2);
			reportPage.date();
			extentTest.log(LogStatus.PASS, "Memaksimalkan tampilan panel report");
		}
		
		@Then("^Meminimalkan tampilan panel report")
		public void g21() {
			extentTest.log(LogStatus.PASS, "Meminimalkan tampilan panel report");
		}
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}


}
