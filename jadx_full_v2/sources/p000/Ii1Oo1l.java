            package p000;

            import android.R;
            
            public abstract class Ii1Oo1l {
                public static final int[] I00000oIO = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
                public static final int[] I00000oOI = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
                public static final int[] I0000Il00O = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
                public static final int[] I0000O = {R.attr.name, R.attr.pathData, R.attr.fillType};
                public static final int[] I0000oI00 = {R.attr.drawable};
                public static final int[] I0001Ioi1lo = {R.attr.name, R.attr.animation};

                public static final String I00000oIO(Object obj) {
/* 5 */             return Integer.toHexString(System.identityHashCode(obj));
                }

                public static final String I00000oOI(IOoil1iiIilo iOoil1iiIilo) {
                    Object objI00000oIO;
/* 3 */             if (iOoil1iiIilo instanceof IiiI1lIo) {
/* 7 */                 return ((IiiI1lIo) iOoil1iiIilo).toString();
                    }
                    try {
/* 32 */                objI00000oIO = iOoil1iiIilo + '@' + I00000oIO(iOoil1iiIilo);
                    } catch (Throwable th) {
/* 38 */                objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                    }
/* 46 */            if (Oi10ii.I00000oOI(objI00000oIO) != null) {
/* 72 */                objI00000oIO = iOoil1iiIilo.getClass().getName() + '@' + I00000oIO(iOoil1iiIilo);
                    }
/* 76 */            return (String) objI00000oIO;
                }
            }
