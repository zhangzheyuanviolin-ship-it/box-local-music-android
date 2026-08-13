            package p000;
            
            public abstract class i11Ill1l implements Cloneable {
                public final i11O1oIl I00iOIl;
                public i11O1oIl I00iiI;

                public i11Ill1l(i11O1oIl i11o1oil) {
/* 4 */             this.I00iOIl = i11o1oil;
/* 11 */            if (i11o1oil.I000II()) {
/* 25 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 20 */            this.I00iiI = (i11O1oIl) i11o1oil.I000OOo1O(4, null);
                }

                public final i11O1oIl I00000oIO() {
/* 1 */             i11O1oIl i11o1oilI00000oOI = I00000oOI();
/* 10 */            if (i11O1oIl.I0001Ioi1lo(i11o1oilI00000oOI, true)) {
/* 12 */                return i11o1oilI00000oOI;
                    }
/* 20 */            throw new i11o1IiO();
                }

                public i11O1oIl I00000oOI() {
/* 3 */             boolean zI000II = this.I00iiI.I000II();
/* 7 */             i11O1oIl i11o1oil = this.I00iiI;
/* 9 */             if (!zI000II) {
/* 11 */                return i11o1oil;
                    }
/* 12 */            i11o1oil.getClass();
/* 25 */            i11liii0.I0000Il00O.I00000oIO(i11o1oil.getClass()).I0000oI00(i11o1oil);
/* 28 */            i11o1oil.I0000Il00O();
/* 31 */            return this.I00iiI;
                }

                public i1111ll I0000Il00O() {
/* 1 */             return I00000oOI();
                }

                public final void I0000O() {
/* 7 */             if (this.I00iiI.I000II()) {
/* 20 */                return;
                    }
/* 9 */             I0000oI00();
                }

                public void I0000oI00() {
/* 9 */             i11O1oIl i11o1oil = (i11O1oIl) this.I00iOIl.I000OOo1O(4, null);
/* 23 */            i11liii0.I0000Il00O.I00000oIO(i11o1oil.getClass()).I0000O(i11o1oil, this.I00iiI);
/* 26 */            this.I00iiI = i11o1oil;
                }

                public final Object clone() {
/* 9 */             i11Ill1l i11ill1l = (i11Ill1l) this.I00iOIl.I000OOo1O(5, null);
/* 15 */            i11ill1l.I00iiI = I00000oOI();
/* 20 */            return i11ill1l;
                }
            }
