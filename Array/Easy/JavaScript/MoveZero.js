let prompt = require("prompt-sync")()
let arr = [1,0,2,3,2,0,0,4,5,1];

let temp = new Array(arr.length);
let index = 0;

for(let i=0; i<arr.length; i++){
    if(arr[i] !== 0){
        temp[index] = arr[i];
        index++;
    }
}

for(let i=0; i<index; i++){
    arr[i] = temp[i];
}

let nz = index;
for(let i=nz; i<arr.length; i++){
    arr[i] = 0;
}

for(let i=0; i<arr.length; i++){
    console.log(arr[i]);
}