package com.dicoding.submission.moviecatalogue.utility

import com.dicoding.submission.moviecatalogue.R
import com.dicoding.submission.moviecatalogue.model.Cast
import com.dicoding.submission.moviecatalogue.model.Movie

object MovieUtil {

    fun initMoviesData(): ArrayList<Movie>{
        val m1 = Movie(
            R.drawable.poster_avengerinfinity,
            "Avengers: Infinity War",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            83,
            "2018",
            "2h 29m",
            initCast("avengerinfinity"),
            "Joe & Anthony Russo",
            listOf("Adventure", "Action", "Sci-Fi")
        )

        val m2 = Movie(
            R.drawable.poster_aquaman,
            "Aquaman",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            68,
            "2018",
            "2h 24m",
            initCast("aquaman"),
            "James Wan",
            listOf("Adventure", "Action", "Fantasy")
        )

        val m3 = Movie(
            R.drawable.poster_serenity,
            "Serenity",
            "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
            52,
            "2019",
            "1h 42m",
            initCast("serenity"),
            "Steven Knight",
            listOf("Thriller", "Drama", "Mystery")
        )

        val m4 = Movie(
            R.drawable.poster_mortal_engines,
            "Mortal Engines",
            "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
            61,
            "2018",
            "2h 9m",
            initCast("mortalengines"),
            "Christian Rivers",
            listOf("Adventure", "Fantasy")
        )

        val m5 = Movie(
            R.drawable.poster_dragon,
            "How to Train Your Dragon: The Hidden World",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            77,
            "2019",
            "1h 44m",
            initCast("dragon"),
            "Dean DeBlois",
            listOf("Adventure", "Animation", "Family")
        )

        val m6 = Movie(
            R.drawable.poster_creed,
            "Creed II",
            "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
            68,
            "2018",
            "2h 10m",
            initCast("creed"),
            "Steven Caple Jr.",
            listOf("Drama")
        )

        val m7 = Movie(
            R.drawable.poster_overlord,
            "Overlord",
            "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
            66,
            "2018",
            "1h 50m",
            initCast("overlord"),
            "Julius Avery",
            listOf("Horror", "Sci-Fi", "WAR")
        )

        val m8 = Movie(
            R.drawable.poster_crimes,
            "Fantastic Beasts: The Crimes of Grindelwald",
            "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
            68,
            "2018",
            "2h 14m",
            initCast("fantasticbeasts"),
            "David Yates",
            listOf("Adventure", "Fantasy", "Family")
        )

        val m9 = Movie(
            R.drawable.poster_t34,
            "T-34",
            "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
            57,
            "2018",
            "2h 19m",
            initCast("t34"),
            "Alexey Sidorov",
            listOf("War", "Action")
        )

        val m10 = Movie(
            R.drawable.poster_bohemian,
            "Bohemian Rhapsody",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            80,
            "2018",
            "2h 15m",
            initCast("bohemian"),
            "Bryan Singer",
            listOf("Drama", "Music")
        )

        return arrayListOf(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10)
    }

