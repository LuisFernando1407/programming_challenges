package algorithms

class C2HashAlgorithm {
    private val hash = HashMap<Int, Int>() //O(n)

    /* f(n) = n + n + 1 + 1 + 1 + 1
    *  f(n) = 2n + 4
    *
    *  O(n)
    *
    * */
    fun execute(array: IntArray){
        repeat(array.size){ index -> //O(n)
            if((this.hash.size > 0) and this.hash.containsKey(array[index])){ //O(1) + 1
                this.hash.remove(array[index]) //O(1)
            }else{
                this.hash[array[index]] = array[index] //O(1)
            }
        }
    }

    fun show(){
        for(key in this.hash.keys){
            if(hash.size > 0){
                print("| ${this.hash[key]} ")
            }else{
                println("| ${this.hash[key]} |")
            }
        }
    }
}
