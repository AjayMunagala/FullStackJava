//2.write a program to practice lexical scope
let fun1=()=>{
    let a =10;
    let b = 20;
    let c= a+b;
    console .log(`sum of ${a} + ${b} is :`+(c));
    let fun2=(d)=>{
        let e = c*d;
        console.log(`Multiplication of ${c}+${d} is :`+ e) ;
    }
    fun2(6);
    
}
fun1();