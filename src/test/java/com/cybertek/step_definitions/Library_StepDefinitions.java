package com.cybertek.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Library_StepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on the login page.");
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters LIBRARIAN username");

        //Assert.fail("INTENTIONAL FAIL");

    }
    @When("user enter librarian password")
    public void user_enter_librarian_password() {
        System.out.println("user enter LIBRARIAN password");
    }

    @Then("user should see librarian in the dashboard")
    public void user_should_see_librarian_in_the_dashboard() {
        System.out.println("user sees the dashboard");
    }

    @Then("user should see dashboard")
    public void userShouldSeeDashboard() {
        System.out.println("user should see dashboard");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enters STUDENT username");
    }

    @And("user enter student password")
    public void userEnterStudentPassword() {
        System.out.println("user enter STUDENT password");
    }

    @When("user enters admin username")
    public void user_enters_admin_username() {
        System.out.println("user enters ADMIN username");
    }

    @When("user enter admin password")
    public void user_enter_admin_password() {
        System.out.println("user enter ADMIN password");
    }


}
