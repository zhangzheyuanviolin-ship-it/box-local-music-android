            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class li0I0lOII0o {
                public static int I00000oIO(float f) {
/* 14 */            return (int) ((lIiioliIlo.I00000oOI(f, 0.0f, 1.0f) * 255.0f) + 0.5f);
                }

                public static List I00000oOI(int i, int i2) {
/* 3 */             int i3 = 0;
/* 4 */             if (i <= 128) {
/* 10 */                return Collections.singletonList(0);
                    }
/* 17 */            ArrayList arrayList = new ArrayList();
/* 22 */            while (i3 + Barcode.FORMAT_ITF < i) {
/* 28 */                arrayList.add(Integer.valueOf(i3));
/* 31 */                i3 += i2;
                    }
/* 38 */            arrayList.add(Integer.valueOf(i - Barcode.FORMAT_ITF));
/* 41 */            return IOOi0Ool1i.I001i1lo1io(arrayList);
                }
            }
