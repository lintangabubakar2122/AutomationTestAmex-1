Feature: Login Amex

	Scenario: Testing Login Amex
Given Amex go to the Website
When Mengisi Username amex
And Mengisi password amex
And Mengklik tombol Log In amex 
And User tidak dapat login sistem amex jika salah
Then User login kedalam sistem amex jika benar


		