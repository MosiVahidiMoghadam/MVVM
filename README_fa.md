# قدم دوم 

پوشه بندی و ساختارش اول عوض کردم 


در مرحله بعدی ایتم ریسایکلر ویو ساختم به شکل

> یه دیتا به شکل زیر داریم از نوع رشته برای گرفتن متن تکست ویو

``item_recycler.xml``
```xml
<data>
        
        <variable
            name="name"
            type="String" />
        
    </data>
```

داخل مین اکتیویتی همه پاک کردم و ریسایکلر ویو اضافه کردم و یه ایدی ست کردم

``activity_main.xml``
```xml
    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recy_mainActivity_showListUser"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

