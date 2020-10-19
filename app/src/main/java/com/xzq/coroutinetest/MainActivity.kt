package com.xzq.coroutinetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xzq.coroutinetest.ui.main.MainFragment

/**
 * https://www.jianshu.com/p/76d2f47b900d
 * https://juejin.im/post/6884979459196190728/
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.container, MainFragment.newInstance()).commitNow()
        }
    }
}