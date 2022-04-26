package com.example.recycleviewtaufan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mengiiskan data superhero sesuai yang kita inginkan
        //menggunakan perintah listof
        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                "Ant-Man",
                "Dengan setelan kostum berkemampuan luar biasa untuk mengecilkan diri dalam skala ekstrim dan meningkatkan kekuatan, Scott yang dulu adalah seorang pencuri ahli, kini berubah menjadi sosok superhero"
            ),
            Superhero(
                R.drawable.ironman,
                "Iron-Man",
                "Dalam kunjungannya, Toni Stark tertangkap dan disandera oleh militan Afghanistan. Di dalam goa, diam-diam ia membangun sebuah senjata lapis baja anti peluru untuk melawan musuh dan meloloskan diri."
            ),
            Superhero(
                R.drawable.dokter,
                "Doctor Strange",
                "Dr. Stephen Strange mengalami sebuah kecelakaan yang fatal yang merusak kemampuan motorik kedua tangannya. Demi kesembuhannya, ia mengunjungi seorang penyihir misterius bernama Ancient One di Tibet."
            ),
            Superhero(
                R.drawable.captain,
                "Captain America",
                "Steve Rogers, ditolak masuk militer karena tidak layak. Kecewa, ia kemudian menjadi relawan untuk sebuah program rahasia, yang membuatnya menjelma menjadi seorang prajurit luar biasa, Captain America."
            ),
            Superhero(
                R.drawable.clint,
                "Clint Barton",
                "Ketika orang tua Clint meninggal dalam kecelakaan mobil, dia dan saudaranya bergabung dengan sirkus keliling bernama Carson Carnival of Traveling Wonders. Di sinilah, mereka dilatih oleh Trickshot dan menjadi penembak jitu yang ahli"
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Doktor Bruce Banner tak sengaja terpapar radiasi gamma dan memiliki efek samping sangat unik. Setiap amarahnya memuncak, Bruce berubah menjadi sesosok monster hijau rakasa yang siap mengamuk."
            ),
            Superhero(
                R.drawable.panter,
                "Black Panther",
                "Ketika Wakanda berada dalam ancaman dua musuh berbahaya yang dapat mengancam keselamatan negara, Black Panther berusaha membuktikan diri sebagai raja sejati Wakanda."
            ),
            Superhero(
                R.drawable.spiderman,
                "Spiderman",
                "Peter Parker, remaja yatim piatu yang tinggal bersama bibi dan pamannya, tak sengaja digigit laba-laba modifikasi genetika beracun mematikan. Namun, kekuatan luar biasa justru muncul dalam dirinya."
            ),
            Superhero(
                R.drawable.thor,
                "Thor",
                "Ketika Thor yang arogan mengacaukan gencatan senjata antara Asgardians dan Giants Frost, Odin sang raja Asgard membuangnya ke bumi. Kini, Thor harus membuktikan bahwa dirinya layak atas takdirnya."
            ),
            Superhero(
                R.drawable.widow,
                "Black Widow",
                "Natasha Romanoff alias Black Widow harus menghadapi sisi gelap hidupnya saat sebuah konspirasi berbahaya dikaitkan dengan masa lalunya."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this,superherolist){

        }
    }
}