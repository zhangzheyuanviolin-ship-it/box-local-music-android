            package p000;
            
            public abstract class Ilooooo implements Cloneable {
                public final Io00l0 I00iOIl;
                public Io00l0 I00iiI;

                public Ilooooo(Io00l0 io00l0) {
/* 4 */             this.I00iOIl = io00l0;
/* 10 */            if (io00l0.I000II()) {
/* 21 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 16 */            this.I00iiI = io00l0.I000OiO();
                }

                public final Io00l0 I00000oIO() {
/* 1 */             Io00l0 io00l0I00000oOI = I00000oOI();
/* 5 */             io00l0I00000oOI.getClass();
/* 13 */            if (Io00l0.I0001Ioi1lo(io00l0I00000oOI, true)) {
/* 15 */                return io00l0I00000oOI;
                    }
/* 55 */            throw new OoiIIIOlI0l();
                }

                public final Io00l0 I00000oOI() {
/* 3 */             boolean zI000II = this.I00iiI.I000II();
/* 7 */             Io00l0 io00l0 = this.I00iiI;
/* 9 */             if (!zI000II) {
/* 11 */                return io00l0;
                    }
/* 12 */            io00l0.getClass();
/* 15 */            OOi1oI oOi1oI = OOi1oI.I0000Il00O;
/* 17 */            oOi1oI.getClass();
/* 28 */            oOi1oI.I00000oIO(io00l0.getClass()).I00000oOI(io00l0);
/* 31 */            io00l0.I000O01llI0();
/* 34 */            return this.I00iiI;
                }

                public final void I0000Il00O() {
/* 7 */             if (this.I00iiI.I000II()) {
/* 55 */                return;
                    }
/* 11 */            Io00l0 io00l0I000OiO = this.I00iOIl.I000OiO();
/* 15 */            Io00l0 io00l0 = this.I00iiI;
/* 17 */            OOi1oI oOi1oI = OOi1oI.I0000Il00O;
/* 19 */            oOi1oI.getClass();
/* 30 */            oOi1oI.I00000oIO(io00l0I000OiO.getClass()).I00000oIO(io00l0I000OiO, io00l0);
/* 33 */            this.I00iiI = io00l0I000OiO;
                }

                public final Object clone() {
/* 8 */             Ilooooo ilooooo = (Ilooooo) this.I00iOIl.I0000Il00O(5);
/* 14 */            ilooooo.I00iiI = I00000oOI();
/* 20 */            return ilooooo;
                }
            }
