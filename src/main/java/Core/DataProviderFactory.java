package Core;

import LizAI.Pages.BaseLizAIPages;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

import java.util.HashMap;

public class DataProviderFactory extends BaseLizAIPages {
    public DataProviderFactory(By locator, String pageName, boolean assertOpen) {super(locator, pageName, assertOpen);}

    @DataProvider(name= "SystemAdministrator")
    public static Object[][] dataSystemAdmin(){
        Object[][] oSystemAdmin = new Object[1][];
        HashMap<String, String> systemAdmin = new HashMap<String, String>();

        //Information
        systemAdmin.put("ID","lizai.startup@gmail.com");
        systemAdmin.put("Password","123456");
        systemAdmin.put("SystemAdminName","Trần Minh Phong");

        oSystemAdmin[0] = new Object[] {systemAdmin};
        return oSystemAdmin;
    }

    @DataProvider(name= "Administrator")
    public static Object[][] dataAdmin() {
        Object[][] oAdmin = new Object[1][];
        HashMap<String, String> admin = new HashMap<String, String>();

        //Information
        admin.put("ID","matrixtest1@gmail.com");
        admin.put("Password","123456");
        admin.put("AdminName","UserLV2");
        oAdmin[0] = new Object[] {admin};
        return oAdmin;
    }



    @DataProvider(name= "UserAccount")
    public static Object[][] dataUser(){
        Object[][] oUser = new Object[1][];
        HashMap<String, String> user = new HashMap<String, String>();

        //Information
        user.put("ID","matrixtest13@gmail.com");
        user.put("Password","123456");
        user.put("UserName","UserLV3");

        oUser[0] = new Object[] {user};
        return oUser;
    }
}
