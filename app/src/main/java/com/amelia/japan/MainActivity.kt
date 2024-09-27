package com.amelia.japan

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.amelia.japan.adapter.DestinationAdapter
import com.amelia.japan.adapter.SightAdapter
import com.amelia.japan.model.Destination
import com.amelia.japan.model.Sight

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // RecyclerView untuk destinasi
        val recyclerViewDestination: RecyclerView = findViewById(R.id.recyclerViewDestination)
        recyclerViewDestination.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val destinationList = listOf(
            Destination("Osaka", R.drawable.osaka),
            Destination("Shinjiku", R.drawable.shinjiku),
            Destination("NaraPark", R.drawable.narapark),
            Destination("Otaru", R.drawable.otaru)
        )
        recyclerViewDestination.adapter = DestinationAdapter(destinationList)

        // RecyclerView untuk sights
        val recyclerViewSight: RecyclerView = findViewById(R.id.recyclerViewSight)
        recyclerViewSight.layoutManager = GridLayoutManager(this, 2)  // 2 kolom
        val sightList = listOf(
            Sight("Sensoji", "Asakusa", R.drawable.sensoji,"Tahun berdiri : 645M" , "Sensoji adalah kuil Buddha tertua dan paling terkenal di Tokyo, terletak di distrik Asakusa. Didirikan pada tahun 645 M, kuil ini merupakan salah satu situs spiritual yang paling dikunjungi di Jepang. Dikenal dengan Gerbang Kaminarimon yang ikonik, kuil ini menarik ribuan pengunjung setiap harinya, baik untuk berdoa maupun untuk menikmati suasana tradisional Jepang. Selain keindahan arsitektur kuil, area sekitarnya, terutama Nakamise-dori, penuh dengan toko-toko yang menjual suvenir khas dan makanan ringan tradisional. Sensoji juga menjadi pusat festival Sanja Matsuri yang terkenal, yang diadakan setiap tahun pada bulan Mei."),
            Sight("Kazanawa", "Tokyo", R.drawable.kazanawa, "Tahun berdiri : 780M","Kiyomizu-dera adalah salah satu kuil paling terkenal di Kyoto, dan dikenal sebagai Situs Warisan Dunia UNESCO. Didirikan pada tahun 780 di sebelah Air Terjun Otowa, kuil ini terkenal dengan pemandangan luar biasa yang dapat dinikmati dari panggung kayu yang berdiri di atas bukit. Nama \"Kiyomizu\" secara harfiah berarti \"air murni\", merujuk pada mata air di dekat kuil. Selain keindahan arsitektur tradisionalnya, kuil ini juga populer selama musim bunga sakura dan musim gugur ketika daun-daun berubah warna. Legenda juga mengatakan bahwa siapa saja yang melompat dari panggung kuil dan bertahan akan mendapatkan keinginan mereka terkabulkan (meskipun praktik ini sekarang dilarang)."),
            Sight("Fuji", "Kyoto", R.drawable.fuji, "Tahun berdiri : 711M","Jepang memiliki sejarah wisata yang kaya, dimulai dari periode Edo (1603-1868) ketika jalan-jalan seperti Tokaido menghubungkan kota-kota besar, memungkinkan para pelancong menikmati keindahan alam dan budaya. Dengan adanya sistem penginapan seperti ryokan, pengunjung bisa merasakan keramahan Jepang. Pada abad ke-19, pembukaan Jepang terhadap dunia luar membawa arus wisata internasional, dan saat ini, Jepang terus menjadi destinasi populer dengan kombinasi tradisi dan modernitas yang unik."),
            Sight("osaka ", "Osaka", R.drawable.osaka, "Tahun berdiri: Abad ke 16", "Osaka Castle adalah kastil megah yang dibangun pada akhir abad ke-16 oleh Toyotomi Hideyoshi, seorang daimyo besar Jepang. Kastil ini memainkan peran penting dalam penyatuan Jepang selama Periode Azuchi-Momoyama. Dengan arsitektur khas Jepang yang elegan dan dikelilingi oleh taman luas yang dipenuhi pohon sakura, Osaka Castle menjadi tempat favorit wisatawan, terutama saat musim bunga sakura. Saat ini, kastil ini menjadi museum yang menampilkan sejarah dan budaya Osaka, serta kisah Toyotomi Hideyoshi.")
        )
        recyclerViewSight.adapter = SightAdapter(sightList, this)


    }
}