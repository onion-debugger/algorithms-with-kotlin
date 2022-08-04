package `leetcode-problems`

/*
* Problem statement #1672
* You are given an `m x n` integer grid `accounts` where
* `[accounts[i][j]]` is the amount of money the ith customer
* has in the jth bank. Return the wealth that the richest
* customer has.
*
*
* A customer's wealth is the amount of money they have in all their bank accounts.
*  The richest customer is the customer that has the maximum wealth.
*
* Inputs :=> [[1, 2, 3], [3, 2, 1]]
* Outputs :=> 6
* */

fun maximumWealth(accounts: Array<IntArray>) : Int {
    val result = mutableListOf<Int>()
    accounts.forEach {
        result.add(it.sum())
    }

    return result.maxOf { it }
}

fun main() {
    val accounts = arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5))
    val accountsTwo = arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1))
    println(maximumWealth(accounts))
    println(maximumWealth(accountsTwo))
}
