## LifeCycle Nedir ?

LifeCycle, kullanıcının uygulama içinde almış olduğu aksiyonlara (uygulamayı açma - kapama, alta atma vs) göre uygulamayı yönetmeye yarayan bir yapıdır. 

Aksiyonlardan bahsetmek gerekirse:

onCreate -> onCreate metodu uygulama ilk açıldığında çalışır.
onStart -> onStart metodu uygulama açıldıktan sonra çalışır.
onResume -> onResume metodu uygulama açıldıktan sonra kullanıcıya gösterilir.
onPause -> onPause metodu uygulama arka plana alındığında çalışır.
onStop -> onStop metodu uygulama arka plana alındığında çalışır.
onDestroy -> onDestroy metodu uygulama kapatıldığında çalışır.
onRestart -> onRestart metodu uygulama arka plana alındıktan sonra tekrar açıldığında çalışır.

## Uygulama içindeki aksiyonlara göre LifeCycle’ın çalışma prensibi şu şekildedir:

Uygulama açıldığında = onCreate() –> onStart() –> onResume()

Geri tuşuna basıldığında = onBackPressed() –> onPaused() –> onStop() –> onDestroy()

Home tuşuna basıldığında = onPaused() –> onStop()

Home tuşuna basıp son uygulamalardan açtığımızda veya uygulamamızın ikonuna basarak açtığımızda = onRestart() –> onStart() –> onResume()

Üst bildirim ekranından başka bir uygulama açtığımızda veya ayarları açtığımızda = onPaused() –> onStop()

Başka bir uygulamada isek geri butonuna bastığımızda veya ayarlarda isek geri butonuna bastığımızda = onRestart() –> onStart() –> onResume()

Ekranda herhangi bir dialog ekranı açıldığında = onPause()

Dialog ekranını kapattığımızda veya geri tuşuna bastığımızda = onResume()

Telefon ekranı kapandığında = onPaused() –> onStop()

Telefon ekranı tekrar açıldığında = onRestart() –> onStart() –> onResume()

Telefonu döndürdüğümüzde (yatay ) = onPause() –> onStop() –> onSaveInstance() –> onDestroy()

Telefonu dikey ‘e tekrar döndürürsek = onCreate() –> onStart() –> onRestoreIntanceState() –> onResume()

## LifeCycle kullanımında yaşanılabilecek sorunlar ve çözümleri

1- Telefonun yatay biçime çevrilmesi durumunda uygulamamızın dikeyden ayrı bir yatay senaryosu yoksa büyük ihtimalle proje patlayacaktır. XML ile kodladığımız yapı genelde vertical (dikey) şekilde tasarlanıyor. Eğer uygumalanın yatay olma durumu var ise ayrı bir XML ile horizontal (yatay) olarak tasarlanması gerekir ve bunu LifeCycle ile bağlamamız gerekir. 


# homework-2

## Ödev 1 

Lifecyle Nedir? Nasıl yönetiriz? Ne gibi problemler olur ve nasıl kaçarız?

## Ödev 2

Derste birlikte yapılan Sign ve Sign Up sayfaların tasarımlarının yapılması. Bu iki tasarımı İki Activity olarak yapılacak ve Sign up butuna basıldığında Sign Up ekranı gelmesi beklenmekte.
