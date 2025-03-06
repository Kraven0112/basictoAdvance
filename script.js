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

console.log(result1)
console.log(result2)