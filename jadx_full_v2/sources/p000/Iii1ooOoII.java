            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class Iii1ooOoII extends IlIiOO0ilI {
                public IlIiOO0ilI I00iiI;

                @Override
                public final Ol0i0olI I00000oIO(OO0IIO1Il oO0IIO1Il) {
/* 3 */             return this.I00iiI.I00000oIO(oO0IIO1Il);
                }

                @Override
                public final void I0000Il00O(OO0IIO1Il oO0IIO1Il, OO0IIO1Il oO0IIO1Il2) {
/* 3 */             this.I00iiI.I0000Il00O(oO0IIO1Il, oO0IIO1Il2);
                }

                @Override
                public final void I000II(OO0IIO1Il oO0IIO1Il) {
/* 3 */             this.I00iiI.I000II(oO0IIO1Il);
                }

                @Override
                public final void I000O01llI0(OO0IIO1Il oO0IIO1Il) {
/* 3 */             this.I00iiI.I000O01llI0(oO0IIO1Il);
                }

                @Override
                public final List I00100l0(OO0IIO1Il oO0IIO1Il) {
/* 3 */             List listI00100l0 = this.I00iiI.I00100l0(oO0IIO1Il);
/* 11 */            ArrayList arrayList = new ArrayList();
/* 14 */            Iterator it = listI00100l0.iterator();
/* 22 */            while (it.hasNext()) {
/* 30 */                arrayList.add((OO0IIO1Il) it.next());
                    }
/* 34 */            IOOiOil.I000o00OoI0I(arrayList);
/* 49 */            return arrayList;
                }

                @Override
                public final IlIOoOIo0l I001l0I00(OO0IIO1Il oO0IIO1Il) {
/* 3 */             IlIOoOIo0l ilIOoOIo0lI001l0I00 = this.I00iiI.I001l0I00(oO0IIO1Il);
/* 7 */             if (ilIOoOIo0lI001l0I00 == null) {
/* 9 */                 return null;
                    }
/* 11 */            OO0IIO1Il oO0IIO1Il2 = ilIOoOIo0lI001l0I00.I0000Il00O;
                    return oO0IIO1Il2 == null ? ilIOoOIo0lI001l0I00 : new IlIOoOIo0l(ilIOoOIo0lI001l0I00.I00000oIO, ilIOoOIo0lI001l0I00.I00000oOI, oO0IIO1Il2, ilIOoOIo0lI001l0I00.I0000O, ilIOoOIo0lI001l0I00.I0000oI00, ilIOoOIo0lI001l0I00.I0001Ioi1lo, ilIOoOIo0lI001l0I00.I000II, ilIOoOIo0lI001l0I00.I000O01llI0);
                }

                @Override
                public final Ol0i0olI I00IOO(OO0IIO1Il oO0IIO1Il) {
/* 1 */             OO0IIO1Il oO0IIO1IlI00000oOI = oO0IIO1Il.I00000oOI();
/* 5 */             if (oO0IIO1IlI00000oOI != null) {
/* 9 */                 I1Il0loi i1Il0loi = new I1Il0loi();
/* 12 */                while (oO0IIO1IlI00000oOI != null && !I000l1(oO0IIO1IlI00000oOI)) {
/* 20 */                    i1Il0loi.addFirst(oO0IIO1IlI00000oOI);
/* 23 */                    oO0IIO1IlI00000oOI = oO0IIO1IlI00000oOI.I00000oOI();
                        }
/* 28 */                Iterator<E> it = i1Il0loi.iterator();
/* 36 */                while (it.hasNext()) {
/* 44 */                    I000II((OO0IIO1Il) it.next());
                        }
                    }
/* 50 */            return this.I00iiI.I00IOO(oO0IIO1Il);
                }

                @Override
                public final OlI1ii I00IioO0OiOi(OO0IIO1Il oO0IIO1Il) {
/* 3 */             return this.I00iiI.I00IioO0OiOi(oO0IIO1Il);
                }

                @Override
                public final void close() {
/* 3 */             this.I00iiI.close();
                }

                public final String toString() {
/* 36 */            return OOoOl0i.I00000oIO.I00000oOI(Iii1ooOoII.class).I000oI1ioi() + '(' + this.I00iiI + ')';
                }
            }
