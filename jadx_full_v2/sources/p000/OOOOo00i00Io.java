            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOOo00i00Io extends Ilooool1l0 implements O1lIi00l {
                public final int I00iiI;
                public int I00iiO;
                public List I00iio;
                public int I00ilI0I1;

                public OOOOo00i00Io(int i) {
/* 1 */             this.I00iiI = i;
                }

                @Override
                public final I01Ilioliio I0000Il00O() {
                    switch (this.I00iiI) {
                        case 0:
/* 23 */                    OOOi000ooO oOOi000ooOI0001Ioi1lo = I0001Ioi1lo();
/* 31 */                    if (oOOi000ooOI0001Ioi1lo.I00000oOI()) {
/* 33 */                        return oOOi000ooOI0001Ioi1lo;
                            }
/* 39 */                    throw new IOiIIo1l();
                        default:
/* 6 */                     OOi0i0OO0lol oOi0i0OO0lolI000II = I000II();
/* 14 */                    if (oOi0i0OO0lolI000II.I00000oOI()) {
/* 16 */                        return oOi0i0OO0lolI000II;
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
/* 3 */             OOi0i0OO0lol oOi0i0OO0lol = null;
/* 3 */             OOOi000ooO oOOi000ooO = null;
                    try {
                        switch (this.I00iiI) {
                            case 0:
                                try {
                                    try {
/* 43 */                                I000O01llI0((OOOi000ooO) OOOi000ooO.I00ioIO.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 46 */                                return this;
                                    } catch (O001110li e) {
/* 52 */                                OOOi000ooO oOOi000ooO2 = (OOOi000ooO) e.I00iOIl;
                                        try {
/* 54 */                                    throw e;
                                        } catch (Throwable th) {
/* 55 */                                    th = th;
/* 56 */                                    oOOi000ooO = oOOi000ooO2;
/* 57 */                                    if (oOOi000ooO != null) {
/* 59 */                                        I000O01llI0(oOOi000ooO);
                                            }
/* 62 */                                    throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
/* 47 */                            th = th2;
/* 57 */                            if (oOOi000ooO != null) {
                                    }
/* 62 */                            throw th;
                                }
                            default:
                                try {
/* 15 */                            I000OOo1O((OOi0i0OO0lol) OOi0i0OO0lol.I00ioIO.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 18 */                            return this;
                                } catch (O001110li e2) {
/* 24 */                            OOi0i0OO0lol oOi0i0OO0lol2 = (OOi0i0OO0lol) e2.I00iOIl;
                                    try {
/* 26 */                                throw e2;
                                    } catch (Throwable th3) {
/* 27 */                                th = th3;
/* 28 */                                oOi0i0OO0lol = oOi0i0OO0lol2;
/* 29 */                                if (oOi0i0OO0lol != null) {
/* 31 */                                    I000OOo1O(oOi0i0OO0lol);
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
/* 14 */                    I000O01llI0((OOOi000ooO) io00OlOi0);
                            break;
                        default:
/* 8 */                     I000OOo1O((OOi0i0OO0lol) io00OlOi0);
                            break;
                    }
/* 11 */            return this;
                }

                public OOOi000ooO I0001Ioi1lo() {
/* 3 */             OOOi000ooO oOOi000ooO = new OOOi000ooO();
/* 7 */             oOOi000ooO.I00ilI0I1 = (byte) -1;
/* 9 */             oOOi000ooO.I00ilO0 = -1;
/* 13 */            oOOi000ooO.I00iOIl = this.I00iOIl;
/* 15 */            int i = this.I00iiO;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            oOOi000ooO.I00iiO = this.I00ilI0I1;
/* 30 */            if ((i & 2) == 2) {
/* 38 */                this.I00iio = Collections.unmodifiableList(this.I00iio);
                        this.I00iiO &= -3;
                    }
/* 48 */            oOOi000ooO.I00iio = this.I00iio;
/* 50 */            oOOi000ooO.I00iiI = i2;
/* 113 */           return oOOi000ooO;
                }

                public OOi0i0OO0lol I000II() {
/* 3 */             OOi0i0OO0lol oOi0i0OO0lol = new OOi0i0OO0lol();
/* 7 */             oOi0i0OO0lol.I00ilI0I1 = (byte) -1;
/* 9 */             oOi0i0OO0lol.I00ilO0 = -1;
/* 13 */            oOi0i0OO0lol.I00iOIl = this.I00iOIl;
/* 15 */            int i = this.I00iiO;
/* 20 */            if ((i & 1) == 1) {
/* 28 */                this.I00iio = Collections.unmodifiableList(this.I00iio);
                        this.I00iiO &= -2;
                    }
/* 38 */            oOi0i0OO0lol.I00iiO = this.I00iio;
/* 42 */            int i2 = (i & 2) != 2 ? 0 : 1;
/* 48 */            oOi0i0OO0lol.I00iio = this.I00ilI0I1;
/* 50 */            oOi0i0OO0lol.I00iiI = i2;
/* 113 */           return oOi0i0OO0lol;
                }

                public void I000O01llI0(OOOi000ooO oOOi000ooO) {
/* 3 */             if (oOOi000ooO == OOOi000ooO.I00io1l) {
/* 5 */                 return;
                    }
/* 10 */            if ((oOOi000ooO.I00iiI & 1) == 1) {
/* 12 */                int i = oOOi000ooO.I00iiO;
/* 17 */                this.I00iiO = 1 | this.I00iiO;
/* 19 */                this.I00ilI0I1 = i;
                    }
/* 27 */            if (!oOOi000ooO.I00iio.isEmpty()) {
/* 35 */                if (this.I00iio.isEmpty()) {
/* 39 */                    this.I00iio = oOOi000ooO.I00iio;
                            this.I00iiO &= -3;
                        } else {
/* 52 */                    if ((this.I00iiO & 2) != 2) {
/* 61 */                        this.I00iio = new ArrayList(this.I00iio);
                                this.I00iiO |= 2;
                            }
/* 72 */                    this.I00iio.addAll(oOOi000ooO.I00iio);
                        }
                    }
/* 83 */            this.I00iOIl = this.I00iOIl.I0000O(oOOi000ooO.I00iOIl);
                }

                public void I000OOo1O(OOi0i0OO0lol oOi0i0OO0lol) {
/* 3 */             if (oOi0i0OO0lol == OOi0i0OO0lol.I00io1l) {
/* 5 */                 return;
                    }
/* 13 */            if (!oOi0i0OO0lol.I00iiO.isEmpty()) {
/* 21 */                if (this.I00iio.isEmpty()) {
/* 25 */                    this.I00iio = oOi0i0OO0lol.I00iiO;
                            this.I00iiO &= -2;
                        } else {
/* 37 */                    if ((this.I00iiO & 1) != 1) {
/* 46 */                        this.I00iio = new ArrayList(this.I00iio);
                                this.I00iiO |= 1;
                            }
/* 57 */                    this.I00iio.addAll(oOi0i0OO0lol.I00iiO);
                        }
                    }
/* 63 */            if ((oOi0i0OO0lol.I00iiI & 1) == 1) {
/* 65 */                int i = oOi0i0OO0lol.I00iio;
                        this.I00iiO |= 2;
/* 73 */                this.I00ilI0I1 = i;
                    }
/* 83 */            this.I00iOIl = this.I00iOIl.I0000O(oOi0i0OO0lol.I00iOIl);
                }

                public final Object clone() {
                    switch (this.I00iiI) {
                        case 0:
/* 30 */                    OOOOo00i00Io oOOOo00i00Io = new OOOOo00i00Io(0);
/* 35 */                    oOOOo00i00Io.I00iio = Collections.EMPTY_LIST;
/* 41 */                    oOOOo00i00Io.I000O01llI0(I0001Ioi1lo());
/* 44 */                    return oOOOo00i00Io;
                        default:
/* 9 */                     OOOOo00i00Io oOOOo00i00Io2 = new OOOOo00i00Io(1);
/* 14 */                    oOOOo00i00Io2.I00iio = Collections.EMPTY_LIST;
/* 17 */                    oOOOo00i00Io2.I00ilI0I1 = -1;
/* 23 */                    oOOOo00i00Io2.I000OOo1O(I000II());
/* 26 */                    return oOOOo00i00Io2;
                    }
                }
            }
