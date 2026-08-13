            package p000;
            
            public final class OOOOOlOO extends Ilooool1l0 implements O1lIi00l {
                public final int I00iiI;
                public int I00iiO;
                public int I00iio;
                public Object I00ilI0I1;

                public OOOOOlOO(int i) {
/* 1 */             this.I00iiI = i;
                }

                @Override
                public final I01Ilioliio I0000Il00O() {
                    switch (this.I00iiI) {
                        case 0:
/* 23 */                    OOOOlOoi0 oOOOlOoi0I0001Ioi1lo = I0001Ioi1lo();
/* 31 */                    if (oOOOlOoi0I0001Ioi1lo.I00000oOI()) {
/* 33 */                        return oOOOlOoi0I0001Ioi1lo;
                            }
/* 39 */                    throw new IOiIIo1l();
                        default:
/* 6 */                     OOOi1IIOOO01 oOOi1IIOOO01I000II = I000II();
/* 14 */                    if (oOOi1IIOOO01I000II.I00000oOI()) {
/* 16 */                        return oOOi1IIOOO01I000II;
                            }
/* 22 */                    throw new IOiIIo1l();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 3 */             OOOi1IIOOO01 oOOi1IIOOO01 = null;
/* 3 */             OOOOlOoi0 oOOOlOoi0 = null;
                    try {
                        switch (this.I00iiI) {
                            case 0:
                                try {
                                    try {
/* 43 */                                I000O01llI0((OOOOlOoi0) OOOOlOoi0.I00ioIO.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 46 */                                return this;
                                    } catch (O001110li e) {
/* 52 */                                OOOOlOoi0 oOOOlOoi02 = (OOOOlOoi0) e.I00iOIl;
                                        try {
/* 54 */                                    throw e;
                                        } catch (Throwable th) {
/* 55 */                                    th = th;
/* 56 */                                    oOOOlOoi0 = oOOOlOoi02;
/* 57 */                                    if (oOOOlOoi0 != null) {
/* 59 */                                        I000O01llI0(oOOOlOoi0);
                                            }
/* 62 */                                    throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
/* 47 */                            th = th2;
/* 57 */                            if (oOOOlOoi0 != null) {
                                    }
/* 62 */                            throw th;
                                }
                            default:
                                try {
/* 15 */                            I000OOo1O((OOOi1IIOOO01) OOOi1IIOOO01.I00ioIO.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 18 */                            return this;
                                } catch (O001110li e2) {
/* 24 */                            OOOi1IIOOO01 oOOi1IIOOO012 = (OOOi1IIOOO01) e2.I00iOIl;
                                    try {
/* 26 */                                throw e2;
                                    } catch (Throwable th3) {
/* 27 */                                th = th3;
/* 28 */                                oOOi1IIOOO01 = oOOi1IIOOO012;
/* 29 */                                if (oOOi1IIOOO01 != null) {
/* 31 */                                    I000OOo1O(oOOi1IIOOO01);
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
/* 14 */                    I000O01llI0((OOOOlOoi0) io00OlOi0);
                            break;
                        default:
/* 8 */                     I000OOo1O((OOOi1IIOOO01) io00OlOi0);
                            break;
                    }
/* 11 */            return this;
                }

                public OOOOlOoi0 I0001Ioi1lo() {
/* 3 */             OOOOlOoi0 oOOOlOoi0 = new OOOOlOoi0();
/* 7 */             oOOOlOoi0.I00ilI0I1 = (byte) -1;
/* 9 */             oOOOlOoi0.I00ilO0 = -1;
/* 13 */            oOOOlOoi0.I00iOIl = this.I00iOIl;
/* 15 */            int i = this.I00iiO;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            oOOOlOoi0.I00iiO = this.I00iio;
/* 30 */            if ((i & 2) == 2) {
/* 32 */                i2 |= 2;
                    }
/* 38 */            oOOOlOoi0.I00iio = (OOOOlIoIlOi) this.I00ilI0I1;
/* 40 */            oOOOlOoi0.I00iiI = i2;
/* 113 */           return oOOOlOoi0;
                }

                public OOOi1IIOOO01 I000II() {
/* 3 */             OOOi1IIOOO01 oOOi1IIOOO01 = new OOOi1IIOOO01();
/* 7 */             oOOi1IIOOO01.I00ilI0I1 = (byte) -1;
/* 9 */             oOOi1IIOOO01.I00ilO0 = -1;
/* 13 */            oOOi1IIOOO01.I00iOIl = this.I00iOIl;
/* 15 */            int i = this.I00iiO;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            oOOi1IIOOO01.I00iiO = this.I00iio;
/* 30 */            if ((i & 2) == 2) {
/* 32 */                i2 |= 2;
                    }
/* 38 */            oOOi1IIOOO01.I00iio = (O1101ooIo0l) this.I00ilI0I1;
/* 40 */            oOOi1IIOOO01.I00iiI = i2;
/* 113 */           return oOOi1IIOOO01;
                }

                public void I000O01llI0(OOOOlOoi0 oOOOlOoi0) {
                    OOOOlIoIlOi oOOOlIoIlOi;
/* 3 */             if (oOOOlOoi0 == OOOOlOoi0.I00io1l) {
/* 5 */                 return;
                    }
/* 6 */             int i = oOOOlOoi0.I00iiI;
/* 11 */            if ((i & 1) == 1) {
/* 13 */                int i2 = oOOOlOoi0.I00iiO;
/* 18 */                this.I00iiO = 1 | this.I00iiO;
/* 20 */                this.I00iio = i2;
                    }
/* 24 */            if ((i & 2) == 2) {
/* 26 */                OOOOlIoIlOi oOOOlIoIlOi2 = oOOOlOoi0.I00iio;
/* 31 */                if ((this.I00iiO & 2) != 2 || (oOOOlIoIlOi = (OOOOlIoIlOi) this.I00ilI0I1) == OOOOlIoIlOi.I00o0l1o1o0) {
/* 58 */                    this.I00ilI0I1 = oOOOlIoIlOi2;
                        } else {
/* 41 */                    OOOOi0ooOlOo oOOOi0ooOlOoI000II = OOOOi0ooOlOo.I000II();
/* 45 */                    oOOOi0ooOlOoI000II.I000O01llI0(oOOOlIoIlOi);
/* 48 */                    oOOOi0ooOlOoI000II.I000O01llI0(oOOOlIoIlOi2);
/* 55 */                    this.I00ilI0I1 = oOOOi0ooOlOoI000II.I0001Ioi1lo();
                        }
                        this.I00iiO |= 2;
                    }
/* 73 */            this.I00iOIl = this.I00iOIl.I0000O(oOOOlOoi0.I00iOIl);
                }

                public void I000OOo1O(OOOi1IIOOO01 oOOi1IIOOO01) {
/* 3 */             if (oOOi1IIOOO01 == OOOi1IIOOO01.I00io1l) {
/* 5 */                 return;
                    }
/* 6 */             int i = oOOi1IIOOO01.I00iiI;
/* 11 */            if ((i & 1) == 1) {
/* 13 */                int i2 = oOOi1IIOOO01.I00iiO;
/* 18 */                this.I00iiO = 1 | this.I00iiO;
/* 20 */                this.I00iio = i2;
                    }
/* 24 */            if ((i & 2) == 2) {
/* 26 */                O1101ooIo0l o1101ooIo0l = oOOi1IIOOO01.I00iio;
/* 28 */                o1101ooIo0l.getClass();
/* 34 */                this.I00iiO = 2 | this.I00iiO;
/* 36 */                this.I00ilI0I1 = o1101ooIo0l;
                    }
/* 46 */            this.I00iOIl = this.I00iOIl.I0000O(oOOi1IIOOO01.I00iOIl);
                }

                public final Object clone() {
                    switch (this.I00iiI) {
                        case 0:
/* 27 */                    OOOOOlOO oOOOOlOO = new OOOOOlOO(0);
/* 32 */                    oOOOOlOO.I00ilI0I1 = OOOOlIoIlOi.I00o0l1o1o0;
/* 38 */                    oOOOOlOO.I000O01llI0(I0001Ioi1lo());
/* 41 */                    return oOOOOlOO;
                        default:
/* 9 */                     OOOOOlOO oOOOOlOO2 = new OOOOOlOO(1);
/* 14 */                    oOOOOlOO2.I00ilI0I1 = IIOII1.I00iOIl;
/* 20 */                    oOOOOlOO2.I000OOo1O(I000II());
/* 23 */                    return oOOOOlOO2;
                    }
                }
            }
