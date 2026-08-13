            package p000;
            
            public abstract class loolIIl0000i implements Cloneable, o0IIiol0oIo {
                public final o001IlOi0O I00iOIl;
                public o001IlOi0O I00iiI;

                public loolIIl0000i(o001IlOi0O o001iloi0o) {
/* 4 */             this.I00iOIl = o001iloi0o;
/* 11 */            if (o001iloi0o.I000OOo1O()) {
/* 25 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 20 */            this.I00iiI = (o001IlOi0O) o001iloi0o.I000iOII(4, null);
                }

                public final o001IlOi0O I00000oIO() {
/* 1 */             o001IlOi0O o001iloi0oI00000oOI = I00000oOI();
/* 10 */            if (o001IlOi0O.I000O01llI0(o001iloi0oI00000oOI, true)) {
/* 12 */                return o001iloi0oI00000oOI;
                    }
/* 20 */            throw new o0OoIiioIool();
                }

                public o001IlOi0O I00000oOI() {
/* 3 */             boolean zI000OOo1O = this.I00iiI.I000OOo1O();
/* 7 */             o001IlOi0O o001iloi0o = this.I00iiI;
/* 9 */             if (!zI000OOo1O) {
/* 11 */                return o001iloi0o;
                    }
/* 12 */            o001iloi0o.getClass();
/* 25 */            o0Ioolo.I0000Il00O.I00000oIO(o001iloi0o.getClass()).I00000oIO(o001iloi0o);
/* 28 */            o001iloi0o.I0000oI00();
/* 31 */            return this.I00iiI;
                }

                public loOo1oOil I0000Il00O() {
/* 1 */             return I00000oOI();
                }

                public final void I0000O() {
/* 7 */             if (this.I00iiI.I000OOo1O()) {
/* 20 */                return;
                    }
/* 9 */             I0000oI00();
                }

                public void I0000oI00() {
/* 9 */             o001IlOi0O o001iloi0o = (o001IlOi0O) this.I00iOIl.I000iOII(4, null);
/* 23 */            o0Ioolo.I0000Il00O.I00000oIO(o001iloi0o.getClass()).I00000oOI(o001iloi0o, this.I00iiI);
/* 26 */            this.I00iiI = o001iloi0o;
                }

                public final Object clone() {
/* 9 */             loolIIl0000i looliil0000i = (loolIIl0000i) this.I00iOIl.I000iOII(5, null);
/* 15 */            looliil0000i.I00iiI = I00000oOI();
/* 20 */            return looliil0000i;
                }

                @Override
                public final boolean zzt() {
/* 4 */             return o001IlOi0O.I000O01llI0(this.I00iiI, false);
                }
            }
