package io.github.iamyours.easywidgets

import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import io.github.iamyours.router.annotation.Route
import kotlinx.android.synthetic.main.activity_main.*

@Route(path = "/app/main")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val url = "https://n.sinaimg.cn/tech/transform/560/w280h280/20190429/SpUs-hwfpcxm9530435.gif"
        Glide.with(this@MainActivity).load(url).into(iv_head)
    }

//    private fun initLineChart() {
//        val list = ArrayList<Entry>()
//        for (i in 0..100) {
//            list.add(Entry(i.toFloat(), i.toFloat()))
//        }
//        val data = LineData(LineDataSet(list, ""))
//        lineChart.data = data
//    }
//
//    val handler = object : Handler() {
//        override fun handleMessage(msg: Message?) {
//            super.handleMessage(msg)
//            val url = "https://n.sinaimg.cn/tech/transform/560/w280h280/20190429/SpUs-hwfpcxm9530435.gif"
//
//            Glide.with(this@MainActivity).load(url).into(image)
//        }
//    }

}
