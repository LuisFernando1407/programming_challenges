package algorithms

class C1XorAlgorithm {
    private var oXor = 0

    /*
      > Xor
        It is a logical operation between two operands that results in a true logical value if and only if the two operands are different

      > Commutativity
        A xor B = B xor A

      > Note (Xor)
        1º Two equal numbers returns 0
        2º Tells if two bits are different
        3º It is possible to do the reverse operation thus taking the value that underwent operation
    */
    fun execute(array: IntArray) {
        repeat(array.size){ index -> //O(n) Time
            this.oXor = this.oXor xor array[index] //O(1) Space
        }
    }

    fun show(){
        println("| ${this.oXor} |")
    }
}