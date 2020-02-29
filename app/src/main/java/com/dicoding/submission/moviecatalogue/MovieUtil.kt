package com.dicoding.submission.moviecatalogue

object MovieUtil {

    fun initMoviesData(): ArrayList<Movie>{
        val m1 = Movie(R.drawable.poster_avengerinfinity,
            "Avengers: Infinity War",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            83,
            "2018",
            "2h 29m",
            initCast("avengerinfinity"),
            "Joe & Anthony Russo",
            listOf("Adventure", "Action", "Sci-Fi")
        )

        val m2 = Movie(R.drawable.poster_aquaman,
            "Aquaman",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            68,
            "2018",
            "2h 24m",
            initCast("aquaman"),
            "James Wan",
            listOf("Adventure", "Action", "Fantasy")
        )

        val m3 = Movie(R.drawable.poster_birdbox,
            "Bird Box",
            "Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety..",
            69,
            "2018",
            "2h 4m",
            initCast("birdbox"),
            "Susanne Bier",
            listOf("Thriller", "Drama")
        )

        val m4 = Movie(R.drawable.poster_bumblebee,
            "Bumblebee",
            "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
            65,
            "2018",
            "1h 54m",
            initCast("bumblebee"),
            "Travis Knight",
            listOf("Adventure", "Action", "Sci-Fi")
        )

        val m5 = Movie(R.drawable.poster_dragon,
            "How to Train Your Dragon: The Hidden World",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            77,
            "2019",
            "1h 44m",
            initCast("dragon"),
            "Dean DeBlois",
            listOf("Adventure", "Animation", "Family")
        )

        val m6 = Movie(R.drawable.poster_creed,
            "Creed II",
            "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
            68,
            "2018",
            "2h 10m",
            initCast("creed"),
            "Steven Caple Jr.",
            listOf("Drama")
        )

        val m7 = Movie(R.drawable.poster_hunterkiller,
            "Hunter Killer",
            "Captain Glass of the USS Arkansas discovers that a coup d'état is taking place in Russia, so he and his crew join an elite group working on the ground to prevent a war.",
            64,
            "2018",
            "2h 2m",
            initCast("hunterkiller"),
            "Donovan Marsh",
            listOf("Action", "Thriller")
        )

        val m8 = Movie(R.drawable.poster_themule,
            "The Mule",
            "Earl Stone, a man in his eighties, is broke, alone, and facing foreclosure of his business when he is offered a job that simply requires him to drive. Easy enough, but, unbeknownst to Earl, he's just signed on as a drug courier for a Mexican cartel. He does so well that his cargo increases exponentially, and Earl hit the radar of hard-charging DEA agent Colin Bates.",
            66,
            "2018",
            "1h 57m",
            initCast("themule"),
            "Clint Eastwood",
            listOf("Crime", "Drama", "Thriller")
        )

        val m9 = Movie(R.drawable.poster_venom,
            "Venom",
            "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
            66,
            "2018",
            "1h 52m",
            initCast("venom"),
            "Ruben Fleischer",
            listOf("Sci-Fi", "Action")
        )

        val m10 = Movie(R.drawable.poster_preman,
            "Preman Pensiun",
            "After three years, the business of Muslihat (Epi Kusnandar), who has retired as a thug, has a problem. Sales decline. Muslihat also faces new problems when Safira (Safira Maharani), her only daughter, grows up in adolescence and begins to be visited by boys. A bigger problem: frictions between his former subordinates.",
            65,
            "2019",
            "1h 34m",
            initCast("preman"),
            "Aris Nugraha",
            listOf("Drama", "Comedy")
        )

        return arrayListOf(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10)
    }

    private fun initCast(moviename: String): List<Cast>{
        return when (moviename){
            "avengerinfinity" ->  listOf(
                Cast("Chris Evans","Steve Rogers", R.drawable.evanscris),
                Cast("Robert Downey Jr.","Tony Stark", R.drawable.downeyrobert),
                Cast("Chris Hemsworth","Thor", R.drawable.crishemsworth),
                Cast("Mark Ruffalo","Bruce Banner", R.drawable.ruffalomark))
            "aquaman" -> listOf(
                Cast("Jason Momoa","Aquaman", R.drawable.momoajason),
                Cast("Amber Heard","Mera", R.drawable.heardamber),
                Cast("Willem Dafoe","Nuidis Vulko", R.drawable.dafoewillem),
                Cast("Patrick Wilson","Ocean Master", R.drawable.wilsonpatrick))
            "birdbox" -> listOf(
                Cast("Sandra Bullock","Malorie Hayes", R.drawable.bullocksandra),
                Cast("Trevante Rhodes","Tom", R.drawable.rhodes),
                Cast("Rosa Zalazar","Lucy", R.drawable.zalazarrosa),
                Cast("Danielle Macdonald","Olympia", R.drawable.daniellemcdonald))
            "bumblebee" -> listOf(
                Cast("Hailee Steinfield","Charlie Watson", R.drawable.hailee),
                Cast("Jorge Lendeborg Jr.","Memo", R.drawable.jorge),
                Cast("John Cena","Agent Jack Burns", R.drawable.cena),
                Cast("Jason Ian Drucker","Otis Watson", R.drawable.drucker))
            "dragon" -> listOf(
                Cast("Jay Baruchel","Hiccup (voice)", R.drawable.baruchel),
                Cast("America Ferrera","Astrid (voice)", R.drawable.ferrera),
                Cast("Cate Blanchett","Valka (voice)", R.drawable.blanchett),
                Cast("Craig Ferguson","Gobber the Belch (voice)", R.drawable.craig))
            "creed" -> listOf(
                Cast("Michael B. Jordan","Adonis Creed", R.drawable.jordan),
                Cast("Sylvester Stallone","Rocky", R.drawable.stallone),
                Cast("Dolph Lundgren","Ivan Drago", R.drawable.lundgren),
                Cast("Florian Munteanu","Viktor Drago", R.drawable.florian))
            "hunterkiller" -> listOf(
                Cast("Gerard Butler","Captain Joe Glass", R.drawable.butler),
                Cast("Gary Oldman","CJCS Charles Donnegan", R.drawable.gary),
                Cast("Toby Stephens","Bill Beaman", R.drawable.toby),
                Cast("Common","RA John Fisk", R.drawable.common))
            "themule" -> listOf(
                Cast("Clint Eastwood","Earl Stone", R.drawable.clint),
                Cast("Bradley Cooper","Agent Colin Bates", R.drawable.cooper),
                Cast("Laurence Fishburne","Special Agent in Charge", R.drawable.fishburne),
                Cast("Michael Pena","Agent Trevino", R.drawable.pena))
            "venom" -> listOf(
                Cast("Tom Hardy","Venom", R.drawable.tom),
                Cast("Riz Ahmed","Riot", R.drawable.ahmed),
                Cast("Scott Haze","Roland Treece", R.drawable.haze),
                Cast("Reid Scott","Dan Lewis", R.drawable.reid))
            else -> listOf(
                Cast("Epy Kusnandar","Kang Mus", R.drawable.epy),
                Cast("Tya Arifin","Kinanti", R.drawable.tya),
                Cast("Soraya Rasyid","Imas", R.drawable.soraya),
                Cast("Sandi Tile","Amin", R.drawable.sandi))
        }
    }
}