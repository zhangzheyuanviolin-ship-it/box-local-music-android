            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iilI1O0il0 {
                public static final int I00000oIO(IloI0lOlll1 iloI0lOlll1) {
/* 1 */             iloI0lOlll1.getClass();
/* 6 */             return Long.hashCode(iloI0lOlll1.I00OI1);
                }

                public static final long I00000oOI(IloI0lOlll1 iloI0lOlll1) {
/* 1 */             return iloI0lOlll1.I00OI1;
                }

                public static final Ilo1oli I0000Il00O(IloI0lOlll1 iloI0lOlll1) {
/* 5 */             iloI0lOlll1.I00Ol10(206, IOl1II00.I0000oI00);
/* 10 */            if (iloI0lOlll1.I00O10llo) {
/* 14 */                Ol11il011o0.I001iOo1i0O(iloI0lOlll1.I00IioO0OiOi);
                    }
/* 17 */            Object objI00IioO0OiOi = iloI0lOlll1.I00IioO0OiOi();
/* 28 */            IloI1lO1IiI0 oi11lOiI1i = objI00IioO0OiOi instanceof IloI1lO1IiI0 ? (IloI1lO1IiI0) objI00IioO0OiOi : null;
/* 29 */            if (oi11lOiI1i == null) {
/* 37 */                long j = iloI0lOlll1.I00OI1;
/* 39 */                boolean z = iloI0lOlll1.I00100o1O0lo;
/* 41 */                boolean z2 = iloI0lOlll1.I001lloI;
/* 43 */                Ilo1oli ilo1oli = new Ilo1oli();
/* 46 */                ilo1oli.I000II = iloI0lOlll1;
/* 48 */                ilo1oli.I00000oIO = j;
/* 50 */                ilo1oli.I00000oOI = z;
/* 52 */                ilo1oli.I0000Il00O = z2;
/* 54 */                OI10IIO oi10iio = OiO11lliO.I00000oIO;
/* 61 */                ilo1oli.I0000oI00 = new OI10IIO();
/* 72 */                ilo1oli.I0001Ioi1lo = new OIooliIO0(OO0lO0l0.I00iio, IOO0o0I1l.I00ilI0I1);
/* 74 */                VarHandle.storeStoreFence();
/* 77 */                Ilo1loO ilo1loO = new Ilo1loO();
/* 80 */                ilo1loO.I00iOIl = ilo1oli;
/* 82 */                VarHandle.storeStoreFence();
/* 86 */                oi11lOiI1i = new Oi11lOiI1i(ilo1loO, -1);
/* 89 */                iloI0lOlll1.I00ilI0I1(oi11lOiI1i);
                    }
/* 96 */            Ilo1oli ilo1oli2 = ((Ilo1loO) oi11lOiI1i.I00000oIO).I00iOIl;
/* 104 */           ilo1oli2.I0001Ioi1lo.setValue(iloI0lOlll1.I000lI());
/* 108 */           iloI0lOlll1.I0010I0i(false);
/* 168 */           return ilo1oli2;
                }
            }
