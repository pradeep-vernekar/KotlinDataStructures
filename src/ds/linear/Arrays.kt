package ds.linear

fun main() {
    val array = arrayOf(1,2,3,4,5,6,7)
    array.reverse()
    println(array.joinToString())
}

// reverse array
fun <T> Array<T>.reverse(){
    var startIndex = 0
    var endIndex = this.size-1
    while (startIndex < endIndex){
        this.swap(startIndex,endIndex)
        startIndex++
        endIndex--
    }
}