package page;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;


public class RemoveAllPage {
	
	WebDriver driver;

	// Each page requires a constructor in order to invite the drivers
	public RemoveAllPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements Library
	@FindBy(how = How.NAME, using = "allbox")
	WebElement allList;
	@FindBys(@FindBy(how = How.XPATH, using = "//input[@type='checkbox']"))
	List<WebElement> checkboxes;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement removeButton;

	public void UserShldBeAbleToRemoveAllItems()  {
		allList.click();
		removeButton.click();
	}

	public boolean checkIfAllBoxesSelected() {
		int NotCheckedBox = 0;
		
		for (int i = 0; i < checkboxes.size(); i++) {
			if (checkboxes.get(i).isSelected() == false) {
				NotCheckedBox++;
			}
		}
		if (NotCheckedBox > 0) {
			return false;
		} else {
			return true;
		}
	}
}
