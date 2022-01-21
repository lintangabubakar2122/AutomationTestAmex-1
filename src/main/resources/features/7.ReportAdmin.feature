
Feature: Report Admin

  Scenario: Testing Report Admin
    
When User click to report button
And Memilih kategori merchant dari drop down list
And Default kategori merchant --choose--
And Memilih kategori merchant --all--
And Memilih kategori merchant Merchant BCA
And Memilih kategori merchant Merchant Non BCA
And Hanya bisa pilih salah satu kategori merchant
And Memilih kategori EDC dari drop down list
And Default kategori EDC --choose--
And Memilih kategori EDC --all--
And Memilih kategori EDC Amex OK
And Memilih kategori EDC EDC Problem
And Hanya bisa pilih salah satu kategori EDC
And Dapat menginput start date manual
And Input dari date picker start date
And Dapat menginput end date manual
And Input dari date picker end date
And Menyimpan report tanpa merge
And Menyimpan report
And Memaksimalkan tampilan panel report
Then Meminimalkan tampilan panel report

    
    