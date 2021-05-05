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

