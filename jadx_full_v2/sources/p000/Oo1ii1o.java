            package p000;
            
            public final class Oo1ii1o extends li1l0000I0l {
                public final int I00000oIO;
                public boolean I00000oOI;
                public int I0000Il00O;
                public Object I0000O;

                @Override
                public void I00000oIO() {
                    switch (this.I00000oIO) {
                        case 0:
/* 8 */                     this.I00000oOI = true;
                            break;
                    }
                }

                @Override
                public final void I00000oOI() {
                    switch (this.I00000oIO) {
                        case 0:
/* 33 */                    ((Oo1ilOl) this.I0000O).I00000oIO.setVisibility(0);
                            break;
                        default:
/* 8 */                     if (!this.I00000oOI) {
/* 12 */                        this.I00000oOI = true;
/* 18 */                        Oooli0Olo10 oooli0Olo10 = ((OoolOolooll) this.I0000O).I0000O;
/* 20 */                        if (oooli0Olo10 != null) {
/* 22 */                            oooli0Olo10.I00000oOI();
                                    break;
                                }
                            }
                            break;
                    }
                }

                @Override
                public final void I0000Il00O() {
                    switch (this.I00000oIO) {
                        case 0:
/* 41 */                    if (!this.I00000oOI) {
/* 51 */                        ((Oo1ilOl) this.I0000O).I00000oIO.setVisibility(this.I0000Il00O);
                                break;
                            }
                            break;
                        default:
/* 8 */                     int i = this.I0000Il00O + 1;
/* 10 */                    this.I0000Il00O = i;
/* 14 */                    OoolOolooll ooolOolooll = (OoolOolooll) this.I0000O;
/* 22 */                    if (i == ooolOolooll.I00000oIO.size()) {
/* 24 */                        Oooli0Olo10 oooli0Olo10 = ooolOolooll.I0000O;
/* 26 */                        if (oooli0Olo10 != null) {
/* 28 */                            oooli0Olo10.I0000Il00O();
                                }
/* 32 */                        this.I0000Il00O = 0;
/* 34 */                        this.I00000oOI = false;
/* 36 */                        ooolOolooll.I0000oI00 = false;
                                break;
                            }
                            break;
                    }
                }
            }
