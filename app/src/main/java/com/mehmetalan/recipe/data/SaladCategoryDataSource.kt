package com.mehmetalan.recipe.data

import com.mehmetalan.recipe.R
import com.mehmetalan.recipe.model.SaladCategory

object SaladCategoryDataSource {

    val saladList = listOf(
        SaladCategory(
            saladId = 1,
            saladImage = R.drawable.coban_salata,
            saladName = "Çoban Salata",
            makingTime = "5 dk.",
            recipe = "İlk olarak domatesleri küçük küçük doğrayın ve karıştırma kabına alın.\n" +
                    "Daha sonra soğanı da küçük küçük doğrayın ve üzerine tuz serpip elinizle güzelce ovun.\n" +
                    "İnce ince doğradığımız yeşil biber ve küçük küçük doğradığımız salatalığımızı da karıştırma kabına alalım.\n" +
                    "Son olarak maydanozu da ince ince doğrayalım ve doğradığımız diğer malzemelerimizin üzerine ekleyelim.\n" +
                    "Salatamızın zeytin yağını ve limon suyunu da ekledikten sonra güzelce harmanlayalım ve servis tabağına alarak servis edelim. Afiyet olsun.",
            materials = "4 adet domates\n" +
                    "1 adet soğan\n" +
                    "1 çay kaşığı tuz\n" +
                    "2 adet yeşil biber\n" +
                    "1 adet salatalık\n" +
                    "Maydanoz\n" +
                    "Limon suyu\n" +
                    "Zeytinyağı"
        ),
        SaladCategory(
            saladId = 2,
            saladImage = R.drawable.gavurdagi_salata,
            saladName = "Gavurdağı Salata",
            makingTime = "10 dk.",
            recipe = "Domatesler ve yeşil biber küçük küçük doğranır.\n" +
                    "Yeşil soğanlar ve maydanozlar da çok ince kıyılır.\n" +
                    "Kuru soğan mümkün olduğunca küçük doğranarak biraz tuzla ovulur.\n" +
                    "Bütün malzeme geniş bir kaba alınır, iri kırılmış cevizler, zeytinyağı ve nar ekşisi ilave edilir.\n" +
                    "Göz kararı yaklaşık 1 yemek kaşığı sumak da eklenir.\n" +
                    "Karıştırılarak servis tabağına alınır.\n" +
                    "Zeytinyağının ve nar ekşisinin miktarını kendi zevkinize göre ayarlayabilirsiniz, ben sevdiğim için oldukça bol kullanıyorum.\n" +
                    "Cevizi de yine neredeyse 1 su bardağına yakın ekliyorum.\n" +
                    "Harika bir salata, denemeyenlere tavsiye ederim. Şimdiden afiyet olsun…",
            materials = "3 adet domates\n" +
                    "1 adet yeşil biber\n" +
                    "1 adet kuru soğan\n" +
                    "3-4 dal taze soğan\n" +
                    "Maydanoz\n" +
                    "2 avuç iri kırılmış ceviz\n" +
                    "Zeytinyağı\n" +
                    "Nar ekşisi\n" +
                    "Sumak\n" +
                    "Tuz"
        ),
        SaladCategory(
            saladId = 3,
            saladImage = R.drawable.amasra_salata,
            saladName = "Amasra Salata",
            makingTime = "15 dk.",
            recipe = "Malzemelerimizden yeşillikleri elimle böldüm iri iri Amasra da da öle oluyor bilmem lezzeti ondanmı geliyor :) domates salatalık soğanı ince ince doğrayın özellikle tadını veren ise kırmızı lahana bence biraz tuzlu suda beklettim sıktım daha sonra ayrı bir kaba alıp yağ ve sirke koyup tadının sirke ve yağla harmanlanıp o güzel kokuyu vermesini sağladım deneyin bence salataya çok hoş bir lezzet veriyor diğer süslemeler görüldüğü gibi sosunu da hepsini bir kaba koyup mikserle yada el çırpıcısıyla karıştırıp üstüne lezzetleyebilirsiniz afiyet olsun.",
            materials = "Salatalık\n" +
                    "Domates\n" +
                    "Havuç\n" +
                    "Marul\n" +
                    "Kırmızı lahana\n" +
                    "Yeşil biber\n" +
                    "Maydanoz\n" +
                    "Roka (olmazsa olmazım )\n" +
                    "Kuru soğan\n" +
                    "Semizotu\n" +
                    "Dereotu\n" +
                    "Taze nane\n" +
                    "Beyaz turp\n" +
                    "Mısır\n" +
                    "Yeşil soğan\n" +
                    "Tere\n" +
                    "Lahana turşusu\n" +
                    "Kırmızı şeker pancarı kökü turşusu\n" +
                    "Limon\n" +
                    "Elma sirkesi\n" +
                    "Nar ekşisi\n" +
                    "Tuz\n" +
                    "Zeytinyağı"
        )
    )

}