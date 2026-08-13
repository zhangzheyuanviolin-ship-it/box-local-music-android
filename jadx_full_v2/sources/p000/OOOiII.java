            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOiII extends Io000lII0l {
                public int I00iio;
                public int I00ilI0I1;
                public List I00ilO0;
                public List I00io1l;
                public List I00ioIO;
                public List I00l0I0l0lO1;

                public static OOOiII I000O01llI0() {
/* 3 */             OOOiII oOOiII = new OOOiII();
/* 7 */             oOOiII.I00ilI0I1 = 6;
/* 9 */             List list = Collections.EMPTY_LIST;
/* 11 */            oOOiII.I00ilO0 = list;
/* 13 */            oOOiII.I00io1l = list;
/* 15 */            oOOiII.I00ioIO = list;
/* 17 */            oOOiII.I00l0I0l0lO1 = list;
/* 29 */            return oOOiII;
                }

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             OOOiIOiii oOOiIOiiiI000II = I000II();
/* 9 */             if (oOOiIOiiiI000II.I00000oOI()) {
/* 11 */                return oOOiIOiiiI000II;
                    }
/* 29 */            throw new IOiIIo1l();
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             OOOiIOiii oOOiIOiii = null;
                    try {
                        try {
/* 10 */                    I000OOo1O((OOOiIOiii) OOOiIOiii.I00ll1.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    OOOiIOiii oOOiIOiii2 = (OOOiIOiii) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        oOOiIOiii = oOOiIOiii2;
/* 24 */                        if (oOOiIOiii != null) {
/* 26 */                            I000OOo1O(oOOiIOiii);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (oOOiIOiii != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000OOo1O((OOOiIOiii) io00OlOi0);
/* 49 */            return this;
                }

                public final OOOiIOiii I000II() {
/* 3 */             OOOiIOiii oOOiIOiii = new OOOiIOiii(this);
/* 7 */             oOOiIOiii.I00l0I0l0lO1 = (byte) -1;
/* 9 */             oOOiIOiii.I00l0OO0IO = -1;
/* 13 */            oOOiIOiii.I00iiI = this.I00iOIl;
/* 15 */            int i = this.I00iio;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            oOOiIOiii.I00iio = this.I00ilI0I1;
/* 31 */            if ((i & 2) == 2) {
/* 39 */                this.I00ilO0 = Collections.unmodifiableList(this.I00ilO0);
/* 43 */                i = this.I00iio & (-3);
/* 45 */                this.I00iio = i;
                    }
/* 49 */            oOOiIOiii.I00ilI0I1 = this.I00ilO0;
/* 54 */            if ((i & 4) == 4) {
/* 62 */                this.I00io1l = Collections.unmodifiableList(this.I00io1l);
/* 66 */                i = this.I00iio & (-5);
/* 68 */                this.I00iio = i;
                    }
/* 72 */            oOOiIOiii.I00ilO0 = this.I00io1l;
/* 78 */            if ((i & 8) == 8) {
/* 86 */                this.I00ioIO = Collections.unmodifiableList(this.I00ioIO);
/* 90 */                i = this.I00iio & (-9);
/* 92 */                this.I00iio = i;
                    }
/* 96 */            oOOiIOiii.I00io1l = this.I00ioIO;
/* 101 */           if ((i & 16) == 16) {
/* 109 */               this.I00l0I0l0lO1 = Collections.unmodifiableList(this.I00l0I0l0lO1);
                        this.I00iio &= -17;
                    }
/* 119 */           oOOiIOiii.I00ioIO = this.I00l0I0l0lO1;
/* 121 */           oOOiIOiii.I00iiO = i2;
/* 541 */           return oOOiIOiii;
                }

                public final void I000OOo1O(OOOiIOiii oOOiIOiii) {
/* 3 */             if (oOOiIOiii == OOOiIOiii.I00li1OI) {
/* 5 */                 return;
                    }
/* 10 */            if ((oOOiIOiii.I00iiO & 1) == 1) {
/* 12 */                int i = oOOiIOiii.I00iio;
/* 17 */                this.I00iio = 1 | this.I00iio;
/* 19 */                this.I00ilI0I1 = i;
                    }
/* 27 */            if (!oOOiIOiii.I00ilI0I1.isEmpty()) {
/* 35 */                if (this.I00ilO0.isEmpty()) {
/* 39 */                    this.I00ilO0 = oOOiIOiii.I00ilI0I1;
                            this.I00iio &= -3;
                        } else {
/* 52 */                    if ((this.I00iio & 2) != 2) {
/* 61 */                        this.I00ilO0 = new ArrayList(this.I00ilO0);
                                this.I00iio |= 2;
                            }
/* 72 */                    this.I00ilO0.addAll(oOOiIOiii.I00ilI0I1);
                        }
                    }
/* 81 */            if (!oOOiIOiii.I00ilO0.isEmpty()) {
/* 89 */                if (this.I00io1l.isEmpty()) {
/* 93 */                    this.I00io1l = oOOiIOiii.I00ilO0;
                            this.I00iio &= -5;
                        } else {
/* 106 */                   if ((this.I00iio & 4) != 4) {
/* 115 */                       this.I00io1l = new ArrayList(this.I00io1l);
                                this.I00iio |= 4;
                            }
/* 126 */                   this.I00io1l.addAll(oOOiIOiii.I00ilO0);
                        }
                    }
/* 135 */           if (!oOOiIOiii.I00io1l.isEmpty()) {
/* 143 */               if (this.I00ioIO.isEmpty()) {
/* 147 */                   this.I00ioIO = oOOiIOiii.I00io1l;
                            this.I00iio &= -9;
                        } else {
/* 161 */                   if ((this.I00iio & 8) != 8) {
/* 170 */                       this.I00ioIO = new ArrayList(this.I00ioIO);
                                this.I00iio |= 8;
                            }
/* 181 */                   this.I00ioIO.addAll(oOOiIOiii.I00io1l);
                        }
                    }
/* 190 */           if (!oOOiIOiii.I00ioIO.isEmpty()) {
/* 198 */               if (this.I00l0I0l0lO1.isEmpty()) {
/* 202 */                   this.I00l0I0l0lO1 = oOOiIOiii.I00ioIO;
                            this.I00iio &= -17;
                        } else {
/* 216 */                   if ((this.I00iio & 16) != 16) {
/* 225 */                       this.I00l0I0l0lO1 = new ArrayList(this.I00l0I0l0lO1);
                                this.I00iio |= 16;
                            }
/* 236 */                   this.I00l0I0l0lO1.addAll(oOOiIOiii.I00ioIO);
                        }
                    }
/* 239 */           I0001Ioi1lo(oOOiIOiii);
/* 250 */           this.I00iOIl = this.I00iOIl.I0000O(oOOiIOiii.I00iiI);
                }

                public final Object clone() {
/* 1 */             OOOiII oOOiIII000O01llI0 = I000O01llI0();
/* 9 */             oOOiIII000O01llI0.I000OOo1O(I000II());
/* 29 */            return oOOiIII000O01llI0;
                }
            }
