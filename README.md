# Step 2 MVVM
 
README <a href="./README_fa.md">parsian</a>

 I changed the folder and its structure first
 
 In the next step, I created the Recycler View item as shown
 
 > We have a data in the following form of string type to get text view text

``item_recycler.xml``
```xml
<data>
        
        <variable
            name="name"
            type="String" />
        
    </data>
```

Inside Activity, I deleted everything and added a Recycler View and set an idea

``activity_main.xml``
```xml
    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recy_mainActivity_showListUser"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```
We set the live manager of Recycler View

```kotlin
binding.recyMainActivityShowListUser.layoutManager = LinearLayoutManager(this)
```