            package p000;

            import java.util.Iterator;
            
            public abstract class IOOi01 extends I00ooiO1I {
                public final O0O01001OOII I00000oIO;

                public IOOi01(O0O01001OOII o0o01001ooii) {
/* 4 */             this.I00000oIO = o0o01001ooii;
                }

                @Override
                public void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             int iI000O01llI0 = I000O01llI0(obj);
/* 9 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(I0000O());
/* 13 */            Iterator itI000II = I000II(obj);
/* 18 */            for (int i = 0; i < iI000O01llI0; i++) {
/* 32 */                iOl1l0o0i1I0I00000oOI.I000l1(I0000O(), i, this.I00000oIO, itI000II.next());
                    }
/* 38 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 14 */            I000lI(i, obj, iOl1ii1loO.I00100o1O0lo(I0000O(), i, this.I00000oIO, null));
                }

                public abstract void I000lI(int i, Object obj, Object obj2);
            }
