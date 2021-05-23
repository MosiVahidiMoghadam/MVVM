# Step 3 MVVM
 
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

