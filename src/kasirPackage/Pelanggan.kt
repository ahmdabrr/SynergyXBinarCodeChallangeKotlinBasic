package kasirPackage

abstract class Pelanggan{

    abstract fun inputPembelianBarang()

    abstract fun hitungTotalBelanja()

    abstract fun pembayaran(totalBelanja: Int)
}