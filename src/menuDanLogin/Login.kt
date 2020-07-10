package menuDanLogin

class Login {
    private val username: String = "MasAgus"
    private val password: String = "apaajaboleh"

    fun login(){
        print("""
            -----------------------------
            Selamat Datang di SYNRGY Mart
            -----------------------------
            +menudanlogin.Login Kasir+
            Username    : 
        """.trimIndent())
        val inputUsername = readLine()
        print("Password   : ")
        val inputPassword = readLine()
        print("--------------------------")

        if(inputUsername == username && inputPassword == password){
            Menu().menuCheckout(username)
        } else {
            print("Username atau Password salah")
            Menu().menu()
        }
    }
}