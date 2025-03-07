package com.example.mercadolibreclonbedu

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.smarteist.autoimageslider.SliderView
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_my_account.view.*

class HomeFragment : Fragment() {

    private lateinit var btnMen : Button
    private lateinit var btnWomen : Button
    private lateinit var btnKids : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // infla el layout para este Fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        btnMen = view.findViewById(R.id.btnMen)
        btnWomen = view.findViewById(R.id.btnWomen)
        btnKids = view.findViewById(R.id.btnKids)

        // seteando el appbar como action bar
        (activity as AppCompatActivity).setSupportActionBar(view.shop_bar)
        val toolbar: Toolbar = view.findViewById(R.id.shop_bar) as Toolbar
        toolbar.setTitle("") //Ocultar el titulo por defecto

        btnMen.setOnClickListener{
            val bundle = Bundle()
            var listProducts = ArrayList<Product>()
            val imageList = arrayListOf<String>("https://m.media-amazon.com/images/I/61zR1uOYBQL._AC_SY395_.jpg", "https://www.beatnikshoes.com/wp-content/uploads/2017/05/Corso-Blues-1.jpg", "https://i.linio.com/p/5951918144c99a80f4d5b1db7a3afa8a-product.jpg")
            val sizesList = arrayListOf<String>("Height: 25 cm, Width: 20 cm, Heel: 5 cm", "Height: 29cm, Width: 22 cm, Heel: 5 cm", "Height: 34cm, Width: 24 cm, Heel: 5 cm")

            val imageList2 = arrayListOf<String>("https://static.dafiti.com.co/p/puma-3211-695701-1-product.jpg", "https://static.dafiti.com.co/p/puma-4907-9016801-1-product.jpg", "https://www.futbolemotion.com/imagesarticulos/145421/540/chaqueta-puma-ac-milan-stadium-2020-2021-negro-0.jpg")
            val sizesList2 = arrayListOf<String>("Height: 68 cm, Width: 45 cm, Heel: 100 cm", "Height: 70 cm, Width: 56 cm, Heel: 115 cm", "Height: 74 cm, Width: 72 cm, Heel: 125 cm")

            val imageList3 = arrayListOf<String>("https://ss237.liverpool.com.mx/xl/1091077815.jpg", "https://assets.adidas.com/images/h_840,f_auto,q_auto:sensitive,fl_lossy,c_fill,g_auto/d285610e30664900b857a7fa00ed0201_9366/Tenis_Superstar_Blanco_C77124_01_standard.jpg", "https://www.dpstreet.mx/wcsstore/ExtendedSitesCatalogAssetStore/images/catalog/zoom/1019110-0100V1.jpg")
            val sizesList3 = arrayListOf<String>("Height: 30 cm, Width: 20 cm, Heel: 5 cm", "Height: 32 cm, Width: 22 cm, Heel: 5 cm", "Height: 34 cm, Width: 24 cm, Heel: 5 cm")

            val imageList4 = arrayListOf<String>("https://http2.mlstatic.com/D_NQ_NP_937478-MLM31220133230_062019-O.jpg", "https://ss357.liverpool.com.mx/xl/1068658566.jpg", "https://cdn.shopify.com/s/files/1/0071/3850/8859/products/805289305026_1600x1067.png?v=1539209159")
            val sizesList4 = arrayListOf<String>("Height: 30 cm, Width: 20 cm, Heel: 5 cm", "Height: 32 cm, Width: 22 cm, Heel: 5 cm", "Height: 34 cm, Width: 24 cm, Heel: 5 cm")

            val imageList5 = arrayListOf<String>("https://allinoutfits.com/wp-content/uploads/Outfit-pantalon-beige-con-bolsillos-hombre.jpg", "https://i.pinimg.com/originals/48/a0/b0/48a0b0d03f401eabdb24b88b5158e4ec.jpg", "https://images-na.ssl-images-amazon.com/images/I/516Q7qJOisL._AC_UX342_.jpg")
            val sizesList5 = arrayListOf<String>("Height: 30 cm, Width: 20 cm, Heel: 5 cm", "Height: 32 cm, Width: 22 cm, Heel: 5 cm", "Height: 34 cm, Width: 24 cm, Heel: 5 cm")

            listProducts.add(Product("Men blue elegant shoes", "$450", 5f, 5, R.drawable.blue_shoes, imageList, sizesList))
            listProducts.add(Product("Men's jacket red and black", "$345",2.5f, 20, R.drawable.jacket, imageList2, sizesList2))
            listProducts.add(Product("Black men's casual sneakers", "$250",3.5f, 7, R.drawable.sneakers, imageList3, sizesList3))
            listProducts.add(Product("Brown Sunglasses", "$450",2.9f, 12, R.drawable.sunglasses_men, imageList4, sizesList4))
            listProducts.add(Product("Beige men pants", "$250",3.5f, 7, R.drawable.beige_pants, imageList5, sizesList5))
            val intent = Intent(activity, MainProductList::class.java)
            bundle.putParcelableArrayList("LISTA", listProducts)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btnWomen.setOnClickListener{
            val bundle = Bundle()
            var listProducts = ArrayList<Product>()
            val imageList = arrayListOf<String>("https://m.media-amazon.com/images/I/51d8XKNR0EL._AC_UL320_.jpg", "https://i.etsystatic.com/5998005/r/il/5a6624/1755302554/il_570xN.1755302554_kxaw.jpg", "https://ae01.alicdn.com/kf/HTB1k6CrLXXXXXafXXXXq6xXFXXXa/Summer-Short-Skirt-With-Safety-Undeware-Pastel-Pink-Mini-Skirts-Womens-Skater-Skirt-Pink-Tennis-Short.jpg")
            val sizesList = arrayListOf<String>("Height: 30 cm, Width: 20 cm, Heel: 5 cm", "Height: 32cm, Width: 22 cm, Heel: 5 cm", "Height: 34cm, Width: 24 cm, Heel: 5 cm")

            val imageList2 = arrayListOf<String>("https://www.sanborns.com.mx/imagenes-sanborns-ii/1200/7501768776495.jpg", "https://www.sanborns.com.mx/imagenes-sanborns-ii/1200/7501768776259_3.jpg", "https://www.sanborns.com.mx/imagenes-sanborns-ii/1200/88357026720_4.jpg")
            val sizesList2 = arrayListOf<String>("Height: 120 cm, Width: 60 cm, Heel: 55 cm", "", "")

            val imageList3 = arrayListOf<String>("https://http2.mlstatic.com/D_NQ_NP_942200-MLM46405114353_062021-W.jpg", "https://i.pinimg.com/originals/85/f1/7f/85f17f3c0f68e7d1788576bf3e91456b.jpg", "https://ss550.liverpool.com.mx/xl/1073562589_3p.jpg")
            val sizesList3 = arrayListOf<String>("Height: 30 cm, Width: 20 cm, Heel: 5 cm", "Height: 32 cm, Width: 22 cm, Heel: 5 cm", "Height: 34 cm, Width: 24 cm, Heel: 5 cm")

            val imageList4 = arrayListOf<String>("https://m.media-amazon.com/images/I/41IvBQH05BL._AC_UX342_.jpg", "https://images-na.ssl-images-amazon.com/images/I/41aocdM9AWL._AC_UX466_.jpg", "https://m.media-amazon.com/images/I/41C5MKsUPeL._AC_.jpg")
            val sizesList4 = arrayListOf<String>("Height: 30 cm, Width: 20 cm, Heel: 5 cm", "Height: 32 cm, Width: 22 cm, Heel: 5 cm", "Height: 34 cm, Width: 24 cm, Heel: 5 cm")

            val imageList5 = arrayListOf<String>("https://m.media-amazon.com/images/I/717qbfjfQcL._AC_UX385_.jpg", "https://m.media-amazon.com/images/I/71Mfm14UVhL._AC_UX342_.jpg", "")
            val sizesList5 = arrayListOf<String>("Height: 30 cm, Width: 20 cm, Heel: 5 cm", "Height: 32 cm, Width: 22 cm, Heel: 5 cm", "Height: 34 cm, Width: 24 cm, Heel: 5 cm")

            listProducts.add(Product("Lady pink skirt", "$150",4.5f, 6, R.drawable.skirt, imageList, sizesList))
            listProducts.add(Product("Weties pink female bag", "$1200",4.6f, 30, R.drawable.pink_bag, imageList2, sizesList2))
            listProducts.add(Product("Purple high heels", "$450",5f, 3, R.drawable.purple_highheels, imageList3, sizesList3))
            listProducts.add(Product("Dress blim women", "$750",3.3f, 10, R.drawable.blim_dress, imageList4, sizesList4))
            listProducts.add(Product("Red women blouse", "$350",1.5f, 15, R.drawable.red_blouse, imageList5, sizesList5))
            val intent = Intent(activity, MainProductList::class.java)
            bundle.putParcelableArrayList("LISTA", listProducts)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btnKids.setOnClickListener{
            val bundle = Bundle()
            var listProducts = ArrayList<Product>()
            val imageList = arrayListOf<String>("https://m.media-amazon.com/images/I/61Dpcl71A0L._AC_UX695_.jpg", "https://m.media-amazon.com/images/I/61gLPSwg6yL._AC_UL1300_.jpg", "https://m.media-amazon.com/images/I/81guaxyBdgL._AC_UL1500_.jpg")
            val sizesList = arrayListOf<String>("Height: 30 cm, Width: 20 cm, Heel: 5 cm", "Height: 32cm, Width: 22 cm, Heel: 5 cm", "Height: 34cm, Width: 24 cm, Heel: 5 cm")

            val imageList2 = arrayListOf<String>("https://http2.mlstatic.com/D_NQ_NP_875587-MLM43746811839_102020-W.jpg", "https://ss421.liverpool.com.mx/xl/1097923091_2p.jpg", "https://http2.mlstatic.com/D_NQ_NP_792632-MLM42813447432_072020-O.jpg")
            val sizesList2 = arrayListOf<String>("Height: 68 cm, Width: 45 cm, Heel: 100 cm", "Height: 70 cm, Width: 56 cm, Heel: 115 cm", "Height: 74 cm, Width: 72 cm, Heel: 125 cm")

            val imageList3 = arrayListOf<String>("https://m.media-amazon.com/images/I/51xNql1VPDL._AC_SX425_.jpg", "https://resources.claroshop.com/medios-plazavip/mkt/5f234dedb9314_poncho6jpg.jpg", "https://sc04.alicdn.com/kf/HTB1v2PfXynrK1RjSsziq6xptpXaZ.jpg")
            val sizesList3 = arrayListOf<String>("Height: 30 cm, Width: 20 cm, Heel: 5 cm", "Height: 32 cm, Width: 22 cm, Heel: 5 cm", "Height: 34 cm, Width: 24 cm, Heel: 5 cm")

            val imageList4 = arrayListOf<String>("https://resources.sears.com.mx/medios-plazavip/fotos/productos_sears1/original/2934154.jpg", "https://resources.sears.com.mx/medios-plazavip/fotos/productos_sears1/original/2934155.jpg", "https://http2.mlstatic.com/D_NQ_NP_812889-MLM46234475547_062021-W.jpg")
            val sizesList4 = arrayListOf<String>("Height: 30 cm, Width: 20 cm, Heel: 5 cm", "Height: 32 cm, Width: 22 cm, Heel: 5 cm", "Height: 34 cm, Width: 24 cm, Heel: 5 cm")

            val imageList5 = arrayListOf<String>("https://http2.mlstatic.com/D_NQ_NP_677508-MLM32786845669_112019-O.jpg", "https://gameplanet-53f8.kxcdn.com/media/catalog/product/cache/4/image/9df78eab33525d08d6e5fb8d27136e95/g/o/gorra-clasica-pikachu.jpg", "https://m.media-amazon.com/images/I/61tkSntxW-L._AC_SL1000_.jpg")
            val sizesList5 = arrayListOf<String>("Height: 30 cm, Width: 20 cm, Heel: 5 cm", "Height: 32 cm, Width: 22 cm, Heel: 5 cm", "Height: 34 cm, Width: 24 cm, Heel: 5 cm")

            val imageList6 = arrayListOf<String>("https://cdn1.coppel.com/images/catalog/pr/7060082-1.jpg", "https://http2.mlstatic.com/D_NQ_NP_958554-MLM28676975403_112018-O.jpg", "https://images-na.ssl-images-amazon.com/images/I/71LlVcSbxaL._AC_SY550_.jpg")
            val sizesList6 = arrayListOf<String>("Height: 30 cm, Width: 20 cm, Heel: 5 cm", "Height: 32 cm, Width: 22 cm, Heel: 5 cm", "Height: 34 cm, Width: 24 cm, Heel: 5 cm")

            listProducts.add(Product("Cocodrile's kid sandals", "$130",4.7f, 20, R.drawable.cocodrile_shoes, imageList, sizesList))
            listProducts.add(Product("Monsters inc pajamas", "$265",3.5f, 35, R.drawable.monster_inc, imageList2, sizesList2))
            listProducts.add(Product("Waterproof children jacket", "$120",4.5f, 4, R.drawable.waterproof_jacket, imageList3, sizesList3))
            listProducts.add(Product("Goody rain boots", "$150",3.5f, 10, R.drawable.boots_kid, imageList4, sizesList4))
            listProducts.add(Product("Pikachu cap", "$320",4.5f,20,  R.drawable.pikachu, imageList5, sizesList5))
            listProducts.add(Product("Cars bagpack", "$120",4.5f, 4, R.drawable.cars_bag, imageList6, sizesList6))

            val intent = Intent(activity, MainProductList::class.java)
            bundle.putParcelableArrayList("LISTA", listProducts)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        val imageSlider = view.findViewById<SliderView>(R.id.imageSlider)
        val imageList: ArrayList<String> = ArrayList()
        imageList.add("https://dam.vanidades.com/wp-content/uploads/2021/04/moda-tendencias-primavera-verano-2021-1-900x550.jpg")
        imageList.add("https://static1.abc.es/media/summum/2019/10/18/PRINCIPALjustufs_hansen-kCSC--620x349@abc.jpg")
        imageList.add("https://childrens-spaces.com/wp-content/uploads/2019/02/moda-infantil.jpg")
        setImageInSlider(imageList, imageSlider)
        return view
    }

    private fun setImageInSlider(images: ArrayList<String>, imageSlider: SliderView) {
        val adapter = MySliderImageAdapter()
        adapter.renewItems(images)
        imageSlider.setSliderAdapter(adapter)
        imageSlider.isAutoCycle = true
        imageSlider.startAutoCycle()
    }
    //Agregar el menú de opciones al AppBar
    override fun onCreateOptionsMenu(menu: Menu, menuInflater: MenuInflater){
        menuInflater.inflate(R.menu.toolbar_menu_home, menu)
        return super.onCreateOptionsMenu(menu,menuInflater)
    }
}