            package p000;
            
            public final class OOi0io001 extends Ilooool1l0 implements O1lIi00l {
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public OOi0l11Ioi I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;
                public OOi0l1Oi I00ioIO;

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             OOi0lO oOi0lOI0001Ioi1lo = I0001Ioi1lo();
/* 5 */             oOi0lOI0001Ioi1lo.I00000oOI();
/* 29 */            return oOi0lOI0001Ioi1lo;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             OOi0lO oOi0lO = null;
                    try {
                        try {
/* 10 */                    I000II((OOi0lO) OOi0lO.I00ll1.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    OOi0lO oOi0lO2 = (OOi0lO) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        oOi0lO = oOi0lO2;
/* 24 */                        if (oOi0lO != null) {
/* 26 */                            I000II(oOi0lO);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (oOi0lO != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000II((OOi0lO) io00OlOi0);
/* 49 */            return this;
                }

                public final OOi0lO I0001Ioi1lo() {
/* 3 */             OOi0lO oOi0lO = new OOi0lO();
/* 7 */             oOi0lO.I00l0I0l0lO1 = (byte) -1;
/* 9 */             oOi0lO.I00l0OO0IO = -1;
/* 13 */            oOi0lO.I00iOIl = this.I00iOIl;
/* 15 */            int i = this.I00iiI;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            oOi0lO.I00iiO = this.I00iiO;
/* 31 */            if ((i & 2) == 2) {
/* 33 */                i2 |= 2;
                    }
/* 37 */            oOi0lO.I00iio = this.I00iio;
/* 42 */            if ((i & 4) == 4) {
/* 44 */                i2 |= 4;
                    }
/* 48 */            oOi0lO.I00ilI0I1 = this.I00ilI0I1;
/* 54 */            if ((i & 8) == 8) {
/* 56 */                i2 |= 8;
                    }
/* 60 */            oOi0lO.I00ilO0 = this.I00ilO0;
/* 66 */            if ((i & 16) == 16) {
/* 68 */                i2 |= 16;
                    }
/* 72 */            oOi0lO.I00io1l = this.I00io1l;
/* 77 */            if ((i & 32) == 32) {
/* 79 */                i2 |= 32;
                    }
/* 83 */            oOi0lO.I00ioIO = this.I00ioIO;
/* 85 */            oOi0lO.I00iiI = i2;
/* 113 */           return oOi0lO;
                }

                public final void I000II(OOi0lO oOi0lO) {
/* 3 */             if (oOi0lO == OOi0lO.I00li1OI) {
/* 5 */                 return;
                    }
/* 6 */             int i = oOi0lO.I00iiI;
/* 11 */            if ((i & 1) == 1) {
/* 13 */                int i2 = oOi0lO.I00iiO;
/* 18 */                this.I00iiI = 1 | this.I00iiI;
/* 20 */                this.I00iiO = i2;
                    }
/* 25 */            if ((i & 2) == 2) {
/* 27 */                int i3 = oOi0lO.I00iio;
/* 32 */                this.I00iiI = 2 | this.I00iiI;
/* 34 */                this.I00iio = i3;
                    }
/* 38 */            if ((i & 4) == 4) {
/* 40 */                OOi0l11Ioi oOi0l11Ioi = oOi0lO.I00ilI0I1;
/* 42 */                oOi0l11Ioi.getClass();
/* 48 */                this.I00iiI = 4 | this.I00iiI;
/* 50 */                this.I00ilI0I1 = oOi0l11Ioi;
                    }
/* 52 */            int i4 = oOi0lO.I00iiI;
/* 58 */            if ((i4 & 8) == 8) {
/* 60 */                int i5 = oOi0lO.I00ilO0;
/* 65 */                this.I00iiI = 8 | this.I00iiI;
/* 67 */                this.I00ilO0 = i5;
                    }
/* 73 */            if ((i4 & 16) == 16) {
/* 75 */                int i6 = oOi0lO.I00io1l;
/* 80 */                this.I00iiI = 16 | this.I00iiI;
/* 82 */                this.I00io1l = i6;
                    }
/* 87 */            if ((i4 & 32) == 32) {
/* 89 */                OOi0l1Oi oOi0l1Oi = oOi0lO.I00ioIO;
/* 91 */                oOi0l1Oi.getClass();
/* 97 */                this.I00iiI = 32 | this.I00iiI;
/* 99 */                this.I00ioIO = oOi0l1Oi;
                    }
/* 109 */           this.I00iOIl = this.I00iOIl.I0000O(oOi0lO.I00iOIl);
                }

                public final Object clone() {
/* 3 */             OOi0io001 oOi0io001 = new OOi0io001();
/* 8 */             oOi0io001.I00ilI0I1 = OOi0l11Ioi.ERROR;
/* 12 */            oOi0io001.I00ioIO = OOi0l1Oi.LANGUAGE_VERSION;
/* 18 */            oOi0io001.I000II(I0001Ioi1lo());
/* 29 */            return oOi0io001;
                }
            }
