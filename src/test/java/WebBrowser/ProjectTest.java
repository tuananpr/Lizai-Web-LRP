package WebBrowser;

import Core.Support.General.Hooks;
import LizAI.Pages.Features.Projects;
import LizAI.Pages.Features.SignInPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectTest extends Hooks {
    @BeforeMethod
    public void setup(){
        before();
        beforeWeb();
    }

    @AfterMethod

    public void tearDown(){
        System.out.println("After..............................");
        after();
    }

    String userAdminName = "Matrix";
    String userAdminEmail = "matrixtest1@gmail.com";
    String userAdminPassword = "123456";

    @Test(priority = 2)
    public void Signin_Admin() throws  InterruptedException {
        SignInPage signInPage = new SignInPage(true);
        signInPage.signIn(userAdminEmail,userAdminPassword );
        signInPage.waitForPageLoadComplete();
        signInPage.label_UserName(userAdminName);

        Projects projects = new Projects(false);
        projects.clickon_Projects();
        projects.clickon_Block();
    }
}
