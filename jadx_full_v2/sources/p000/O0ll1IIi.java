            package p000;
            
            public final class O0ll1IIi {
                public Object I00000oIO;
                public O0ll1ilooi I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public O0ll1IIi I0000oI00;
                public boolean I0001Ioi1lo;
                public OIooliIO0 I000II;

                public final O0ll1IIi I00000oIO() {
/* 3 */             if (this.I0001Ioi1lo) {
/* 7 */                 Ioll0IliO1l.I0000Il00O("Pin should not be called on an already disposed item ");
                    }
/* 12 */            if (this.I0000O == 0) {
/* 18 */                this.I00000oOI.I00iOIl.add(this);
/* 27 */                O0ll1IIi o0ll1IIi = (O0ll1IIi) this.I000II.getValue();
/* 29 */                if (o0ll1IIi != null) {
/* 31 */                    o0ll1IIi.I00000oIO();
                        } else {
/* 35 */                    o0ll1IIi = null;
                        }
/* 36 */                this.I0000oI00 = o0ll1IIi;
                    }
                    this.I0000O++;
/* 55 */            return this;
                }

                public final void I00000oOI() {
/* 3 */             if (this.I0001Ioi1lo) {
/* 55 */                return;
                    }
/* 8 */             if (this.I0000O <= 0) {
/* 13 */                Ioll0IliO1l.I0000Il00O("Release should only be called once");
                    }
                    int i = this.I0000O - 1;
/* 20 */            this.I0000O = i;
/* 22 */            if (i == 0) {
/* 28 */                this.I00000oOI.I00iOIl.remove(this);
/* 31 */                O0ll1IIi o0ll1IIi = this.I0000oI00;
/* 33 */                if (o0ll1IIi != null) {
/* 35 */                    o0ll1IIi.I00000oOI();
                        }
/* 39 */                this.I0000oI00 = null;
                    }
                }
            }
