            package p000;
            
            public abstract class ililOli1l implements Cloneable, ioOI1Io1oo {
                public final illOil I00iOIl;
                public illOil I00iiI;

                public ililOli1l(illOil illoil) {
/* 4 */             this.I00iOIl = illoil;
/* 11 */            if (illoil.I000lI()) {
/* 25 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 20 */            this.I00iiI = (illOil) illoil.I000oI1ioi(4, null);
                }

                @Override
                public final boolean I00000oIO() {
/* 4 */             return illOil.I000l1(this.I00iiI, false);
                }

                public final illOil I00000oOI() {
/* 1 */             illOil illoilI0000Il00O = I0000Il00O();
/* 10 */            if (illOil.I000l1(illoilI0000Il00O, true)) {
/* 12 */                return illoilI0000Il00O;
                    }
/* 20 */            throw new l010o0l0loO();
                }

                public illOil I0000Il00O() {
/* 3 */             boolean zI000lI = this.I00iiI.I000lI();
/* 7 */             illOil illoil = this.I00iiI;
/* 9 */             if (!zI000lI) {
/* 11 */                return illoil;
                    }
/* 12 */            illoil.getClass();
/* 25 */            ioiO0iOooii.I0000Il00O.I00000oIO(illoil.getClass()).I00000oIO(illoil);
/* 28 */            illoil.I000OOo1O();
/* 31 */            return this.I00iiI;
                }

                public il00ioIl I0000O() {
/* 1 */             return I0000Il00O();
                }

                public final void I0000oI00() {
/* 7 */             if (this.I00iiI.I000lI()) {
/* 20 */                return;
                    }
/* 9 */             I0001Ioi1lo();
                }

                public void I0001Ioi1lo() {
/* 9 */             illOil illoil = (illOil) this.I00iOIl.I000oI1ioi(4, null);
/* 23 */            ioiO0iOooii.I0000Il00O.I00000oIO(illoil.getClass()).I00000oOI(illoil, this.I00iiI);
/* 26 */            this.I00iiI = illoil;
                }

                public final Object clone() {
/* 9 */             ililOli1l ililoli1l = (ililOli1l) this.I00iOIl.I000oI1ioi(5, null);
/* 15 */            ililoli1l.I00iiI = I0000Il00O();
/* 20 */            return ililoli1l;
                }
            }
