package menuDanLogin

import kasirPackage.Member
import kasirPackage.NonMember

class Menu {
    fun menu(){
        do {
            print("""
            -----------------------------
            Selamat Datang di SYNRGY Mart
            -----------------------------
            1. Login
            0. Keluar
            
            Masukan Pilihan : 
        """.trimIndent())

            var inputMenu = readLine()

            when(inputMenu){
                "1" -> Login().login()
                "0" -> print("Terimakasih Telah Mengakses Kami")
                else -> {
                    println("Inputan yang anda masukan tidak ada, silahkan masukan ulang")
                    print("Masukan pilihan menu (1/0) : ")
                    inputMenu = readLine()
                }
            }
        } while (inputMenu != "0")
    }

    fun menuCheckout(username:String) {
        print("""
            -----------------------------
            Selamat Datang $username
            -----------------------------
            1. Checkout Pelanggan
            0. Logout
            -----------------------------
            Masukan Pilihan : 
        """.trimIndent())

        when(readLine()){
            "1" -> checkoutPelanggan()
            "0" -> print("Terimakasih Telah Mengakses Kami")
        }
    }

    fun checkoutPelanggan(){
        print("""
            -----------------------------
            Checkout Pelanggan 
            -----------------------------
            1. Pelanggan Member
            2. Pelanggan Non-Member
            -----------------------------
            Masukan Pilihan :  
        """.trimIndent())

        when(readLine()){
            "1" -> {
                print(
                    """
                    -----------------------------
                    Checkout Pelanggan Member
                    -----------------------------
                    Input Nama Member : 
                """.trimIndent()
                )

                val namaMember = readLine().toString()
                Member(namaMember).inputPembelianBarang()
            }
            "2" -> NonMember().inputPembelianBarang()
        }
    }
}