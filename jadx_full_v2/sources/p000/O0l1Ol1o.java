            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class O0l1Ol1o implements I11IlOOO {
                public final o01l1ioOo0 I00iOIl;
                public final O00l0Oi0o I00iiI;
                public final boolean I00iiO;
                public final I1ooIoloo0 I00iio;

                public O0l1Ol1o(o01l1ioOo0 o01l1iooo0, O00l0Oi0o o00l0Oi0o, boolean z) {
/* 4 */             this.I00iOIl = o01l1iooo0;
/* 6 */             this.I00iiI = o00l0Oi0o;
/* 8 */             this.I00iiO = z;
/* 16 */            O1I0OloI o1I0OloI = (O1I0OloI) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I00000oIO;
/* 22 */            I00iiI i00iiI = new I00iiI(20);
/* 25 */            i00iiI.I00iiI = this;
/* 27 */            VarHandle.storeStoreFence();
/* 34 */            this.I00iio = o1I0OloI.I0000Il00O(i00iiI);
                }

                @Override
                public final boolean I001l0I00(Ill0IO ill0IO) {
                    return I00IOO(ill0IO) != null;
                }

                @Override
                public final I111oOiIiO0 I00IOO(Ill0IO ill0IO) {
                    I111oOiIiO0 i111oOiIiO0;
/* 1 */             O00l0Oi0o o00l0Oi0o = this.I00iiI;
/* 3 */             OOo1O1i oOo1O1iI00000oIO = o00l0Oi0o.I00000oIO(ill0IO);
/* 7 */             if (oOo1O1iI00000oIO != null && (i111oOiIiO0 = (I111oOiIiO0) this.I00iio.invoke(oOo1O1iI00000oIO)) != null) {
/* 20 */                return i111oOiIiO0;
                    }
/* 21 */            OI1Iio0ii1 oI1Iio0ii1 = O00ioI0Ii1Io.I00000oIO;
/* 25 */            return O00ioI0Ii1Io.I00000oIO(ill0IO, o00l0Oi0o, this.I00iOIl);
                }

                @Override
                public final boolean isEmpty() {
                    return this.I00iiI.getAnnotations().isEmpty();
                }

                @Override
                public final Iterator iterator() {
/* 1 */             O00l0Oi0o o00l0Oi0o = this.I00iiI;
/* 17 */            OoI10o0iO11O ooI10o0iO11O = new OoI10o0iO11O(IOOi0Ool1i.I001IO000(o00l0Oi0o.getAnnotations()), this.I00iio);
/* 20 */            OI1Iio0ii1 oI1Iio0ii1 = O00ioI0Ii1Io.I00000oIO;
/* 26 */            OO1o0I011 oO1o0I011I00000oIO = O00ioI0Ii1Io.I00000oIO(OlIllOO11lOl.I000lI, o00l0Oi0o, this.I00iOIl);
/* 33 */            I1Iolliil0i i1Iolliil0i = new I1Iolliil0i(5);
/* 36 */            i1Iolliil0i.I00000oOI = oO1o0I011I00000oIO;
/* 38 */            VarHandle.storeStoreFence();
/* 69 */            return new IlIo0o(OilO1oiooiII.I000O01llI0(I1IoiO1l.I0000Il00O(new OilO0iOl[]{ooI10o0iO11O, i1Iolliil0i})), false, new OiioI1Io0o(4)).iterator();
                }
            }
