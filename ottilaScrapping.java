package ottilaProject;

import java.io.*;
import java.util.ArrayList;

import org.openqa.selenium.*;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.Augmenter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;

public class ottilaScrapping {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Program execution has started");
		DesiredCapabilities caps = new DesiredCapabilities();
		ArrayList<String> cliArgsCap = new ArrayList<String>();
		cliArgsCap.add("--load-images=no");
		cliArgsCap.add("--webdriver-loglevel=NONE");
		
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, cliArgsCap);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/usr/bin/phantomjs");                  
		  
	      WebDriver driver = new PhantomJSDriver(caps);
	      driver.get("http://www.ottila.net/");
	      File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshot, new File("screenshot.png"));
	      System.out.println("Screenshot has been saved");
	      driver.findElement(By.xpath(".//*[@id='txtUserId']")).sendKeys("Datavel3086");
	      driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("vinay");
	      driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys(Keys.RETURN);
	      WebDriverWait wait = new WebDriverWait(driver, 40);
	      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='popupContact1']/div[1]")));
	      File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshot1, new File("screenshot1.png"));
	      System.out.println("Screenshot after login has been saved");
	      /*
	      WebElement popup = driver.findElement(By.xpath(".//*[@id='popupContact1']/div[2]/a"));
	      popup.click();
	      Thread.sleep(1000);
	      File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshot2, new File("screenshot2.png"));
	      System.out.println("Screenshot after disabling popup has been saved");
	      */
	      driver.get("http://www.ottila.net/searchRailEurope.aspx");
	      wait = new WebDriverWait(driver, 40);
	      element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ui-id-1']")));
	      File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshot3, new File("screenshot3.png"));
	      System.out.println("Screenshot after selecting the rail tab has been saved");
	      InputStreamReader read = new InputStreamReader(System.in);
	      BufferedReader in = new BufferedReader(read);
	      System.out.println("Enter 1 for Pass or 2 for Ticket");
	      int ch1 = Integer.parseInt(in.readLine());
	      switch (ch1)
	      {
	      case 1:
	    	  System.out.println("Case Pass");
	    	  System.out.println("Enter 1 for European Pass or 2 for Non European Pass");
	    	  int ch2 = Integer.parseInt(in.readLine());
	    	  switch (ch2)
	    	  {
	    	  case 1:
	    		  System.out.println("Case European Pass selected");
	    		  System.out.println("Select family: \n 1 Eurail Passes \n 2 Multi-Country Passes \n 3 French Products \n 4 Swiss Products \n 5 British Products \n 6 Other Single Country Passes \n 7 Norwegian Combination Tours \n 12 Other Miscellaneous Passes ");
	    		  int ch3 = Integer.parseInt(in.readLine());
	    		  WebElement  dropDownListBox = driver.findElement(By.xpath(".//*[@id='ddlPass']"));
	    		  Select clickThis = new Select(dropDownListBox);
	    		  switch (ch3)
	    		  {
	    		  case 1:
	    			  System.out.println("Eurail Passes selected");
	    			  {
	    				  clickThis.selectByValue("1");
	    				  
	    				  
	    				  System.out.println("Select Pass family: \n 1 Eurail Austria - Croatia/Slovenia Pass \n 2 Eurail Austria - Czech Republic Pass \n 3 Eurail Austria - Germany Pass \n 4 Eurail Austria - Hungary Pass \n 5 Eurail Austria - Switzerland Pass \n 6 Eurail Austria Pass \n 7 Eurail Benelux - France Pass \n 8 Eurail Benelux - Germany Pass \n 9 Eurail Benelux Pass \n 10 Eurail Bulgaria Pass \n 11 Eurail Croatia Pass \n 12 Eurail Croatia/Slovenia - Hungary Pass \n 13 Eurail Czech Republic - Germany Pass \n 14 Eurail Czech Republic Pass \n 15 Eurail Denmark - Germany Pass \n 16 Eurail Denmark - Sweden Pass \n 17 Eurail Denmark Pass \n 18 Eurail Finland - Sweden Pass \n 19 Eurail Finland Pass \n 20 Eurail France - Germany Pass \n 21 Eurail France - Italy Pass \n 22 Eurail France - Spain Pass \n 23 Eurail France - Switzerland Pass \n 24 Eurail Germany - Poland Pass \n 25 Eurail Germany - Switzerland Pass \n 26 Eurail Global Pass \n 27 Eurail Greece - Italy Pass \n 28 Eurail Greece Pass \n 29 Eurail Hungary - Romania Pass \n 30 Eurail Hungary Pass \n 31 Eurail Ireland Pass \n 32 Eurail Italy - Spain Pass \n 33 Eurail Italy Pass \n 34 Eurail Norway - Sweden Pass \n 35 Eurail Norway Pass \n 36 Eurail Poland Pass \n 37 Eurail Portugal - Spain Pass \n 38 Eurail Portugal Pass \n 39 Eurail Romania Pass \n 40 Eurail Scandinavia Pass \n 41 Eurail Select Pass \n 42 Eurail Slovenia Pass \n 43 Eurail Spain Pass \n 44 Eurail Sweden Pass");
	    				  int ch4 = Integer.parseInt(in.readLine());
	    				  driver.findElement(By.xpath(".//*[@id='ddlPassFamily']")).click();
	    				  WebElement  dropDownListBox2 = driver.findElement(By.xpath(".//*[@id='ddlPassFamily']"));
	    	    		  Select clickThis2 = new Select(dropDownListBox2);
	    	    		  Thread.sleep(500);
	    				  File screenshot4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    	    	      FileUtils.copyFile(screenshot4, new File("screenshot4.png"));
	    	    	      System.out.println("Screenshot after selecting eurorail has been saved");
	    	    		  
	    	    		  switch (ch4)
	    	    		  {
	    	    		  case 1:
	    	    			  System.out.println("Eurail Austria - Croatia/Slovenia Pass");
	    	    			  clickThis2.selectByValue("100229");
	    	    			  break;
	    	    		  case 2:
	    	    			  System.out.println("Eurail Austria - Czech Republic Pass");
	    	    			  clickThis2.selectByValue("100275");
	    	    			  break;
	    	    		  case 3:
	    	    			  System.out.println("Eurail Austria - Germany Pass");
	    	    			  clickThis2.selectByValue("100286");
	    	    			  break;
	    	    		  case 4:
	    	    			  System.out.println("Eurail Austria - Hungary Pass");
	    	    			  clickThis2.selectByValue("100502");
	    	    			  break;
	    	    		  case 5:
	    	    			  System.out.println("Eurail Austria - Switzerland Pass");
	    	    			  clickThis2.selectByValue("100277");
	    	    			  break;
	    	    		  case 6:
	    	    			  System.out.println("Eurail Austria Pass");
	    	    			  clickThis2.selectByValue("100600");
	    	    			  break;
	    	    		  case 7:
	    	    			  System.out.println("Eurail Benelux - France Pass");
	    	    			  clickThis2.selectByValue("100278");
	    	    			  break;
	    	    		  case 8:
	    	    			  System.out.println("Eurail Benelux - Germany Pass");
	    	    			  clickThis2.selectByValue("100203");
	    	    			  break;
	    	    		  case 9:
	    	    			  System.out.println("Eurail Benelux Pass");
	    	    			  clickThis2.selectByValue("100503");
	    	    			  break;
	    	    		  case 10:
	    	    			  System.out.println("Eurail Bulgaria Pass");
	    	    			  clickThis2.selectByValue("100709");
	    	    			  break;
	    	    		  case 11:
	    	    			  System.out.println("Eurail Croatia Pass");
	    	    			  clickThis2.selectByValue("100504");
	    	    			  break;
	    	    		  case 12:
	    	    			  System.out.println("Eurail Croatia/Slovenia - Hungary Pass");
	    	    			  clickThis2.selectByValue("100232");
	    	    			  break;
	    	    		  case 13:
	    	    			  System.out.println("Eurail Czech Republic - Germany Pass");
	    	    			  clickThis2.selectByValue("100515");
	    	    			  break;
	    	    		  case 14:
	    	    			  System.out.println("Eurail Czech Republic Pass");
	    	    			  clickThis2.selectByValue("100602");
	    	    			  break;
	    	    		  case 15:
	    	    			  System.out.println("Eurail Denmark - Germany Pass");
	    	    			  clickThis2.selectByValue("100230");
	    	    			  break;
	    	    		  case 16:
	    	    			  System.out.println("Eurail Denmark - Sweden Pass");
	    	    			  clickThis2.selectByValue("100603");
	    	    			  break;
	    	    		  case 17:
	    	    			  System.out.println("Eurail Denmark Pass");
	    	    			  clickThis2.selectByValue("100334");
	    	    			  break;
	    	    		  case 18:
	    	    			  System.out.println("Eurail Finland - Sweden Pass");
	    	    			  clickThis2.selectByValue("100605");
	    	    			  break;
	    	    		  case 19:
	    	    			  System.out.println("Eurail Finland Pass");
	    	    			  clickThis2.selectByValue("100280");
	    	    			  break;
	    	    		  case 20:
	    	    			  System.out.println("Eurail France - Germany Pass");
	    	    			  clickThis2.selectByValue("100281");
	    	    			  break;
	    	    		  case 21:
	    	    			  System.out.println("Eurail France - Italy Pass");
	    	    			  clickThis2.selectByValue("100283");
	    	    			  break;
	    	    		  case 22:
	    	    			  System.out.println("Eurail France - Spain Pass");
	    	    			  clickThis2.selectByValue("100284");
	    	    			  break;
	    	    		  case 23:
	    	    			  System.out.println("Eurail France - Switzerland Pass");
	    	    			  clickThis2.selectByValue("100285");
	    	    			  break;
	    	    		  case 24:
	    	    			  System.out.println("Eurail Germany - Poland Pass");
	    	    			  clickThis2.selectByValue("100517");
	    	    			  break;
	    	    		  case 25:
	    	    			  System.out.println("Eurail Germany - Switzerland Pass");
	    	    			  clickThis2.selectByValue("100289");
	    	    			  break;
	    	    		  case 26:
	    	    			  System.out.println("Eurail Global Pass");
	    	    			  clickThis2.selectByValue("100029");
	    	    			  break;
	    	    		  case 27:
	    	    			  System.out.println("Eurail Greece - Italy Pass");
	    	    			  clickThis2.selectByValue("100231");
	    	    			  break;
	    	    		  case 28:
	    	    			  System.out.println("Eurail Greece Pass");
	    	    			  clickThis2.selectByValue("100291");
	    	    			  break;
	    	    		  case 29:
	    	    			  System.out.println("Eurail Hungary - Romania Pass");
	    	    			  clickThis2.selectByValue("100204");
	    	    			  break;
	    	    		  case 30:
	    	    			  System.out.println("Eurail Hungary Pass");
	    	    			  clickThis2.selectByValue("100294");
	    	    			  break;
	    	    		  case 31:
	    	    			  System.out.println("Eurail Ireland Pass");
	    	    			  clickThis2.selectByValue("100505");
	    	    			  break;
	    	    		  case 32:
	    	    			  System.out.println("Eurail Italy - Spain Pass");
	    	    			  clickThis2.selectByValue("100506");
	    	    			  break;
	    	    		  case 33:
	    	    			  System.out.println("Eurail Italy Pass");
	    	    			  clickThis2.selectByValue("100507");
	    	    			  break;
	    	    		  case 34:
	    	    			  System.out.println("Eurail Norway - Sweden Pass");
	    	    			  clickThis2.selectByValue("100607");
	    	    			  break;
	    	    		  case 35:
	    	    			  System.out.println("Eurail Norway Pass");
	    	    			  clickThis2.selectByValue("100296");
	    	    			  break;
	    	    		  case 36:
	    	    			  System.out.println("Eurail Poland Pass");
	    	    			  clickThis2.selectByValue("100299");
	    	    			  break;
	    	    		  case 37:
	    	    			  System.out.println("Eurail Portugal - Spain Pass");
	    	    			  clickThis2.selectByValue("100236");
	    	    			  break;
	    	    		  case 38:
	    	    			  System.out.println("Eurail Portugal Pass");
	    	    			  clickThis2.selectByValue("100509");
	    	    			  break;
	    	    		  case 39:
	    	    			  System.out.println("Eurail Romania Pass");
	    	    			  clickThis2.selectByValue("100301");
	    	    			  break;
	    	    		  case 40:
	    	    			  System.out.println("Eurail Scandinavia Pass");
	    	    			  clickThis2.selectByValue("100609");
	    	    			  break;
	    	    		  case 41:
	    	    			  System.out.println("Eurail Select Pass");
	    	    			  clickThis2.selectByValue("101040");
	    	    			  break;
	    	    		  case 42:
	    	    			  System.out.println("Eurail Slovenia Pass");
	    	    			  clickThis2.selectByValue("100611");
	    	    			  break;
	    	    		  case 43:
	    	    			  System.out.println("Eurail Spain Pass");
	    	    			  clickThis2.selectByValue("100303");
	    	    			  break;
	    	    		  case 44:
	    	    			  System.out.println("Eurail Sweden Pass");
	    	    			  clickThis2.selectByValue("100306");
	    	    			  break;
	    	    			  default:
	    	    				  System.out.println("Wrong choice selected");
	    	    		  
	    	    		  }//end of switch case for sub-family of eurail
	    			  }//end of the case eurail is selected
	    			  break;
	    		  case 2:
	    			  System.out.println("Multi-Country Passes selected");
	    			  break;
	    		  case 3:
	    			  System.out.println("French Products selected");
	    			  break;
	    		  case 4:
	    			  System.out.println("Swiss Products selected");
	    			  break;
	    		  case 5:
	    			  System.out.println("British Products selected");
	    			  break;
	    		  case 6:
	    			  System.out.println("Other Single Country Passes selected");
	    			  break;
	    		  case 7:
	    			  System.out.println("Norwegian Combination Tours selected");
	    			  break;
	    		  case 12:
	    			  System.out.println("Other Miscellaneous Passes selected");
	    			  break;
	    			  default:
	    				  System.out.println("Wrong choice selected");
	    		  }
	    		  
	    		  //code to specify date comes here
	    		  
	    		  driver.findElement(By.xpath(".//*[@id='lbtnSearch']/span[1]")).click();
	    		  System.out.println("search button has been clicked");
	    		  wait = new WebDriverWait(driver, 40);
	    	      element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='FirstClass1']/ul/li[1]/a")));
	    	      System.out.println("Results have been loaded");
	    	      File screenshot5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    	      FileUtils.copyFile(screenshot5, new File("screenshot5.png"));
	    	      System.out.println("Screenshot after searching has been saved");
	    	      
	    		  break;//end of case european pass is selected
	    	  case 2:
	    		  System.out.println("Case Non European Pass selected");
	    		  break;
	    		  default:
	    			  System.out.println("Wrong choice selected");
	    	  }
	    	  break;
	      case 2:
	    	  System.out.println("Case ticket");
	    	  break;
	    	  default:
	    		  System.out.println("Wrong choice selected");
	      }
	}

}
