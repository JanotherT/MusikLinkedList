class DynamicPlaylist(songs : ArrayList<Song>) : Playlist(songs) {
    private var first :SongNode? = null
    private var last :SongNode? = null
    var newSongliste = songs
    private var liste = newSongliste.toArray()
    private var songlist = songliste.toArray()

    init {
        if(songliste != null)
            newSongliste.addAll(songliste)
        //System.arraycopy(songlist,0, liste, 0 , songlist.size)
    }

    private class SongNode(var nextSong: SongNode?,val song: Song)


    fun songHinzufuegen(obj: Song) {
        val runPointer = last

        while (runPointer?.nextSong != null) {
                runPointer.nextSong
        }
        runPointer?.nextSong = SongNode(null, obj)

    }

    fun songEntnehmen() :Any{
        val song = first?.song

        if(song == null) throw NoSuchElementException()
        newSongliste.removeAt(0)

        return song
    }

    fun zuruecksetzen()  {
        if(newSongliste != null)
            songliste.addAll(newSongliste)

        //System.arraycopy(liste, 0, songliste, 0, liste.size)
    }

    override fun gesamtspieldauerBerechnen(): Int = newSongliste.sumBy { it.spieldauer }

    override fun alleSongsSpielen() {
        for(s in newSongliste)
            s.abspielen()
    }


}