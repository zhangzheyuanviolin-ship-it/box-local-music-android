            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIiIOOo extends IlO1i1lOIi {
                public static final OIiIOOo I0000O = new OIiIOOo(0, 3, 1);

                @Override
                public final void I0000O(IOOOi1 iOOOi1, I1IOO010 i1ioo010, Ol11il011o0 ol11il011o0, OOoo1il oOoo1il, OIiOolI1lio oIiOolI1lio) {
                    I1I0i0Ilo1Oi i1I0i0Ilo1Oi;
/* 6 */             Ol11i0000Oo ol11i0000Oo = (Ol11i0000Oo) iOOOi1.I0001Ioi1lo(1);
/* 13 */            Ilo1iIi1OI01 ilo1iIi1OI01 = (Ilo1iIi1OI01) iOOOi1.I0001Ioi1lo(0);
/* 20 */            IlO11OO01 ilO11OO01 = (IlO11OO01) iOOOi1.I0001Ioi1lo(2);
/* 22 */            Ol11il011o0 ol11il011o0I000lI = ol11i0000Oo.I000lI();
/* 26 */            if (oIiOolI1lio != null) {
                        try {
/* 32 */                    i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(21);
/* 35 */                    i1I0i0Ilo1Oi.I00iiI = oIiOolI1lio;
/* 37 */                    i1I0i0Ilo1Oi.I00iiO = ol11il011o0;
/* 39 */                    VarHandle.storeStoreFence();
                        } catch (Throwable th) {
/* 84 */                    ol11il011o0I000lI.I0000oI00(false);
/* 399 */                   throw th;
                        }
                    } else {
/* 45 */                i1I0i0Ilo1Oi = null;
                    }
/* 52 */            if (!ilO11OO01.I00000oOI.I0000Il00O()) {
/* 56 */                IOl1II00.I00000oIO("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                    }
/* 61 */            ilO11OO01.I00000oIO.I00000oOI(i1ioo010, ol11il011o0I000lI, oOoo1il, i1I0i0Ilo1Oi);
/* 64 */            ol11il011o0I000lI.I0000oI00(true);
/* 67 */            ol11il011o0.I0000O();
/* 70 */            ilo1iIi1OI01.getClass();
/* 77 */            ol11il011o0.I001l0I00(ol11i0000Oo, ol11i0000Oo.I00000oOI(ilo1iIi1OI01));
/* 80 */            ol11il011o0.I000OiO();
                }
            }
