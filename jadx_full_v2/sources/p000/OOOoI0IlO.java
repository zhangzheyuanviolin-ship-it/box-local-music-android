            package p000;
            
            public final class OOOoI0IlO extends Ilooool1l0 implements O1lIi00l {
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public OOOoI1io I00ilI0I1;

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             OOOoOiil01 oOOoOiil01I0001Ioi1lo = I0001Ioi1lo();
/* 9 */             if (oOOoOiil01I0001Ioi1lo.I00000oOI()) {
/* 11 */                return oOOoOiil01I0001Ioi1lo;
                    }
/* 29 */            throw new IOiIIo1l();
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             OOOoOiil01 oOOoOiil01 = null;
                    try {
                        try {
/* 10 */                    I000II((OOOoOiil01) OOOoOiil01.I00l0I0l0lO1.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    OOOoOiil01 oOOoOiil012 = (OOOoOiil01) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        oOOoOiil01 = oOOoOiil012;
/* 24 */                        if (oOOoOiil01 != null) {
/* 26 */                            I000II(oOOoOiil01);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (oOOoOiil01 != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000II((OOOoOiil01) io00OlOi0);
/* 49 */            return this;
                }

                public final OOOoOiil01 I0001Ioi1lo() {
/* 3 */             OOOoOiil01 oOOoOiil01 = new OOOoOiil01();
/* 7 */             oOOoOiil01.I00ilO0 = (byte) -1;
/* 9 */             oOOoOiil01.I00io1l = -1;
/* 13 */            oOOoOiil01.I00iOIl = this.I00iOIl;
/* 15 */            int i = this.I00iiI;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            oOOoOiil01.I00iiO = this.I00iiO;
/* 31 */            if ((i & 2) == 2) {
/* 33 */                i2 |= 2;
                    }
/* 37 */            oOOoOiil01.I00iio = this.I00iio;
/* 41 */            if ((i & 4) == 4) {
/* 43 */                i2 |= 4;
                    }
/* 47 */            oOOoOiil01.I00ilI0I1 = this.I00ilI0I1;
/* 49 */            oOOoOiil01.I00iiI = i2;
/* 113 */           return oOOoOiil01;
                }

                public final void I000II(OOOoOiil01 oOOoOiil01) {
/* 3 */             if (oOOoOiil01 == OOOoOiil01.I00ioIO) {
/* 5 */                 return;
                    }
/* 6 */             int i = oOOoOiil01.I00iiI;
/* 11 */            if ((i & 1) == 1) {
/* 13 */                int i2 = oOOoOiil01.I00iiO;
/* 18 */                this.I00iiI = 1 | this.I00iiI;
/* 20 */                this.I00iiO = i2;
                    }
/* 25 */            if ((i & 2) == 2) {
/* 27 */                int i3 = oOOoOiil01.I00iio;
/* 32 */                this.I00iiI = 2 | this.I00iiI;
/* 34 */                this.I00iio = i3;
                    }
/* 38 */            if ((i & 4) == 4) {
/* 40 */                OOOoI1io oOOoI1io = oOOoOiil01.I00ilI0I1;
/* 42 */                oOOoI1io.getClass();
/* 48 */                this.I00iiI = 4 | this.I00iiI;
/* 50 */                this.I00ilI0I1 = oOOoI1io;
                    }
/* 60 */            this.I00iOIl = this.I00iOIl.I0000O(oOOoOiil01.I00iOIl);
                }

                public final Object clone() {
/* 3 */             OOOoI0IlO oOOoI0IlO = new OOOoI0IlO();
/* 7 */             oOOoI0IlO.I00iiO = -1;
/* 11 */            oOOoI0IlO.I00ilI0I1 = OOOoI1io.PACKAGE;
/* 17 */            oOOoI0IlO.I000II(I0001Ioi1lo());
/* 29 */            return oOOoI0IlO;
                }
            }
