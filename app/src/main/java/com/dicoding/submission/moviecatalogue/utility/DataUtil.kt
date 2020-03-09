package com.dicoding.submission.moviecatalogue.utility

import com.dicoding.submission.moviecatalogue.R
import com.dicoding.submission.moviecatalogue.model.Cast
import com.dicoding.submission.moviecatalogue.model.Movie
import com.dicoding.submission.moviecatalogue.model.TvShow

object DataUtil {

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


    fun initTvShowsData(): ArrayList<TvShow>{
        val tv1 = TvShow(
            R.drawable.poster_arrow,
            "Arrow",
            "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
            59,
            "2012",
            "42m",
            initCast("arrow",false),
            "Greg Berlanti",
            listOf("Crime","Drama","Mystery","Action","Adventure"),
            "Ended",
            R.drawable.network_thecw,
            "2019",
            "8",
            "10"
            )

        val tv2 = TvShow(
            R.drawable.poster_flash,
            "The Flash",
            "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
            68,
            "2014",
            "44m",
            initCast("flash",false),
            "Greg Berlanti",
            listOf("Drama","Sci-Fi"),
            "Returning Series",
            R.drawable.network_thecw,
            "2019",
            "6",
            "16"
            )
        val tv3 = TvShow(
            R.drawable.poster_doom_patrol,
            "Doom Patrol",
            "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
            66,
            "2019",
            "60m",
            initCast("doompatrol",false),
            "Jeremy Carver",
            listOf("Fantasy","Sci-Fi","Action","Adventure"),
            "Returning Series",
            R.drawable.network_dc,
            "2019",
            "1",
            "15"
            )
        val tv4 = TvShow(
            R.drawable.poster_gotham,
            "Gotham",
            "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
            69,
            "2014",
            "60m",
            initCast("gotham",false),
            "Bruno Heller",
            listOf("Fantasy","Drama","Crime"),
            "Ended",
            R.drawable.network_fox,
            "2019",
            "5",
            "12"
            )
        val tv5 = TvShow(
            R.drawable.poster_dragon_ball,
            "Dragon Ball",
            "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
            72,
            "1986",
            "25m",
            initCast("dragonball",false),
            "Akira Toriyama",
            listOf("Fantasy","Sci-Fi","Comedy","Action","Adventure"),
            "Ended",
            R.drawable.network_dragonball,
            "1986",
            "1",
            "153"
            )
        val tv6 = TvShow(
            R.drawable.poster_the_walking_dead,
            "The Walking Dead",
            "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
            73,
            "2010",
            "45m",
            initCast("walkingdead",false),
            "Frank Darabont",
            listOf("Drama","Sci-Fi","Fantasy","Action","Adventure"),
            "Returning Series",
            R.drawable.network_amc,
            "2019",
            "10",
            "16"
            )
        val tv7 = TvShow(
            R.drawable.poster_grey_anatomy,
            "Grey Anatomy",
            "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
            66,
            "2005",
            "43m",
            initCast("greyanatomy",false),
            "Shonda Rhimes",
            listOf("Drama"),
            "Returning Series",
            R.drawable.network_abc,
            "2019",
            "16",
            "18"
            )
        val tv8 = TvShow(
            R.drawable.poster_naruto_shipudden,
            "Naruto Shippuuden",
            "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
            77,
            "2007",
            "25m",
            initCast("naruto",false),
            "Masashi Kishimoto",
            listOf("Animation","Comedy","Drama"),
            "Ended",
            R.drawable.network_tvtokyo,
            "2015",
            "20",
            "87"
            )
        val tv9 = TvShow(
            R.drawable.poster_supernatural,
            "Supernatural",
            "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
            75,
            "2005",
            "45m",
            initCast("supernatural",false),
            "Eric Kripke",
            listOf("Mystery","Sci-Fi","Drama","Fantasy"),
            "Returning Series",
            R.drawable.network_thecw,
            "2019",
            "15",
            "13"
            )
        val tv10 = TvShow(
            R.drawable.poster_ncis,
            "NCIS",
            "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
            69,
            "2003",
            "45m",
            initCast("ncis",false),
            "Donald P. Bellisario",
            listOf("Action","Crime","Adventure","Drama"),
            "Returning Series",
            R.drawable.network_cbs,
            "2019",
            "17",
            "16"
            )

        return arrayListOf(tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10)
    }

