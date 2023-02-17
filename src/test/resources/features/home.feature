Feature: H Module

  Scenario:
    Given User open application
    When User on welcome screen




  Scenario: verify successfull login
    When User on welcome screen
    Then I login with " username" and " password"

   @android @home
  Scenario: verify Credentails
    Then I login with " rahul123@gmail.com  " and " cucumber"


   @ios @home
    Scenario Outline:  verify login
      Then I login with "<username>" and "<password>"
      Examples:
      | username | password  |
      | rahulkatta | rahul123 |
      |Muzamil123|ali123|



@smoke @home
      Scenario: Verify to fail
        Given My credentials as formatTable
        |rahulkatta|rahul123|
        |Muzamil123|ali123|
        |revifrnd|revi123|
        |vinayDeewana|Vinay456|

        Then I got failed




