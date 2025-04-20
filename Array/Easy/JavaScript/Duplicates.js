// // Brute force approach
// let arr = [1,1,2,2,2,3,3];
// let set = new Set();

// for(let i=0; i<arr.length; i++){
//     set.add(arr[i]);
// }

// // console.log(set);
// let index = 0;
// for(let i of set){
//     arr[index] = i;
//     index++;
// }

// arr.length = index;
// console.log(arr);


// Optimal approach
// let arr = [1,1,2,2,2,3,3];
// let i=0;

// for(let j=1; j<arr.length; j++){
//     if(arr[i] !== arr[j]){
//         arr[i+1] = arr[j];
//         i++;
//     }
// }

// arr.length = i+1;
// console.log(arr);

// OR

let arr = [1, 1, 2, 2, 2, 3, 3];
let i = 0, j=1;

while (j < arr.length) {
    if (arr[i] !== arr[j]) {
        i++;
        arr[i] = arr[j];
    }
    j++;
}

arr.length = i + 1;
console.log(arr);