            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class O0olIIIOllio {
                public static final List I00000oOI;
                public int I00000oIO;

                static {
/* 3 */             O0olIIIOllio o0olIIIOllio = new O0olIIIOllio();
/* 7 */             o0olIIIOllio.I00000oIO = 1;
/* 9 */             VarHandle.storeStoreFence();
/* 14 */            O0olIIIOllio o0olIIIOllio2 = new O0olIIIOllio();
/* 18 */            o0olIIIOllio2.I00000oIO = 2;
/* 20 */            VarHandle.storeStoreFence();
/* 25 */            O0olIIIOllio o0olIIIOllio3 = new O0olIIIOllio();
/* 29 */            o0olIIIOllio3.I00000oIO = 4;
/* 31 */            VarHandle.storeStoreFence();
/* 42 */            I00000oOI = IOOi1I.I000O01llI0(o0olIIIOllio, o0olIIIOllio2, o0olIIIOllio3);
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof O0olIIIOllio) && this.I00000oIO == ((O0olIIIOllio) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
/* 4 */             if (i == 1) {
/* 6 */                 return "CR";
                    }
/* 10 */            if (i == 2) {
/* 12 */                return "LF";
                    }
/* 16 */            if (i == 4) {
/* 18 */                return "CRLF";
                    }
/* 21 */            List list = I00000oOI;
/* 27 */            ArrayList arrayList = new ArrayList();
/* 38 */            for (Object obj : list) {
/* 50 */                if ((((O0olIIIOllio) obj).I00000oIO | i) == i) {
/* 52 */                    arrayList.add(obj);
                        }
                    }
/* 56 */            return arrayList.toString();
                }
            }
