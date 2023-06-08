<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function myFunction() {

		var user = document.getElementById("name").value;
		var age = document.getElementById("age").value;
		if (user == "" || user == null) {
			alert("please enter name");
			return false;
		}
		if (age == "" || age == null) {
			alert("please enter age");
			return false;
		}
		else if(age<=17){
			alert("your under age for vote");
			return false;
		}
		else if(age>=51){
			alert("your over age for vote");
			return false ;
		}
	}
</script>
</head>
<body>
 <form action="Age" onsubmit="return myFunction()" method="post">
		 <h2>LOGIN</h2>
        <label>User Name</label>
        <input type="text" name="name" id="name">
        <label>Age</label>
        <input type="number" name="age" id="age">
        <button type="submit">login</button>
        <a>forget password ?</a>
	</form>
</body>
</html>