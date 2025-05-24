<!DOCTYPE html>
<html >

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Send mail</title>
    <link rel="stylesheet" href="/css/style.css">

</head>

<body>
<h1> Sent mail to employees</h1>
<form action="/sendEmail/toEmployees" method="post" enctype="multipart/form-data">
    <label for="toE">Employee</label>
    <input type="email" id="toE" name="to" required><br><br>
    <label for="subjectE">Subject</label>
    <input type="text" id="subjectE" name="subject" required><br><br>
    <label for="textE">Message</label><br>
    <textarea id="textE" name="text" required></textarea><br><br>
    <label for="attachmentE">Attachment</label>
    <input type="file" id="attachmentE" name="attachment" required><br><br>
    <input type="submit" value="Send to Employees">
</form>
<h1> Sent mail to customers</h1>
<form action="/sendEmail/toCustomers" method="post" enctype="multipart/form-data">
    <label for="toC">Employee</label>
    <input type="email" id="toC" name="to" required><br><br>
    <label for="subjectC">Subject</label>
    <input type="text" id="subjectC" name="subject" required><br><br>
    <label for="textC">Message</label><br>
    <textarea id="textC" name="text" required></textarea><br><br>
    <label for="attachmentC">Attachment</label>
    <input type="file" id="attachmentC" name="attachment" required><br><br>
    <input type="submit" value="Send to Customers">
</form>
<h1> Sent mail to administrator</h1>
<form action="/sendEmail/toAdministrators" method="post" enctype="multipart/form-data">
    <label for="toA">Administrator</label>
    <input type="email" id="toA" name="to" required><br><br>
    <label for="subjectA">Subject</label>
    <input type="text" id="subjectA" name="subject" required><br><br>
    <label for="textA">Message</label><br>
    <textarea id="textA" name="text" required></textarea><br><br>
    <label for="attachmentA">Attachment</label>
    <input type="file" id="attachmentA" name="attachment" required><br><br>
    <input type="submit" value="Send to Administrator">
</form>
</body>

</html>