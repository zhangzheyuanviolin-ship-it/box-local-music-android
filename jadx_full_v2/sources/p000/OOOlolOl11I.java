            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOlolOl11I extends Io000lII0l {
                public int I00iio;
                public OOOoiIli I00ilI0I1;
                public OOOoOl1 I00ilO0;
                public OOOloii1IoO0 I00io1l;
                public List I00ioIO;

                public static OOOlolOl11I I000O01llI0() {
/* 3 */             OOOlolOl11I oOOlolOl11I = new OOOlolOl11I();
/* 8 */             oOOlolOl11I.I00ilI0I1 = OOOoiIli.I00ilI0I1;
/* 12 */            oOOlolOl11I.I00ilO0 = OOOoOl1.I00ilI0I1;
/* 16 */            oOOlolOl11I.I00io1l = OOOloii1IoO0.I00li1OI;
/* 20 */            oOOlolOl11I.I00ioIO = Collections.EMPTY_LIST;
/* 29 */            return oOOlolOl11I;
                }

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             OOOloll11 oOOloll11I000II = I000II();
/* 9 */             if (oOOloll11I000II.I00000oOI()) {
/* 11 */                return oOOloll11I000II;
                    }
/* 29 */            throw new IOiIIo1l();
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             OOOloll11 oOOloll11 = null;
                    try {
                        try {
/* 10 */                    I000OOo1O((OOOloll11) OOOloll11.I00li1OI.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    OOOloll11 oOOloll112 = (OOOloll11) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        oOOloll11 = oOOloll112;
/* 24 */                        if (oOOloll11 != null) {
/* 26 */                            I000OOo1O(oOOloll11);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (oOOloll11 != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000OOo1O((OOOloll11) io00OlOi0);
/* 49 */            return this;
                }

                public final OOOloll11 I000II() {
/* 3 */             OOOloll11 oOOloll11 = new OOOloll11(this);
/* 7 */             oOOloll11.I00ioIO = (byte) -1;
/* 9 */             oOOloll11.I00l0I0l0lO1 = -1;
/* 13 */            oOOloll11.I00iiI = this.I00iOIl;
/* 15 */            int i = this.I00iio;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            oOOloll11.I00iio = this.I00ilI0I1;
/* 31 */            if ((i & 2) == 2) {
/* 33 */                i2 |= 2;
                    }
/* 37 */            oOOloll11.I00ilI0I1 = this.I00ilO0;
/* 42 */            if ((i & 4) == 4) {
/* 44 */                i2 |= 4;
                    }
/* 48 */            oOOloll11.I00ilO0 = this.I00io1l;
/* 53 */            if ((i & 8) == 8) {
/* 61 */                this.I00ioIO = Collections.unmodifiableList(this.I00ioIO);
                        this.I00iio &= -9;
                    }
/* 71 */            oOOloll11.I00io1l = this.I00ioIO;
/* 73 */            oOOloll11.I00iiO = i2;
/* 113 */           return oOOloll11;
                }

                public final void I000OOo1O(OOOloll11 oOOloll11) {
                    OOOloii1IoO0 oOOloii1IoO0;
                    OOOoOl1 oOOoOl1;
                    OOOoiIli oOOoiIli;
/* 3 */             if (oOOloll11 == OOOloll11.I00l0OO0IO) {
/* 5 */                 return;
                    }
/* 10 */            if ((oOOloll11.I00iiO & 1) == 1) {
/* 12 */                OOOoiIli oOOoiIli2 = oOOloll11.I00iio;
/* 17 */                if ((this.I00iio & 1) != 1 || (oOOoiIli = this.I00ilI0I1) == OOOoiIli.I00ilI0I1) {
/* 48 */                    this.I00ilI0I1 = oOOoiIli2;
                        } else {
/* 28 */                    OOOiOi0o oOOiOi0o = new OOOiOi0o(3);
/* 33 */                    oOOiOi0o.I00iio = O0o1O0olOll.I00iiI;
/* 35 */                    oOOiOi0o.I000l1(oOOoiIli);
/* 38 */                    oOOiOi0o.I000l1(oOOoiIli2);
/* 45 */                    this.I00ilI0I1 = oOOiOi0o.I000O01llI0();
                        }
                        this.I00iio |= 1;
                    }
/* 59 */            if ((oOOloll11.I00iiO & 2) == 2) {
/* 61 */                OOOoOl1 oOOoOl12 = oOOloll11.I00ilI0I1;
/* 66 */                if ((this.I00iio & 2) != 2 || (oOOoOl1 = this.I00ilO0) == OOOoOl1.I00ilI0I1) {
/* 96 */                    this.I00ilO0 = oOOoOl12;
                        } else {
/* 76 */                    OOOiOi0o oOOiOi0o2 = new OOOiOi0o(1);
/* 81 */                    oOOiOi0o2.I00iio = Collections.EMPTY_LIST;
/* 83 */                    oOOiOi0o2.I000iOII(oOOoOl1);
/* 86 */                    oOOiOi0o2.I000iOII(oOOoOl12);
/* 93 */                    this.I00ilO0 = oOOiOi0o2.I000II();
                        }
                        this.I00iio |= 2;
                    }
/* 107 */           if ((oOOloll11.I00iiO & 4) == 4) {
/* 109 */               OOOloii1IoO0 oOOloii1IoO02 = oOOloll11.I00ilO0;
/* 114 */               if ((this.I00iio & 4) != 4 || (oOOloii1IoO0 = this.I00io1l) == OOOloii1IoO0.I00li1OI) {
/* 139 */                   this.I00io1l = oOOloii1IoO02;
                        } else {
/* 122 */                   OOOlo0l oOOlo0lI000O01llI0 = OOOlo0l.I000O01llI0();
/* 126 */                   oOOlo0lI000O01llI0.I000OOo1O(oOOloii1IoO0);
/* 129 */                   oOOlo0lI000O01llI0.I000OOo1O(oOOloii1IoO02);
/* 136 */                   this.I00io1l = oOOlo0lI000O01llI0.I000II();
                        }
                        this.I00iio |= 4;
                    }
/* 152 */           if (!oOOloll11.I00io1l.isEmpty()) {
/* 160 */               if (this.I00ioIO.isEmpty()) {
/* 164 */                   this.I00ioIO = oOOloll11.I00io1l;
                            this.I00iio &= -9;
                        } else {
/* 178 */                   if ((this.I00iio & 8) != 8) {
/* 187 */                       this.I00ioIO = new ArrayList(this.I00ioIO);
                                this.I00iio |= 8;
                            }
/* 198 */                   this.I00ioIO.addAll(oOOloll11.I00io1l);
                        }
                    }
/* 201 */           I0001Ioi1lo(oOOloll11);
/* 212 */           this.I00iOIl = this.I00iOIl.I0000O(oOOloll11.I00iiI);
                }

                public final Object clone() {
/* 1 */             OOOlolOl11I oOOlolOl11II000O01llI0 = I000O01llI0();
/* 9 */             oOOlolOl11II000O01llI0.I000OOo1O(I000II());
/* 29 */            return oOOlolOl11II000O01llI0;
                }
            }
