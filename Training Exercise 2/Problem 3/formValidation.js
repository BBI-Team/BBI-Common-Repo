
function printError(elemId, hintMsg)
 {
    document.getElementById(elemId).innerHTML = hintMsg;
}

function validateForm() 
{
    
    var name = document.contactForm.name.value;
    var email = document.contactForm.email.value;
    var mobile = document.contactForm.mobile.value;
    var gender = document.contactForm.gender.value;
    
    
    var namErr = emErr = mobErr = true;
    
    
    if(name == "")
    {
        printError("namErr", "Enter your name please ");
    } 
    else
     {
        var conditionName = /^[a-zA-Z\s]+$/;                
       
        if(conditionName.test(name) === false)
         {
            printError("namErr", "Please enter a valid name");
         }
        else 
         {
            printError("namErr", "");
            conditionName = false;
         }
     }
    

    if(email == "") 
    {
        printError("emErr", "Enter your email address please");
    } 
    else
     {
        
        var conditionEmail = /^\S+@\S+\.\S+$/;

        if(conditionEmail.test(email) === false) {
            printError("emErr", "enter a valid email address");
        } else{
            printError("emErr", "");
            conditionEmail = false;
        }
    }
    
    
    if(mobile == "") {
        printError("mobErr", "enter your mobile number");
    } else {
        var mobCondition = /^[1-9]\d{9}$/;
        if(mobCondition.test(mobile) === false) {
            printError("mobErr", "enter a valid 10 digit mobile number");
        } else{
            printError("mobErr", "");
            mobErr = false;
        }
    }
    
    
    if(gender == "") {
        printError("genErr", "select your gender");
    } else {
        printError("genErr", "");
        genErr = false;
    }
    
    
    if((namErr || emErr || mobErr || genErr) == true) 
    {
       return false;
    }

};
