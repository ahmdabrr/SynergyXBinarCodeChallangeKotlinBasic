package kasirPackage

import kotlin.collections.ArrayList

class Member (val namaMember: String): Pelanggan() {
    private val arrayNama = ArrayList<String>()
    private val arrayHarga = ArrayList<Int>()
    private val arrayJumlah = ArrayList<Int>()

    override fun inputPembelianBarang() {
        do {
            println("""
            -----------------------------
            Checkout Pelanggan Member $namaMember
            -----------------------------
        """.trimIndent())

            print("Input Nama Barang : ")
            val nBarang = readLine()
            print("Input Harga Satuan Barang : ")
            val hBarang = readLine()
            print("Input Jumlah Barang : ")
            val jBarang = readLine()

            if (nBarang != null && hBarang != null && jBarang != null) {
                val belanjaan = Belanjaan(nBarang, hBarang.toInt(), jBarang.toInt())

                arrayNama.add(belanjaan.namaBarang)
                arrayHarga.add(belanjaan.hargaBrang)
                arrayJumlah.add(belanjaan.jumlahBarang)
            }

            print("""
                -----------------------------
                Input Barang lagi?
                Masukan Inputan (Y/T) :
            """.trimIndent())
            val inputan = readLine() !!
            val inputanChar : Char = inputan.single()
        } while (inputanChar == 'Y')

        hitungTotalBelanja()
    }

    override fun hitungTotalBelanja() {
        println("""
            -----------------------------
            Checkout Pelanggan Member $namaMember
            -----------------------------
        """.trimIndent())

        var totalBelanja = 0

        var i = 0
        while (i < arrayNama.size){
            val totalHargaBarang:Int = arrayJumlah[i]*arrayHarga[i]
            totalBelanja = totalBelanja+totalHargaBarang
            println("${arrayNama[i]} X ${arrayJumlah[i]}      : Rp. $totalHargaBarang")
            i++
        }

        println("""
            -----------------------------
            Total Belanja : Rp. $totalBelanja
            -----------------------------
        """.trimIndent())

        if (totalBelanja>50000) {
            val diskon = totalBelanja.toDouble() * 9.5 / 100
            totalBelanja = totalBelanja - diskon.toInt()
            println("""
                Selamat! karena total belanjaan
                $namaMember lebih besar dari Rp. 50000,
                maka mendapatkan potongan sebesar 9.5%

                $namaMember cukup membayar Rp. $totalBelanja
            """.trimIndent())
        }

        pembayaran(totalBelanja)
    }

    override fun pembayaran(totalBelanja: Int) {
        print("""
            -----------------------------
            Checkout Pelanggan Member $namaMember
            -----------------------------
            Total Belanja : Rp. $totalBelanja
            
            Input Uang Customer : Rp. 
        """.trimIndent())
        val uangCostumer = readLine()
        if (uangCostumer != null){
            if (uangCostumer.toInt() < totalBelanja) {
                print("Uang Costumer kurang")
            }else{
                val kembalian = uangCostumer.toInt() - totalBelanja
                    println("""
                    -----------------------------
                    Kembalian : Rp. $kembalian
                    -----------------------------
                    -Terima Kasih-
                """.trimIndent())
            }
        }
    }
}
