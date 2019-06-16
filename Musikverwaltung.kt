import java.util.*
import kotlin.collections.ArrayList

class Musikverwaltung {
    val songliste = arrayListOf<Song>()

    fun songHinzufuegen(song : Song) {
     songliste.add(song)
    }

   fun songSuchen(x : String): Song? {
       for (s in songliste)
           if(s.suchbegriffPruefen(x))
               return s
       return null
       //return songliste[0]
   }


    fun besterSong() : Song  {
       //var zahl = 100
       //var x = true

       //while(x) {
       //    for (s in songliste) {
       //        if (s.bewertung == zahl)
       //            return s.titel
       //    }
       //    zahl--
       //}
       //    return ""
        var ranking = 0
        var besterSong = songliste[0]
        for (s in songliste) {
            if(s.bewertung > ranking) {
                ranking = s.bewertung
                besterSong = s
            }
        }
        return besterSong

    }

    fun zufaelligePlaylistErzeugen(size: Int) : ArrayList<Song> {

        var playList = arrayListOf<Song>()
        val zufallsGenerator = Random ()

        for(i in 0..(size-1)) {
            val zufallsZahl = zufallsGenerator.nextInt(songliste.size)
            playList.add(songliste[zufallsZahl])

        }

     // var songs = ""
     // var zahl = 0

     // for(s in songliste) {
     //     if(zufallsZahl >= zahl)
     //         songs = s.titel// + s.interpret
     //     //else
     //   //     songs = s.titel + s.interpret
     //     zahl++
     // }

        // zufallsSong += zufallsZahl

        return playList
    }

}