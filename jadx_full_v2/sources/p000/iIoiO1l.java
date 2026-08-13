            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            
            public abstract class iIoiO1l {
                public static final int[] I00000oIO = {R.attr.theme, com.box.gallery.R.attr.theme};
                public static final int[] I00000oOI = {com.box.gallery.R.attr.materialThemeOverlay};

                public static Context I00000oIO(Context context, AttributeSet attributeSet, int i, int i2, int[] iArr) {
/* 6 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I00000oOI, i, i2);
/* 2 */             int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
/* 17 */            typedArrayObtainStyledAttributes.recycle();
/* 20 */            int i3 = iArr2[0];
/* 35 */            boolean z = (context instanceof IOoiOIIOOIi) && ((IOoiOIIOOIi) context).I00000oIO == i3;
/* 36 */            if (i3 == 0 || z) {
/* 399 */               return context;
                    }
/* 43 */            IOoiOIIOOIi iOoiOIIOOIi = new IOoiOIIOOIi(context, i3);
/* 46 */            int length = iArr.length;
/* 47 */            int[] iArr3 = new int[length];
/* 50 */            if (iArr.length > 0) {
/* 52 */                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
/* 58 */                for (int i4 = 0; i4 < iArr.length; i4++) {
/* 64 */                    iArr3[i4] = typedArrayObtainStyledAttributes2.getResourceId(i4, 0);
                        }
/* 69 */                typedArrayObtainStyledAttributes2.recycle();
                    }
/* 73 */            for (int i5 = 0; i5 < length; i5++) {
/* 75 */                int i6 = iArr3[i5];
/* 77 */                if (i6 != 0) {
/* 83 */                    iOoiOIIOOIi.getTheme().applyStyle(i6, true);
                        }
                    }
/* 91 */            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, I00000oIO);
/* 95 */            int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
/* 99 */            int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
/* 103 */           typedArrayObtainStyledAttributes3.recycle();
/* 106 */           if (resourceId == 0) {
/* 109 */               resourceId = resourceId2;
                    }
/* 110 */           if (resourceId != 0) {
/* 116 */               iOoiOIIOOIi.getTheme().applyStyle(resourceId, true);
                    }
/* 119 */           return iOoiOIIOOIi;
                }
            }
