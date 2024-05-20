package com.mehmetalan.recipe.data

import com.mehmetalan.recipe.R
import com.mehmetalan.recipe.model.FoodCategory

object FoodCategoryDataSource {

    val foodList = listOf(
        FoodCategory(
            foodId = 1,
            foodImage = R.drawable.karni_yarik,
            foodName = "Karnıyarık",
            makingTime = "50 dk.",
            recipe = "Patlıcanları çizgili soyup, yarım saat yağ çekmemesi için tuzlu suda bekletin.\n" +
                    "İyice yıkadıktan sonra suyunu havlu ile çektirin ve az yağda kızartın. 3 adet biberi de yağda kızartın.\n" +
                    "Daha sonra aynı tavada doğranmış soğanları kavurun, kıymayı ekleyerek bir müddet daha kavurun ve biberleri, sarımsağı ekleyerek 2 dakika daha kavurun.\n" +
                    "Küp küp doğramış olduğunuz 2 adet domatesi, tuzu, baharatları ekleyerek karıştırın.\n" +
                    "Üzerine bir çay bardağı su ekleyerek 5 dk kaynatın.\n" +
                    "Tepsiye patlıcanların ortalarını keserek yerleştirin ve bu kesiklerden patlıcanın içine bastırarak iç malzemesine yer açın ve malzeme ile patlıcanları doldurun.\n" +
                    "Doldurduğunuz patlıcanların üzerine ortadan ikiye kestiğiniz çeri domatesi ya da 1 adet domatesi eşit büyüklükte olacak şekilde paylaştırın ve kızarttığımız biberlerden birer tane koyun.\n" +
                    "Ayrı bir yerde 1 kaşık salçayı, 1 su bardağı sıcak suda ezerek patlıcanların aralarına dökün. Kıymalar çıkmasın diye üzerine dökmeyin.\n" +
                    "Daha sonra 170 derece de ısıttığınız fırına sürerek 20-25 dk pişirin. Dilerseniz bu işlemi pilav tenceresi gibi bir tencerede ocakta yapabilirsiniz. Aynı sürede tencerede de  pişecektir.\n" +
                    "Afiyet olsun..",
            materials = "6 adet küçük boy patlıcan (büyük ise ikiye bölebilirsiniz)\n" +
                    "3 adet sivri biber\n" +
                    "Kıymalı Harç İçin;\n" +
                    "2 adet orta boy soğan\n" +
                    "2 adet domates\n" +
                    "2 adet sivri biber\n" +
                    "2 diş sarımsak\n" +
                    "Sıvı yağ, tuz, karabiber, kırmızıbiber\n" +
                    "200 gr kıyma\n" +
                    "1 çay bardağı sıcak su\n" +
                    "Sosu İçin;\n" +
                    "1 yemek kaşığı salça\n" +
                    "1 su bardağı sıcak su"
        ),
        FoodCategory(
            foodId = 2,
            foodName = "Yaprak Sarması",
            foodImage = R.drawable.yaprak_sarmasi,
            makingTime = "35 dk.",
            recipe = "Öncelikle salamura yapraklar 2-3 dakika sıcak suda bekletilir, yıkanır ve süzgece alınır.\n" +
                    "Geniş bir kabın içerisine soğanlar rendelenir.\n" +
                    "Üzerine zeytinyağı dökülür.\n" +
                    "Pirinç yıkanarak  kabın içerisine eklenir.\n" +
                    "Baharatlar, salça ve tuzu da ilave edildikten sonra ince kıyılmış maydanozu da eklenerek karıştırılır.(çiğden bir iç harç olacak)\n" +
                    "Yaprağın geniş kısmına iç harçtan konulur ve rulo gibi iki yanlardan kapatarak sarılır. Bu işleme yaprak bitene kadar devam edilir.\n" +
                    "Sardığımız yaprakların üzerine zeytinyağı ve limon dilimleri ekleyip yaklaşık 5-6 su bardağı kadar da sıcak su ilave edilerek kısık ateşte pişirilir.(üzerine sarmalar dağılmasın diye tencere kapağından biraz küçük ebatta bir kase kapatabilirsiniz.)\n" +
                    "Afiyet olsun…",
            materials = "500 gram tokat yaprağı (salamura)\n" +
                    "1 adet limon\n" +
                    "Zeytinyağı\n" +
                    "İç harcı;\n" +
                    "2 orta boy kuru soğan\n" +
                    "1,5 su bardağı pirinç\n" +
                    "Maydanoz\n" +
                    "1 yemek kaşığı salça\n" +
                    "Karabiber\n" +
                    "Kırmızı pul biber\n" +
                    "Kimyon\n" +
                    "Nane\n" +
                    "Tuz\n" +
                    "2 yemek kaşığı sıvı yağ"
        ),
        FoodCategory(
            foodId = 3,
            foodName = "İçli Köfte",
            foodImage = R.drawable.icli_kofte,
            makingTime = "80 dk.",
            recipe = "Soğanlar ince ince doğranır. Tavaya sıvı yağ alınıp soğanlar eklenir ve pembeleşinceye kadar kavrulur.\n" +
                    "Kavrulan soğanlara Kıyma eklenir suyunu çekinceye kadar kısık ateşte kavrulur.\n" +
                    "Daha sonra salça eklenir 3 dk daha kavrulur. Biraz su eklenir tekrar (yumuşak kalması gerekiyor kuru olmamalı).\n" +
                    "Baharatlar, tuz, ceviz ve ince kıyılmış maydanoz eklenip ocağın altı kapatılır. Soğumaya bırakılır.\n" +
                    "İnce bulgur 1 bardak soğuk su ile kısır yapar gibi ıslatılır.\n" +
                    "Suyu çekilince irmik salça baharatlar tuz eklenip 15 dk boyunca azar azar suyu eklenip iyice yoğurulur.\n" +
                    "Daha sonra un eklenir 5 dk daha yoğurulur. Ele alınıp yuvarlandığında dağılmıyorsa tamamdır. Ele yapışabilir. Eller iyice yıkanır tekrar hamur ele alındığında yapışmaz.\n" +
                    "Cevizden biraz daha büyük parçalar alınıp baş parmak ile ara ara su alınarak içi ince bir şekilde açılır. İç koyulur ve yukarı doğru limon şeklinde uzatılır. Hepsine aynı işlem uygulanır.\n" +
                    "Aşamaları çekemedim çünkü ellerim hamurlu iken fotoğraf makinesini tutamadım.\n" +
                    "Biten içli köfteler kızgın 1 bardak sıvı yağda kızartılır.\n" +
                    "Bu ölçüden ortalama 18 adet çıkıyor. Yenilecek kısmı kızartılabilir, kalanı saklama kabı içerisinde derin dondurucuda saklanabilir.\n" +
                    "\n" +
                    "Haşlamak istiyorsanız bir tencerede kaynayan sıcak suya 2-3 parça küçük limon tuzu ve 1 tatlı kaşığı tuz ekleyin. İçli köfteleri içine bırakın. Haşlanan içli köfte üste çıkacaktır.\n" +
                    "\n" +
                    "Afiyet olsun.",
            materials = "Dışı için;\n" +
                    "1.5 su bardağı ince köftelik bulgur\n" +
                    "1 çay bardağı irmik\n" +
                    "1 tatlı kaşığı toz kırmızı biber\n" +
                    "1 tatlı kaşığı biber salçası\n" +
                    "1 su bardağından biraz az un\n" +
                    "1 çay kaşığı tuz\n" +
                    "1 su bardağı soğuk su\n" +
                    "İçi için;\n" +
                    "2 yemek kaşığı sıvı yağ\n" +
                    "300 gr kıyma\n" +
                    "3 orta boy soğan\n" +
                    "Yarım tatlı kaşığı salça\n" +
                    "Yarım demek maydanoz\n" +
                    "1 küçük çay bardağı küçük parçalı ceviz (isteğe bağlı)\n" +
                    "Tuz\n" +
                    "Pul biber\n" +
                    "Karabiber (baharatlar ve tuz isteğe göre ayarlanabilir.)\n" +
                    "Kızartmak için;\n" +
                    "Sıvı yağ"
        )
    )

}