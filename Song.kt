

open class Song(val titel: String, val interpret: String, val spieldauer: Int, bewertung_param : Int ) {

    var bewertung = bewertung_param
    set (value) {
        if(value < 0) field = 0
        else if (value > 100) field = 100
        else field = value
    }
    init {
        if(bewertung_param > 100) bewertung = 100
        else if(bewertung_param < 0) bewertung = 0
        else bewertung = bewertung_param
    }
    open fun abspielen(){

        var zahl : Int = (spieldauer/60)
        for(i in 0..zahl)
            println("Spiele: $titel von $interpret (Bewertung: $bewertung)")
    }

    fun aendernDerBewertung() {
       var bewertung1 = readLine()!!.toInt()!!

       if (bewertung1 < 0)
           println("Bewertung von $titel darf nicht kleiner als 0 sein")
       else if (bewertung1 > 100)
           println("Bewertung von $titel darf nicht kleiner als 100 sein")
       else
           bewertung = bewertung1
    }

  open fun suchbegriffPruefen(s : String): Boolean {
     val x = this.titel
     val y = this.interpret

       if((x.contains(s) || y.contains(s)))
           return true
       return false

  }


}