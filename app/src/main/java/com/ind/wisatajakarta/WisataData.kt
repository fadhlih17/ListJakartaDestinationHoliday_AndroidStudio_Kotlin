package com.ind.wisatajakarta

object WisataData {
    private val wisataNames = arrayOf(
        "Monumen Nasional",
        "Taman Mini Indonesia Indah",
        "Ragunan Zoo",
        "Taman Impian Jaya Ancol",
        "Museum Macan",
        "Museum Fatahillah",
        "Jakarta Aquarium",
        "Wisata Alam Mangrove",
        "Kota Tua Jakarta",
        "Setu Babakan"
    )

    private val wisataAddress = arrayOf(
        "Kecamatan Gambir, Jakarta Pusat, DKI Jakarta",
        "Kota Jakarta Timur, DKI Jakarta",
        "Kec Ps.Minggu, Kota Jakarta Selatan, DKI Jakarta",
        "Ancol, Kec.Pademangan, Kota Jkt Utara, DKI Jakarta",
        "AKR Tower,Kec Kb Jeruk, Jakarta Barat, DKI Jakarta",
        "Pinangsia, Kec Taman Sari, Kota Jakarta Barat, DKI Jakarta",
        "Tj.Duren Sel, Grogol petamburan, Jakarta Barat, DKI Jakarta",
        "Kamal Muara, Kec. Penjaringan, Jakarta Utara, DKI Jakarta",
        "Mangga Besar, Kec. Taman Sari, Jakarta Barat, DKI Jakarta",
        "Jagakarsa, Jakarta Selatan, DKI Jakarta"
    )

