/*4.define a function that need to perform opertaion in asynchronous format and wait until all objects came from 
collection
Instructions:
create a collection that contain atleast 10 object and perform all HTTP methods using axios+asyn/await*/
//manual creating collection 
const users = [
  { id: 1, name: "vijay", age: 25, city: "Hyderabad" },
  { id: 2, name: "Kiran", age: 22, city: "Chennai" },
  { id: 3, name: "Sita", age: 28, city: "Mumbai" },
  { id: 4, name: "Rahul", age: 24, city: "Delhi" },
  { id: 5, name: "Anjali", age: 26, city: "Bangalore" },
  { id: 6, name: "Varun", age: 27, city: "Pune" },
  { id: 7, name: "Priya", age: 23, city: "Kolkata" },
  { id: 8, name: "Vikram", age: 30, city: "Jaipur" },
  { id: 9, name: "Meena", age: 21, city: "Ahmedabad" },
  { id: 10, name: "Ravi", age: 29, city: "Vizag" }
];
const data =(users)=>{
  return new Promise((resolve)=>{
    setTimeout(()=>{
      resolve(users)
    },1000)
  })

}

(async()=>{
  console.log("Retrieving Objects from Collection.......!" );
  let processData = users.map((sendData)=>data(sendData));
  let result = await Promise.all(processData);
  console.log(result);
  console.log("Retrieving objects completed...!")
})();

// Answer:-
// =========
// It is not possible to perform all HTTP methods using axios+asyn/await for user defined colllection Object,we need an API to perform those operations.