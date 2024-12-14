package tr.com.nuritiras.ogrenmebirimi5uygulama6

class Dortgen {
    var kisaKenar: Int? = null
    var uzunKenar: Int? = null

    constructor(kisaKenar: Int) {
        this.kisaKenar = kisaKenar
        this.uzunKenar = kisaKenar
    }

    constructor(kisaKenar: Int, uzunKenar: Int) {
        this.kisaKenar = kisaKenar
        this.uzunKenar = uzunKenar
    }

    fun alanBul(): Int {
        return kisaKenar!! * uzunKenar!!
    }

}