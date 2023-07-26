function isInteger(age) {
  return Number.isInteger(parseInt(age));
}

function userInputValidation(){
	var isValidFirstName = validateUsername('firstName');
	var isValidLastName = validateUsername('lastName');
	var isValidAge = validateAge();
	if(!isValidFirstName || !isValidLastName || !isValidAge){
	    console.log("first name and last name cannot be null, age should be an integer.");
		return false;
	}else{
		return true;
	}

	
}

function validateAge(){
	let age = document.getElementById("age").value.trim();
	const ageError = document.getElementById('ageError');
	if(!isInteger(age)){
		ageError.textContent = "Age is invalid";
        return false;
	} else {
		ageError.textContent = "";
		return true;
	}
}

//if first name or last time is empty, show error, telling it is required
function validateUsername(inputName) {
    const usernameInput = document.getElementById(inputName);
    const usernameError = document.getElementById(inputName + 'Error');
    const usernameValue = usernameInput.value.trim();

    if (usernameValue === "") {
        usernameError.textContent = "Username is required";
        return false;
    } else {
        usernameError.textContent = "";
        return true;
    }
}


//Todo: validate email and phone number
