package com.example.snack_mate

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    private lateinit var OutletimageButton: ImageButton
    private lateinit var OutletimageView : ImageView
    // private lateinit var StudentimageButton:ImageButton
    //   private lateinit var StudentimageView:ImageView
    private var selectedLayout:Int=1

    companion object {
        private const val PICK_IMAGE_REQUEST = 1
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.outlet_login)


//        OutletimageButton = findViewById(R.id.photoeditoutletregister)
//        OutletimageView=findViewById(R.id.photooutletregister)
//        StudentimageButton=findViewById(R.id.photostudentregister)
//        StudentimageView=findViewById(R.id.studentphotoedit)

        // Set OnClickListener to select image
//        OutletimageButton.setOnClickListener {
//            selectedLayout=1
//            openGallery()
//        }
//        //StudentimageButton.setOnClickListener {
//            selectedLayout=2
//            openGallery()
//        }

        // Set status bar color
//        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            window.statusBarColor = Color.TRANSPARENT
//            window.navigationBarColor = Color.TRANSPARENT // Make navigation bar transparent
//        }

//        // Draw gradient background behind status bar and navigation bar
//        val decorView = window.decorView
//        decorView.background = resources.getDrawable(R.drawable.logingradient)
//        // Adjust status bar icon color based on background brightness
    }

//    private fun openGallery() {
//        // Intent to pick image from gallery
//        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
////        startActivityForResult(intent, PICK_IMAGE_REQUEST)
//    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null) {
//            // Get the image URI from the data
//            val imageUri = data.data
//            // Set the image URI to the ImageView
//            when(selectedLayout){
//                1->OutletimageView.setImageURI(imageUri)
//                //2->StudentimageView.setImageURI(imageUri)
//            }
//
//        }
//    }



}