            package p000;

            import java.util.Iterator;
            
            public abstract class I00ooiO1I implements O0O01001OOII {
                @Override
                public Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             return I000OOo1O(ii1iO1O);
                }

                public abstract Object I0000oI00();

                public abstract int I0001Ioi1lo(Object obj);

                public abstract Iterator I000II(Object obj);

                public abstract int I000O01llI0(Object obj);

                public final Object I000OOo1O(Ii1iO1O ii1iO1O) {
/* 1 */             Object objI0000oI00 = I0000oI00();
/* 5 */             int iI0001Ioi1lo = I0001Ioi1lo(objI0000oI00);
/* 13 */            IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(I0000O());
                    while (true) {
/* 21 */                int iI000II = iOl1ii1loOI00000oOI.I000II(I0000O());
/* 26 */                if (iI000II == -1) {
/* 37 */                    iOl1ii1loOI00000oOI.I000oI1ioi(I0000O());
/* 40 */                    return I000l1(objI0000oI00);
                        }
/* 29 */                I000OiO(iOl1ii1loOI00000oOI, iI000II + iI0001Ioi1lo, objI0000oI00);
                    }
                }

                public abstract void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj);

                public abstract Object I000iOII(Object obj);

                public abstract Object I000l1(Object obj);
            }
