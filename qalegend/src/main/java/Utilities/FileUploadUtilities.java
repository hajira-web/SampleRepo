package Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtilities {
	public void fileUplaodUsingRobotClass(String path) throws AWTException {
	 
	StringSelection ss = new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	Robot robot = new Robot();
	robot.delay(250);
	robot.keyPress(KeyEvent.VK_ENTER);//enter key to make the enter key on textbox-HOLD
	robot.keyRelease(KeyEvent.VK_ENTER);//HOLD OFF
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.delay(90);
	robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