    private fun initCast(moviename: String): List<Cast>{
        return when (moviename){
            "avengerinfinity" ->  listOf(
                Cast(
                    "Chris Evans",
                    "Steve Rogers",
                    R.drawable.evanscris
                ),
                Cast(
                    "Robert Downey Jr.",
                    "Tony Stark",
                    R.drawable.downeyrobert
                ),
                Cast(
                    "Chris Hemsworth",
                    "Thor",
                    R.drawable.crishemsworth
                ),
                Cast(
                    "Mark Ruffalo",
                    "Bruce Banner",
                    R.drawable.ruffalomark
                )
            )
            "aquaman" -> listOf(
                Cast(
                    "Jason Momoa",
                    "Aquaman",
                    R.drawable.momoajason
                ),
                Cast(
                    "Amber Heard",
                    "Mera",
                    R.drawable.heardamber
                ),
                Cast(
                    "Willem Dafoe",
                    "Nuidis Vulko",
                    R.drawable.dafoewillem
                ),
                Cast(
                    "Patrick Wilson",
                    "Ocean Master",
                    R.drawable.wilsonpatrick
                )
            )
            "serenity" -> listOf(
                Cast(
                    "Matthew McConaughey",
                    "Baker Dill",
                    R.drawable.mccounaughy
                ),
                Cast(
                    "Anne Hathaway",
                    "Karen Zariakas",
                    R.drawable.annehathaway
                ),
                Cast(
                    "Jason Clarke",
                    "Frank Zariakas",
                    R.drawable.jasonclarke
                ),
                Cast(
                    "Djimon Hounsou",
                    "Duke",
                    R.drawable.djimon
                )
            )
            "mortalengines" -> listOf(
                Cast(
                    "Hera Hilmar",
                    "Hester Shaw",
                    R.drawable.hera
                ),
                Cast(
                    "Robert Sheehan",
                    "Tom Natsworthy",
                    R.drawable.sheehan
                ),
                Cast(
                    "Hugo Weaving",
                    "Thaddeus Valentine",
                    R.drawable.weaving
                ),
                Cast(
                    "Jihae",
                    "Anna Fang",
                    R.drawable.jihae
                )
            )
            "dragon" -> listOf(
                Cast(
                    "Jay Baruchel",
                    "Hiccup (voice)",
                    R.drawable.baruchel
                ),
                Cast(
                    "America Ferrera",
                    "Astrid (voice)",
                    R.drawable.ferrera
                ),
                Cast(
                    "Cate Blanchett",
                    "Valka (voice)",
                    R.drawable.blanchett
                ),
                Cast(
                    "Craig Ferguson",
                    "Gobber the Belch (voice)",
                    R.drawable.craig
                )
            )
            "creed" -> listOf(
                Cast(
                    "Michael B. Jordan",
                    "Adonis Creed",
                    R.drawable.jordan
                ),
                Cast(
                    "Sylvester Stallone",
                    "Rocky",
                    R.drawable.stallone
                ),
                Cast(
                    "Dolph Lundgren",
                    "Ivan Drago",
                    R.drawable.lundgren
                ),
                Cast(
                    "Florian Munteanu",
                    "Viktor Drago",
                    R.drawable.florian
                )
            )
            "overlord" -> listOf(
                Cast(
                    "Jovan Adepo",
                    "Private First Class Edward Boyce",
                    R.drawable.adepo
                ),
                Cast(
                    "Wyatt Russell",
                    "Corporal Lewis Ford",
                    R.drawable.wyatt
                ),
                Cast(
                    "John Magaro",
                    "Private First Class Lyle Tibbet",
                    R.drawable.magaro
                ),
                Cast(
                    "Pilou Asbaek",
                    "Captain Wafner",
                    R.drawable.pilou
                )
            )
            "fantasticbeasts" -> listOf(
                Cast(
                    "Eddie Redmayne",
                    "Newt Scamander",
                    R.drawable.eddie
                ),
                Cast(
                    "Johnny Depp",
                    "Gellert Grindelwald",
                    R.drawable.depp
                ),
                Cast(
                    "Jude Law",
                    "Albus Dumbledore",
                    R.drawable.law
                ),
                Cast(
                    "Katherine Waterston",
                    "Porpentina Goldstein",
                    R.drawable.katherine
                )
            )
            "t34" -> listOf(
                Cast(
                    "Alexander Petrov",
                    "Ivushkin",
                    R.drawable.petrov
                ),
                Cast(
                    "Victor Dobronravov",
                    "Vasilenok",
                    R.drawable.dobronravov
                ),
                Cast(
                    "Vinzenz Kiefer",
                    "Klaus",
                    R.drawable.vinzenz
                ),
                Cast(
                    "Petr Skvortsov",
                    "Lykov",
                    R.drawable.petr
                )
            )
            else -> listOf(
                Cast(
                    "Rami Malek",
                    "Freddie Mercury",
                    R.drawable.rami
                ),
                Cast(
                    "Gwilym Lee",
                    "Brian May",
                    R.drawable.gwilym
                ),
                Cast(
                    "Ben Hardy",
                    "Roger Taylor",
                    R.drawable.benhardy
                ),
                Cast(
                    "Joseph Mazello",
                    "John Deacon",
                    R.drawable.mazello
                )
            )
        }
    }
}