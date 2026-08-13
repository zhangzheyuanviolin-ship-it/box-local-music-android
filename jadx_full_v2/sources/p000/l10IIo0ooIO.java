            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class l10IIo0ooIO {
                public static final void I00000oIO(OooioIIoi0O oooioIIoi0O, I1I0i0Ilo1Oi i1I0i0Ilo1Oi, I01O1lIi i01O1lIi) {
/* 7 */             OiIo0IlO1Il0 oiIo0IlO1Il0 = (OiIo0IlO1Il0) oooioIIoi0O.I0000Il00O("androidx.lifecycle.savedstate.vm.tag");
/* 9 */             if (oiIo0IlO1Il0 == null || oiIo0IlO1Il0.I00iiO) {
/* 98 */                return;
                    }
/* 15 */            oiIo0IlO1Il0.I00000oIO(i1I0i0Ilo1Oi, i01O1lIi);
/* 18 */            O0oOi0I o0oOi0II00ol1 = i01O1lIi.I00ol1();
/* 24 */            if (o0oOi0II00ol1 == O0oOi0I.I00iiI || o0oOi0II00ol1.I00000oIO(O0oOi0I.I00iio)) {
/* 52 */                i1I0i0Ilo1Oi.I00Ol10();
/* 98 */                return;
                    }
/* 38 */            IiI01001l1I iiI01001l1I = new IiI01001l1I(1);
/* 41 */            iiI01001l1I.I00iiI = i01O1lIi;
/* 43 */            iiI01001l1I.I00iiO = i1I0i0Ilo1Oi;
/* 45 */            VarHandle.storeStoreFence();
/* 48 */            i01O1lIi.I00li1OI(iiI01001l1I);
                }
            }
