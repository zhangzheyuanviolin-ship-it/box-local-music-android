            package p000;
            
            public abstract class iOlOOOll1OiI implements Cloneable {
                public final iOlOoOlI0li1 I00iOIl;
                public iOlOoOlI0li1 I00iiI;

                public iOlOOOll1OiI(iOlOoOlI0li1 ioloooli0li1) {
/* 4 */             this.I00iOIl = ioloooli0li1;
/* 10 */            if (ioloooli0li1.I00000oIO()) {
/* 24 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 19 */            this.I00iiI = (iOlOoOlI0li1) ioloooli0li1.I000O01llI0(4);
                }

                public final iOlOoOlI0li1 I00000oIO() {
/* 3 */             boolean zI00000oIO = this.I00iiI.I00000oIO();
/* 7 */             iOlOoOlI0li1 ioloooli0li1 = this.I00iiI;
/* 9 */             if (!zI00000oIO) {
/* 11 */                return ioloooli0li1;
                    }
/* 12 */            ioloooli0li1.getClass();
/* 25 */            iOloOOOIOII.I00000oOI.I00000oIO(ioloooli0li1.getClass()).I0000O(ioloooli0li1);
/* 28 */            ioloooli0li1.I00000oOI();
/* 31 */            return this.I00iiI;
                }

                public final Object clone() {
/* 8 */             iOlOOOll1OiI ioloooll1oii = (iOlOOOll1OiI) this.I00iOIl.I000O01llI0(5);
/* 14 */            ioloooll1oii.I00iiI = I00000oIO();
/* 20 */            return ioloooll1oii;
                }
            }
