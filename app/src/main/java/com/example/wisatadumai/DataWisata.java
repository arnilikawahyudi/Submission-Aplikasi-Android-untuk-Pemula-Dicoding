package com.example.wisatadumai;

import java.util.ArrayList;

public class DataWisata {

    private static String[] namaWisata = {
            "Lancang Kuning",
            "Hutan Mangrove",
            "Bukit Gelanggang",
            "Hutan Wisata",
            "Kampung Teratai",
            "Pantai Koneng",
            "Pelabuhan Tpi",
            "Pantai Purnama",
            "Pulai Bungkuk",
            "Teluk Makmur"
    };

    private static String[] detailWisata = {
            "Jika anda ingin melihat simbol yang ada di Dumai, maka anda wajib melihat tugu lancing kuning. Tugu lancang kuning berada di sekitar taman bukit gelanggang, anda bisa mengunjunginya ketika sedang berada di area taman untuk melihat secara langsung tugu tersebut.",
            "Hutan Mangrove merupakan pemandangan yang bukan hanya melihat keindahannya tapi juga melihat betapa penting peran mangrove untuk lingkungan dan untuk fauna sekitar.",
            "Wisata yang satu ini cocok bagi Anda yang ingin menikmati suasa di sore hari. Anda bisa duduk sembari melihat keindahan taman dan sesekali mengambil foto dengan pose yang bagus. Sore hari akan menjadi waktu yang lebih nyaman karena cuaca yang sudah tak lagi panas.",
            "Hutan Wisata memang di khususkan untuk wisata. Anda bisa lo piknik bersama keluarga di hutan wisata yang satu ini. Bercerita tentang banyak hal sembari makan bekal piknik adalah cara terbaik bagi Anda yang ingin memiliki kedekatan dengan keluarga.",
            "Kampung Teratai merupakan pemandangan hijau dan udara sejuk di sekitar wisata membuat agenda liburan tidak membosankan. Anda  bisa datang kesini setelah pulang kerja dan butuh tempat untuk melepas penat.",
            "Pantai Koneng merupakan pemandangan alam destinasi alam ini cukup mengagumkan. Sangat cocok bagi Anda  yang gemar fotografi karena lanskap alamnya mendukung. Namun pengunjung tidak diperbolehkan berenang kecuali saat air sedang surut.",
            "Pelabuhan TPI Purnama memang cukup megah, dengan dua ponton untuk tempat sandar kapal. Anda  bisa memancing di area sekitar dermaga, tapi lumayan berbahaya karena pelabuhannya berayun-ayun.",
            "Pantai ini memancarkan kecantikan yang luar biasa. Untuk Anda yang ingin merasakan ketenangan maka mengunjungi pantai purnama juga tidak ada salahnya. Suara deburan ombak dan pemandangan pantai yang cantik mampu untuk menghipnotis anda.",
            "Nama pantai ini bermula saat salah satu warga menemukan pohon pulai di tepi pantai. Dahannya membungkuk ke arah laut dan tercetuslah nama Pulai Bungkuk. Sisi menarik pantai karena adanya spot-spot foto menarik dan ayunan di bibir pantai. Pengunjung juag bisa berenang, snorkeling, atau bermain sepeda air di kawasan wisata ini.",
            "Pantai Teluk Makmur memiliki sport terbaik untuk berfoto mungkin di area bebatuan yang indah. Anda bisa diduk semabari berpose dengan latar belakang birunya laut yang cantik.",
    };

    private static String[] hargaWisata = {
            "------",
            "------",
            "------",
            "------",
            "Rp. 10.000 - 15.000/Orang",
            "Rp. 10.000 - 15.000/Orang",
            "Rp. 10.000 - 15.000/Orang",
            "Rp. 10.000 - 15.000/Orang",
            "Rp. 10.000 - 15.000/Orang",
            "Rp. 10.000 - 15.000/Orang",
    };

    private static int[] gambarWisata = {
            R.drawable.lancang_kuning,
            R.drawable.hutan_mangrove,
            R.drawable.bukit_gelanggang,
            R.drawable.hutan_wisata,
            R.drawable.kampung_teratai,
            R.drawable.pantai_koneng,
            R.drawable.pelabuhan_tpi,
            R.drawable.pantai_purnama,
            R.drawable.pulai_bungkuk,
            R.drawable.teluk_makmur
    };

    static ArrayList<Wisata> getListData() {
        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position < namaWisata.length; position++) {
            Wisata wisata = new Wisata();
            wisata.setNama_wisata(namaWisata[position]);
            wisata.setDetail_wisata(detailWisata[position]);
            wisata.setPhoto(gambarWisata[position]);
            wisata.setHarga(hargaWisata[position]);
            list.add(wisata);
        }
        return list;
    }

}
