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

We build a model and build the general structure of the users
``UsersModel.kt``

Then we go to the adapter
``ShowUserAdapter.kt``

There is only one point inside the adapter to explain that we do not use View and we use the binding of Rissa Chlor View View item as follows

```kotlin
 class ViewHolderShowUser(private val binding: ItemRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun setData(date: UsersModel) {
            binding.name = date.name
        }

    }
``` 

Let's go to the main activity as shown below the data values
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

Now we set the adapter
```kotlin
binding.recyMainActivityShowListUser.adapter = ShowUserAdapter(dates)
```