package kr.hs.emirim.evie.dialogtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    lateinit var btnItem : Button
    lateinit var textResult : TextView
    var versionArray = arrayOf("브레드", "마카롱", "소시지")
    var idolImgRes = arrayOf(R.drawable.bread, R.drawable.macaron, R.drawable.sausage)

    lateinit var imgV : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnItem = findViewById(R.id.btn_item)
        textResult = findViewById(R.id.text_result)

        imgV = findViewById(R.id.imgV)

        btnItem.setOnClickListener {
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 캐릭터는?")
            dlg.setIcon(R.drawable.icon)
            dlg.setItems(versionArray) {dialog, index ->
                textResult.text = versionArray[index]
                imgV.setImageResource(idolImgRes[index])
            }
            dlg.setNegativeButton("닫기", null)
            dlg.show()
        }

    }
}