package com.wantestapp.clipMatrixCamera;

import android.content.Context;
import android.graphics.*;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.wantestapp.R;

public class Practice08MatrixScaleView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;
    Point point1 = new Point(200, 200);
    Point point2 = new Point(600, 200);
    Matrix matrix = new Matrix();

    public Practice08MatrixScaleView(Context context) {
        super(context);
    }

    public Practice08MatrixScaleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice08MatrixScaleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.maps);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int bitmapCenterWidth = bitmap.getWidth()/2;
        int bitmapCenterHeight = bitmap.getHeight()/2;

        matrix.reset();
        canvas.save();
        matrix.postScale(1.5f,1.5f, point1.x+bitmapCenterWidth, point1.y+bitmapCenterHeight);
        canvas.concat(matrix);
        canvas.drawBitmap(bitmap, point1.x, point1.y, paint);
        canvas.restore();

        matrix.reset();
        canvas.save();
        matrix.postScale(0.5f,1.5f,point2.x+bitmapCenterWidth, point2.y+bitmapCenterHeight);
        canvas.concat(matrix);
        canvas.drawBitmap(bitmap, point2.x, point2.y, paint);
        canvas.restore();
    }
}
