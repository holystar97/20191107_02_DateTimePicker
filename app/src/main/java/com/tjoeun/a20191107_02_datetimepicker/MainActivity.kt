package com.tjoeun.a20191107_02_datetimepicker

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setupEvents(){

        selectDateBtn.setOnClickListener {
            var datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->

                var selectedDate = Calendar.getInstance()
                //원하는 항목별로 직접 입력
                selectedDate.set(Calendar.YEAR,year)
                // 년.월.일을 한번에 집어 넣기
                selectedDate.set(year,month,dayOfMonth)

                var sdf=SimpleDateFormat("yyyy년 M월 d일")
                var resultStr = sdf.format(selectedDate.time)

                dateTxt.text =resultStr


            },2019,Calendar.NOVEMBER,9)
            datePickerDialog.show()
        }
    }

    override fun setValues(){

    }



}
