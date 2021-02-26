package testcases.rediff;

import org.testng.annotations.Test;

import testbase.BaseTest;


public class PortfolioManagement extends BaseTest{
	
	@Test
	public void createPortfolio() {
		String portfolioName="PortfolioAshish100";
		
		app.log("Creating Profolio");
		app.click("createPortfolio_id");
		app.clear("porfolioname_id");
		app.type("porfolioname_id", portfolioName);
		app.click("createPortfolioButton_css");
		app.waitForPageToLoad();
		app.validateSelectedValueInDropDown("portfolioid_dropdown_id",portfolioName);
	}
	
	
	@Test
	public void deletePortfolio() {
		String portfolioName="Portfolio1202611";
		
		
		app.log("Deleting Profolio");
        app.selectByVisibleText("portfolioid_dropdown_id", portfolioName);
        app.waitForPageToLoad();
        app.click("deletePortfolio_id");
        app.acceptAlert();
        app.validateSelectedValueNotInDropDown("portfolioid_dropdown_id",portfolioName);
	}
	
	@Test
	public void selectPortFolio() {
		app.log("Selecting Profolio");
		app.selectByVisibleText("portfolioid_dropdown_id", "Cat");
        app.waitForPageToLoad();
	}

}
