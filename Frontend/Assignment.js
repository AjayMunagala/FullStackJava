/* 


3.define 2 functions in one .js file and try to access them in another file


4.define a function that need to perform opertaion in asynchronous format and wait until all
objects came from collection
Instructions:
create a collection that contain atleast 10 object and perform all HTTP methods using axios+asyn/await

5.what is axios and fetch how to differntiate those?

6.what is Regularexpression and write email validations and mobile validation without HTML integration?
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
arr2 = [...arr2,...arr1,...arr3,...arr4];
console.log(arr2);



