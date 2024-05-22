let randomnumber=Math.floor(Math.random()*100)+1;
let attempts=0;
document.getElementById("submit-guess").addEventListener("click",function(){
const UserGuess=Number(document.getElementById("guess-input").value);
attempts++;
if(UserGuess< 1 || UserGuess > 100)
{
displaymessage("please Enter a number between 1 to 100");
}
else if(UserGuess > randomnumber){
displaymessage("Number is greater than Guessing")
}
else if(UserGuess < randomnumber){
displaymessage("Number is lower than Guessing")

}
else{
displaymessage(`congrats! you guess it in $ {attempts}attempts`)
ShowRestartButton();
}
}
);

document.getElementById("restart-game").addEventListener("click",function() {
 RestartGame () ; 
}

)
function displaymessage(message){
document.getElementById("message").textContent=message;

}function ShowRestartButton(){
document.getElementById("restart-game").style.display="block";
document.getElementById("submit-Guess").style.display="none";
}
function RestartGame(){
randomnumber=Math.floor(Math.random()*100)+1
attempts=0;

document.getElementById("guess-input").value="";
document.getElementById("message").textContent="";
document.getElementById("restart-game").style.display="none";
document.getElementById("guess-input").disable=false;
}