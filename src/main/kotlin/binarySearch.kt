/**
 * Binary search finds an element in a sorted array
 * @param: an array and a target number: Int
 * @return Int [index of the location where the target value is found]
 * */

fun binarySearch(arr: IntArray, target: Int): Int {
    // define the ranges
    var minimumValue = 0; var maximumValue = arr.size - 1
    var guess: Int

    // while there is something to search for
    while (minimumValue <= maximumValue) {
        // define the middle number
        guess = (minimumValue + maximumValue) / 2

        // if we have the target number
        // if the target isn't here, we check if the middle is less
        // than the value we are looking for, reset minimumValue
        // else reset maximumValue
        if (arr[guess] == target) {
            return guess
        } else if (arr[guess] < target) {
            minimumValue = guess + 1
        } else {
            maximumValue = guess - 1
        }
    }

    return -1
}

fun main() {
    val arr = intArrayOf(1, 3, 5, 8, 12, 17, 21)
    val list = intArrayOf(4, 8, 15, 16, 23, 42)
    val binarySearchResult = binarySearch(arr, target = 4)
    println(binarySearchResult)
    println(binarySearch(list, target = 23))
}
