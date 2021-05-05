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


