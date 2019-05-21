package com.wantestapp.clipMatrixCamera;

import android.content.Context;
import android.graphics.*;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.wantestapp.R;

public class Practice02ClipPathView extends View {
    Paint paint = new Paint();
    Bitmap bitmap;
    Point point1 = new Point(200, 200);
    Point point2 = new Point(600, 200);

    public Practice02ClipPathView(Context context) {
        super(context);
    }

    public Practice02ClipPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02ClipPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.maps);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Path path1 = new Path();
        path1.addCircle(bitmap.getWidth()+point1.x,bitmap.getHeight()+point1.y,200, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path1);
        canvas.drawBitmap(bitmap, point1.x, point1.y, paint);
        canvas.restore();

        Path path2 = new Path();
        path2.setFillType(Path.FillType.INVERSE_WINDING);
        path2.addCircle(point2.x + 200, point2.y + 200, 150, Path.Direction.CW);

        canvas.save();
        canvas.clipPath(path2);
        canvas.drawBitmap(bitmap, point2.x, point2.y, paint);
        canvas.restore();
    }
}
