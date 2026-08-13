            package p000;
            
            public final class OIiOi0I extends IlO1i1lOIi {
                public static final OIiOi0I I0000O = new OIiOi0I(1, 0, 2);

                @Override
                public final void I0000O(IOOOi1 iOOOi1, I1IOO010 i1ioo010, Ol11il011o0 ol11il011o0, OOoo1il oOoo1il, OIiOolI1lio oIiOolI1lio) {
/* 2 */             int iI0000oI00 = iOOOi1.I0000oI00(0);
/* 6 */             int i = ol11il011o0.I001IO000;
/* 14 */            int iI00IoiI = ol11il011o0.I00IoiI(ol11il011o0.I00000oOI, ol11il011o0.I00100o1O0lo(i));
/* 26 */            int iI0001Ioi1lo = ol11il011o0.I0001Ioi1lo(ol11il011o0.I00000oOI, ol11il011o0.I00100o1O0lo(i + 1));
/* 36 */            for (int iMax = Math.max(iI00IoiI, iI0001Ioi1lo - iI0000oI00); iMax < iI0001Ioi1lo; iMax++) {
/* 44 */                Object obj = ol11il011o0.I0000Il00O[ol11il011o0.I000II(iMax)];
/* 48 */                if (obj instanceof IloI1lO1IiI0) {
/* 52 */                    oOoo1il.I0001Ioi1lo((IloI1lO1IiI0) obj);
                        } else if (obj instanceof OOloioIl) {
/* 62 */                    ((OOloioIl) obj).I0000Il00O();
                        }
                    }
/* 70 */            if (iI0000oI00 <= 0) {
/* 73 */                IOl1II00.I00000oIO("Check failed");
                    }
/* 76 */            int i2 = ol11il011o0.I001IO000;
/* 84 */            int iI00IoiI2 = ol11il011o0.I00IoiI(ol11il011o0.I00000oOI, ol11il011o0.I00100o1O0lo(i2));
/* 100 */           int iI0001Ioi1lo2 = ol11il011o0.I0001Ioi1lo(ol11il011o0.I00000oOI, ol11il011o0.I00100o1O0lo(i2 + 1)) - iI0000oI00;
/* 101 */           if (iI0001Ioi1lo2 < iI00IoiI2) {
/* 104 */               IOl1II00.I00000oIO("Check failed");
                    }
/* 107 */           ol11il011o0.I00Io1lO(iI0001Ioi1lo2, iI0000oI00, i2);
/* 110 */           int i3 = ol11il011o0.I000OOo1O;
/* 112 */           if (i3 >= iI00IoiI2) {
/* 115 */               ol11il011o0.I000OOo1O = i3 - iI0000oI00;
                    }
                }
            }
