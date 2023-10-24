package edu.temple.inclassactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var some : Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        meta-programming
//        if (::some.isInitialized) {
//
//        }

        // Fetch images into IntArray called imageArray
        val typedArray = resources.obtainTypedArray(R.array.image_ids)
        val imageArray = IntArray(typedArray.length()) {typedArray.getResourceId(it, 0)}
        typedArray.recycle()

        // Attach an instance of ImageDisplayFragment using factory method
        var fragment = ImageDisplayFragment.newInstance(imageArray)

//        if (supportFragmentManager.findFragmentById(R.id.fragmentContainerView) !is ImageDisplayFragment) {
//        if (supportFragmentManager.findFragmentById(R.id.fragmentContainerView) == null) {
//
//            supportFragmentManager
//                .beginTransaction()
//                .add(R.id.fragmentContainerView, fragment)
//                .replace(R.id.fragmentContainerView, ImageDisplayFragment())
//                .addToBackStack(null)
//                .setReorderingAllowed(true)
//                .commit()
//        }

        fun imageSelected(itemId: Int) {
            Toast.makeText(this, "You selected $itemId", Toast.LENGTH_SHORT).show()
        }

    }
}