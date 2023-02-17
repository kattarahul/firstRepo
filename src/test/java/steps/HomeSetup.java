package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class HomeSetup {


    @Given("User open application")
    public void user_open_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" w ");
    }


    @When("User on welcome screen")
    public void user_on_welcome_screen() {

        // Write code here that turns the phrase above into concrete actions
        System.out.println(" w2 ");
    }

    @Then("I login with {string} and {string}")
    public void i_login_with_and(String userName, String password) {
        System.out.println(" Username : " + userName + " and password is : " + password);
    }

    @Given("My credentials as formatTable")
    public void My_credentials_as_formatTable(DataTable dataTable) {
        List<List<String>> str = dataTable.asLists(String.class);
        System.out.println(str.get(0).get(0) +" and " + str.get(0).get(1));
        System.out.println(str.get(1).get(0)+ " and "+ str.get(1).get(1));
        System.out.println(str.get(1).get(0)+ " and "+ str.get(1).get(1));
        System.out.println(str.get(2).get(0)+ " and "+ str.get(2).get(1));
        System.out.println(str.get(3).get(0)+ " and "+ str.get(3).get(1));
        System.out.println(" fetch re baba...");


    }
    @Then("I got failed")
    public void i_got_failed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" data table successfully working..");
    }




}