    private val wisataDesc = arrayOf(
        "Monumen Nasional yang umumnya dikenal dengan sebutan Monas merupakan ikon terpopuler di Jakarta. Monas didirikan sebagai wujud apresiasi atas perjuangan rakyat Indonesia dalam memperebutkan kembali kemerdekaan dari tangan para penjajah. Tempat ini sudah lama menjadi destinasi wisata yang difavoritkan masyarakat sekitar, bahkan seluruh warga Indonesia. Tidak hanya itu, bangunan bersejarah ini juga menjadi pusat pendidikan terbaik bagi penduduk Jakarta dan sekitarnya."+
        "\n\nTiket : Puncak monas -> dewasa (Rp. 15.000), mahasiswa (Rp. 8.000), anak-anak (Rp. 4.000) Cawan & museum -> dewasa (Rp. 5.000), mahasiswa (Rp. 3.000), anak-anak (Rp. 2.000)",

        "Taman Mini Indonesia Indah yang berlokasi di Jakarta Timur ini umumnya dikenal dengan sebutan TMII. Taman ini termasuk taman wisata dan rekreasi paling besar sekaligus paling baik di Indonesia. Luasnya mencapai 150 hektar. Hingga detik ini, TMII masih menjadi destinasi wisata utama yang ada di Jakarta. Setiap hari, banyak pengunjung yang datang terlebih saat musim liburan."+
        "\n\nAda berbagai tempat menarik yang bisa dikunjungi seperti 33 Anjungan Daerah, Bangunan Keagamaan, Taman Terbuka, Istana Anak, Taman Legenda Keong Emas, Snowbay Waterpark, Kereta Layang, Theater Imax Keong Emas, Kereta Api Mini, Kereta Gantung, Teater 4 Dimensi, 14 Museum, Tematik Flora & Fauna, Skyworld TMII, dan juga beragam fasilitas pendukung. Aneka sarana rekreasi itulah yang menjadikan TMII sebagai destinasi wisata terkemuka sejak pertama berdiri hingga sekarang."+
        "\n\nTiket : 25.000 per orang",

        "Ada juga Tempat wisata di Jakarta yang sangat edukatif dan diminati segala kalangan. Tempat tersebut adalah taman wisata Margastwa Ragunan. Kebun binatang Ragunan ini berlokasi di jakarta Selatan, tepatnya Pasar Minggu, daerah Ragunan. Ada beraneka ragam satwa di dalamnya, yakni sekitar 3000 ekor satwa bahkan lebih. Selain itu, tempat ini juga dikelilingi sekitar 50.000 pohon sehingga sensasi yang hadir di dalamnya begitu menyejukkan." +
        "\n\nDaya Tarik yang ada di taman Margasatwa Ragunan antara lain taman satwa anak, Pusat Primata Schmutzer, taman perahu angsa, kereta keliling, kuda tunggang, gajah tunggang, pentas satwa, dan lainnya. Selain itu, fasilitas yang tersedia juga sangat lengkap, misalnya toilet, tempat duduk, tempat makan, gaze \n\nTiket : Rp. 3.000 – Rp. 65.000 (tiket masuk – wahana)",


        "Taman Impian Jaya Ancol ini memiliki konsep wisata yang sangat terintegrasi. Maka, tidak heran jika di dalamnya terdapat banyak sekali objek wisata yang hits dan populer serta pas untuk semua kalangan. Saat ini, wahana yang tersedia di Ancol Jakarta sangat banyak dan beragam. Wahana-wahana tersebut dikelompokkan menjadi berbagai taman wisata tematik, seperti :Sea World, Ocen Ecopark, Dunia Fantasi, Ocean Dream Samudera, Gelanggang Samudera, Pantai, Dan lain-lain.\n" +
                "\nSelain itu, terdapat pula Dufan Ancol yang menyuguhkan beragam wahan menarik yang mana tidak semua tempat wisata memilikinya. Wahana tersebut antara lain Gajah Bledug, Kora-kora, Turangga-rangga, Bianglala, dan lainnya. Lalu, bagaimana dengan fasilitas pendukungnya? Semuanya lengkap di sini mulai dari rumah makan, toilet, musholah, ruang pertemuan, hotel, dan lain-lain.\n" +
                "\nTiket : Motor (Rp. 15.000 ), mobil (Rp. 25.000), bus (Rp. 45.000), wahana & objek wisata (mulai dari 15.000 – 1.000.000\n",

        "Museum Macan (Museum Of Modern And Contemporary Art In Nusantara) ini mengusung tema seni budaya. Artinya, Museum Macan tidak hanya sekadar tempat rekreasi, tetapi juga tempat art exhibition (pameran karya seni). Itulah kenapa tempat wisata ini sangat diminati wisatawan khususnya para penyuka seni.\n" +
                "\nKonsep serta penyajian karya di Museum Macan sangatlah bagus. Karya yang dipajang itu bukan sekadar lukisan, tetapi beraneka teknik, instalasi, dan medium. Selain itu, terdapat pula banyak spot foto yang keren. Fasilitas yang tersedia pun sangat lengkap, seperti karya seni tradisonal, karya seni modern, toko museum, ruang seni anak, cafe, toilet, area parkir, dan masih banyak lagi. Jadi, pengunjung baik anak-anak atau dewasa bisa menikmati sekaligus mempelajari semua karya yang ada di dalamnya\n" +
                "\nTiket : anak-anak (Rp. 80.000), pelajar (Rp. 90.000), dewasa (Rp. 100.000).",

        "Bangunan museum ini sangat unik sehingga menjadi daya tarik tersendiri bagi para pengunjung. Bentuknya menyerupai Istana Dam, Amsterdam, Belanda. Museum Sejarah Jakarta ini terdiri dari 2 bangunan, yaitu bangunan utama dan bangunan pendamping. Bangunan utama terletak di bagian timur-barat dan memiliki dua sayap. Sementara itu, bangunan pendamping dimanfaatkan sebagai ruang pengadilan, kantor, serta berbagai ruang bawah tanah.\n" +
                "\nAda banyak koleksi benda bersejarah pada masa penjajahan Belanda. Pada bangunan lantai satu menyajikan berbagai replika, misalnya perahu, prasasti, senjata-senjata tradisional, maket gedung, dan lainnya. Lalu, lantai dua menyajikan berbagai perabot rumah tangga (furniture), seperti kursi, meja, dan lemari yang dipakai pada masa pemerintahan Hindia-Belanda. Selain itu, ada pula spot wisata yang asyik, seperti patung hukuman gantung, penjara-penjara yang berada di ruang bawah tanah, Meriam Si Jagur, dan lainnya\n" +
                "\nTiket : anak-anak (Rp. 2.000), mahasiswa (Rp. 3.000), dewasa (Rp. 5.000).",

        "Nama destinasi wisata ini sudah cukup menggambarkan bahwa Jakarta Aquarium adalah objek wisata yang edukatif untuk semua kalangan. Menariknya, tempat ini tergabung dengan pusat perbelanjaan sehingga pengunjung bisa bebas berwisata sekaligus berbelanja. Di sini, pengunjung akan tahu banyak hal tentang dunia hewan. Bahkan, pengunjung juga bisa eksplore aquarium sepuasnya.\n" +
                "\nAda berbagai jenis hewan di Jakarta Aquarium, mulai dari hewan darat hingga hewan air. Jumlah keseluruhan hewan mencapai lebih dari 3.500 spesies. Bahkan, pengunjung juga bisa melihat dan berinteraksi langsung dengan satwa cantik asal Indonesia, yakni sekitar 2000 satwa. Selain itu, terdapat pula banyak zona atraksi yang akan menemani oengunjung untuk bersenang-senang. Di antaranya adalah Otter Tunnel, Touch Pool, Aqua Trekking, Meerkat Feeding, dan lainnya\n" +
                "\nTiket :" +
                "Reguler -> anak-anak (weekdays Rp. 112.700, weekend Rp. 147.000), dewasa (weekdays Rp. 147.000, weekend Rp. 171.500)\n" +
                "Premium -> anak-anak (weekdays Rp. 147.000, weekend Rp. 171.500), dewasa (weekdays Rp. 196.000, weekend Rp. 220.500.",

        "Bagi para pecinta wisata alam, Mangrove yang terletak di Jakarta Utara, tepatnya Pantai Indah Kapuk ini sangat direkomendasikan. Panorama kawasan ini sangat indah, pun udaranya sangat sejuk. Tempat wisata ini tidak sekadar menyuguhi pengunjung tanaman Mangrove. Kenyataannya, pengunjung akan mendapatkan pengalaman berbeda dan menyenangkan selama berkeliling TWA Mangrove.\n" +
                "\nSelain itu, ada juga wisata air, taman wisata anak, dan spot lain yang akan memanjakan para pengunjung. Bahkan, tersedia pula camping ground atau penginapan dengan harga yang bervariasi. Semua fasilitas ada di sini, seperti toilet, rumah makan berbasis alam dan tradisional (menyerupai saung-saung), musholah, dan masih banyak lagi.\n" +
                "\nTiket : anak-anak (weekdays Rp. 15.000, weekend Rp. 20.000), dewasa (weekdays Rp. 30.000, weekend Rp. 35.000)",

        "Rekomendasi tempat wisata populer di Jakarta selanjutnya yaitu Kota Tua Jakarta. Warga Jakarta atau pendatang pasti tidak asing dengan tempat ini dan bahkan mungkin sering mengunjunginya. Kota Tua ini berlokasi di Jakarta Barat. Kawasannya dikelilingi berbagai museum serta gedung tua. Spot-spot di area tersebut menjadi favorit tersendiri bagi para warga yang berkunjung.\n" +
                "\nMenariknya, kawasan Kota Tua ini dilengkapi berbagai fasilitas. Yang paling diminati para pengunjung adalah jajanan khas serta bebrbagai restoran yang menawarkan aneka makanan Indonesia. Inilah salah satu faktor kenapa Kita Tua mendalatkan rating tinggi sebagai destinasi wisata Jakarta terbaik\n" +
                "\nTiket Masuk : –",

        "Jakarta juga mempunya destinasi wisata yang memperkenalkan kebudayaan betawi, yakni Setu Babakan. Objek wisata ini terletak di Srengseng Sawah, Jakarta Selatan. Area ini merupakan perkampungan yang kental dengan kebudayaan betawi. Artinya, pengunjung akan dikenalkan dengan aneka ragam kehidupan serta budaya orang betawi.\n" +
                "\nSetu Babakan juga menyajikan tempat pertunjukan. Wisatawan bisa melihat aneka ragam pertunjukan kesenian atau adat betawi. Misalnya, seni musik, Lenong, hingga pencak silat. Anda bisa menikmati keindahan danau serta semua fasilitas di dalamnya dengan biaya yang murah. Anda cukup mengeluarkan biaya untuk parkir saja. Selebihnya, Anda bisa megeksplore Setu Babakan sepuasnya\n" +
                "\nTiket : –",

    )

