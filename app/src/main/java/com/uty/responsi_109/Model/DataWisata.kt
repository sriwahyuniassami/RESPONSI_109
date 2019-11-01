package com.uty.responsi_109.Model

import com.uty.responsi_109.R

object DataWisata {
    private val wisata = arrayOf(
        "Ampera",
        "Benteng Kuto Basak",
        "Bukit Siguntang",
        "Danau Ranau",
        "Kebun Teh Dempo",
        "Masjid Agung",
        "Museum Sultan Mahmud Badaruddin",
        "Pulau Kemaro",
        "Punti Kayu",
        "Tangga 2001"
    )
    private val deskripsi = arrayOf(
        "Jembatan Ampera sudah menjadi ikon dari Kota Palembang. Jembatan ini mulai dibangun pada bulan April tahun 1962",
        "Benteng Kuto Besak merupakan bangunan peninggalan keraton kesutanan palembang yaitu Sultan Mahmud Badaruddin I.",
        "Bukit ini merupakan tempat sakral yang menyimpan cerita dan kisah dari Kerajaan Sriwijaya",
        "Asal mula dari danau ini terbentuk akibat dari letusan gunung yang sangat dahsyat sehingga mencipatakan sebuah cekungan besar",
        "Hamparan ladang petani dan hijaunya kebun teh menjadikan Gunung Dempo layaknya bidadari bagi pariwisata Sumatera Selatan",
        "Masjid Agung Sultan Mahmud Badaruddin I atau biasa disebut Masjid Agung Palembang adalah sebuah masjid paling besar di Kota Palembang, Sumatra Selatan",
        "Museum ini didirikan di bekas bangunan rumah residen kolonial Sumatra Selatan abad ke-19",
        "Pulau Kemaro, merupakan sebuah delta kecil di Sungai Musi, terletak sekitar 6 km dari Jembatan Ampera",
        "Taman Wisata Alam Punti Kayu Palembang adalah sebuah hutan wisata dan rekreasi keluarga. Kawasan hutan penghasil oksigen segar ini berada di tengah Kota Palembang",
        "Tangga 2001 memang didesain khusus untuk objek wisata dan sekaligus tempat olahraga terapi pengobatan telapak kaki"
    )

    private val gambar = intArrayOf(
        R.drawable.ampera,
        R.drawable.benteng_kuto_asak,
        R.drawable.bukit_siguntang,
        R.drawable.danau_ranau,
        R.drawable.kebun_teh_dempo,
        R.drawable.masjid_agung,
        R.drawable.museum,
        R.drawable.pulau_kemaro,
        R.drawable.punti_kayu,
        R.drawable.tangga
    )
    val listWisata: ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in wisata.indices){
                val wst = Wisata()
                wst.wisata = wisata[position]
                wst.deskripsi = deskripsi[position]
                wst.gambar = gambar[position]
                list.add(wst)
            }
            return list
        }

}