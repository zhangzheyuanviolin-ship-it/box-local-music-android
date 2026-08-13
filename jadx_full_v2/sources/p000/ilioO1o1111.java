            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            
            public abstract class ilioO1o1111 {
                public static int I00000oIO(Context context, int i) throws Resources.NotFoundException {
/* 8 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
/* 14 */            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
/* 18 */            typedArrayObtainStyledAttributes.recycle();
/* 37 */            return resourceId;
                }
            }
