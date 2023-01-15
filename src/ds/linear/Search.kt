package ds.linear

fun main() {
    val array = arrayOf(1, 2, 3, 5, 6, 7, 9)
    //println(array.search(5))

    val found = binarySearch(array, 0,array.size-1,2)
    println(found)
}

// linear search, time complexity is 0(n)
fun <T> Array<T>.search(key: T): Boolean {
    for (i in this.indices) {
        if (this[i] == key) {
            return true
        }
    }
    return false
}

// binary search time complexity is 0(log n)
tailrec fun binarySearch(array: Array<Int>, startIndex: Int, endIndex: Int, key: Int): Boolean {
    if (startIndex > endIndex) {
        return false
    }else{
        val midIndex = (startIndex + endIndex) / 2
        if (array[midIndex] == key) {
            return true
        }
        return if (key > array[midIndex]) {
             binarySearch(array, midIndex+1, endIndex, key)
        } else {
             binarySearch(array, startIndex, midIndex-1, key)
        }
    }
}