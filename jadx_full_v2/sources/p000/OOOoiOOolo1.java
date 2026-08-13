            package p000;
            
            public final class OOOoiOOolo1 extends Ilooool1l0 implements O1lIi00l {
                public int I00iiI;
                public OOOoil1l010 I00iiO;
                public OOi001oo1OOI I00iio;
                public int I00ilI0I1;

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             OOOooIOl oOOooIOlI0001Ioi1lo = I0001Ioi1lo();
/* 9 */             if (oOOooIOlI0001Ioi1lo.I00000oOI()) {
/* 11 */                return oOOooIOlI0001Ioi1lo;
                    }
/* 29 */            throw new IOiIIo1l();
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             OOOooIOl oOOooIOl = null;
                    try {
                        try {
/* 10 */                    I000II((OOOooIOl) OOOooIOl.I00l0I0l0lO1.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    OOOooIOl oOOooIOl2 = (OOOooIOl) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        oOOooIOl = oOOooIOl2;
/* 24 */                        if (oOOooIOl != null) {
/* 26 */                            I000II(oOOooIOl);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (oOOooIOl != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000II((OOOooIOl) io00OlOi0);
/* 49 */            return this;
                }

                public final OOOooIOl I0001Ioi1lo() {
/* 3 */             OOOooIOl oOOooIOl = new OOOooIOl();
/* 7 */             oOOooIOl.I00ilO0 = (byte) -1;
/* 9 */             oOOooIOl.I00io1l = -1;
/* 13 */            oOOooIOl.I00iOIl = this.I00iOIl;
/* 15 */            int i = this.I00iiI;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            oOOooIOl.I00iiO = this.I00iiO;
/* 31 */            if ((i & 2) == 2) {
/* 33 */                i2 |= 2;
                    }
/* 37 */            oOOooIOl.I00iio = this.I00iio;
/* 41 */            if ((i & 4) == 4) {
/* 43 */                i2 |= 4;
                    }
/* 47 */            oOOooIOl.I00ilI0I1 = this.I00ilI0I1;
/* 49 */            oOOooIOl.I00iiI = i2;
/* 113 */           return oOOooIOl;
                }

                public final void I000II(OOOooIOl oOOooIOl) {
                    OOi001oo1OOI oOi001oo1OOI;
/* 3 */             if (oOOooIOl == OOOooIOl.I00ioIO) {
/* 5 */                 return;
                    }
/* 10 */            if ((oOOooIOl.I00iiI & 1) == 1) {
/* 12 */                OOOoil1l010 oOOoil1l010 = oOOooIOl.I00iiO;
/* 14 */                oOOoil1l010.getClass();
/* 20 */                this.I00iiI = 1 | this.I00iiI;
/* 22 */                this.I00iiO = oOOoil1l010;
                    }
/* 28 */            if ((oOOooIOl.I00iiI & 2) == 2) {
/* 30 */                OOi001oo1OOI oOi001oo1OOI2 = oOOooIOl.I00iio;
/* 35 */                if ((this.I00iiI & 2) != 2 || (oOi001oo1OOI = this.I00iio) == OOi001oo1OOI.I00oO101o) {
/* 57 */                    this.I00iio = oOi001oo1OOI2;
                        } else {
/* 43 */                    OOOoooI oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI);
/* 47 */                    oOOoooII0010o.I000OOo1O(oOi001oo1OOI2);
/* 54 */                    this.I00iio = oOOoooII0010o.I000II();
                        }
                        this.I00iiI |= 2;
                    }
/* 68 */            if ((oOOooIOl.I00iiI & 4) == 4) {
/* 70 */                int i = oOOooIOl.I00ilI0I1;
/* 75 */                this.I00iiI = 4 | this.I00iiI;
/* 77 */                this.I00ilI0I1 = i;
                    }
/* 87 */            this.I00iOIl = this.I00iOIl.I0000O(oOOooIOl.I00iOIl);
                }

                public final Object clone() {
/* 3 */             OOOoiOOolo1 oOOoiOOolo1 = new OOOoiOOolo1();
/* 8 */             oOOoiOOolo1.I00iiO = OOOoil1l010.INV;
/* 12 */            oOOoiOOolo1.I00iio = OOi001oo1OOI.I00oO101o;
/* 18 */            oOOoiOOolo1.I000II(I0001Ioi1lo());
/* 29 */            return oOOoiOOolo1;
                }
            }
