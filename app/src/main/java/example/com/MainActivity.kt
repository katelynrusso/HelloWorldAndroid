package example.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //two ways to define variables: val and var
        //val is not able to be reassigned
        val string = "hello world"
       //string = "new stuff" --error
        //var is able to be reassigned
        var string2 = "creating variables"
        string2 = "new thing" //--works

        //? allows you to set a variable to null
        var string3: String? = "variable"
        string3 = null
    }
    //fun is a new function
    private fun getStringLength(string: String?): Int
        {
            if(string != null) {
                return string.length
            }
            return 0
            //alternative way: "call length if string is not null"
            //return string?.length ?: 0
        }
}
