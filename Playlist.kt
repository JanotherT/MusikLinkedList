open class Playlist(songs : ArrayList<Song>) {
    val songliste = songs

    open fun gesamtspieldauerBerechnen(): Int = songliste.sumBy { it.spieldauer }
    //{
    // var summe = 0

    // for(s in songliste)
    //     summe += s.spieldauer

    // return summe
    //}



    open fun alleSongsSpielen() {
        for(s in songliste)
            s.abspielen()
    }

}