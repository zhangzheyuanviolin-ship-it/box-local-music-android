            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            
            public final class I1Ilill extends IOOi01 {
                public final I1IlOI0O I00000oOI;

                public I1Ilill(O0O01001OOII o0o01001ooii) {
/* 1 */             super(o0o01001ooii);
/* 13 */            this.I00000oOI = new I1IlOI0O(o0o01001ooii.I0000O());
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final Object I0000oI00() {
/* 3 */             return new ArrayList();
                }

                @Override
                public final int I0001Ioi1lo(Object obj) {
/* 3 */             return ((ArrayList) obj).size();
                }

                @Override
                public final Iterator I000II(Object obj) {
/* 3 */             return ((Collection) obj).iterator();
                }

                @Override
                public final int I000O01llI0(Object obj) {
/* 3 */             return ((Collection) obj).size();
                }

                @Override
                public final Object I000iOII(Object obj) {
                    throw null;
                }

                @Override
                public final Object I000l1(Object obj) {
/* 1 */             return (ArrayList) obj;
                }

                @Override
                public final void I000lI(int i, Object obj, Object obj2) {
/* 3 */             ((ArrayList) obj).add(i, obj2);
                }
            }
