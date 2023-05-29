

fun main(args: Array<String>) {
    print(containsDuplicate(intArrayOf(1,2,2,1)))
}


fun containsDuplicate(nums: IntArray): Boolean {
    val hashmap = mutableMapOf<Int,Int>()

    for (num in nums) {
        if (hashmap.contains(num)) {
            return true
        } 

        hashmap.put(num,num)
        hashmap.
    }

    return false
}