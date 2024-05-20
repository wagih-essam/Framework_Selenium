package platform;

import pages.LoginPage;
import pages.SearchPage;

public class MyApplication {
    public SearchPage search;
    public  LoginPage login;

    public MyApplication(){
        search = new SearchPage();
    }
}
