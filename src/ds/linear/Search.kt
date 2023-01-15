package ds.linear

fun main(){
    val array = arrayOf(1,2,3,5,6,7,9)
    println(array.search(5))
}

// linear search, time complexity is 0(n)
fun <T> Array<T>.search(key:T):Boolean{
    for(i in this.indices){
        if(this[i] == key){
            return true
        }
    }
    return false
}