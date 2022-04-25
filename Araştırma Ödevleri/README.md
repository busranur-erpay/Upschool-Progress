# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)
- [Araştırma Projesi 3 - Font family XML](#3)
- [Araştırma Projesi 4 - Property Animation](#4)


### <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?

### CEVAPLAR: LATEINIT

   Kotlin programlama dilinde birden çok değişken ve değişken tanımlama türleri vardır. Bunlardan bazıları var, val, lateinit, lazy , getter&setters … olarak çoğaltılabilir. Kotlin, değişken tanımlarken değeriyle tanımlamamızı gerektiren bir dildir. Kotlin’de değişken tanımlama işlemleri iki farklı anahtar kelime ile yapılıyor;
-	val: Sabit değer tanımlamak için kullanılır. Tanımlandıktan sonra tekrar değiştirilemez. Javadaki final’a denk gelir.
-	var: Normal değişken tanımlamak için kullanılır. Tanımladıktan sonra dilediğinizde değerini değiştirebilirsiniz.

Başlangıçta değer atamadan değişken tanımlamak istersek lazy ve lateinit kavramları kullanılır. Lateinit kavramı, bir değişkene değer ataması bir sonraki aşamada gerçekleşmesi halinde kullanılır. Eğer bu değişkeni kullanacağımız garanti ise fakat vereceğimiz, atayacağımız değer hakkında emin değilsek bu işi lateinit ile yapabiliyoruz. Türkçe anlamına bakıldığında da geç başlangıç anlamına gelir. Yani kısaca “seni şuan tanımlıyorum, fakat ben sana bir şey verene kadar sadece bekle değerini boşta bırakıyorum “ demektir.  Bunun için lateinit değişkeni başlatılana kadar bellekte ona yer ayrılmaz. Lateinit sadece non-nullable ve referans tipli değişkenlerde kullanılır. Bir değişkenin non-nullable olduğundan eminsek lateinit kullanabiliriz. Lateinit kullandığımızda dikkat etmemiz gereken şey bu değişkenin null değer almayacak olmasıdır. Eğer null değer alırsa uygulama crash olur. Yani null olmadığından emin olduğumuz değişkenleri tanımlarken lateinit kullanırız, değişkenin alacağı değeri bilmediğimiz durumlarda null kullanabiliriz böylece o değişkene null olabilme hakkı tanımış oluruz.
- Lateinit Örnek Kullanım:

```kotlin
        class MainActivity : AppCompatActivity(), View.OnClickListener {
          private lateinit var button: Button //Değer atamadan Button tanımladık
          private lateinit var dice: ImageView

          override fun onCreate(savedInstanceState: Bundle?) {
              super.onCreate(savedInstanceState)
              setContentView(R.layout.activity_main)
              button = findViewById(R.id.mybutton)//Değer atamasını burda gerçekleştirdik.
              dice=findViewById(R.id.dice)

              button.setOnClickListener(this)
          }
```


### <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

### CEVAPLAR: TOOLS NAMESPACE

   XML (Extensible Markup Language- Genişleyebilir İşaretleme Dili) bir etiketleme dilidir ve etiket isimleri programcı tarafından belirlenir. Farklı XML uygulamalarından birlikte kullanılan XML kaynakları aynı isimde etiketlere sahip olabilir. Bu çakışmayı önlemek için namespace (isim uzayı) ve prefix (ön ek) kullanılır. Namespace tanımlarken URI (Uniform Resource Identifier) namespace ismi olarak verilir. En yaygın kullanılanı URL (Uniform Resource Locator), diğeri ise URN (Uniform Resource Name) dir. URL ve URN'nin namespace olarak kullanım amacı namespacelerin tek olmasını sağlamaktır ve hangisinin kullanılacağı programcının tercihine bırakılmıştır. Bu şekilde namescape'lerin uniqu (tek) olması sağlanır. Çünkü aynı URL'den iki tane olamaz. Örneğin www.x.com adresi sadece bir tane olabilir. Prefix ise etiketlerin başında kullanılarak aynı isimdeki etiketlerin hangi namespace’e ait olduğunu gösterir ve çakışmasını engeller.
  
  Bir uygulama geliştirilirken tasarım tarafında yapılan değişiklerin nasıl göründüğünü veya compile edilince nasıl görüneceğini uygulamayı çalıştırmadan anında görebilmek için tools namespace kullanır. Uygulama çalıştırıldığında, derleme araçları bu özellikleri kaldırır. Böylece APK boyutu veya çalışma zamanı davranışı üzerinde hiçbir etkisi olmaz.
- Tools namespace ile gelen özellikleri kullanabilmek için her XML dosyasının root öğesine tools namespace eklenir:
  ```kotlin
      xmlns:tools="http://schemas.android.com/tools"
  ```

- Tools (tools namespace) Örnek Kullanım:
   ```kotlin
      <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
          xmlns:app="http://schemas.android.com/apk/res-auto"
          xmlns:tools="http://schemas.android.com/tools"
          android:layout_width="match_parent"
          android:layout_height="match_parent"
          tools:context=".MainActivity">
          
           <ImageView
        android:id="@+id/dice"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="96dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        android:src="@drawable/empty_dice"
        tools:src="@drawable/dice_1"
        />
      </androidx.constraintlayout.widget.ConstraintLayout>
  ```

## <a name="3"></a> Araştırma Projesi 3

- Font family dosyası nasıl oluşturulup kullanıyoruz?
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

P.S. [Bu linkten](https://developer.android.com/guide/topics/ui/look-and-feel/fonts-in-xml ) faydalanarak font family projenizde deneyebilirsiniz.

### CEVAPLAR: FONT FAMILY 
:white_flower: Projemizde yazı stillerini çesitlendirmek için Font family dosyası kullanılır. Font family dosyası bir fontun style ve weight özelliklerinini içeren bir XML dosyasıdır. Android'de XML kaynağı olarak yeni bir Font family dosyası oluşturularak her bir style ve weight özelliklerini ayrı ayrı kaynaklar olarak adlandırmak yerine hepsini tek bir kaynakta toplanması sağlanır. Böylece sistem, kullanmaya çalıştığımız text style'ına göre doğru olan yazı tipini seçebilir. 

:white_flower: Font dosyası oluşturmak için öncelikle <b>res</b> dizini içerisinde font adında bir klasör oluşturmalıyız. res dizinine sağ tıklayıp <b>res > New > Directory</b> adımları takip edilerek açılan pencerede klasör adı için font yazılır. Bu işlemden sonra res dizini içerisinde font adında klasör oluşturulmuş olur. Bu klasör içerisinde kendi oluşturduğumuz veya internetten hazır olarak indirdiğimiz fontları .otf (OpenType) veya .ttf (TrueType) formatlarında ekleyerek bunları projemizde kullanabiliriz. İnternetten indirdiğimiz font dosyalarını kullanabilmek için dosyayı kopyalayıp res dizini içerisindeki font klasöründe sağ tıklayıp yapıştır seçeneği seçilir.  

:white_flower: Font family dosyası oluşturmak için <b>res>font>New>Font Resource File</b> yolunu takip ederek açılan pencerede file name alanı doldurulur ve OK butonuna basılır. Bu işlemden sonra editörde yeni font XML kaynağı açılır. Açılan XML dosyasında bulunan <b><font></b> tag'larını kullanarak bir font için style, weight gibi özellikler tanımlarız.

<img  src="https://user-images.githubusercontent.com/77737341/165010970-6cc9bbf0-b3f7-4783-97a7-9bb7a271187b.png">   
<img  src="https://user-images.githubusercontent.com/77737341/165011205-5030156d-e300-44c5-9b34-c988c1318d96.png">      
   
- ### my_font.xml  

         <?xml version="1.0" encoding="utf-8"?>
      <font-family xmlns:android="http://schemas.android.com/apk/res/android">
          <font
              android:fontStyle="normal"
              android:font="@font/sansita_regular"
              android:fontWeight="400" />
          <font
              android:fontStyle="italic"
              android:font="@font/sansita_bolditalic"
              android:fontWeight="700" />
          <font
              android:fontStyle="italic"
              android:font="@font/sansita_blackitalic"
              android:fontWeight="900" />
      </font-family>


- Eklenen font dosyalarını Text'de gösterebilmek için android:fontFamily özeliği eklenerek belirtilir. Yazı stilini belirtmek için ise  android:textStyle özelliği kullanılarak bold, normal veya italik olduğu belirtilir.
   
## :white_flower: Örnek Kullanım:   
     
 - ### activity_main.xml   
  <img align="right" src="https://user-images.githubusercontent.com/77737341/165014007-12ca6840-1469-4e28-8a45-be64c1ca991b.png">
   
       <TextView
           android:id="@+id/textView3"
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:layout_marginTop="128dp"
           android:fontFamily="@font/my_font"
           android:textStyle="normal"
           android:text="Hello World!"
           android:textSize="40sp" />
       <TextView
           android:id="@+id/textView"
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:layout_marginTop="80dp"
           android:fontFamily="@font/my_font"
           android:text="Hello World! "
           android:textSize="40sp"
           android:textStyle="italic"
           app:layout_constraintTop_toBottomOf="@+id/textView3" />
       <TextView
           android:id="@+id/textView2"
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:layout_marginTop="80dp"
           android:fontFamily="@font/my_font"
           android:text="Hello World! "
           android:textSize="40sp"
           android:textStyle="italic|bold"
           app:layout_constraintTop_toBottomOf="@+id/textView" />


### Neden bu şekilde kullanımı tercih ediyoruz?
   Fontları projenin içine dahil ederek kullanmamızın sebebi; Google’ın kullandığımız fontu kullanımdan kaldırması veya değiştirmesi gibi ileride oluşabilecek bu durumlara karşı önlem almaktır. Böyle bir durumda fontumuz artık kullanılmayacak hale gelecektir. 
   
   
## <a name="4"></a> Araştırma Projesi 4

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız

P.S. [Bu linkten](https://developer.android.com/guide/topics/resources/animation-resource#Property) faydalanabilirsiniz.
