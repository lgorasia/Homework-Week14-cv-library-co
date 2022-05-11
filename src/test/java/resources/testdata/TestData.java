package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "jobSearchData")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester","Harrow","up to 5 miles","30000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Manager","Harrow","up to 15 miles","20000","60000","Per annum","Permanent","Permanent Manager jobs in Harrow on the Hill"},
                {"Project Manager","Harrow","up to 15 miles","40000","50000","Per annum","Contract","Contract Project Manager jobs in Harrow on the Hill"},
                {"Project Director","Harrow","up to 15 miles","70000","80000","Per annum","Permanent","Permanent Project Director jobs in Harrow on the Hill"},
                {"Project Management","Luton","up to 15 miles","30000","50000","Per annum","Contract","Contract Project Management jobs in Luton"},
                {"Project Controller","Harrow","up to 15 miles","500","1000","Per day","Temporary","Temporary Project Controller jobs in Harrow on the Hill"}

        };
        return data;
    }
}
