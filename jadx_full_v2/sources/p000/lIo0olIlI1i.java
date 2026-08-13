            package p000;

            import kotlin.jvm.functions.Function1;
            
            public abstract class lIo0olIlI1i {
                public static final void I00000oIO(I1Io0i0II i1Io0i0II, Function1 function1) {
/* 5 */             I1Io0i0II i1Io0i0II2 = new I1Io0i0II(999);
/* 8 */             int i = i1Io0i0II.I00iiO;
/* 11 */            int i2 = 0;
/* 12 */            int i3 = 0;
/* 13 */            while (i2 < i) {
/* 23 */                i1Io0i0II2.put(i1Io0i0II.I000II(i2), i1Io0i0II.I000OiO(i2));
/* 26 */                i2++;
/* 28 */                i3++;
/* 30 */                if (i3 == 999) {
/* 32 */                    function1.invoke(i1Io0i0II2);
/* 35 */                    i1Io0i0II2.clear();
/* 38 */                    i3 = 0;
                        }
                    }
/* 40 */            if (i3 > 0) {
/* 42 */                function1.invoke(i1Io0i0II2);
                    }
                }
            }
