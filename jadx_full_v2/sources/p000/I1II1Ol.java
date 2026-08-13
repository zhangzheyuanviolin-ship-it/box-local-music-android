            package p000;

            import android.content.Context;
            import android.graphics.RectF;
            import android.widget.TextView;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class I1II1Ol {
                public int I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public float I0000O;
                public int[] I0000oI00;
                public boolean I0001Ioi1lo;
                public TextView I000II;
                public Context I000O01llI0;

                static {
/* 3 */             new RectF();
/* 8 */             new ConcurrentHashMap();
                }

                public static int[] I00000oIO(int[] iArr) {
/* 1 */             int length = iArr.length;
/* 2 */             if (length != 0) {
/* 5 */                 Arrays.sort(iArr);
/* 10 */                ArrayList arrayList = new ArrayList();
/* 15 */                for (int i : iArr) {
/* 19 */                    if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
/* 35 */                        arrayList.add(Integer.valueOf(i));
                            }
                        }
/* 45 */                if (length != arrayList.size()) {
/* 48 */                    int size = arrayList.size();
/* 52 */                    int[] iArr2 = new int[size];
/* 54 */                    for (int i2 = 0; i2 < size; i2++) {
/* 66 */                        iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                            }
/* 77 */                    return iArr2;
                        }
                    }
/* 47 */            return iArr;
                }

                public final boolean I00000oOI() {
/* 5 */             return !(this.I000II instanceof I1I00Ii);
                }
            }
