Feature: Dashboard Admin

  Scenario: Testing Dashboard Admin
    
When Menampilkan form dashboard amex
And Tombol home
And Menampilkan diagram total
And Menampilkan Table uraian dari diagram total
And Menampilkan diagram merchant EDC BCA
And Menampilkan Table uraian dari diagram merchant EDC BCA
And Menampilkan diagram EDC NON BCA
And Menampilkan Table uraian dari diagram merchant EDC NON BCA
And Mengklik dropdown periode
And Mengklik button filter
And Mengklik tombol tambah pada kota bandung
And mengisi kolom search
And mengisi kolom search dengan mengetik area BANDUNG
And Mengklik tombol search
And Mengklik tombol tambah pada setiap kota yang tampil
And Menampilkan total visit
And Menampilkan merchant EDC BCA
And Menampilkan merchant EDC NON BCA
And Menampilkan informasi amex OK
And Menampilkan informasi amex NOT OK
And Menampilkan informasi POSM placed
And Menampilkan informasi EDC problem
And Menampilkan informasi grand total
And Menampilkan nama posm
And Menampilkan stok di awal
And Menampilkan terpakai
And Menampilkan sisa stok
And Menampilkan data status kota
And Mengklik tombol complete
And Mengklik tombol sedang berjalan
Then Mengklik tombol belum berjalan
