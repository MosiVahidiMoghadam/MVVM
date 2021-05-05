<<<<<<< HEAD
# Step 1 MVVM

README <a href="./README_fa.md">parsian</a>

Enable data binding in the build grid file

``build.gradle(Module:MVVM.app)``
```groovy
dataBinding{
        enabled=true
    }
```

In the next step, we will edit the layout file and layout print

``activity_main.xml``
```xml
<layout>
    ...
</layout>
```

We define a variable in layout as follows

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

We created a string variable called a number

Adding a value to a variable in Text View for run time The variable is changed, the text is also changed and we set a default value if the variable was empty

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

Well, we enter the main activity class and define the binding and connect the view and the class as follows

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

In the following line, we create an empty variable of the data building class

``MainActivity.kt``
```kotlin
    private lateinit var binding : ActivityMainBinding
```

In the line below, we do the initialization and connect the levee and the class

``MainActivity.kt``
```kotlin
    binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
```

In the following line, we set the variable that we created in Live

``MainActivity.kt``
```kotlin
    binding.number = "hello mvvm"
```
=======
# MVVM
MVVM in Android Kotlin


<a href="https://github.com/alirezabashi98/MVVM/tree/step1">Stop 1 mvvm</a><br>
<a href="https://github.com/alirezabashi98/MVVM/tree/step2">Stop 2 mvvm</a>
>>>>>>> 52e8c55262fcf4f37d730e18619427204776ea9b
