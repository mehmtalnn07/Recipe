package com.mehmetalan.recipe.data

import com.mehmetalan.recipe.R
import com.mehmetalan.recipe.model.SoupCategory

object SoupCategoryDataSource {

    val soupList = listOf(
        SoupCategory(
            soupId = 1,
            soupImage = R.drawable.mercimek_corbasi,
            soupName = "Mercimek Çorbası",
            makingTime = "45 dk.",
            recipe = "Kırmızı mercimek çorbası için sıvı yağı tencereye alınarak yemeklik doğranan soğanlar hafif pembeleşinceye kadar kavrulur.\n" +
                    "Daha sonra un ilave edilerek kısık ateşte kavurmaya devam edilir.\n" +
                    "Salça kullanılacak ise salça ilave edilir, kavrulduktan sonra küp küp doğranmış havuç ve iyice yıkanıp suyu süzülen mercimekler ilave edilir.\n" +
                    "Üzerine su eklenerek karıştırılır ve tencerenin kapağı kapatılır. Çorbamız kaynayana kadar orta ateşte, kaynadıktan sonra mercimekler ve havuçlar yumuşayana kadar ara ara karıştırılarak kısık ateşte pişirilir.\n" +
                    "Çorba piştikten sonra el blenderı ile güzelce ezilir. Eğer blenderiniz yoksa süzgeçten de geçirebilirsiniz.\n" +
                    "Karabiber, tuz ve isteğe bağlı olarak kimyon eklenir ve karıştırılır. 5 dakika daha pişirilerek ocaktan alınır.\n" +
                    "Kıvamı koyu gelirse size, bir miktar su ilave edilerek bir taşım kaynatılır.\n" +
                    "Bu arada küçük bir tavaya iki yemek kaşığı tereyağı alınır, kızdırılır ve bir tatlı kaşığı kırmızı toz biber eklenerek ocaktan alınır.\n" +
                    "Mercimek çorbası servis kasesine alındıktan sonra üzerine kırmızı biberli sos gezdirilir ve bir dilim limon ile servis edilir.\n" +
                    "Mercimek çorbası tarifimi deneyeceklere şimdiden afiyet olsun.",
            materials = "2 su bardağı kırmızı mercimek\n" +
                    "1 adet soğan\n" +
                    "2 yemek kaşığı un\n" +
                    "1 adet havuç\n" +
                    "Yarım yemek kaşığı biber ya da  domates salçası (rengi kırmızı olsun isterseniz artırabilir ya da hiç kullanmayabilirsiniz)\n" +
                    "1 tatlı kaşığı tuz\n" +
                    "Yarım çay kaşığı karabiber\n" +
                    "1 çay kaşığı kimyon (isteğe bağlı)\n" +
                    "2 litre sıcak su\n" +
                    "5 yemek kaşığı sıvı yağ\n" +
                    "Sosu için:\n" +
                    "2 yemek kaşığı tereyağı\n" +
                    "1 tatlı kaşığı kırmızı toz biber"
        ),
        SoupCategory(
            soupId = 2,
            soupImage = R.drawable.ezogelin_corbasi,
            soupName = "Ezogelin Çorbası",
            makingTime = "55 dk.",
            recipe = "Tencereye tereyağı ve 1 yemek kaşığı sıvı yağ tencereye alınarak ısıtılır.\n" +
                    "Soğan ve sarımsak küçük küçük doğranır ve tencerede orta ateşte, soğanlar diriliğini kaybedinceye kadar kavrulur. Dilerseniz sarımsakları rendeleyerek de kullanabilirsiniz.\n" +
                    "Üzerine yıkanmış ve suyu süzülmüş olan kırmızı mercimek, pirinç ve bulgur eklenerek karıştırılır ve kavrulur.\n" +
                    "Üzerine sıcak su ilave edilerek tencerenin kapağı kapatılır ve pişmeye bırakılır. Çorba kaynayana kadar yüksek ateşte kaynadıktan sonra kısık ateşte ara ara karıştırılır.\n" +
                    "Bakliyatlar yumuşayınca kadar yaklaşık 35 dakika pişirilir ve ocak kapatılır.\n" +
                    "Ayrı bir yerde 2 yemek kaşığı sıvı yağ ısıtılır.\n" +
                    "1 yemek kaşığı un eklenir ve unun kokusu çıkana kadar karıştırılarak kavrulur.\n" +
                    "Üzerine 2 yemek kaşığı domates salçası eklenir, 1-2 dakika daha kavrulur.\n" +
                    "Salça da kavrulduktan sonra 2 su bardağı kadar su ilave edilerek kaynatılır.\n" +
                    "Nane, kırmızı biber, karabiber ilave edilerek hazırlanan sos ocaktan alınır ve çorbaya ilave edilir.\n" +
                    "Tuzu da eklenerek 1-2 dakika kaynatılır. Bu aşamada gerek duyarsanız sıcak su ekleyebilirsiniz. Ben 2,5 su bardağı kadar sıcak su ekledim ancak siz çorbanızın kıvamına göre ayarlayabilirsiniz.\n" +
                    "Yaklaşık 5 dakika daha kaynattıktan sonra Ezogelin Çorbamız servise hazır. Afiyet olsun.",
            materials = "1 yemek kaşığı sıvı yağ\n" +
                    "1 yemek kaşığı tereyağı\n" +
                    "1 adet kuru soğan\n" +
                    "2 diş sarımsak\n" +
                    "1 su bardağı kırmızı mercimek\n" +
                    "1 kahve fincanı bulgur (4 yemek kaşığı)\n" +
                    "Yarım kahve fincanı pirinç (2 yemek kaşığı)\n" +
                    "6 su bardağı sıcak su + 2,5 su bardağı sıcak su\n" +
                    "Sosu için;\n" +
                    "2 yemek kaşığı sıvıyağ\n" +
                    "1 yemek kaşığı un\n" +
                    "2 yemek kaşığı domates salçası\n" +
                    "2 su bardağı sıcak su\n" +
                    "1 tatlı kaşığı nane\n" +
                    "1 çay kaşığı kırmızı pul biber\n" +
                    "1 çay kaşığı karabiber\n" +
                    "1,5 tatlı kaşığı kadar tuz"
        ),
        SoupCategory(
            soupId = 3,
            soupImage = R.drawable.mantar_corbasi,
            soupName = "Mantar Çorbası",
            makingTime = "40 dk.",
            recipe = "Öncelikle soğanları ince ince doğrayalım.\n" +
                    "Ardından mantarları minik minik doğrayalım. Bu aşamada dilerseniz mantarlarınızı yıkayabilir, dilerseniz de silebilirsiniz.\n" +
                    "Tencereye sıvı yağ ve tereyağını alarak erimesi için bekleyelim.\n" +
                    "Eridikten sonra soğanları ekleyelim ve hafif pembeleşene kadar kavuralım.\n" +
                    "Mantarları da ekleyelim ve orta ateşte mantarlar suyunu salıp çekinceye kadar kavuralım.\n" +
                    "Daha sonra unu ilave edelim ve unun kokusu çıkana kadar kavuralım.\n" +
                    "Bir taraftan karıştırırken bir taraftan da suyumuzu ekleyelim ve orta ateşte çorbamızı kaynamaya bırakalım.\n" +
                    "Çorbamız kaynadıktan sonra altını kısalım ve oda ısısındaki sütü ve karabiberi ilave ederek karıştıralım ve kaynamaya bırakalım.\n" +
                    "Son kez tuzumuzu da ekleyelim ve karıştırarak çorbamızı ocaktan alalım.\n" +
                    "Çorbamızın sosu için tavaya tereyağını alalım ve eritelim.\n" +
                    "Eriyen tereyağına kırmızı toz biberi ekleyerek kızdıralım ve ocaktan alalım.\n" +
                    "Çorbamızı kaselere koyduktan sonra üzerine sosumuzdan gezdirelim. Dilerseniz sosu tencereye aktarabilir ve karıştırarak servis edebilirsiniz. Afiyet olsun!",
            materials = "2 adet kuru soğan\n" +
                    "10 adet mantar\n" +
                    "4 yemek kaşığı sıvı yağ\n" +
                    "1 yemek kaşığı tereyağı\n" +
                    "2 yemek kaşığı un\n" +
                    "1 litre sıcak su\n" +
                    "1 su bardağı süt\n" +
                    "Yarım çay kaşığı karabiber\n" +
                    "1 tatlı kaşığı tuz\n" +
                    "Sosu için;\n" +
                    "1 yemek kaşığı tereyağı\n" +
                    "1 tatlı kaşığı kırmızı toz biber"
        )
    )

}