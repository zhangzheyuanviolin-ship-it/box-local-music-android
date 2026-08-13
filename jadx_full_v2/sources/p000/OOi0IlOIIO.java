            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOi0IlOIIO extends Io000lII0l {
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public boolean I00io1l;
                public OOi0Illolii I00ioIO;
                public List I00l0I0l0lO1;
                public List I00l0OO0IO;
                public List I00li1OI;

                public static OOi0IlOIIO I000O01llI0() {
/* 3 */             OOi0IlOIIO oOi0IlOIIO = new OOi0IlOIIO();
/* 8 */             oOi0IlOIIO.I00ioIO = OOi0Illolii.INV;
/* 10 */            List list = Collections.EMPTY_LIST;
/* 12 */            oOi0IlOIIO.I00l0I0l0lO1 = list;
/* 14 */            oOi0IlOIIO.I00l0OO0IO = list;
/* 16 */            oOi0IlOIIO.I00li1OI = list;
/* 29 */            return oOi0IlOIIO;
                }

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             OOi0O1i1lOi oOi0O1i1lOiI000II = I000II();
/* 9 */             if (oOi0O1i1lOiI000II.I00000oOI()) {
/* 11 */                return oOi0O1i1lOiI000II;
                    }
/* 29 */            throw new IOiIIo1l();
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             OOi0O1i1lOi oOi0O1i1lOi = null;
                    try {
                        try {
/* 10 */                    I000OOo1O((OOi0O1i1lOi) OOi0O1i1lOi.I00o0iI0io1.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    OOi0O1i1lOi oOi0O1i1lOi2 = (OOi0O1i1lOi) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        oOi0O1i1lOi = oOi0O1i1lOi2;
/* 24 */                        if (oOi0O1i1lOi != null) {
/* 26 */                            I000OOo1O(oOi0O1i1lOi);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (oOi0O1i1lOi != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000OOo1O((OOi0O1i1lOi) io00OlOi0);
/* 49 */            return this;
                }

                public final OOi0O1i1lOi I000II() {
/* 3 */             OOi0O1i1lOi oOi0O1i1lOi = new OOi0O1i1lOi(this);
/* 7 */             oOi0O1i1lOi.I00l0OO0IO = -1;
/* 9 */             oOi0O1i1lOi.I00ll1 = (byte) -1;
/* 11 */            oOi0O1i1lOi.I00lli11 = -1;
/* 15 */            oOi0O1i1lOi.I00iiI = this.I00iOIl;
/* 17 */            int i = this.I00iio;
/* 22 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 28 */            oOi0O1i1lOi.I00iio = this.I00ilI0I1;
/* 33 */            if ((i & 2) == 2) {
/* 35 */                i2 |= 2;
                    }
/* 39 */            oOi0O1i1lOi.I00ilI0I1 = this.I00ilO0;
/* 44 */            if ((i & 4) == 4) {
/* 46 */                i2 |= 4;
                    }
/* 50 */            oOi0O1i1lOi.I00ilO0 = this.I00io1l;
/* 56 */            if ((i & 8) == 8) {
/* 58 */                i2 |= 8;
                    }
/* 62 */            oOi0O1i1lOi.I00io1l = this.I00ioIO;
/* 68 */            if ((i & 16) == 16) {
/* 76 */                this.I00l0I0l0lO1 = Collections.unmodifiableList(this.I00l0I0l0lO1);
/* 80 */                i = this.I00iio & (-17);
/* 82 */                this.I00iio = i;
                    }
/* 86 */            oOi0O1i1lOi.I00ioIO = this.I00l0I0l0lO1;
/* 92 */            if ((i & 32) == 32) {
/* 100 */               this.I00l0OO0IO = Collections.unmodifiableList(this.I00l0OO0IO);
/* 104 */               i = this.I00iio & (-33);
/* 106 */               this.I00iio = i;
                    }
/* 110 */           oOi0O1i1lOi.I00l0I0l0lO1 = this.I00l0OO0IO;
/* 115 */           if ((i & 64) == 64) {
/* 123 */               this.I00li1OI = Collections.unmodifiableList(this.I00li1OI);
                        this.I00iio &= -65;
                    }
/* 133 */           oOi0O1i1lOi.I00li1OI = this.I00li1OI;
/* 135 */           oOi0O1i1lOi.I00iiO = i2;
/* 541 */           return oOi0O1i1lOi;
                }

                public final void I000OOo1O(OOi0O1i1lOi oOi0O1i1lOi) {
/* 3 */             if (oOi0O1i1lOi == OOi0O1i1lOi.I00lll10) {
/* 5 */                 return;
                    }
/* 6 */             int i = oOi0O1i1lOi.I00iiO;
/* 11 */            if ((i & 1) == 1) {
/* 13 */                int i2 = oOi0O1i1lOi.I00iio;
/* 18 */                this.I00iio = 1 | this.I00iio;
/* 20 */                this.I00ilI0I1 = i2;
                    }
/* 25 */            if ((i & 2) == 2) {
/* 27 */                int i3 = oOi0O1i1lOi.I00ilI0I1;
/* 32 */                this.I00iio = 2 | this.I00iio;
/* 34 */                this.I00ilO0 = i3;
                    }
/* 39 */            if ((i & 4) == 4) {
/* 41 */                boolean z = oOi0O1i1lOi.I00ilO0;
/* 46 */                this.I00iio = 4 | this.I00iio;
/* 48 */                this.I00io1l = z;
                    }
/* 53 */            if ((i & 8) == 8) {
/* 55 */                OOi0Illolii oOi0Illolii = oOi0O1i1lOi.I00io1l;
/* 57 */                oOi0Illolii.getClass();
/* 63 */                this.I00iio = 8 | this.I00iio;
/* 65 */                this.I00ioIO = oOi0Illolii;
                    }
/* 73 */            if (!oOi0O1i1lOi.I00ioIO.isEmpty()) {
/* 81 */                if (this.I00l0I0l0lO1.isEmpty()) {
/* 85 */                    this.I00l0I0l0lO1 = oOi0O1i1lOi.I00ioIO;
                            this.I00iio &= -17;
                        } else {
/* 99 */                    if ((this.I00iio & 16) != 16) {
/* 108 */                       this.I00l0I0l0lO1 = new ArrayList(this.I00l0I0l0lO1);
                                this.I00iio |= 16;
                            }
/* 119 */                   this.I00l0I0l0lO1.addAll(oOi0O1i1lOi.I00ioIO);
                        }
                    }
/* 128 */           if (!oOi0O1i1lOi.I00l0I0l0lO1.isEmpty()) {
/* 136 */               if (this.I00l0OO0IO.isEmpty()) {
/* 140 */                   this.I00l0OO0IO = oOi0O1i1lOi.I00l0I0l0lO1;
                            this.I00iio &= -33;
                        } else {
/* 154 */                   if ((this.I00iio & 32) != 32) {
/* 163 */                       this.I00l0OO0IO = new ArrayList(this.I00l0OO0IO);
                                this.I00iio |= 32;
                            }
/* 174 */                   this.I00l0OO0IO.addAll(oOi0O1i1lOi.I00l0I0l0lO1);
                        }
                    }
/* 183 */           if (!oOi0O1i1lOi.I00li1OI.isEmpty()) {
/* 191 */               if (this.I00li1OI.isEmpty()) {
/* 195 */                   this.I00li1OI = oOi0O1i1lOi.I00li1OI;
                            this.I00iio &= -65;
                        } else {
/* 209 */                   if ((this.I00iio & 64) != 64) {
/* 218 */                       this.I00li1OI = new ArrayList(this.I00li1OI);
                                this.I00iio |= 64;
                            }
/* 229 */                   this.I00li1OI.addAll(oOi0O1i1lOi.I00li1OI);
                        }
                    }
/* 232 */           I0001Ioi1lo(oOi0O1i1lOi);
/* 243 */           this.I00iOIl = this.I00iOIl.I0000O(oOi0O1i1lOi.I00iiI);
                }

                public final Object clone() {
/* 1 */             OOi0IlOIIO oOi0IlOIIOI000O01llI0 = I000O01llI0();
/* 9 */             oOi0IlOIIOI000O01llI0.I000OOo1O(I000II());
/* 29 */            return oOi0IlOIIOI000O01llI0;
                }
            }
