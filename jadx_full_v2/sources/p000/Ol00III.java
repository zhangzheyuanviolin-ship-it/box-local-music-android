            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ol00III {
                public static final l1I0oI I00000oIO = new l1I0oI(15);
                public static final lOOlOoll I00000oOI = new lOOlOoll(15);

                public static OlO00IIi I00000oIO(int i) {
/* 9 */             long j = (i & 1) != 0 ? 0L : 5000L;
/* 13 */            OlO00IIi olO00IIi = new OlO00IIi();
/* 16 */            olO00IIi.I00000oIO = j;
/* 20 */            if (j >= 0) {
/* 22 */                VarHandle.storeStoreFence();
/* 25 */                return olO00IIi;
                    }
/* 34 */            I000II.I0010I0i(IlIi0I0.I000l1(j, "stopTimeout(", " ms) cannot be negative"));
/* 37 */            return null;
                }
            }
