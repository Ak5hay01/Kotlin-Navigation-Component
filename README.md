# Kotlin-Navigation-Component



Navigation refers to the interactions that allow users to navigate across, into, and back out from the different pieces of content within your app. Android Jetpack's Navigation component helps you implement navigation, from simple button clicks to more complex patterns.

Link: https://developer.android.com/guide/navigation and <br/>
Link: https://developer.android.com/guide/navigation/navigation-getting-started



# Home Screen 
![alt text](/screenshots/home.PNG)

Here as you can see I have added a textview with text and this is a fragment added in fragment container in activity_main.xml. If you click on the text you will be navigated to next fragment. I have added 2 scenarios for it 

1. Regular Navigation
2. Navigation using safe args(sending some data from one fragment to another)

# Second Fragment without safe args

![alt text](/screenshots/second_Frag_witout_safe_args.PNG)

Here as you can see we Default text can be seen and if you click on the textview you will be navigated back to the first fragment.

# Second Fragment with safe args

![alt text](/screenshots/second_fragment.PNG)

Here as you can see whatever text we send from first fragments using the safe args is sent to send fragment and its set to textview. you can see the logic for sending safe args in first fragment textview click. 

```
 textView.setOnClickListener {
     //Sending data from 1st to 2nd fragment.
      val action = FirstFragmentDirections.navigateToSecondScreen("Second(2nd) Fragment") // even if we dont pass the string the app will work and default value will be shown
      Navigation.findNavController(view).navigate(action)
  }
```

