import algorithms.C1XorAlgorithm

class MainApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val array = arrayOf(9, 3, 9, 3, 9, 7, 9).toIntArray()

            val c1Xor = C1XorAlgorithm()
            c1Xor.execute(array)
            c1Xor.show()
        }
    }
}