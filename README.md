# Step 3 MVVM
 
 <a href="README_fa.md">README parsian</a>
 
Add libraries

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

We make a model called below

``LifecycleModel.kt``

And we inherit as follows

``LifecycleModel.kt``
```kotlin
class LifecycleModel : LifecycleObserver {
 
}
```

Now we write a function for different modes as follows

``LifecycleModel.kt``
```kotlin
class LifecycleModel : LifecycleObserver {
 
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.i("TAG_TEST", "onCreate")
    }
}
```

Well, in the annotation of the type function, it is specified that here is that credit
  And inside the function are written the events that should benefit the creator