    private val wisataUrls = arrayOf(
        "https://www.museumnasional.or.id",
        "https://www.tamanmini.com",
        "https://ragunanzoo.jakarta.go.id",
        "https://www.ancol.com",
        "https://www.museummacan.org",
        "https://www.museumjakarta.com",
        "https://jakartaaquariumsafari.com",
        "https://www.jakartamangrove.id",
        "https://www.wisatakotatua.com",
        "http://www.setubabakanbetawi.com"
    )

    private val wisataTimes = arrayOf(
        "08.00 – 22.00 (setiap hari)",
        "06.00 – 18.00",
        "07.00 – 16.00 (Senin tutup)",
        "06.00 – 21.00 (setiap hari)",
        "10.00 – 16.00 (senin tutup)",
        "09.00-15.00 (senin tutup)",
        "10.00-20.00 (setiap hari)",
        "07.00 – 19.00 (setiap hari)",
        "06.00-22.00",
        "09.00 – 15.00 (senin dan hari libur nasional tutup)"
    )
    private val wisataPictures = intArrayOf(
        R.drawable.monas_sc,
        R.drawable.tmii,
        R.drawable.ragunan,
        R.drawable.ancol,
        R.drawable.museum_macan,
        R.drawable.museum_fatahillah,
        R.drawable.jakarta_aquarium,
        R.drawable.mangrove_jakarta,
        R.drawable.kotu,
        R.drawable.setubabakan_sc
    )

    val listData : ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in wisataNames.indices){
                val wisata = Wisata()
                wisata.nama = wisataNames[position]
                wisata.alamat = wisataAddress[position]
                wisata.deskripsi = wisataDesc[position]
                wisata.url = wisataUrls[position]
                wisata.jamBuka = wisataTimes[position]
                wisata.gambar = wisataPictures[position]
                list.add(wisata)
            }
            return list
        }
}