            package p000;
            
            public final class OIi1lIio extends IlO1i1lOIi {
                public static final OIi1lIio I0000O = new OIi1lIio(0, 2, 1);

                @Override
                public final void I0000O(IOOOi1 iOOOi1, I1IOO010 i1ioo010, Ol11il011o0 ol11il011o0, OOoo1il oOoo1il, OIiOolI1lio oIiOolI1lio) {
/* 6 */             Ilo1iIi1OI01 ilo1iIi1OI01 = (Ilo1iIi1OI01) iOOOi1.I0001Ioi1lo(0);
/* 9 */             Object objI0001Ioi1lo = iOOOi1.I0001Ioi1lo(1);
/* 15 */            if (objI0001Ioi1lo instanceof IloI1lO1IiI0) {
/* 18 */                IloI1lO1IiI0 iloI1lO1IiI0 = (IloI1lO1IiI0) objI0001Ioi1lo;
/* 24 */                ((OI110O0) oOoo1il.I0000O).I00000oOI(iloI1lO1IiI0);
/* 31 */                ((OI10IIO) oOoo1il.I000II).I00000oIO(iloI1lO1IiI0);
                    }
/* 36 */            if (ol11il011o0.I000o00OoI0I != 0) {
/* 41 */                IOl1II00.I00000oIO("Can only append a slot if not current inserting");
                    }
/* 44 */            int i = ol11il011o0.I000OOo1O;
/* 46 */            int i2 = ol11il011o0.I000OiO;
/* 48 */            int iI0000Il00O = ol11il011o0.I0000Il00O(ilo1iIi1OI01);
/* 60 */            int iI0001Ioi1lo = ol11il011o0.I0001Ioi1lo(ol11il011o0.I00000oOI, ol11il011o0.I00100o1O0lo(iI0000Il00O + 1));
/* 64 */            ol11il011o0.I000OOo1O = iI0001Ioi1lo;
/* 66 */            ol11il011o0.I000OiO = iI0001Ioi1lo;
/* 68 */            ol11il011o0.I001i1O0Ol(1, iI0000Il00O);
/* 71 */            if (i >= iI0001Ioi1lo) {
/* 73 */                i++;
/* 75 */                i2++;
                    }
/* 79 */            ol11il011o0.I0000Il00O[iI0001Ioi1lo] = objI0001Ioi1lo;
/* 81 */            ol11il011o0.I000OOo1O = i;
/* 83 */            ol11il011o0.I000OiO = i2;
                }
            }
