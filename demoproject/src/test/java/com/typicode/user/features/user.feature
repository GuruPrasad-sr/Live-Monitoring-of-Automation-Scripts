Feature: Customer API
  Scenario: Create a customer
    Given I have a customer with the following details
      | name | age | location  |
      | Guru | 22  | Bangalore |
    When I create the customer
    Then the response status code should be "201"

 Scenario: Get a person by ID
 Given there is a person with ID 1
 When I request the person by ID
 Then the response status code should be "200 OK"
 And the response should contain the following details
 | id | name | age | location |
 | 1 | Pavan | 21 | Bangalore |
#
# Scenario: Retrieve all persons
# Given there are some persons in the system
# When I request all persons
# Then the response should contain all persons
#
# Scenario: Update a person by ID
# Given there is a person with ID 1
# And I have updated the person with the following details
# | name | age | location |
# | Pavan M | 21 | Bangalore |
# When I update the person by ID
# Then the response status code should be "200 OK"
# And the response should contain the following details
# | id | name | age | location |
# | 1 | Pavan M | 21 | Bangalore |
#
# Scenario: Delete a person by ID
# Given there is a person with ID 1
# When I delete the person by ID
# Then the response status code should be "204 No Content"
# And the person should not exist with ID 1