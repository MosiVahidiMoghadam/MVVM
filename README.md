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

