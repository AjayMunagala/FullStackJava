//max elemeent in the array?
let arr = [9,4,6,2];
let max = 0;
arr.forEach((ele)=>{
    if(ele > max){
        max = ele;
    }
})

//min element in array?
let min = arr[0];
console.log(max);
arr.forEach((ele)=>{
    if(ele < min)
        min = ele;
})
console.log(min);

//arrange element in ascending order?
for(i=0;i<arr.length; i++){
    for(j=0;j<arr.length;j++){
     if(arr[j]>arr[j+1]){
        temp = arr[j]
        arr[j]= arr[j+1];
        arr[j+1]=temp;
     }
}
} 
console.log(arr);

//Arrange the elements in descending order
for(i =0;i<arr.length;i++){
    for(j =0;j<arr.length;j++){
        if(arr[j]<arr[j+1]){
            temp = arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
}
console.log(arr);


//find the first ans last elemnet sum in array
console.log(arr[0] + arr[arr.length-1]);


let sum = ((a) => a[0] + a[a.length - 1])(arr);
console.log(sum);

//Adding between Elements
let tot =0
for(i=1;i<arr.length-1;i++){
        tot+= arr[i];
}
console.log(tot);