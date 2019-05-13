package com.wantestapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class HomeworkView1 : View {
    private val paint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
//        canvas.drawColor(Color.YELLOW)

        //一共四个圆：1.实心圆 2.空心圆  3.线宽为 20 的空心圆
//        paint.color = Color.RED
//        canvas.drawCircle(200f, 200f, 100f, paint)
//
//        paint.style = Paint.Style.STROKE
//        canvas.drawCircle(500f, 200f, 100f, paint)
//
//        paint.strokeWidth = 20f
//        paint.color = Color.BLUE
//        canvas.drawCircle(200f,500f,100f,paint)

        //画矩形
//        canvas.drawRect(20f,20f,300f,300f,paint)

        //画圆角矩形
//        canvas.drawRoundRect(100f, 100f, 500f, 300f, 50f, 50f, paint)

        //画弧形、扇形
//        canvas.drawArc(100f,100f,800f,600f,0f,-90f,true,paint)
//        paint.style = Paint.Style.STROKE
//        canvas.drawArc(100f,100f,800f,600f,260f,-90f,false,paint)
//        paint.style = Paint.Style.FILL
//        canvas.drawArc(100f,100f,800f,600f,10f,140f,false,paint)

        //划线
//        canvas.drawLine(100f,100f,500f,500f,paint)

        //画椭圆
//        canvas.drawOval(100f,100f,800f,600f,paint)

        //画心
//        paint.color = Color.RED
//        val path = Path()
//        path.addArc(100f,100f,200f,200f,150f,180f)
//        path.arcTo(200f,100f,300f,200f,180f,210f,false)
//        path.lineTo(200f,280f)
//        path.close()
//
//        paint.style = Paint.Style.FILL
//        canvas.drawPath(path,paint)

        //画点
//        paint.strokeWidth = 40f
//        paint.strokeCap = Paint.Cap.ROUND
//        canvas.drawPoint(100f,100f,paint)
//
//        paint.strokeCap = Paint.Cap.SQUARE
//        canvas.drawPoint(200f,100f,paint)
//
//        paint.strokeCap = Paint.Cap.BUTT
//        canvas.drawPoint(300f,100f,paint)


    }


}