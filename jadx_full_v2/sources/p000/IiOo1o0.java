            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
/* 47 */    public final class IiOo1o0 extends IiOo0lO1 {
                public final OIo0il I000II;
                public final OOOloii1IoO0 I000O01llI0;
                public final String I000OOo1O;
                public final Ill0IO I000OiO;

                public IiOo1o0(OIo0il oIo0il, OOOloii1IoO0 oOOloii1IoO0, OI1IlOlol oI1IlOlol, II0O0I00oOi iI0O0I00oOi, O0I1l1l o0I1l1l, Ii10lIo0l1 ii10lIo0l1, String str, IllOOo00lI illOOo00lI) {
/* 5 */             Oi0Oooi oi0Oooi = new Oi0Oooi(oOOloii1IoO0.I00io1l);
/* 8 */             OooO111lO1OI oooO111lO1OI = OooO111lO1OI.I00000oOI;
/* 40 */            super(new IiOili0lOO1(ii10lIo0l1, oI1IlOlol, oIo0il, oi0Oooi, li1i10.I00000oIO(oOOloii1IoO0.I00ioIO), iI0O0I00oOi, o0I1l1l, null, Il01100l.I00iOIl), oOOloii1IoO0.I00iio, oOOloii1IoO0.I00ilI0I1, oOOloii1IoO0.I00ilO0, illOOo00lI);
/* 43 */            this.I000II = oIo0il;
/* 45 */            this.I000O01llI0 = oOOloii1IoO0;
/* 49 */            this.I000OOo1O = str;
/* 56 */            this.I000OiO = ((OIo0l0) oIo0il).I00ilI0I1;
                }

                @Override
                public final Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 1 */             OIIl0iOOlo oIIl0iOOlo = OIIl0iOOlo.I00iOIl;
/* 3 */             Collection collectionI000OOo1O = I000OOo1O(iiOOioIIO0, function1);
/* 15 */            Iterable iterable = (Iterable) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I000OiO;
/* 19 */            ArrayList arrayList = new ArrayList();
/* 22 */            Iterator it = iterable.iterator();
/* 30 */            while (it.hasNext()) {
/* 46 */                IOOii0O10Io0.I00100l0(arrayList, ((IOIOIoI) it.next()).I00000oOI(this.I000OiO));
                    }
/* 50 */            return IOOi0Ool1i.I00O10llo(collectionI000OOo1O, arrayList);
                }

                @Override
                public final IOIiO1lIl0l I0000oI00(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 3 */             Object obj = this.I00000oOI.I00iiI;
/* 13 */            String str = ((OIo0l0) this.I000II).I00ilI0I1.I00000oIO.I00000oIO;
/* 15 */            oI1Iio0ii1.I00000oOI();
/* 18 */            return super.I0000oI00(oI1Iio0ii1, oIIl0iOOlo);
                }

                @Override
                public final IOIOill I000l1(OI1Iio0ii1 oI1Iio0ii1) {
/* 5 */             return new IOIOill(this.I000OiO, oI1Iio0ii1);
                }

                @Override
                public final Set I000o00OoI0I() {
/* 1 */             return Il01llIol0.I00iOIl;
                }

                @Override
                public final Set I000oI1ioi() {
/* 1 */             return Il01llIol0.I00iOIl;
                }

                @Override
                public final Set I00100l0() {
/* 1 */             return Il01llIol0.I00iOIl;
                }

                @Override
                public final boolean I00100o1O0lo(OI1Iio0ii1 oI1Iio0ii1) {
/* 5 */             if (super.I00100o1O0lo(oI1Iio0ii1)) {
/* 58 */                return true;
                    }
/* 15 */            Iterable iterable = (Iterable) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I000OiO;
/* 19 */            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
/* 56 */                return false;
                    }
/* 31 */            Iterator it = iterable.iterator();
/* 39 */            while (it.hasNext()) {
/* 53 */                if (((IOIOIoI) it.next()).I0000Il00O(this.I000OiO, oI1Iio0ii1)) {
/* 58 */                    return true;
                        }
                    }
/* 56 */            return false;
                }

                public final String toString() {
/* 1 */             return this.I000OOo1O;
                }

                @Override
/* 48 */        public final void I000O01llI0(ArrayList arrayList) {
                }
            }
