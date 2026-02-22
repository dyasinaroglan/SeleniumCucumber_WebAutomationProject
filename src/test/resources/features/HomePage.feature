Feature: Ana Sayfa Fonksiyonları

  @yaso1
  Scenario: İhtiyaç kredisi sayfası url kontrolü
    Given "https://www.hesapkurdu.com/" hesapkurdu ana sayfasına gidilir
    When ihtiyaç kredisi butonuna tıklanır
    Then İhtiyaç kredisi gidildiği kontrol edilir
    Then Tarayıcı kapatılır.