# N11 Automation Tests

Bu repo N11.com Web Otomasyon Testleri için oluşturulmuştur. Proje içerisinde Java Selenium Cucumber ile Page Object Model kullanılarak 2 adet test senaryosu yazılmıştır. Bu senaryolar firma listesini CSV olarak kaydetmek, ürün aramak, marka filtrelemek, ürünü sepete eklemek ve tüm adımların kontrollerini yapmak gibi adımları içermektedir. Ayrıca bu projede BDD yaklaşımı uygulanmıştır. BDD yaklaşımı tüm birimler tarafından anlaşılabilen ortak bir dil kullanarak test otomasyonunun kolay anlaşılabilir olmasını sağlamaktadır. Test senaryoları "resources/features/TestCases.feature” altında yer almaktadır. 

Aynı zamanda bu proje içerisinde Selenium Grid ve Docker kullanılmıştır. Selenium Grid testlerin paralel olarak farklı tarayıcılarda imkan tanıyan bir sistemdir.

<p align="center" width="100%">
    <img width="100%" alt="Selenium Grid Mimarisi" src="https://miro.medium.com/max/884/1*rpC1U4ZaA4e3m6rL_acpwQ.png"> 
Bu çizim "https://medium.com/devopsturkiye/selenium-grid-nedir-d325a19db2bd" adresinden alınmıştır.  
</p>

Oluşturulan docker-compose.yaml dosyası ile bir selenium grid hub'ı başlatılır ve oluşturulan testlerin bu ortamda koşması sağlanır. Bu proje için oluşturulan docker-compose dosyası localhost:4444 adresinde çalışmaktadır. Bu nedenle Driver.java dosyası içerisinde yer alan uzak tarayıcı adresleri bu adrese göre ayarlanmıştır.


## Kurulum Öncesi Gereksinimler
* Java
* Maven
* Selenium-java
* Cucumber-java
* Webdrivermanager
* Cucumber-junit
* Docker

## Kurulum Adımları

1- Bash ekranı açılır.
`

2- N11WebTestAutomation reposu lokal cihaza kopyalanır.

``` git clone https://github.com/acelyagul/N11WebTestAutomation.git ```

3- Klasöre gidilir.

``` cd N11WebTestAutomation ```

4- Ana dizinde yer alan "configurations.properties" dosyası içerisine gerekli bilgiler tanımlanr.

```
browserName=[BrowserName]
baseURL=[BaseURL]
websiteTitle=[WebSiteTitle]
```

5- Daha sonra docker compose çalıştırılır. 

``` docker-compose up  ```

6- Ardından test dosyaları çalıştırılır.

``` mvn clean test -Dtest=CucumberRunner  ```

Not: Test sonuçları "Target" klasörü altında yer alan "default-html-reports" klasöründe raporlanmaktadır. 