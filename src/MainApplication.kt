import algorithms.C1XorAlgorithm
import algorithms.C2HashAlgorithm

class MainApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val array = arrayOf(9, 3, 9, 3, 9, 7, 9).toIntArray()
            val arrayMultipleValues = arrayOf(9, 3, 9, 3, 9, 7, 9, 8, 1).toIntArray()

            val c1Xor = C1XorAlgorithm()
            c1Xor.execute(array)
            c1Xor.show()

            val c2Hash = C2HashAlgorithm()
            c2Hash.execute(arrayMultipleValues)
            c2Hash.show()
        }
    }
}