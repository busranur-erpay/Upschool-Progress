# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)
- [Öğrenci Cevapları](#x)


### <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?

### CEVAPLAR: LATEINIT

   Kotlin programlama dilinde birden çok değişken ve değişken tanımlama türleri vardır. Bunlardan bazıları var, val, lateinit, lazy , getter&setters … olarak çoğaltılabilir. Kotlin, değişken tanımlarken değeriyle tanımlamamızı gerektiren bir dildir. Kotlin’de değişken tanımlama işlemleri iki farklı anahtar kelime ile yapılıyor;
-	val: Sabit değer tanımlamak için kullanılır. Tanımlandıktan sonra tekrar değiştirilemez. Javadaki final’a denk gelir.
-	var: Normal değişken tanımlamak için kullanılır. Tanımladıktan sonra dilediğinizde değerini değiştirebilirsiniz.

Başlangıçta değer atamadan değişken tanımlamak istersek lazy ve lateinit kavramları kullanılır. Lateinit kavramı, bir değişkene değer ataması bir sonraki aşamada gerçekleşmesi halinde kullanılır. Eğer bu değişkeni kullanacağımız garanti ise fakat vereceğimiz, atayacağımız değer hakkında emin değilsek bu işi lateinit ile yapabiliyoruz. Türkçe anlamına bakıldığında da geç başlangıç anlamına gelir. Yani kısaca “seni şuan tanımlıyorum, fakat ben sana bir şey verene kadar sadece bekle değerini boşta bırakıyorum “ demektir.  Bunun için lateinit değişkeni başlatılana kadar bellekte ona yer ayrılmaz. Lateinit sadece non-nullable ve referans tipli değişkenlerde kullanılır. Bir değişkenin non-nullable olduğundan eminsek lateinit kullanabiliriz. Lateinit kullandığımızda dikkat etmemiz gereken şey bu değişkenin null değer almayacak olmasıdır. Eğer null değer alırsa uygulama crash olur. Yani null olmadığından emin olduğumuz değişkenleri tanımlarken lateinit kullanırız, değişkenin alacağı değeri bilmediğimiz durumlarda null kullanabiliriz böylece o değişkene null olabilme hakkı tanımış oluruz.


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



### <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 
