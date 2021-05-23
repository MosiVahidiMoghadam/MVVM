# قدم سوم 

اضافه کردن کتابخانه ها

``build.gradle(Module: MVVM app)``
```groovy

    // Lifecycles
    // https://developer.android.com/jetpack/androidx/releases/lifecycle#groovy
    def lifecycle_version = "2.3.1"
    def arch_version = "2.1.0"

    // ViewModel
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    // LiveData
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
    // Lifecycles only (without ViewModel or LiveData)
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"

```

یه مدل میسازیم به  اسم زیر

``LifecycleModel.kt``

و ارث بری می کنیم به شکل زیر

``LifecycleModel.kt``
```kotlin
class LifecycleModel : LifecycleObserver {
 
}
```

حالا به شکل زیر یک تابع برای حالت های مختلف مینویسیم

``LifecycleModel.kt``
```kotlin
class LifecycleModel : LifecycleObserver {
 
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.i("TAG_TEST", "onCreate")
    }
}
```

خب در انوتیشن تابع نوعش مشخص میشه که اینجا اون کریت هست
 و داخل تابع اتفاقاتی که موفع ان کریت باید پیش بیاد نوشته میشوند
