package com.wantestapp.clipMatrixCamera;

import android.content.Context;
import android.graphics.*;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.wantestapp.R;

public class Practice11CameraRotateView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;
    Point point1 = new Point(200, 100);
    Point point2 = new Point(600, 200);

    public Practice11CameraRotateView(Context context) {
        super(context);
    }

    public Practice11CameraRotateView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11CameraRotateView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.maps);
    }

    Camera camera = new Camera();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        canvas.save();
        camera.save();
        camera.rotateX(30);
        camera.applyToCanvas(canvas);
        canvas.drawBitmap(bitmap, point1.x, point1.y, paint);
        camera.restore();
        canvas.restore();

        canvas.save();
        camera.save();
        camera.rotateY(30);
        camera.applyToCanvas(canvas);
        canvas.drawBitmap(bitmap, point2.x, point2.y, paint);
        canvas.restore();
        camera.restore();
    }
}