    private fun initCast(name: String, isMovie: Boolean = true): List<Cast>{
        val listCast: List<Cast>
        if (isMovie){
            listCast = when (name){
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
                        "Edward Boyce",
                        R.drawable.adepo
                    ),
                    Cast(
                        "Wyatt Russell",
                        "Lewis Ford",
                        R.drawable.wyatt
                    ),
                    Cast(
                        "John Magaro",
                        "Lyle Tibbet",
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
        }else{
            listCast = when (name){
                "arrow" -> listOf(
                    Cast(
                        "Stephen Amell",
                        "Oliver Queen",
                        R.drawable.arrow_amell
                    ),
                    Cast(
                        "David Ramsey",
                        "John Diggle",
                        R.drawable.arrow_davidramsey
                    ),
                    Cast(
                        "Katie Cassidy",
                        "Laurel Lance",
                        R.drawable.arrow_katiecassidy
                    ),
                    Cast(
                        "Paul Blackthorne",
                        "Quentin Lance",
                        R.drawable.arrow_paulblackthrone
                    )
                )
                "flash" ->listOf(
                    Cast(
                        "Grant Gustin",
                        "Barry Allen",
                        R.drawable.flash_grantgustin
                    ),
                    Cast(
                        "Tom Cavanagh",
                        "Harrison Wells",
                        R.drawable.flash_cavanagh
                    ),
                    Cast(
                        "Carlos Valdes",
                        "Cisco Ramon",
                        R.drawable.flash_valdes
                    ),
                    Cast(
                        "Candice Patton",
                        "Iris West",
                        R.drawable.flash_patton
                    )
                )
                "doompatrol" -> listOf(
                    Cast(
                        "Timothy Dalton",
                        "Dr. Niles Caulder",
                        R.drawable.doom_dalton
                    ),
                    Cast(
                        "Matt Bomer",
                        "Larry Trainor",
                        R.drawable.doom_matt
                    ),
                    Cast(
                        "Brendan Fraser",
                        "Cliff Steele",
                        R.drawable.doom_brendan
                    ),
                    Cast(
                        "April Bowlby",
                        "Rita Farr",
                        R.drawable.doom_april
                    )
                )
                "gotham" -> listOf(
                    Cast(
                        "Ben McKenzie",
                        "Jim Gordon",
                        R.drawable.gotham_ben
                    ),
                    Cast(
                        "Donal Logue",
                        "Harvey Bullock",
                        R.drawable.gotham_logue
                    ),
                    Cast(
                        "David Mazouz",
                        "Bruce Wayne",
                        R.drawable.gotham_david
                    ),
                    Cast(
                        "Sean Pertwee",
                        "Alfred Pennyworth",
                        R.drawable.gotham_pertwee
                    )
                )
                "dragonball" -> listOf(
                    Cast(
                        "Masako Nozawa",
                        "Son Goku (voice)",
                        R.drawable.dragonball_masako
                    ),
                    Cast(
                        "Mayumi Tanaka",
                        "Krillin (voice)",
                        R.drawable.dragonball_mayumi
                    ),
                    Cast(
                        "Naoki Tatsuta",
                        "Oolong (voice)",
                        R.drawable.dragonball_naoki
                    ),
                    Cast(
                        "Toru Furuya",
                        "Yamcha (voice)",
                        R.drawable.dragonball_toru
                    )
                )
                "walkingdead" -> listOf(
                    Cast(
                        "Norman Reedus",
                        "Daryl Dixon",
                        R.drawable.walkingdead_norman
                    ),
                    Cast(
                        "Andrew Lincoln",
                        "Rick Grimes",
                        R.drawable.walkingdead_lincoln
                    ),
                    Cast(
                        "Chandler Riggs",
                        "Carl Grimes",
                        R.drawable.walkingdead_riggs
                    ),
                    Cast(
                        "Danai Gurira",
                        "Michonne",
                        R.drawable.walkingdead_danai
                    )
                )
                "greyanatomy" -> listOf(
                    Cast(
                        "Ellen Pompeo",
                        "Meredith Grey",
                        R.drawable.grey_ellen
                    ),
                    Cast(
                        "Justin Chambers",
                        "Alex Karev",
                        R.drawable.grey_justin
                    ),
                    Cast(
                        "James Pickens Jr.",
                        "Richard Webber",
                        R.drawable.grey_james
                    ),
                    Cast(
                        "Patrick Dempsey",
                        "Derek Shepherd",
                        R.drawable.grey_dempsey
                    )
                )
                "naruto" -> listOf(
                    Cast(
                        "Junko Takeuchi",
                        "Naruto Uzumaki (voice)",
                        R.drawable.naruto_junko
                    ),
                    Cast(
                        "Kazuhiko Inoue",
                        "Kakashi Hatake (voice)",
                        R.drawable.naruto_inoue
                    ),
                    Cast(
                        "Jouji Nakata",
                        "Baki (voice)",
                        R.drawable.naruto_nakata
                    ),
                    Cast(
                        "Akira Ishida",
                        "Gaara (voice)",
                        R.drawable.naruto_akira
                    )
                )
                "supernatural" -> listOf(
                    Cast(
                        "Jensen Ackles",
                        "Dean Winchester",
                        R.drawable.supernatural_jansen
                    ),
                    Cast(
                        "Jared Padalecki",
                        "Sam Winchester",
                        R.drawable.supernatural_jared
                    ),
                    Cast(
                        "Misha Collins",
                        "Castiel",
                        R.drawable.supernatural_misha
                    ),
                    Cast(
                        "Alexander Calvert",
                        "Belphegor",
                        R.drawable.supernatural_calvert
                    )
                )
                else -> listOf(
                    Cast(
                        "Mark Harmon",
                        "Leroy Jethro Gibbs",
                        R.drawable.ncis_mark
                    ),
                    Cast(
                        "David McCallum",
                        "Donald Mallard",
                        R.drawable.ncis_david
                    ),
                    Cast(
                        "Sean Murray",
                        "Timothy McGee",
                        R.drawable.ncis_sean
                    ),
                    Cast(
                        "Michael Weatherly",
                        "Tony DiNozzo",
                        R.drawable.ncis_michael
                    )
                )
            }
        }

        return listCast
    }
}