            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOl0llOi extends Ilooool1l0 implements O1lIi00l {
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public OOOl1oi I00ilI0I1;
                public OOi001oo1OOI I00ilO0;
                public int I00io1l;
                public List I00ioIO;
                public List I00l0I0l0lO1;

                public static OOOl0llOi I000II() {
/* 3 */             OOOl0llOi oOOl0llOi = new OOOl0llOi();
/* 8 */             oOOl0llOi.I00ilI0I1 = OOOl1oi.TRUE;
/* 12 */            oOOl0llOi.I00ilO0 = OOi001oo1OOI.I00oO101o;
/* 14 */            List list = Collections.EMPTY_LIST;
/* 16 */            oOOl0llOi.I00ioIO = list;
/* 18 */            oOOl0llOi.I00l0I0l0lO1 = list;
/* 29 */            return oOOl0llOi;
                }

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             OOOlOO0IO oOOlOO0IOI0001Ioi1lo = I0001Ioi1lo();
/* 9 */             if (oOOlOO0IOI0001Ioi1lo.I00000oOI()) {
/* 11 */                return oOOlOO0IOI0001Ioi1lo;
                    }
/* 29 */            throw new IOiIIo1l();
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             OOOlOO0IO oOOlOO0IO = null;
                    try {
                        try {
/* 10 */                    I000O01llI0((OOOlOO0IO) OOOlOO0IO.I00lli11.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    OOOlOO0IO oOOlOO0IO2 = (OOOlOO0IO) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        oOOlOO0IO = oOOlOO0IO2;
/* 24 */                        if (oOOlOO0IO != null) {
/* 26 */                            I000O01llI0(oOOlOO0IO);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (oOOlOO0IO != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000O01llI0((OOOlOO0IO) io00OlOi0);
/* 49 */            return this;
                }

                public final OOOlOO0IO I0001Ioi1lo() {
/* 3 */             OOOlOO0IO oOOlOO0IO = new OOOlOO0IO();
/* 7 */             oOOlOO0IO.I00l0OO0IO = (byte) -1;
/* 9 */             oOOlOO0IO.I00li1OI = -1;
/* 13 */            oOOlOO0IO.I00iOIl = this.I00iOIl;
/* 15 */            int i = this.I00iiI;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            oOOlOO0IO.I00iiO = this.I00iiO;
/* 31 */            if ((i & 2) == 2) {
/* 33 */                i2 |= 2;
                    }
/* 37 */            oOOlOO0IO.I00iio = this.I00iio;
/* 42 */            if ((i & 4) == 4) {
/* 44 */                i2 |= 4;
                    }
/* 48 */            oOOlOO0IO.I00ilI0I1 = this.I00ilI0I1;
/* 54 */            if ((i & 8) == 8) {
/* 56 */                i2 |= 8;
                    }
/* 60 */            oOOlOO0IO.I00ilO0 = this.I00ilO0;
/* 66 */            if ((i & 16) == 16) {
/* 68 */                i2 |= 16;
                    }
/* 72 */            oOOlOO0IO.I00io1l = this.I00io1l;
/* 78 */            if ((i & 32) == 32) {
/* 86 */                this.I00ioIO = Collections.unmodifiableList(this.I00ioIO);
/* 90 */                i = this.I00iiI & (-33);
/* 92 */                this.I00iiI = i;
                    }
/* 96 */            oOOlOO0IO.I00ioIO = this.I00ioIO;
/* 101 */           if ((i & 64) == 64) {
/* 109 */               this.I00l0I0l0lO1 = Collections.unmodifiableList(this.I00l0I0l0lO1);
                        this.I00iiI &= -65;
                    }
/* 119 */           oOOlOO0IO.I00l0I0l0lO1 = this.I00l0I0l0lO1;
/* 121 */           oOOlOO0IO.I00iiI = i2;
/* 541 */           return oOOlOO0IO;
                }

                public final void I000O01llI0(OOOlOO0IO oOOlOO0IO) {
                    OOi001oo1OOI oOi001oo1OOI;
/* 3 */             if (oOOlOO0IO == OOOlOO0IO.I00ll1) {
/* 5 */                 return;
                    }
/* 6 */             int i = oOOlOO0IO.I00iiI;
/* 11 */            if ((i & 1) == 1) {
/* 13 */                int i2 = oOOlOO0IO.I00iiO;
/* 18 */                this.I00iiI = 1 | this.I00iiI;
/* 20 */                this.I00iiO = i2;
                    }
/* 25 */            if ((i & 2) == 2) {
/* 27 */                int i3 = oOOlOO0IO.I00iio;
/* 32 */                this.I00iiI = 2 | this.I00iiI;
/* 34 */                this.I00iio = i3;
                    }
/* 38 */            if ((i & 4) == 4) {
/* 40 */                OOOl1oi oOOl1oi = oOOlOO0IO.I00ilI0I1;
/* 42 */                oOOl1oi.getClass();
/* 48 */                this.I00iiI = 4 | this.I00iiI;
/* 50 */                this.I00ilI0I1 = oOOl1oi;
                    }
/* 57 */            if ((oOOlOO0IO.I00iiI & 8) == 8) {
/* 59 */                OOi001oo1OOI oOi001oo1OOI2 = oOOlOO0IO.I00ilO0;
/* 64 */                if ((this.I00iiI & 8) != 8 || (oOi001oo1OOI = this.I00ilO0) == OOi001oo1OOI.I00oO101o) {
/* 86 */                    this.I00ilO0 = oOi001oo1OOI2;
                        } else {
/* 72 */                    OOOoooI oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI);
/* 76 */                    oOOoooII0010o.I000OOo1O(oOi001oo1OOI2);
/* 83 */                    this.I00ilO0 = oOOoooII0010o.I000II();
                        }
                        this.I00iiI |= 8;
                    }
/* 98 */            if ((oOOlOO0IO.I00iiI & 16) == 16) {
/* 100 */               int i4 = oOOlOO0IO.I00io1l;
/* 105 */               this.I00iiI = 16 | this.I00iiI;
/* 107 */               this.I00io1l = i4;
                    }
/* 115 */           if (!oOOlOO0IO.I00ioIO.isEmpty()) {
/* 123 */               if (this.I00ioIO.isEmpty()) {
/* 127 */                   this.I00ioIO = oOOlOO0IO.I00ioIO;
                            this.I00iiI &= -33;
                        } else {
/* 141 */                   if ((this.I00iiI & 32) != 32) {
/* 150 */                       this.I00ioIO = new ArrayList(this.I00ioIO);
                                this.I00iiI |= 32;
                            }
/* 161 */                   this.I00ioIO.addAll(oOOlOO0IO.I00ioIO);
                        }
                    }
/* 170 */           if (!oOOlOO0IO.I00l0I0l0lO1.isEmpty()) {
/* 178 */               if (this.I00l0I0l0lO1.isEmpty()) {
/* 182 */                   this.I00l0I0l0lO1 = oOOlOO0IO.I00l0I0l0lO1;
                            this.I00iiI &= -65;
                        } else {
/* 196 */                   if ((this.I00iiI & 64) != 64) {
/* 205 */                       this.I00l0I0l0lO1 = new ArrayList(this.I00l0I0l0lO1);
                                this.I00iiI |= 64;
                            }
/* 216 */                   this.I00l0I0l0lO1.addAll(oOOlOO0IO.I00l0I0l0lO1);
                        }
                    }
/* 227 */           this.I00iOIl = this.I00iOIl.I0000O(oOOlOO0IO.I00iOIl);
                }

                public final Object clone() {
/* 1 */             OOOl0llOi oOOl0llOiI000II = I000II();
/* 9 */             oOOl0llOiI000II.I000O01llI0(I0001Ioi1lo());
/* 29 */            return oOOl0llOiI000II;
                }
            }
