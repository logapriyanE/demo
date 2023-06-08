<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
    function addMark(){
    	var t= document.getElementById("T").value;
    	var e= document.getElementById("E").value;
    	var m= document.getElementById("M").value;
    	var s= document.getElementById("S").value;
    	var ss= document.getElementById("SS").value;
    	if(t == ""||t == null){
    		alert("Enter the Tamil Mark");
    		return false;
    	}
    	else if(e == ""||e == null){
    		alert("Enter the English Mark");
    		return false;
    	}
    	else if(m == ""||m == null){
    		alert("Enter the Maths Mark");
    		return false;
    	}
    	else if(s == ""||s == null){
    		alert("Enter the Science Mark");
    		return false;
    	}
    	else if(ss == ""||ss == null){
    		alert("Enter the Social Science Mark");
    		return false;
    	}
    }
</script>
</head>
<body>
<form action="Mark" method="post" onsubmit="return addMark()">
Tamil: <input type="number" name="T" id="T"><br>
English: <input type="number" name="E" id="E"><br>
Maths: <input type="number" name="M" id="M"><br>
Science: <input type="number" name="S" id="S"><br>
Social Science: <input type="number" name="SS" id="SS"><br>
Login <input type="submit">
</form>

</body>
</html>