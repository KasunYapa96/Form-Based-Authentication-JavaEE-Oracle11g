<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <!-- <script type = "text/javascript">
  function validate() {
      
      if( document.myForm.uid.value == "" ) {
         alert( "Please provide your name!" );
         document.myForm.Name.focus() ;
         return false;
      }
      if( document.myForm.pass.value == "" ) {
         alert( "Please provide your Email!" );
         document.myForm.EMail.focus() ;
         return false;
      }
      return( true );
  }
    </script>   --> 
<style>
body, html {
  height: 100%;
  margin: 0;
}

.bg {
    background-image: url("wp.png");
    height: 100%;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: 100%;
}
.no-background {
    background-image: url("images/blank.jpg");
}
</style>

</head>
<body>
<div class="bg">

<center>
<br><br><br><br><br><br><br><br><br><br><br>
<h2>Please login here</h2>

    <form action="Loginservlet" method="post" name="myForm" onsubmit = "return(validate());">
    
    	<table style="with: 50%">
    	
    			<tr>
					<td>USERNAME</td>
					<td><input type="text" name="uid" required="required"></td>
				</tr>
				<tr>
					<td>PASSWORD</td>
					<td><input type="password" name="pass" required="required"></td>
				</tr>
    	
    	</table>
    	
    	    <br>
         <input type="submit" name="submit" value="Login">
    </form>
    
    <br>
    
  <a href="Register.jsp">  
      <input type="submit" value="Create an account"/>  
     </a>
     </center>
</div>
</body>
</html>