# Automated Tests - Web site Task it!​ :man_technologist: :woman_technologist:

This automation project was created using Selenium WebDriver with Java and Junit and it's important to mention that the entire structure follows the Page Object pattern.

The test suite presents **2** validations, they are:

- ***Validate insertion of phone contact in account settings***
- **Validate insertion of email contact in account settings**

#### **Adjustments of directories in some project pages and in the CSV**

Below I will list some necessary adjustments regarding directories and the CSV file.

**Pages - Changes**

1. ***Web Page*** - Change the browser driver directory in the ***createChrome*** method to where your browser driver is located.
2. ***Base Page*** - In the ***screenshotArquivo*** variable, point to the directory where you want the evidence to be saved.
