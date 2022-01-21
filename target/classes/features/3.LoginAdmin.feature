Feature: Login Admin

	Scenario: Testing Login Admin
Given User go to the Website
When Mengisi Username
And Mengisi password
And Mengklik tombol Log In
And User cant login to the Website if wrong
Then User can login to the Website if right