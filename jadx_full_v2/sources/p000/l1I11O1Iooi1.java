            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            
            public abstract class l1I11O1Iooi1 {
                public static ColorStateList I00000oIO(Context context, TypedArray typedArray, int i) {
                    int resourceId;
                    ColorStateList colorStateListI00000oOI;
                    return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListI00000oOI = iOI10i0I11.I00000oOI(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListI00000oOI;
                }
            }
