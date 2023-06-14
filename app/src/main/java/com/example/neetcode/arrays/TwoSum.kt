fun main(args: Array<String>) {
   val nums  : IntArray = intArrayOf(2,7,11,15)
   val target : Int = 9
   twoSum(nums,target)

}


fun twoSum(nums: IntArray, target: Int) : IntArray {
        var hashMap = mutableMapOf<Int,Int>()
        for ((index,_) in nums.withIndex()) {
           if (hashMap.containsKey(target - nums[index]))  {
                  return intArrayOf(hashMap.get(target - nums[index])!!,index)
            } else {
            hashMap.put(nums[index],index)
            }
        }
        return intArrayOf(0,0)

}