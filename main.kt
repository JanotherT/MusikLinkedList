import javax.management.DynamicMBean

fun main (args : Array <String>) {

    val musikverwaltung = Musikverwaltung()

    val song1 = Song("Through Fire and Flames", "Dragonforce", 65, 120)
    val song2 = Song("DuDuDu", "Blackpink", 78, 80)
    val song3 = Song("Popstars", "KDA ", 128, 65)
    val song4 = Song("Lass Liegen", "Alligatoah", 87, 10)
    val song5 = Song("Want to", "Dua Lipa", 136, 56)
    val song6 = Song("Llegaste Tu", "Sofia Reyes", 233, 32)
    val song7 = Song("R.I.P", "Sofia Reyes", 532, 70)
    val song8 = Song("New Rules", "Dua Lipa", 180, 73)

    musikverwaltung.songHinzufuegen(song1)
    musikverwaltung.songHinzufuegen(song2)
    musikverwaltung.songHinzufuegen(song3)
    musikverwaltung.songHinzufuegen(song4)
    musikverwaltung.songHinzufuegen(song5)
    musikverwaltung.songHinzufuegen(song6)
    musikverwaltung.songHinzufuegen(song7)
    musikverwaltung.songHinzufuegen(song8)


    //song1.aendernDerBewertung()
    //festgelegte Songs
   // var playlist1 = arrayListOf<Song>(song1, song5, song4)
   //var playlist = arrayOf(song1, song4, song6)

   //for(song in playlist)
   //    song.abspielen()

    //var playlist = Playlist(musikverwaltung.songliste)
   //playlist.festlegenDerSongsBeimErzeugen()
   //playlist.alleSongsSpielen()


   //var playlist2 = Playlist(musikverwaltung.songliste)
   //playlist2.gesamtspieldauerBerechnen()

   ////rnd Songs
  //var rndPlaylist = Playlist(musikverwaltung.zufaelligePlaylistErzeugen(3))
  //rndPlaylist.alleSongsSpielen()

  //musikverwaltung.besterSong().abspielen()

  // do {
  //   println("Bitte geben Sie einen Suchbegriff ein")
  //   val benutzerEingabe = readLine().toString()

  //  musikverwaltung.songSuchen(benutzerEingabe)?.abspielen()

  //} while (benutzerEingabe != "stopp")

    var dynamic = DynamicPlaylist(ArrayList<Song>())
    DynamicPlaylist(dynamic.newSongliste).songHinzufuegen(Song("a", "", 12, 120))
    DynamicPlaylist(musikverwaltung.songliste).songHinzufuegen(Song("s", "", 100, 1))
    DynamicPlaylist(musikverwaltung.songliste).songHinzufuegen(Song("d", "", 45, 76))
   //DynamicPlaylist(musikverwaltung.songliste).songHinzufuegen(Song("f", "", 120, 13))
   //DynamicPlaylist(musikverwaltung.songliste).songHinzufuegen(Song("g", "", 300, 97))
   //DynamicPlaylist(musikverwaltung.songliste).songHinzufuegen(Song("h", "", 41, 134))
   //DynamicPlaylist(musikverwaltung.songliste).songHinzufuegen(Song("j", "", 78, 53))

    //DynamicPlaylist(musikverwaltung.songliste).songEntnehmen()
    //DynamicPlaylist(musikverwaltung.songliste).gesamtspieldauerBerechnen()
    DynamicPlaylist(dynamic.newSongliste).alleSongsSpielen()




}