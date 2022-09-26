/**
 * This interface outlines the functionality of the FrontendLoader class
 *  responsible for loading the FrontendDeveloper's web-based application 
 *  and integration with backend so that website can be ran from Makefile
 *  instead of manually connecting to the website
 */
public interface IFrontendLoader {
	public void loadWebsite();
	public void displayWebsite();
	public void startAndRun();
}
