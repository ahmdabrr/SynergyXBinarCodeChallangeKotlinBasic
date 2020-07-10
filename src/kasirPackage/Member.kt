package kasirPackage

class Member: Pelanggan() {
    lateinit var namaMember: String

    fun inputNamaMember(){
        print("""
            -----------------------------
            Checkout Pelanggan Member
            -----------------------------
            Input Nama Member : 
        """.trimIndent())

        namaMember = readLine().toString()
    }

    override fun inputPembelianBarang() {

    }
}