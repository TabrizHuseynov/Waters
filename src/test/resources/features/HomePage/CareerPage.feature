@wip
Feature:  Waters Career Assestment
#  Automation should visit https://uscareers-waters.icims.com/jobs/ and search for the job req for a posting on the team, which is 11688.
#  Automation should then open the job position that matches that req number.
#  Automation should then assert that the page displays the correct posting number:
  Background: open browser and career page

  Scenario: user goes to career page and enters the job id to search correct posting number
    Given user is on the career page
    And enters the job id "11688" to searchbox
    And user verifies that the page displays the correct posting number
