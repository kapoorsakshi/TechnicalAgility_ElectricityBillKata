package stepdefs;

import static org.junit.Assert.*;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ElectricityBillTest {
	
	ElectricityBill electricityBill =new ElectricityBill();
	

	@Given("My electricity bill is  {int}")
	public void my_electricity_bill_is(Integer units) {
		
		electricityBill.setUnits(units);
		int rerieveunits=  electricityBill.getUnits();
		
		System.out.println("rerieveunits=="+rerieveunits);
		
		
		
	}

	
	/////CHECKING FOR ELECTRICITY CHARGE
	
	@Given("my slab is {double}")
	public void my_slab_is(Double double1) {
		
	   
	}    

	@When("I check for the energy charges")
	public void i_check_for_the_energy_charges() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("I verify the <energy charge>")
	public void i_verify_the_energy_charge() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	
////CHECKING FOR FCA CHARGE

		@When("I check for the FCA charges")
		public void i_check_for_the_fca_charges() {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

		@When("FCA charge is {double} paisa\\/unit")
		public void fca_charge_os_paisa_unit(Double double1) {
		    // Write code here that turns the phrase above into concrete actions
		   
		}
		
		@Then("I verify the FCA charge {double}")
		public void i_verify_the_fca_charge(Double double1) {
		    // Write code here that turns the phrase above into concrete actions
		    
		}
		
/////  CHECKING FOR DUTY CHARGE 

			@Given("my duty charge slab is {double}")
			public void my_duty_charge_slab_is(Double double1) {
			    // Write code here that turns the phrase above into concrete actions
			   
			}

			@When("I check for the slab wise duty charges")
			public void i_check_for_the_slab_wise_duty_charges() {
			    // Write code here that turns the phrase above into concrete actions
			    
			}
			@When("I check for the FCA on duty charges")
			public void i_check_for_the_fca_on_duty_charges() {
			    // Write code here that turns the phrase above into concrete actions
			    
			}
			
			@Then("I verify the Total Duty Charge {double}")
			public void i_verify_the_total_duty_charge(Double double1) {
			    // Write code here that turns the phrase above into concrete actions
			    //throw new io.cucumber.java.PendingException();
			}
			
///////  CHECKING FOR TOTAL CHARGES 		
							
			@Given("my units are upto {int} and duty slab is {double}")
			public void my_units_are_upto_and_duty_slab_is(Integer int1, Double double1) {
			    // Write code here that turns the phrase above into concrete actions
			    
			}

			@When("I check for the Total bill amount")
			public void i_check_for_the_total_bill_amount() {
			    // Write code here that turns the phrase above into concrete actions
			    
			}
			
			@Then("I verify the Total amount {double}")
			public void i_verify_the_total_amount(Double double1) {
			    // Write code here that turns the phrase above into concrete actions
			    //throw new io.cucumber.java.PendingException();
			}



			


	
	
	
	
	
	







}
