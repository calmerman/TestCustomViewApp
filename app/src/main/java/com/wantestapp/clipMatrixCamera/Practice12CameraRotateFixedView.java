package com.wantestapp.clipMatrixCamera;

import android.content.Context;
import android.graphics.*;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.wantestapp.R;

public class Practice12CameraRotateFixedView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;
    Point point1 = new Point(200, 200);
    Point point2 = new Point(600, 200);

    public Practice12CameraRotateFixedView(Context context) {
        super(context);
    }

    public Practice12CameraRotateFixedView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice12CameraRotateFixedView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.maps);
    }

    Camera camera = new Camera();
    Matrix matrix = new Matrix();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = bitmap.getHeight() / 2;
        int width = bitmap.getWidth() / 2;

        int center1X = point1.x + width;
        int center1Y = point1.y + height;

        int center2X = point2.x + width;
        int center3Y = point2.y + height;

        matrix.reset();
        camera.save();
        camera.rotateX(30);
        camera.getMatrix(matrix);
        camera.restore();
        canvas.save();
        matrix.postTranslate(center1X, center1Y);
        matrix.preTranslate(-center1X, -center1Y);
        canvas.concat(matrix);
        canvas.drawBitmap(bitmap, point1.x, point1.y, paint);
        canvas.restore();

        matrix.reset();
        camera.save();
        camera.rotateY(30);
        camera.getMatrix(matrix);
        camera.restore();
        canvas.save();
        matrix.postTranslate(center2X,center3Y);
        matrix.preTranslate(-center2X,-center3Y);
        canvas.concat(matrix);
        canvas.drawBitmap(bitmap, point2.x, point2.y, paint);
        canvas.restore();

    }
}
