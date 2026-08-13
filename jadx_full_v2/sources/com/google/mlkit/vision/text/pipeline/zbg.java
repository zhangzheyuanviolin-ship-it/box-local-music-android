            package com.google.mlkit.vision.text.pipeline;

            import java.util.Iterator;
            import java.util.List;
            import p000.i0iIIoO;
            
            final class zbg {
                public static String zba(List list) {
/* 1 */             Iterator it = list.iterator();
/* 5 */             float fI000oI1ioi = 0.0f;
/* 6 */             String strI00100l0 = "und";
/* 12 */            while (it.hasNext()) {
/* 18 */                i0iIIoO i0iiioo = (i0iIIoO) it.next();
/* 26 */                if (fI000oI1ioi < i0iiioo.I000oI1ioi()) {
/* 28 */                    fI000oI1ioi = i0iiioo.I000oI1ioi();
/* 32 */                    strI00100l0 = i0iiioo.I00100l0();
                        }
                    }
/* 49 */            return strI00100l0;
                }
            }
