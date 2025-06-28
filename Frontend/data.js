//3.define 2 functions in one .js file and try to access them in another file
export let fun1 = (firstName,lastName)=>{
    let StudentName= firstName+" "+lastName; 
    console.log(`Student Name :${StudentName}`)
}
export let fun2=(age,loc,course)=>{
    console.log(`Age          :${age}\nloc          :${loc}\ncourse       :${course}`);
}
