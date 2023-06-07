fun main(args: Array<String>) {
       
    val strs = arrayOf("eat","tea","tan","ate","nat","bat")
    groupAnagrams(strs)
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = HashMap<String,MutableList<String>>()
    for (str in strs) {
        val key = String(str.toCharArray().sortedArray())
        if (!map.containsKey(key)) {
            map[key] = mutableListOf()
        }
        map[key]?.add(str)
    }
    return map.values.toList()
        
}