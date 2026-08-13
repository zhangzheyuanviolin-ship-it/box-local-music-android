            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOlo0l extends Io000lII0l {
                public int I00iio;
                public List I00ilI0I1;
                public List I00ilO0;
                public List I00io1l;
                public OOi0i0OO0lol I00ioIO;
                public OOi0liO I00l0I0l0lO1;

                public static OOOlo0l I000O01llI0() {
/* 3 */             OOOlo0l oOOlo0l = new OOOlo0l();
/* 6 */             List list = Collections.EMPTY_LIST;
/* 8 */             oOOlo0l.I00ilI0I1 = list;
/* 10 */            oOOlo0l.I00ilO0 = list;
/* 12 */            oOOlo0l.I00io1l = list;
/* 16 */            oOOlo0l.I00ioIO = OOi0i0OO0lol.I00io1l;
/* 20 */            oOOlo0l.I00l0I0l0lO1 = OOi0liO.I00ilI0I1;
/* 29 */            return oOOlo0l;
                }

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             OOOloii1IoO0 oOOloii1IoO0I000II = I000II();
/* 9 */             if (oOOloii1IoO0I000II.I00000oOI()) {
/* 11 */                return oOOloii1IoO0I000II;
                    }
/* 29 */            throw new IOiIIo1l();
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             OOOloii1IoO0 oOOloii1IoO0 = null;
                    try {
                        try {
/* 10 */                    I000OOo1O((OOOloii1IoO0) OOOloii1IoO0.I00ll1.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    OOOloii1IoO0 oOOloii1IoO02 = (OOOloii1IoO0) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        oOOloii1IoO0 = oOOloii1IoO02;
/* 24 */                        if (oOOloii1IoO0 != null) {
/* 26 */                            I000OOo1O(oOOloii1IoO0);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (oOOloii1IoO0 != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000OOo1O((OOOloii1IoO0) io00OlOi0);
/* 49 */            return this;
                }

                public final OOOloii1IoO0 I000II() {
                    int i;
/* 3 */             OOOloii1IoO0 oOOloii1IoO0 = new OOOloii1IoO0(this);
/* 7 */             oOOloii1IoO0.I00l0I0l0lO1 = (byte) -1;
/* 9 */             oOOloii1IoO0.I00l0OO0IO = -1;
/* 13 */            oOOloii1IoO0.I00iiI = this.I00iOIl;
/* 15 */            int i2 = this.I00iio;
/* 20 */            if ((i2 & 1) == 1) {
/* 28 */                this.I00ilI0I1 = Collections.unmodifiableList(this.I00ilI0I1);
/* 32 */                i = this.I00iio & (-2);
/* 34 */                this.I00iio = i;
                    } else {
/* 37 */                i = i2;
                    }
/* 40 */            oOOloii1IoO0.I00iio = this.I00ilI0I1;
/* 45 */            if ((i & 2) == 2) {
/* 53 */                this.I00ilO0 = Collections.unmodifiableList(this.I00ilO0);
/* 57 */                i = this.I00iio & (-3);
/* 59 */                this.I00iio = i;
                    }
/* 63 */            oOOloii1IoO0.I00ilI0I1 = this.I00ilO0;
/* 67 */            if ((i & 4) == 4) {
/* 75 */                this.I00io1l = Collections.unmodifiableList(this.I00io1l);
                        this.I00iio &= -5;
                    }
/* 85 */            oOOloii1IoO0.I00ilO0 = this.I00io1l;
/* 91 */            int i3 = (i2 & 8) != 8 ? 0 : 1;
/* 97 */            oOOloii1IoO0.I00io1l = this.I00ioIO;
/* 102 */           if ((i2 & 16) == 16) {
/* 104 */               i3 |= 2;
                    }
/* 108 */           oOOloii1IoO0.I00ioIO = this.I00l0I0l0lO1;
/* 110 */           oOOloii1IoO0.I00iiO = i3;
/* 113 */           return oOOloii1IoO0;
                }

                public final void I000OOo1O(OOOloii1IoO0 oOOloii1IoO0) {
                    OOi0liO oOi0liO;
                    OOi0i0OO0lol oOi0i0OO0lol;
/* 3 */             if (oOOloii1IoO0 == OOOloii1IoO0.I00li1OI) {
/* 5 */                 return;
                    }
/* 13 */            if (!oOOloii1IoO0.I00iio.isEmpty()) {
/* 21 */                if (this.I00ilI0I1.isEmpty()) {
/* 25 */                    this.I00ilI0I1 = oOOloii1IoO0.I00iio;
                            this.I00iio &= -2;
                        } else {
/* 37 */                    if ((this.I00iio & 1) != 1) {
/* 46 */                        this.I00ilI0I1 = new ArrayList(this.I00ilI0I1);
                                this.I00iio |= 1;
                            }
/* 57 */                    this.I00ilI0I1.addAll(oOOloii1IoO0.I00iio);
                        }
                    }
/* 67 */            if (!oOOloii1IoO0.I00ilI0I1.isEmpty()) {
/* 75 */                if (this.I00ilO0.isEmpty()) {
/* 79 */                    this.I00ilO0 = oOOloii1IoO0.I00ilI0I1;
                            this.I00iio &= -3;
                        } else {
/* 91 */                    if ((this.I00iio & 2) != 2) {
/* 100 */                       this.I00ilO0 = new ArrayList(this.I00ilO0);
                                this.I00iio |= 2;
                            }
/* 111 */                   this.I00ilO0.addAll(oOOloii1IoO0.I00ilI0I1);
                        }
                    }
/* 120 */           if (!oOOloii1IoO0.I00ilO0.isEmpty()) {
/* 128 */               if (this.I00io1l.isEmpty()) {
/* 132 */                   this.I00io1l = oOOloii1IoO0.I00ilO0;
                            this.I00iio &= -5;
                        } else {
/* 145 */                   if ((this.I00iio & 4) != 4) {
/* 154 */                       this.I00io1l = new ArrayList(this.I00io1l);
                                this.I00iio |= 4;
                            }
/* 165 */                   this.I00io1l.addAll(oOOloii1IoO0.I00ilO0);
                        }
                    }
/* 171 */           if ((oOOloii1IoO0.I00iiO & 1) == 1) {
/* 173 */               OOi0i0OO0lol oOi0i0OO0lol2 = oOOloii1IoO0.I00io1l;
/* 180 */               if ((this.I00iio & 8) != 8 || (oOi0i0OO0lol = this.I00ioIO) == OOi0i0OO0lol.I00io1l) {
/* 202 */                   this.I00ioIO = oOi0i0OO0lol2;
                        } else {
/* 188 */                   OOOOo00i00Io oOOOo00i00IoI000OOo1O = OOi0i0OO0lol.I000OOo1O(oOi0i0OO0lol);
/* 192 */                   oOOOo00i00IoI000OOo1O.I000OOo1O(oOi0i0OO0lol2);
/* 199 */                   this.I00ioIO = oOOOo00i00IoI000OOo1O.I000II();
                        }
                        this.I00iio |= 8;
                    }
/* 212 */           if ((oOOloii1IoO0.I00iiO & 2) == 2) {
/* 214 */               OOi0liO oOi0liO2 = oOOloii1IoO0.I00ioIO;
/* 221 */               if ((this.I00iio & 16) != 16 || (oOi0liO = this.I00l0I0l0lO1) == OOi0liO.I00ilI0I1) {
/* 251 */                   this.I00l0I0l0lO1 = oOi0liO2;
                        } else {
/* 231 */                   OOOiOi0o oOOiOi0o = new OOOiOi0o(2);
/* 236 */                   oOOiOi0o.I00iio = Collections.EMPTY_LIST;
/* 238 */                   oOOiOi0o.I000lI(oOi0liO);
/* 241 */                   oOOiOi0o.I000lI(oOi0liO2);
/* 248 */                   this.I00l0I0l0lO1 = oOOiOi0o.I000OOo1O();
                        }
                        this.I00iio |= 16;
                    }
/* 258 */           I0001Ioi1lo(oOOloii1IoO0);
/* 269 */           this.I00iOIl = this.I00iOIl.I0000O(oOOloii1IoO0.I00iiI);
                }

                public final Object clone() {
/* 1 */             OOOlo0l oOOlo0lI000O01llI0 = I000O01llI0();
/* 9 */             oOOlo0lI000O01llI0.I000OOo1O(I000II());
/* 29 */            return oOOlo0lI000O01llI0;
                }
            }
