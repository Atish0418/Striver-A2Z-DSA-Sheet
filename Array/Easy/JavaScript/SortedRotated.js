const prompt = require("prompt-sync")();

let arr = prompt("Enter array:").split(" ").map(Number);
let count = 0;
for(let i=0; i<arr.length; i++){
    let next = arr[(i+1)%arr.length];
    if(arr[i] > next){
        count++;
    }
}
console.log(count > 1 ? false : true);

