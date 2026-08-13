            package p000;
            
            public abstract class ilOI1I0llIi implements Cloneable {
                public final ilOl10 I00iOIl;
                public ilOl10 I00iiI;

                public ilOI1I0llIi(ilOl10 ilol10) {
/* 4 */             this.I00iOIl = ilol10;
/* 10 */            if (ilol10.I000l1()) {
/* 21 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 16 */            this.I00iiI = ilol10.I0000oI00();
                }

                public final ilOl10 I00000oIO() {
/* 1 */             ilOl10 ilol10I00000oOI = I00000oOI();
/* 9 */             if (ilol10I00000oOI.I000iOII()) {
/* 11 */                return ilol10I00000oOI;
                    }
/* 20 */            throw new ioo01i();
                }

                public final ilOl10 I00000oOI() {
/* 3 */             boolean zI000l1 = this.I00iiI.I000l1();
/* 7 */             ilOl10 ilol10 = this.I00iiI;
/* 9 */             if (!zI000l1) {
/* 11 */                return ilol10;
                    }
/* 12 */            ilol10.getClass();
/* 25 */            ioIOiiiiO0.I0000Il00O.I00000oIO(ilol10.getClass()).I00000oIO(ilol10);
/* 28 */            ilol10.I000O01llI0();
/* 31 */            return this.I00iiI;
                }

                public final void I0000Il00O() {
/* 7 */             if (this.I00iiI.I000l1()) {
/* 55 */                return;
                    }
/* 11 */            ilOl10 ilol10I0000oI00 = this.I00iOIl.I0000oI00();
/* 27 */            ioIOiiiiO0.I0000Il00O.I00000oIO(ilol10I0000oI00.getClass()).I00000oOI(ilol10I0000oI00, this.I00iiI);
/* 30 */            this.I00iiI = ilol10I0000oI00;
                }

                public final Object clone() {
/* 8 */             ilOI1I0llIi iloi1i0llii = (ilOI1I0llIi) this.I00iOIl.I000lI(5);
/* 14 */            iloi1i0llii.I00iiI = I00000oOI();
/* 20 */            return iloi1i0llii;
                }
            }
