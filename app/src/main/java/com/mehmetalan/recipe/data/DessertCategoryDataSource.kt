package com.mehmetalan.recipe.data

import com.mehmetalan.recipe.R
import com.mehmetalan.recipe.model.DessertCategory

object DessertCategoryDataSource {

    val dessertList = listOf(
        DessertCategory(
            dessertId = 1,
            dessertImage = R.drawable.baklava,
            dessertName = "Baklava",
            makingTime = "90 dk.",
            recipe = "İlk olarak tatlımızın şerbetini hazırlayalım. Bunun için uygun bir tencereye şeker ve suyu alalım.\n" +
                    "Karıştırdıktan sonra şerbetimizi kaynamaya bırakalım.\n" +
                    "Sürenin sonunda limon suyunu da ilave ederek bir kaç dakika daha kaynatalım ve ocaktan alalım.\n" +
                    "Baklava hamuru için yoğurma kabına yumurta, sıvı yağ, süt, sirke ve tuzu alarak karıştıralım.\n" +
                    "Daha sonra unu yavaş yavaş  ilave ederek hamurumuzu ele yapışmayan bir kıvam alıncaya  kadar yoğuralım.\n" +
                    "Yoğurduğumuz hamurumuzun üzerini streçleyerek 30 dakika kadar dinlenmeye bırakalım. Bu şekilde hamurumuz çok daha kolay açılacaktır.\n" +
                    "Süre sonunda hamurumuzu tezgaha alalım ve bir iki kere daha yoğurarak toparlayalım.\n" +
                    "Hamurumuzu ilk önce eşit bir şekilde 3 parçaya ayıralım, daha sonra her parçayı da 9 parçaya ayıralım.\n" +
                    "Böldüğümüz parçaları dıştan içe doğru yoğurup, elimizde yuvarlayarak beze haline getirelim. Toplamda 27 adet beze elde etmiş olacağız.\n" +
                    "Tüm parçaları beze haline getirdikten sonra üzerlerini streç filmle kapatalım. Böylece hamur açma işlemi bitene kadar kurumalarını engellemiş olacağız.\n" +
                    "Bezelerimizinden bir tanesini nişasta serptiğimiz tezgaha alalım, merdane yardımı ile tatlı tabağı boyutunda açalım. Bu şekilde ilk 9 bezeyi tek tek açalım, aralarına nişasta serperek üst üste yerleştirelim.\n" +
                    "Daha sonra hazırladığımız 9 kat hamuru tepsi boyutundan biraz büyük olacak şekilde arada bir ters-yüz ederek açalım. Burada hamuru ters yüz ettiğinizde altta kalan küçük katlarda eşit oranda genişleyecektir.\n" +
                    "Daha sonra hamuru yine dikkatli bir şekilde, nazikçe katlarına ayıralım.\n" +
                    "Elde ettiğimiz incecik, zar gibi baklava hamurunu tepsimize yerleştirelim. Dilerseniz benim gibi yufkaları ayırarak koyabileceğiniz gibi ayırmadan bütün bir şekilde de koyabilirsiniz.\n" +
                    "İlk 9 katı tepsiye yerleştirdikten sonra üzerine ceviz kırıkları serpiştirelim. Dilerseniz bu aşamada fındık veya fıstıkta koyabilirsiniz.\n" +
                    "Diğer 9 bezeyı de aynı şekilde açarak, aralarına nişasta serpelim ve üst üste yerleştirelim. Ardından tepsi boyutunda genişletelim.\n" +
                    "Genişlettiğimiz hamuru tekrar katlarına ayırarak tepsimize yerleştirelim.Eğer siz de katları tek tek yerleştirecekseniz ve yeriniz de müsaitse, hamurları kurumaları için bir yere serip, 3-4 dakika bekletebilirsiniz.\n" +
                    "Tepsiye yerleştirdiğimiz hamurların üzerine ceviz kırığı serpelim.\n" +
                    "Son 9 bezemizi de aynı işlemleri uygulayarak tepsi boyutunda genişletelim ve tepsimize yerleştirelim.\n" +
                    "Baklavamızı keserken ilk önce 4 parçaya keselim. Daha sonra bu 4 parçayı da küçük üçgenlere ayıralım.\n" +
                    "Son olarak eritilmiş tereyağı ve sıvı yağ karışımını baklavamızın üzerine gezdirelim ve önceden ısıttığımız 170°C fırında 1 saat kadar pişmeye bırakalım.\n" +
                    "Süre sonunda fırından aldığımız sıcak baklavaların üzerine soğuyan şerbetimizi gezdirelim ve şerbetini çekmesi için dinlenmeye bırakalım. Deneyeceklere şimdiden afiyet olsun.",
            materials = "Şerbeti için;\n" +
                    "4 su bardağı şeker\n" +
                    "4 su bardağı su\n" +
                    "1 tatlı kaşığı limon suyu\n" +
                    "Hamuru için;\n" +
                    "3,5 su bardağı un\n" +
                    "2 adet yumurta\n" +
                    "1 çay bardağı sıvı yağ\n" +
                    "1 çay bardağı süt\n" +
                    "1 yemek kaşığı sirke\n" +
                    "Çay kaşığı ucu ile Tuz\n" +
                    "Hamuru açmak için;\n" +
                    "Nişasta\n" +
                    "Arası için;\n" +
                    "2 su bardağı ceviz kırığı\n" +
                    "Üzerine;\n" +
                    "250g tereyağı\n" +
                    "Yarım çay bardağı sıvı yağ"
        ),
        DessertCategory(
            dessertId = 2,
            dessertImage = R.drawable.sutlac,
            dessertName = "Sütlaç",
            makingTime = "35 dk.",
            recipe = "Sütlaç yapmak için öncelikle pirinci yıkayıp su ile ateşe koyun.\n" +
                    "Pirinçler uzayıp suyu çekene kadar kaynatın. Ocağı çok yüksek ateşte açarak pirinçleri yakmamaya dikkat edin.\n" +
                    "Ardında soğuk sütü ekleyin. 1-2 defa karıştırıp, kaynamasını bekleyin.\n" +
                    "Bu arada bir kasede pirinç ununu 1 su bardağı soğuk süt ile ezin. Topak kalmamasına mutlaka dikkat edin.\n" +
                    "Tencerede kaynamakta olan sütten 1-2 kepçe alıp kaseye ekleyin. (pirinç unu ılınmış olmalı).\n" +
                    "Pirinç ununu tencereye ekleyin, ara sıra karıştırarak 10 dakika kadar pişirin.\n" +
                    "Toz şekeri ilave edip karıştırın ve 1-2 taşım daha kaynatın.\n" +
                    "Sütlacı kaselere paylaştırın.\n" +
                    "Soğuyunca sütlaçların üzerlerine tarçın serperek servis edebilirsiniz. Afiyet olsun.",
            materials = "1 lt süt\n" +
                    "2 çay bardağı pirinç\n" +
                    "1 litre su\n" +
                    "3 yemek kaşığı pirinç unu\n" +
                    "1,5 -2 su bardağı toz şeker (eğer çok şekerli sevmiyorsanız 1,5 bardak kullanabilirsiniz)\n" +
                    "1 su bardağı süt\n" +
                    "tarçın"
        ),
        DessertCategory(
            dessertId = 3,
            dessertImage = R.drawable.kunefe,
            dessertName = "Künefe",
            makingTime = "50 dk.",
            recipe = "İlk olarak künefenin şerbeti hazırlanır. Şerbet için, su ve şeker bir tencereye alınarak kaynamaya bırakılır. (Şerbetin dibine tutmaması için ara ara karıştırılır.)\n" +
                    "Şerbet kaynamaya başlayınca şekerin kesilmemesi için 1 çay kaşığı limon suyu eklenip 10-15 dakika kadar daha kaynatılır ve şerbet soğumaya bırakılır.\n" +
                    "Künefe için, tereyağı kısık ateşte erimeye bırakılır.\n" +
                    "Eriyen tereyağı bir kenara alınarak bekletilir.\n" +
                    "Tereyağı donduktan sonra altında tereyağının suyu olacaktır bu suyu kullanmayın.\n" +
                    "Hafif donmuş olan tereyağına 1 çay kaşığı pekmezi eklenerek muhallebi kıvamına gelecek şekilde karıştırılır.\n" +
                    "Varsa künefe tepsisi yoksa alüminyum veya teflon tavanın altı bu pekmezli yağ karışımı ile yağlanır.\n" +
                    "Kadayıf tel tel tiftiklenerek ayrılır.\n" +
                    "Ardından bıçakla 1 cm kalınlığında kesilerek iki parçaya ayrılır.\n" +
                    "Ayırdığımız kadayıfın bir parçası yağlanmış tepsinin dibine aralarda boşluk kalmayacak şekilde serilir.\n" +
                    "Rendelenmiş peynirler kadayıfın üzerine yayılır.\n" +
                    "Diğer kadayıf da peynirin üzerinde boşluk kalmayacak şekilde kapatılır.\n" +
                    "Kenarları düzeltilir ve başka bir tepsi altıyla veya eliniz ile üzerine bastırılır.\n" +
                    "İyice bastırarak arasında boşluk kalmamasını dikkat edin.\n" +
                    "En kısık ateşte ocağın üzerinde tepsi çevrilerek pişirilir.\n" +
                    "Altının tamamen kızardığından emin olduğunuzda tepsiyi bir tabağın veya tepsinin üzerine ters çevrilir ve diğer tarafının pişmesi için ikinci tepsinin içi de yağlanır.\n" +
                    "Kızaran kısım üstte kalacak şekilde künefe tepsiye yerleştirilir ve altı kızartılır. Böylece iki tarafı da kızarmış olur.\n" +
                    "Şerbeti kenarından başlanarak dökülür. Antep fıstığı veya süt kaymağı ile servis edilir. Afiyet olsun.",
            materials = "250 gram tel kadayıf\n" +
                    "150 gr tuzsuz künefe peyniri\n" +
                    "4 yemek kaşığı tereyağı\n" +
                    "1 çay kaşığı pekmez\n" +
                    "Şerbeti için:\n" +
                    "2 su bardağı su\n" +
                    "2 su bardağı toz şeker\n" +
                    "1 çay kaşığı limon suyu\n" +
                    "Üzeri için;\n" +
                    "Toz Antep fıstığı\n" +
                    "Süt kaymağı veya dondurma (isteğe bağlı)"
        )
    )

}