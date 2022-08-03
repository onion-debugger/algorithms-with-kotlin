package `leetcode-problems`


/**
 * Problem statement #1480
 * Given an array `nums`. We define a running sum of an array as
 * `runningSum[i] = sum(nums[0]...nums[i])
 *
 * Return the running sums of `nums`
 *
 *
 * Examples
 * Input :=> [1, 2, 3, 4]
 * Output :=> [1, 3, 6, 10]
 */

fun runningSum(nums: IntArray) : IntArray {
    // create a result variable to store the value of each addition
    val result = mutableListOf<Int>()

    // setting up the assured values of the new result
    // the first value in `nums` array is ALWAYS present
    result.add(0, nums[0])

    // loop thru each element in the `nums` array and obtain each value
    for (numbers in nums.indices) {
        if (numbers != 0) {
            result.add(result[numbers - 1] + nums[numbers])
        }
    }

    // Alternative solution
    for (numbers in 1 until nums.size - 1) {
        nums[numbers] += nums[numbers - 1]
    }
    return result.toIntArray()
}


fun main() {
    val resultOfFunction = runningSum(intArrayOf(1, 2, 3, 4))
    val result = runningSum(intArrayOf(3, 1, 2, 10, 1))
    println(resultOfFunction.contentToString())
    println(result.contentToString())
}
