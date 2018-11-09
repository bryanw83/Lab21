function validateInfo(){
	//1. get the text box value
	var first = document.getElementById("firstname").value;
	var last = document.getElementById("lastname").value;
	
	if (first.length <= 2){
		alert("Please enter a full first name!");
		document.getElementById("firstname").focus();
		return false;
	}
	if (last.length <= 2){
		alert("Please enter a full last name!");
		document.getElementById("lastname").focus();
		return false;
	}
}