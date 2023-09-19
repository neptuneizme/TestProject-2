<%
  String[] stringArray = (String[]) request.getAttribute("contact.checked");
%>
<!doctype html>

<html>
<head>
  <meta charset="UTF-8">
  <title>Huy Hoang's Java Servlets and JSP <3</title>
  <link rel="stylesheet" type="text/css" href="./Styles/style.css"/>
</head>
<body>
  <h1>Thanks for joining our email list</h1>
  <p>Here is the information that you entered:</p>
  <label>Email:</label>
  <span>${survey.user.email}</span>
  <br>
  <label>First Name</label>
  <span>${survey.user.firstName}</span>
  <br>
  <label>Last Name</label>
  <span>${survey.user.lastName}</span>
  <br>
  <label>Date of Birth</label>
  <span>${survey.user.dob}</span>
  <br>
  <label>How did you hear</label>
  <span>${how.display}</span>
  <br>
  <label>Contact info</label>
  <span>${contact.getContactViaString()}</span>
  <br>
  <span>${contact.getCheck()}</span>
  <br>


  <p>To enter another email address, click on the Black button in your browser or the Return button shown below.</p>
  <form action="" method="get">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
  </form>
</body>
</html>