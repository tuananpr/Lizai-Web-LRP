package WebBrowser;

import Core.Support.General.Hooks;
import LizAI.Pages.Features.Projects;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Projects_Test extends Hooks {
    @BeforeMethod
    public void setup(){
        before();
        beforeWeb();
    }

    @AfterMethod

    public void tearDown(){after();}

    SignIn_Test signInTest = new SignIn_Test();
    Projects projects = new Projects(false);
    @Test(priority = 1)
    public void Create_Project() throws InterruptedException {
//        signInTest.Signin_Admin();
        projects.clickon_Projects();
        projects.clickon_CreateNewProject();
    }
}
