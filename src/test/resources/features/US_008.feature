Feature: Bir kullanıcı olarak ana sayfaya girdiğimde, sayfanin sağ üst bölümünde "İlan Ekle" linkini görebilmeliyim.

  Background:User signs in
    Given kullanici "http://environment.kielmarketplace.nl" adresine gider

  Scenario: TC_001_US_008 kullanici ilan ekle butonunun aktif olup olmadigini kontrol eder
    Then kullanici ilan ekle linkinin aktif oldugunu dogrular

  Scenario: TC_002_US_008 kullanici ilan ekle butonunun arkaplan rengini dogrular
    Then kullanici ilan ekle linkinin arkaplan renginin "rgba(25, 135, 84, 1)" oldugunu dogrular

  Scenario: TC_003_US_008 kullanici giris yapmadiginda linke tıklarsa "/login" sayfasina gitmeli
    And kullanici ilan ekle butonuna tiklar
    Then kullanici uzerinde bulundugu sayfanin urlinde "/login" ifadesini dogrular

  Scenario: TC_004_US_008 kullanici giris yaptiginda linke tıklarsa "/add_ilan" sayfasina gitmeli
    And kullanici giris yap linkine tiklar
    And kullanici sisteme "kullanici1@gmail.com" ve "Kullanici123." bilgileri ile giris yapar
    And kullanici ilan ekle butonuna tiklar
    Then kullanici uzerinde bulundugu sayfanin urlinde "/add_ilan" ifadesini dogrular








#1.User Story ve gereksinimlerinin anlasilmasi
#2.Test Case olusturulur
#3.Manuel olarak test ederiz
#4.Automation Test Scriplerinin yazilmasi



  #JIRA ADIMLERI
  #1.Test Case olusturmak ve User Story ile baglantisinin saglanmasi
  #2.Pre-Conditionlari olusturmak ve Test Case lere baglamak
  #3.Test Set olusturmak (Eger kullanacagimiz daha onceden olusturulan test set varsa , onu kullanabiliriz)
  #4. Test Plan icine Test Set Eklenmesi (Zaten ekliyse , sadece test case execute edilir)
  #For Example:
  # 20 Test Case  -> Login Test Set
  # 120 Test Case -> HomePage Test Set
  # 240 Test Case -> AdminPage Test Set


