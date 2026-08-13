            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class O0IIi1lI extends Ilooool1l0 implements O1lIi00l {
                public int I00iiI;
                public List I00iiO;
                public List I00iio;

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             O0IIio11 o0IIio11I0001Ioi1lo = I0001Ioi1lo();
/* 5 */             o0IIio11I0001Ioi1lo.I00000oOI();
/* 29 */            return o0IIio11I0001Ioi1lo;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             O0IIio11 o0IIio11 = null;
                    try {
                        try {
/* 10 */                    I000II((O0IIio11) O0IIio11.I00ioIO.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    O0IIio11 o0IIio112 = (O0IIio11) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        o0IIio11 = o0IIio112;
/* 24 */                        if (o0IIio11 != null) {
/* 26 */                            I000II(o0IIio11);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (o0IIio11 != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000II((O0IIio11) io00OlOi0);
/* 49 */            return this;
                }

                public final O0IIio11 I0001Ioi1lo() {
/* 3 */             O0IIio11 o0IIio11 = new O0IIio11();
/* 7 */             o0IIio11.I00iio = -1;
/* 9 */             o0IIio11.I00ilI0I1 = (byte) -1;
/* 11 */            o0IIio11.I00ilO0 = -1;
/* 15 */            o0IIio11.I00iOIl = this.I00iOIl;
/* 17 */            int i = this.I00iiI;
/* 22 */            if ((i & 1) == 1) {
/* 30 */                this.I00iiO = Collections.unmodifiableList(this.I00iiO);
/* 34 */                i = this.I00iiI & (-2);
/* 36 */                this.I00iiI = i;
                    }
/* 40 */            o0IIio11.I00iiI = this.I00iiO;
/* 44 */            if ((i & 2) == 2) {
/* 52 */                this.I00iio = Collections.unmodifiableList(this.I00iio);
                        this.I00iiI &= -3;
                    }
/* 62 */            o0IIio11.I00iiO = this.I00iio;
/* 113 */           return o0IIio11;
                }

                public final void I000II(O0IIio11 o0IIio11) {
/* 3 */             if (o0IIio11 == O0IIio11.I00io1l) {
/* 5 */                 return;
                    }
/* 12 */            if (!o0IIio11.I00iiI.isEmpty()) {
/* 20 */                if (this.I00iiO.isEmpty()) {
/* 24 */                    this.I00iiO = o0IIio11.I00iiI;
                            this.I00iiI &= -2;
                        } else {
/* 37 */                    if ((this.I00iiI & 1) != 1) {
/* 46 */                        this.I00iiO = new ArrayList(this.I00iiO);
                                this.I00iiI |= 1;
                            }
/* 57 */                    this.I00iiO.addAll(o0IIio11.I00iiI);
                        }
                    }
/* 66 */            if (!o0IIio11.I00iiO.isEmpty()) {
/* 74 */                if (this.I00iio.isEmpty()) {
/* 78 */                    this.I00iio = o0IIio11.I00iiO;
                            this.I00iiI &= -3;
                        } else {
/* 91 */                    if ((this.I00iiI & 2) != 2) {
/* 100 */                       this.I00iio = new ArrayList(this.I00iio);
                                this.I00iiI |= 2;
                            }
/* 111 */                   this.I00iio.addAll(o0IIio11.I00iiO);
                        }
                    }
/* 122 */           this.I00iOIl = this.I00iOIl.I0000O(o0IIio11.I00iOIl);
                }

                public final Object clone() {
/* 3 */             O0IIi1lI o0IIi1lI = new O0IIi1lI();
/* 6 */             List list = Collections.EMPTY_LIST;
/* 8 */             o0IIi1lI.I00iiO = list;
/* 10 */            o0IIi1lI.I00iio = list;
/* 16 */            o0IIi1lI.I000II(I0001Ioi1lo());
/* 29 */            return o0IIi1lI;
                }
            }
