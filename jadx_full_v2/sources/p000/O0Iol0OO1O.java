            package p000;

            import java.util.Collection;
            
            public final class O0Iol0OO1O extends O0IiOio0lo0 {
                public static final int I00iio = 0;
                public Class I00iiI;
                public O0ioIllo0i1 I00iiO;

                @Override
                public final Class I001l0I00() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final Collection I001lloI() {
/* 1 */             return Il01100l.I00iOIl;
                }

                @Override
                public final Collection I00II0Ol1O0l(OI1Iio0ii1 oI1Iio0ii1) {
/* 9 */             OOoOiOo01lo oOoOiOo01lo = ((O0IoOilol1) this.I00iiO.getValue()).I0000O;
/* 14 */            O0O00I1Ili o0O00I1Ili = O0IoOilol1.I0001Ioi1lo[1];
/* 24 */            return ((O1iil1I01o) oOoOiOo01lo.invoke()).I00000oIO(oI1Iio0ii1, OIIl0iOOlo.I00iiI);
                }

                @Override
                public final OOOO01l I00II0oii1o(int i) {
/* 9 */             OOoOiOo01lo oOoOiOo01lo = ((O0IoOilol1) this.I00iiO.getValue()).I0000O;
/* 14 */            O0O00I1Ili o0O00I1Ili = O0IoOilol1.I0001Ioi1lo[1];
/* 20 */            O1iil1I01o o1iil1I01o = (O1iil1I01o) oOoOiOo01lo.invoke();
/* 30 */            IiOo1o0 iiOo1o0 = o1iil1I01o instanceof IiOo1o0 ? (IiOo1o0) o1iil1I01o : null;
/* 31 */            if (iiOo1o0 != null) {
/* 34 */                IiOili0lOO1 iiOili0lOO1 = iiOo1o0.I00000oOI;
/* 36 */                OOOloii1IoO0 oOOloii1IoO0 = iiOo1o0.I000O01llI0;
/* 45 */                OOOo0i11Ol oOOo0i11Ol = (OOOo0i11Ol) lIOIiol1IoI.I00000oOI(oOOloii1IoO0, O0IIoOIiII0O.I000l1, i);
/* 47 */                if (oOOo0i11Ol != null) {
/* 74 */                    return (OOOO01l) Oolli0oi0.I0000O(this.I00iiI, oOOo0i11Ol, (OI1IlOlol) iiOili0lOO1.I00iiO, new Oi0Oooi(oOOloii1IoO0.I00io1l), (II0O0I00oOi) iiOili0lOO1.I00io1l, I00ilI0I1.I00ilO0);
                        }
                    }
/* 24 */            return null;
                }

                @Override
                public final Class I00IO1() {
/* 15 */            Class cls = (Class) ((O0IoOilol1) this.I00iiO.getValue()).I0000oI00.getValue();
                    return cls == null ? this.I00iiI : cls;
                }

                @Override
                public final Collection I00IO1oi11O(OI1Iio0ii1 oI1Iio0ii1) {
/* 9 */             OOoOiOo01lo oOoOiOo01lo = ((O0IoOilol1) this.I00iiO.getValue()).I0000O;
/* 14 */            O0O00I1Ili o0O00I1Ili = O0IoOilol1.I0001Ioi1lo[1];
/* 24 */            return ((O1iil1I01o) oOoOiOo01lo.invoke()).I0001Ioi1lo(oI1Iio0ii1, OIIl0iOOlo.I00iiI);
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof O0Iol0OO1O) && this.I00iiI.equals(((O0Iol0OO1O) obj).I00iiI);
                }

                public final int hashCode() {
/* 3 */             return this.I00iiI.hashCode();
                }

                public final String toString() {
/* 21 */            return "file class " + OOo1Io0I0.I00000oIO(this.I00iiI).I00000oIO();
                }
            }
