            package p000;

            import android.R;
            import android.content.Context;
            
            public abstract class Ioo1l1i00O {
                public static Context I00000oIO;
                public static Boolean I00000oOI;
                public static final int[] I0000Il00O = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
                public static final int[] I0000O = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
                public static final int[] I0000oI00 = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
                public static final int[] I0001Ioi1lo = {R.attr.name, R.attr.pathData};

                public static synchronized boolean I00000oIO(Context context) {
                    Boolean bool;
/* 4 */             Context applicationContext = context.getApplicationContext();
/* 8 */             Context context2 = I00000oIO;
/* 10 */            if (context2 != null && (bool = I00000oOI) != null && context2 == applicationContext) {
/* 19 */                return bool.booleanValue();
                    }
/* 28 */            I00000oOI = null;
/* 38 */            Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
/* 42 */            I00000oOI = boolValueOf;
/* 44 */            I00000oIO = applicationContext;
/* 46 */            return boolValueOf.booleanValue();
                }
            }
