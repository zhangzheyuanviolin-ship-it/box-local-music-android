            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOl000lO1Il extends Io000lII0l {
                public int I00iio;
                public int I00ilI0I1;
                public List I00ilO0;

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             OOOl0lIlIoil oOOl0lIlIoilI000II = I000II();
/* 9 */             if (oOOl0lIlIoilI000II.I00000oOI()) {
/* 11 */                return oOOl0lIlIoilI000II;
                    }
/* 29 */            throw new IOiIIo1l();
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             OOOl0lIlIoil oOOl0lIlIoil = null;
                    try {
                        try {
/* 10 */                    I000O01llI0((OOOl0lIlIoil) OOOl0lIlIoil.I00l0I0l0lO1.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    OOOl0lIlIoil oOOl0lIlIoil2 = (OOOl0lIlIoil) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        oOOl0lIlIoil = oOOl0lIlIoil2;
/* 24 */                        if (oOOl0lIlIoil != null) {
/* 26 */                            I000O01llI0(oOOl0lIlIoil);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (oOOl0lIlIoil != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000O01llI0((OOOl0lIlIoil) io00OlOi0);
/* 49 */            return this;
                }

                public final OOOl0lIlIoil I000II() {
/* 3 */             OOOl0lIlIoil oOOl0lIlIoil = new OOOl0lIlIoil(this);
/* 7 */             oOOl0lIlIoil.I00ilO0 = (byte) -1;
/* 9 */             oOOl0lIlIoil.I00io1l = -1;
/* 13 */            oOOl0lIlIoil.I00iiI = this.I00iOIl;
/* 15 */            int i = this.I00iio;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            oOOl0lIlIoil.I00iio = this.I00ilI0I1;
/* 30 */            if ((i & 2) == 2) {
/* 38 */                this.I00ilO0 = Collections.unmodifiableList(this.I00ilO0);
                        this.I00iio &= -3;
                    }
/* 48 */            oOOl0lIlIoil.I00ilI0I1 = this.I00ilO0;
/* 50 */            oOOl0lIlIoil.I00iiO = i2;
/* 113 */           return oOOl0lIlIoil;
                }

                public final void I000O01llI0(OOOl0lIlIoil oOOl0lIlIoil) {
/* 3 */             if (oOOl0lIlIoil == OOOl0lIlIoil.I00ioIO) {
/* 5 */                 return;
                    }
/* 10 */            if ((oOOl0lIlIoil.I00iiO & 1) == 1) {
/* 12 */                int i = oOOl0lIlIoil.I00iio;
/* 17 */                this.I00iio = 1 | this.I00iio;
/* 19 */                this.I00ilI0I1 = i;
                    }
/* 27 */            if (!oOOl0lIlIoil.I00ilI0I1.isEmpty()) {
/* 35 */                if (this.I00ilO0.isEmpty()) {
/* 39 */                    this.I00ilO0 = oOOl0lIlIoil.I00ilI0I1;
                            this.I00iio &= -3;
                        } else {
/* 52 */                    if ((this.I00iio & 2) != 2) {
/* 61 */                        this.I00ilO0 = new ArrayList(this.I00ilO0);
                                this.I00iio |= 2;
                            }
/* 72 */                    this.I00ilO0.addAll(oOOl0lIlIoil.I00ilI0I1);
                        }
                    }
/* 75 */            I0001Ioi1lo(oOOl0lIlIoil);
/* 86 */            this.I00iOIl = this.I00iOIl.I0000O(oOOl0lIlIoil.I00iiI);
                }

                public final Object clone() {
/* 3 */             OOOl000lO1Il oOOl000lO1Il = new OOOl000lO1Il();
/* 8 */             oOOl000lO1Il.I00ilO0 = Collections.EMPTY_LIST;
/* 14 */            oOOl000lO1Il.I000O01llI0(I000II());
/* 29 */            return oOOl000lO1Il;
                }
            }
