const allEmp = [
    {id:1, employName:"Sushil",DOB:"04_25_2003",isYoung:"YES"},
    {id:2, employName:"Mohan",DOB:"04_25_2001",isYoung:"YES"},
    {id:3, employName:"Sooraj",DOB:"04_25_2002",isYoung:"NO"},
    {id:4, employName:"Sanam",DOB:"04_25_2000",isYoung:"NO"},
    {id:5, employName:"Sujata",DOB:"04_25_2001",isYoung:"NO"},
    {id:6, employName:"Sandeep",DOB:"04_25_2003",isYoung:"YES"},
]
const result1 = allEmp.every(emp => emp.isYoung == "YES")
const result2 = allEmp.some(emp => emp.isYoung == "YES")

// console.log(result1)
// console.log(result2)



const object = {
    objName:"Table",
    objSize:"12*12",
    brand:"CEAT"
}

// Object.freeze(anyobject) method protects object from modification, deletion, addition of properties in an object.
Object.freeze(object)

// deletion of existed key-values
delete object.objName

// modification of existed properties
object.objName = "Chair"

// Add of new properties
object.comfortable =true


const dog = {
    name:"Husky",
    type:"siberian husky",
    lifetime:"10 years"
}

// Object.seal(anyobject) method used to protect an object from deletion and addition of new properties but we can modify the existed properties in an object

Object.seal(dog)

// deletion of existed properties
delete dog.lifetime

// modify existed properties
dog.name="Husky bhai"

// add new properties
dog.behavior = "friendly"

// console.log(dog)

// Converting string into hash code
function hashCode(str) {
    let hash = 0;
    
    for (let i = 0; i < str.length; i++) {
        const char = str.charCodeAt(i);
        hash =  hash + char;
        hash = hash & hash; // Convert to 32-bit integer
    }
    return hash;
}

const string = "Hello, World!";
// console.log(hashCode(string)); // Output: -1885530697



// Retrieving original data from hash code

function getOriginalData(target,credential){
    for(const n of credential){
        if(hashCode(n) === target){
            return n
        }
    }
    return null
}

const target = hashCode("Sushil")
const credential  = ["Sushil","Chaudhary"]
// console.log(getOriginalData(target,credential))


// ASCII code of all character 

const str = "Sushil"

for(const char in str){
    const asciicode = str.charCodeAt(char)
    console.log("ASCII code of "+str.charAt(char) + " is "+asciicode)
}

console.log(0b101) // output is 35
console.log(0o45) // output is 37
console.log(0xA) // output is 10

// In javascript we use 0b for binary, 0o for octal and 0x for hexadecimal