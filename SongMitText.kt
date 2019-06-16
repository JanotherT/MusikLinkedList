class SongMitText(titel : String, interpret : String, spieldauer : Int, bewertung_param : Int, val textZeile : String) : Song(titel, interpret, spieldauer, bewertung_param){

    override fun suchbegriffPruefen(s: String): Boolean {

        if((titel.contains(s) || interpret.contains(s) || textZeile.contains(s)))
            return true
        return false
    }
}