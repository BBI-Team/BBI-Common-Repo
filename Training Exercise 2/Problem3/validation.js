
function printError(elemId, hintMsg)
 {
    document.getElementById(elemId).innerHTML = hintMsg;
}

function validateForm() 
{
    
    var name = document.myForm.name.value;
    var email = document.myForm.email.value;
    var mobile = document.myForm.mobile.value;
   
    
    
    var nameError = emailError = mobileError = true;
    
    
    if(name == "")
    {
        printError("nameError", "Enter your name please ");
    } 
    else
     {
        var conditionName = /^[a-zA-Z\s]+$/;                
       
        if(conditionName.test(name) === false)
         {
            printError("nameError", "Please enter a valid name");
         }
        else 
         {
            printError("nameError", "");
            conditionName = false;
         }
     }
    

    if(email == "") 
    {
        printError("emailError", "Enter your email address please");
    } 
    else
     {
        
        var conditionEmail = /^\S+@\S+\.\S+$/;

        if(conditionEmail.test(email) === false) {
            printError("emailError", "enter a valid email address");
        } else{
            printError("emailError", "");
            conditionEmail = false;
        }
    }
    
    
    if(mobile == "") {
        printError("mobileError", "enter your mobile number");
    } else {
        var mobCondition = /^[1-9]\d{9}$/;
        if(mobCondition.test(mobile) === false) {
            printError("mobileError", "enter a valid 10 digit mobile number");
        } else{
            printError("mobileError", "");
            mobileError = false;
        }
    }
    
    
    
    
    
    if((nameError|| emailError || mobileError ) == true) 
    {
       return false;
    }

};
