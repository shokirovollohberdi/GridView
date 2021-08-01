package com.example.gridviewhomework

import Adapters.MyAdapters
import Models.Os
import Models.UserList
import Models.UserList.os_list
import Models.index
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var myAdapters: MyAdapters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()


        myAdapters = MyAdapters(this, UserList.os_list)

        gridview_photo.adapter = myAdapters

        gridview_photo.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "$position", Toast.LENGTH_SHORT).show()
            index.pos = position
            startActivity(Intent(this, MainActivity2::class.java))
        }


    }

    private fun loadData() {
        UserList.os_list.add(Os(R.drawable.cubcake, "Cub cake", "With the launch of Android 10," +
                " Google’s tradition of codenamed dessert names for major Android versions " +
                "has also come to an end.Although these dessert codes are no longer publicly announced," +
                " Google still uses this naming method internally. " +
                "So what is called inside Android 11? The answer is Red Velvet Cake"))
        UserList.os_list.add(Os(R.drawable.donut, "Donut", "Android Donut, is the fourth version of the open source Android mobile operating " +
                "system developed by Google that is no longer supported. Among the more prominent features" +
                " introduced with this update were added support for CDMA smartphones, additional screen sizes, " +
                "a battery usage indicator, and a text-to-speech engine.[3][4]"))
        UserList.os_list.add(Os(R.drawable.eslair, "Eslair", "Android Eclair is a codename of the Android mobile operating system developed by Google, " +
                "the fifth operating system for Android and the second major release of Android, and for the " +
                "no-longer supported versions 2.0 to 2.1. Unveiled on October 26, 2009, Android 2.1 builds " +
                "upon the significant changes made in Android 1.6 Donut"))
        UserList.os_list.add(Os(R.drawable.froya, "Froya", "Android Froyo is the sixth version of Android and is a codename of" +
                " the Android mobile operating system developed by Google, spanning versions between " +
                "2.2 and 2.2.3.[3] Those versions are no longer supported. It was unveiled on May 20, " +
                "2010, during the Google I/O 2010 conference."))
        UserList.os_list.add(Os(R.drawable.gingerbread, "GinGerBread", "Android 2.3 Gingerbread is the seventh version of Android," +
                " a codename of the Android mobile operating system developed by Google and released in" +
                " December 2010, for versions that are no longer supported. The Gingerbread release" +
                " introduced support for near field communication (NFC)—used in mobile payment solutions—and " +
                "Session Initiation Protocol (SIP)—used in VoIP internet telephones.[3]"))
        UserList.os_list.add(Os(R.drawable.kitkat, "Kit Kat", "Android 4.4 takes system performance to an " +
                "all-time high by optimizing memory and improving your touchscreen so that it responds" +
                " faster and more accurately than ever before. This means that you can listen to music " +
                "while browsing the web, or race down the highway with the latest hit game, all without a hitch"))
        UserList.os_list.add(Os(R.drawable.lollipop, "Lollipop", "Android Lollipop (codenamed Android L during" +
                " development) is the fifth major version of the Android mobile operating system developed " +
                "by Google and the 12th version of Android, spanning versions between 5.0 and 5.1.1.[4]" +
                " Unveiled on June 25, 2014 at the Google I/O 2014 conference, it became available through " +
                "official over-the-air (OTA) updates on November 12, 2014, for select devices that run " +
                "distributions of Android serviced by Google (such as Nexus and Google Play edition devices)." +
                " Its source code was made available on November 3, 2014. It is the fifth major update and the " +
                "twelfth version of Android."))
        UserList.os_list.add(Os(R.drawable.muchmore, "Muchmore", "Android is a mobile operating system" +
                " based on a modified version of the Linux kernel and other open source software," +
                " designed primarily for touchscreen mobile devices such as smartphones and tablets." +
                " Android is developed by a consortium of developers known as the Open Handset Alliance" +
                " and commercially sponsored by Google. It was unveiled in November 2007, with the first " +
                "commercial Android device, the HTC Dream, being launched in September 2008."))
    }
}