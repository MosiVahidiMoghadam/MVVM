# قدم اول 

فعال کردن دیتا بایندینگ در فایل بیلد گریدل

``build.gradle(Module:MVVM.app)``
```groovy
dataBinding{
        enabled=true
    }
```

در مرحله بعدی فایل لیوت ادیت میکنیم و پرنت لیوت رو لیوت میزاریم

``activity_main.xml``
```xml
<layout>
    ...
</layout>
```

یک متغیر در لایوت تعریف می کنیم به شکل زیر

``activity_main.xml``
```xml
<layout>
    
    <data>
            
        <variable
           name="number"
           type="String" />
            
    </data>
    
    ...
</layout>
```

یک متغیر از نوع رشته به اسم نامبر ساختیم


اضافه کردن مقدار به متغیر در تکست ویو برای ران تایم متغییر تغییر کرد متن هم تغییر کنه و یه مقدار دیفالت گذاشتیم اگر متغییر خالی بود 

``activity_main.xml``
```xml
<layout>
    
    <data>
            
        <variable
           name="number"
           type="String" />
            
    </data>
    
    ...
        <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"

                    android:text="@{number,default=Hello_World}"
                    
                    app:layout_constraintBottom_toBottomOf="parent"
                    app:layout_constraintLeft_toLeftOf="parent"
                    app:layout_constraintRight_toRightOf="parent"
                    app:layout_constraintTop_toTopOf="parent" />
    ...
</layout>
```

خب وارد کلاس مین اکتیویتی میشیم و بیندینگ تعریف میکنیم و ویو و کلاس بهم وصل میکنیم به شکل زیر

``MainActivity.kt``
```kotlin
package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding : ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.number = "hello mvvm"

    }
}
```

در خط زیر یه متغیر خالی از کلاس ساخته شده توست دیتا بیندینگ میسازیم

``MainActivity.kt``
```kotlin
    private lateinit var binding : ActivityMainBinding
```

در خط زیر مقدار دهی اولیه انجام میدیم لیوت و کلاس بهم وصل میکنیم

``MainActivity.kt``
```kotlin
    binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
```

در خط زیر متغیری که در لایوت ساختیم مقدار دهی میکنیم

``MainActivity.kt``
```kotlin
    binding.number = "hello mvvm"
```