package ds.linear

fun main() {
    val numArray = arrayOf(10,30,2,4,1,7)
    numArray.bubbleSort()
    println(numArray.joinToString())
}

// Sorting Algorithms time complexity O(n2)
// sort
fun <T:Comparable<T>> Array<T>.sort(){
    for(i in  this.indices){
        for (j in i until this.size){
            if(this[i] > this[j]) this.swap(i,j)
        }
    }
}

// Bubble sort
fun <T:Comparable<T>> Array<T>.bubbleSort(){
    if(this.size < 2) return
    var end = this.size -1
    for(i in this.indices){
        for(j in 0 until end){
            if(this[j] > this[j+1]) this.swap(j,j+1)
        }
        end--
    }
}



// selection sort

// insertion sort


// Generic extension function for swap index in array
fun <T> Array<T>.swap(firstIndex:Int,secondIndex:Int){
    val temp = this[firstIndex]
    this[firstIndex] = this[secondIndex]
    this[secondIndex] = temp
}