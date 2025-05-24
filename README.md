
# 📬 Spring Boot Mailing List Application
A simple Spring Boot web application for sending emails to different user groups — employees, customers, and administrators — with file attachments.

## 📦 Features
- ✅ Import email addresses from a CSV file on startup
- ✅ Store recipients in a database (using Spring Data JPA)
- ✅ Send emails with attachments
- ✅ Web interface with forms for sending to each user group

## 🛠️ Technologies Used
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Mail
- H2 / any relational database
- Maven

## 🧪 How It Works
1. On startup, the app reads `persons.csv` and stores data into database tables by user type.
2. Web UI allows selecting:
   - Recipient group (Employees / Customers / Administrators)
   - Subject
   - Message text
   - Attachment
3. Email is sent using Spring’s JavaMailSender with the specified attachment.

## 🧾 Example CSV Format
```csv
id,name,type,email
1,John Smith,employee,john.smith@example.com
2,Jane Doe,customer,jane.doe@example.com
3,Alice Admin,administrator,alice.admin@example.com

📝 To Do / Improvements
Add support for multiple recipients
Email preview before sending
Switch to real database (MySQL, PostgreSQL)
Add user authentication

📩 Author
Tamuna
GitHub: @Tamuna9

