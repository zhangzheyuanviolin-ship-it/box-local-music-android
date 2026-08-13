            package p000;

            import android.graphics.drawable.Drawable;
            import android.view.textclassifier.TextClassification;
            import java.lang.invoke.VarHandle;
            
            public abstract class lOiolIl1l101 {
                public static final void I00000oIO(OloilI0Ol oloilI0Ol, Object obj, TextClassification textClassification, int i, Drawable drawable) {
/* 3 */             Oloo0Oooi oloo0Oooi = new Oloo0Oooi(obj);
/* 6 */             oloo0Oooi.I00000oOI = textClassification;
/* 8 */             oloo0Oooi.I0000Il00O = i;
/* 10 */            oloo0Oooi.I0000O = drawable;
/* 12 */            VarHandle.storeStoreFence();
/* 17 */            oloilI0Ol.I00000oIO.I00000oOI(oloo0Oooi);
                }
            }
