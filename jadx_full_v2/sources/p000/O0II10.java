            package p000;
            
            public final class O0II10 extends Ilooool1l0 implements O1lIi00l {
                public final int I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;

                public O0II10(int i) {
/* 1 */             this.I00iiI = i;
                }

                @Override
                public final I01Ilioliio I0000Il00O() {
                    switch (this.I00iiI) {
                        case 0:
/* 14 */                    O0II1001o o0II1001oI0001Ioi1lo = I0001Ioi1lo();
/* 18 */                    o0II1001oI0001Ioi1lo.I00000oOI();
/* 21 */                    return o0II1001oI0001Ioi1lo;
                        default:
/* 6 */                     O0III0iooOOi o0III0iooOOiI000II = I000II();
/* 10 */                    o0III0iooOOiI000II.I00000oOI();
/* 13 */                    return o0III0iooOOiI000II;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 3 */             O0III0iooOOi o0III0iooOOi = null;
/* 3 */             O0II1001o o0II1001o = null;
                    try {
                        switch (this.I00iiI) {
                            case 0:
                                try {
                                    try {
/* 43 */                                I000O01llI0((O0II1001o) O0II1001o.I00ioIO.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 46 */                                return this;
                                    } catch (O001110li e) {
/* 52 */                                O0II1001o o0II1001o2 = (O0II1001o) e.I00iOIl;
                                        try {
/* 54 */                                    throw e;
                                        } catch (Throwable th) {
/* 55 */                                    th = th;
/* 56 */                                    o0II1001o = o0II1001o2;
/* 57 */                                    if (o0II1001o != null) {
/* 59 */                                        I000O01llI0(o0II1001o);
                                            }
/* 62 */                                    throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
/* 47 */                            th = th2;
/* 57 */                            if (o0II1001o != null) {
                                    }
/* 62 */                            throw th;
                                }
                            default:
                                try {
/* 15 */                            I000OOo1O((O0III0iooOOi) O0III0iooOOi.I00ioIO.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 18 */                            return this;
                                } catch (O001110li e2) {
/* 24 */                            O0III0iooOOi o0III0iooOOi2 = (O0III0iooOOi) e2.I00iOIl;
                                    try {
/* 26 */                                throw e2;
                                    } catch (Throwable th3) {
/* 27 */                                th = th3;
/* 28 */                                o0III0iooOOi = o0III0iooOOi2;
/* 29 */                                if (o0III0iooOOi != null) {
/* 31 */                                    I000OOo1O(o0III0iooOOi);
                                        }
/* 34 */                                throw th;
                                    }
                                }
                        }
                    } catch (Throwable th4) {
/* 19 */                th = th4;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
                    switch (this.I00iiI) {
                        case 0:
/* 14 */                    I000O01llI0((O0II1001o) io00OlOi0);
                            break;
                        default:
/* 8 */                     I000OOo1O((O0III0iooOOi) io00OlOi0);
                            break;
                    }
/* 11 */            return this;
                }

                public O0II1001o I0001Ioi1lo() {
/* 3 */             O0II1001o o0II1001o = new O0II1001o();
/* 7 */             o0II1001o.I00ilI0I1 = (byte) -1;
/* 9 */             o0II1001o.I00ilO0 = -1;
/* 13 */            o0II1001o.I00iOIl = this.I00iOIl;
/* 15 */            int i = this.I00iiO;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            o0II1001o.I00iiO = this.I00iio;
/* 30 */            if ((i & 2) == 2) {
/* 32 */                i2 |= 2;
                    }
/* 36 */            o0II1001o.I00iio = this.I00ilI0I1;
/* 38 */            o0II1001o.I00iiI = i2;
/* 113 */           return o0II1001o;
                }

                public O0III0iooOOi I000II() {
/* 3 */             O0III0iooOOi o0III0iooOOi = new O0III0iooOOi();
/* 7 */             o0III0iooOOi.I00ilI0I1 = (byte) -1;
/* 9 */             o0III0iooOOi.I00ilO0 = -1;
/* 13 */            o0III0iooOOi.I00iOIl = this.I00iOIl;
/* 15 */            int i = this.I00iiO;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            o0III0iooOOi.I00iiO = this.I00iio;
/* 30 */            if ((i & 2) == 2) {
/* 32 */                i2 |= 2;
                    }
/* 36 */            o0III0iooOOi.I00iio = this.I00ilI0I1;
/* 38 */            o0III0iooOOi.I00iiI = i2;
/* 113 */           return o0III0iooOOi;
                }

                public void I000O01llI0(O0II1001o o0II1001o) {
/* 3 */             if (o0II1001o == O0II1001o.I00io1l) {
/* 5 */                 return;
                    }
/* 6 */             int i = o0II1001o.I00iiI;
/* 11 */            if ((i & 1) == 1) {
/* 13 */                int i2 = o0II1001o.I00iiO;
/* 18 */                this.I00iiO = 1 | this.I00iiO;
/* 20 */                this.I00iio = i2;
                    }
/* 24 */            if ((i & 2) == 2) {
/* 26 */                int i3 = o0II1001o.I00iio;
/* 31 */                this.I00iiO = 2 | this.I00iiO;
/* 33 */                this.I00ilI0I1 = i3;
                    }
/* 43 */            this.I00iOIl = this.I00iOIl.I0000O(o0II1001o.I00iOIl);
                }

                public void I000OOo1O(O0III0iooOOi o0III0iooOOi) {
/* 3 */             if (o0III0iooOOi == O0III0iooOOi.I00io1l) {
/* 5 */                 return;
                    }
/* 6 */             int i = o0III0iooOOi.I00iiI;
/* 11 */            if ((i & 1) == 1) {
/* 13 */                int i2 = o0III0iooOOi.I00iiO;
/* 18 */                this.I00iiO = 1 | this.I00iiO;
/* 20 */                this.I00iio = i2;
                    }
/* 24 */            if ((i & 2) == 2) {
/* 26 */                int i3 = o0III0iooOOi.I00iio;
/* 31 */                this.I00iiO = 2 | this.I00iiO;
/* 33 */                this.I00ilI0I1 = i3;
                    }
/* 43 */            this.I00iOIl = this.I00iOIl.I0000O(o0III0iooOOi.I00iOIl);
                }

                public final Object clone() {
                    switch (this.I00iiI) {
                        case 0:
/* 23 */                    O0II10 o0ii10 = new O0II10(0);
/* 30 */                    o0ii10.I000O01llI0(I0001Ioi1lo());
/* 33 */                    return o0ii10;
                        default:
/* 9 */                     O0II10 o0ii102 = new O0II10(1);
/* 16 */                    o0ii102.I000OOo1O(I000II());
/* 19 */                    return o0ii102;
                    }
                }
            }
