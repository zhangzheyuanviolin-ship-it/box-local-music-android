            package p000;

            import java.util.List;
            
            public abstract class l101lII0l1ol {
                public static final int I00000oIO(O0o00O1Oi00 o0o00O1Oi00) {
/* 1 */             List list = o0o00O1Oi00.I000l1;
/* 8 */             if (list.isEmpty()) {
/* 7 */                 return 0;
                    }
/* 14 */            int size = list.size();
/* 18 */            int i = 0;
/* 19 */            for (int i2 = 0; i2 < size; i2++) {
/* 29 */                i += ((O0o0100I) list.get(i2)).I000oI1ioi;
                    }
/* 40 */            return (i / list.size()) + o0o00O1Oi00.I0010I0i;
                }
            }
