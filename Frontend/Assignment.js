/* 










*/
/*1.write a program using rest 
case1:function name is MoreValues() pass atleast 5 values to a single paramter
*/
let MoreValues = (...values)=>{
    console.log(values);
}
MoreValues(10,20,34,23,45,56);

//case2: take 4 arrays that contains different datatype of values and merge thenm in a 2nd array
//spread operator
let arr1 = [1,2,3,4,5];
let arr2 = [{id:1},{name:"Ajay"}]
let arr3 = ["Apple","Orange","papaya","watermelon","StrawBerry"];
let arr4 = [true,false];
const result = [...arr2,arr1,arr3,arr4];
console.log(result);



