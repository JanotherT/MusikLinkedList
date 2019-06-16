class SongMitAutoBewertung(titel : String, interpret : String, spieldauer: Int, bewertung_param : Int) : Song(titel, interpret, spieldauer, bewertung_param){

    override fun abspielen() {
        super.abspielen()
        bewertung++
    }


}