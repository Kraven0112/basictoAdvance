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

console.log(dog)


