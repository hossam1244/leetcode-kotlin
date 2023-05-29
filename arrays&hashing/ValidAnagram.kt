fun main(args: Array<String>) {
    val s : String = "anagram"
    val t : String = "nagaram"
    print(isAnagram(s,t))
}



fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) 
          return false

         var firstString = s.toCharArray().sorted()
        var secondString =  t.toCharArray().sorted()

         for (key in firstString)
 {
    print(key)
 }
println()
 for (key in secondString) {
    print(key)
 }
         for ((index,value) in firstString.withIndex()) {
            
               if (value != secondString.get(index))
                 return false
         }
    

        return true


}