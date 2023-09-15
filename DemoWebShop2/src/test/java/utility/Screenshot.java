package utility;


import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import tests.TestBase;





public class Screenshot {
	WebDriver driver;
		public String takeScreenshot() throws IOException {
			
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\HP\\OneDrive\\Desktop\\screenshot"+System.currentTimeMillis()+".png";
		File Target=new File(path);
		FileUtils.copyFile(source,Target);
		String TargetPath=Target.getAbsolutePath();
		return TargetPath;
		
		
	}
	


}