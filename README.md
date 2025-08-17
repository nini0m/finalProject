აღნიშნული პროექტი წარმოადგენს ავტომატიზებულ ტესტირების ფრეიმვორქს, რომელიც შექმნილია ვებ აპლიკაციების ფუნქციონალის ტესტირებისთვის და API-ის სტატუსის შემოწმებისთვის.

სატესტო საიტი - https://ee.ge

სატესტო API https://reqres.in

პროექტი შექმნილია Page Object Model (POM) დიზაინ პატერნის მიხედვით, PageFactory-ს გამოყენებით.

პროექტში გამოყენებულია შემდეგი ბიბლიოთეკები: TestNG, Selenium WebDriver, WebDriverManager, ExtentReports და RestAssured.

ტესტირების მიზანია:

•	ვებ ელემენტების და ფუნქციონალების ავტომატიზებული შემოწმება

•	API-ის სტატუსის შემოწმება

•	ლოგების და ვიზუალური რეპორტების გენერაცია

**პროექტის სტრუქტურა**

src

└── main

    └── java
    
        └── org/example
        
            ├── pages
            
            │   ├── CartPage.java
            
            │   ├── ChatPage.java
            
            │   ├── LanguagePage.java
            
            │   ├── MainPage.java
            
            │   └── SearchResultsPage.java
            
            │
            
            ├── utils
            
            │   ├── ConfigReader.java
            
            │   ├── DriveManager.java
            
            │   ├── ExtentReportManager.java
            
            │   ├── TestListener.java
            
            │   └── Utils.java
            
            │
            
            ├── BasePage.java
            
            └── RestAssuredApi.java
            

src

└── test

    └── java
    
        └── org/example
        
            ├── tests
            
            │   ├── ApiTest.java
            
            │   ├── ChatTest.java
            
            │   ├── LanguageTest.java
            
            │   ├── MainTest.java
            
            │   ├── RemoveFromCartTest.java
            
            │   └── SearchResultsTest.java
            
            │
            
            └── BaseTest.java
            

test-output

└── ExtentReport.html


pom.xml

testng.xml


**გატესტილი ფუნქციონალები:**

1.	ელემენტის ფერის შემოწმება
2.	საიტის ენის ცვლილება
3.	პროდუქტის ძიება და კალათაში დამატება
4.	კალათიდან პროდუქტის წაშლა
5.	ჩატის გახსნა და ტექსტის გაგზავნა
6.	API ტესტირება: სტატუს კოდის შემოწმება



