package com.example.exp_3

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val drawView = object : View(this) {
            private val paint = Paint()

            override fun onDraw(canvas: Canvas) {
                super.onDraw(canvas)

                paint.color = Color.BLUE
                paint.strokeWidth = 5f
                paint.style = Paint.Style.FILL

                canvas.drawCircle(200f, 200f, 100f, paint)

                paint.color = Color.RED
                val rect = RectF(350f, 150f, 550f, 250f)
                canvas.drawOval(rect, paint)

                paint.color = Color.GREEN
                canvas.drawRect(100f, 300f, 400f, 500f, paint)

                paint.color = Color.BLACK
                paint.textSize = 50f
                canvas.drawText("Hello, Android!", 100f, 600f, paint)
            }
        }

        setContentView(drawView)
    }
}