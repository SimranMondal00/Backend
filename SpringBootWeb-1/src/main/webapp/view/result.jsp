<%@page language="java" %>

<html>
  <head>
         <link rel="stylesheet" type="text/css" href="style.css">
     </head>
    <body>
      <!-- WAY 1
       <h2>Result is: <%= session.getAttribute("result") %></h2>
        -->

        <!-- WAY 2 -->
       <h2>Result is: ${result} </h2>

    </body>
</html>