            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            
            public final class Oilo101I11l0 {
                public final Collection I00000oIO;
                public final boolean I00000oOI;
                public final OllO00oiil I0000Il00O;
                public final OllO00oiil I0000O;
                public final OllO00oiil I0000oI00;
                public final OllO00oiil I0001Ioi1lo;
                public final OllO00oiil I000II;

                public Oilo101I11l0(Collection collection, boolean z) {
/* 4 */             this.I00000oIO = collection;
/* 6 */             this.I00000oOI = z;
/* 11 */            Oilo100II oilo100II = new Oilo100II(0);
/* 14 */            oilo100II.I00iiI = this;
/* 16 */            VarHandle.storeStoreFence();
/* 24 */            this.I0000Il00O = new OllO00oiil(oilo100II);
/* 29 */            Oilo100II oilo100II2 = new Oilo100II(1);
/* 32 */            oilo100II2.I00iiI = this;
/* 34 */            VarHandle.storeStoreFence();
/* 42 */            this.I0000O = new OllO00oiil(oilo100II2);
/* 47 */            Oilo100II oilo100II3 = new Oilo100II(2);
/* 50 */            oilo100II3.I00iiI = this;
/* 52 */            VarHandle.storeStoreFence();
/* 60 */            this.I0000oI00 = new OllO00oiil(oilo100II3);
/* 65 */            Oilo100II oilo100II4 = new Oilo100II(3);
/* 68 */            oilo100II4.I00iiI = this;
/* 70 */            VarHandle.storeStoreFence();
/* 78 */            this.I0001Ioi1lo = new OllO00oiil(oilo100II4);
/* 83 */            Oilo100II oilo100II5 = new Oilo100II(4);
/* 86 */            oilo100II5.I00iiI = this;
/* 88 */            VarHandle.storeStoreFence();
/* 96 */            this.I000II = new OllO00oiil(oilo100II5);
                }

                public final void I00000oIO(IiIO1ol1i1o0 iiIO1ol1i1o0) {
                    IOoil1iiIilo iOoil1iiIilo;
                    Object next;
/* 8 */             if (l11I11lO.I0000O(3, "CXCP")) {
/* 10 */                iiIO1ol1i1o0.toString();
                    }
/* 17 */            Iterator it = this.I00000oIO.iterator();
                    while (true) {
/* 25 */                iOoil1iiIilo = null;
/* 26 */                if (!it.hasNext()) {
/* 55 */                    next = null;
                            break;
                        }
/* 28 */                next = it.next();
/* 33 */                Ool10o ool10o = (Ool10o) next;
/* 52 */                if ((this.I00000oOI ? ool10o.I00100l0 : ool10o.I00100o1O0lo).I00000oOI().contains(iiIO1ol1i1o0)) {
                            break;
                        }
                    }
/* 56 */            Ool10o ool10o2 = (Ool10o) next;
/* 63 */            OillooOlI oillooOlI = ool10o2 != null ? ool10o2.I00100l0 : null;
/* 64 */            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 81 */            iOi1II01i0.I0000O(il001oo1.I00000oIO(O1OI1l011OO1.I00000oIO.I00ilI0I1), null, null, new I1iOI0oo(oillooOlI, iOoil1iiIilo, 19), 3);
                }
            }
