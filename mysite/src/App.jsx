export default function App (){
  return(
    <div className="min-h-[99.9vh] max-w-[1400px] mx-auto grid grid-cols-4 gap-y-5">
      {
        Array.from({length : 100}).map((el,i)=>{
          return (
          <div className="w-[300px] h-[400px] bg-gray-400 flex items-center justify-center rounded-xl">
              <div key={i} className="loader"></div>
          </div>)
        })
      }
    </div>
  )
}