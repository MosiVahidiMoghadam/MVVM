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

لایوت منیجر ریسایکلر ویو رو ست میکنیم

```kotlin
binding.recyMainActivityShowListUser.layoutManager = LinearLayoutManager(this)
```

یه مدل میسازیم و ساختار کلی کاربران میزاریم توش
``UsersModel.kt``

بعد میریم سراغ آداپتور
``ShowUserAdapter.kt``

فقط یه نکته داخل اداپتر هست برای توضیح اونم اینه از ویو استفاده نمیکنیم و از بایندینگ ایتم ریسای کلر ویو استفاده میکنیم به شکل زیر

```kotlin
 class ViewHolderShowUser(private val binding: ItemRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun setData(date: UsersModel) {
            binding.name = date.name
        }

    }
``` 

بریم سراخ مین اکتیویتی به شکل زیر مقادیر دیتا میدیم
```kotlin
val dates : MutableList<UsersModel> = mutableListOf()

...

private fun setListDates(){
        for (item in 18..28){
            dates.add(
                UsersModel(
                    "Name$item",
                    "Family$item",
                    item
                )
            )
        }
    }
```

حالا آداپتور رو ست میکنیم
```kotlin
binding.recyMainActivityShowListUser.adapter = ShowUserAdapter(dates)
```