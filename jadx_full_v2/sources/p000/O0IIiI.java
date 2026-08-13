            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class O0IIiI extends Ilooool1l0 implements O1lIi00l {
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public Object I00ilI0I1;
                public O0IIiO1iiio0 I00ilO0;
                public List I00io1l;
                public List I00ioIO;

                public static O0IIiI I000II() {
/* 3 */             O0IIiI o0IIiI = new O0IIiI();
/* 7 */             o0IIiI.I00iiO = 1;
/* 11 */            o0IIiI.I00ilI0I1 = "";
/* 15 */            o0IIiI.I00ilO0 = O0IIiO1iiio0.NONE;
/* 17 */            List list = Collections.EMPTY_LIST;
/* 19 */            o0IIiI.I00io1l = list;
/* 21 */            o0IIiI.I00ioIO = list;
/* 29 */            return o0IIiI;
                }

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             O0IIiil00lI o0IIiil00lII0001Ioi1lo = I0001Ioi1lo();
/* 5 */             o0IIiil00lII0001Ioi1lo.I00000oOI();
/* 29 */            return o0IIiil00lII0001Ioi1lo;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             O0IIiil00lI o0IIiil00lI = null;
                    try {
                        try {
/* 10 */                    I000O01llI0((O0IIiil00lI) O0IIiil00lI.I00lll10.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    O0IIiil00lI o0IIiil00lI2 = (O0IIiil00lI) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        o0IIiil00lI = o0IIiil00lI2;
/* 24 */                        if (o0IIiil00lI != null) {
/* 26 */                            I000O01llI0(o0IIiil00lI);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (o0IIiil00lI != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000O01llI0((O0IIiil00lI) io00OlOi0);
/* 49 */            return this;
                }

                public final O0IIiil00lI I0001Ioi1lo() {
/* 3 */             O0IIiil00lI o0IIiil00lI = new O0IIiil00lI();
/* 7 */             o0IIiil00lI.I00ioIO = -1;
/* 9 */             o0IIiil00lI.I00l0OO0IO = -1;
/* 11 */            o0IIiil00lI.I00li1OI = (byte) -1;
/* 13 */            o0IIiil00lI.I00ll1 = -1;
/* 17 */            o0IIiil00lI.I00iOIl = this.I00iOIl;
/* 19 */            int i = this.I00iiI;
/* 24 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 30 */            o0IIiil00lI.I00iiO = this.I00iiO;
/* 35 */            if ((i & 2) == 2) {
/* 37 */                i2 |= 2;
                    }
/* 41 */            o0IIiil00lI.I00iio = this.I00iio;
/* 46 */            if ((i & 4) == 4) {
/* 48 */                i2 |= 4;
                    }
/* 52 */            o0IIiil00lI.I00ilI0I1 = this.I00ilI0I1;
/* 58 */            if ((i & 8) == 8) {
/* 60 */                i2 |= 8;
                    }
/* 64 */            o0IIiil00lI.I00ilO0 = this.I00ilO0;
/* 70 */            if ((i & 16) == 16) {
/* 78 */                this.I00io1l = Collections.unmodifiableList(this.I00io1l);
/* 82 */                i = this.I00iiI & (-17);
/* 84 */                this.I00iiI = i;
                    }
/* 88 */            o0IIiil00lI.I00io1l = this.I00io1l;
/* 93 */            if ((i & 32) == 32) {
/* 101 */               this.I00ioIO = Collections.unmodifiableList(this.I00ioIO);
                        this.I00iiI &= -33;
                    }
/* 111 */           o0IIiil00lI.I00l0I0l0lO1 = this.I00ioIO;
/* 113 */           o0IIiil00lI.I00iiI = i2;
/* 541 */           return o0IIiil00lI;
                }

                public final void I000O01llI0(O0IIiil00lI o0IIiil00lI) {
/* 3 */             if (o0IIiil00lI == O0IIiil00lI.I00lli11) {
/* 5 */                 return;
                    }
/* 6 */             int i = o0IIiil00lI.I00iiI;
/* 11 */            if ((i & 1) == 1) {
/* 13 */                int i2 = o0IIiil00lI.I00iiO;
/* 18 */                this.I00iiI = 1 | this.I00iiI;
/* 20 */                this.I00iiO = i2;
                    }
/* 25 */            if ((i & 2) == 2) {
/* 27 */                int i3 = o0IIiil00lI.I00iio;
/* 32 */                this.I00iiI = 2 | this.I00iiI;
/* 34 */                this.I00iio = i3;
                    }
/* 39 */            if ((i & 4) == 4) {
                        this.I00iiI |= 4;
/* 48 */                this.I00ilI0I1 = o0IIiil00lI.I00ilI0I1;
                    }
/* 53 */            if ((i & 8) == 8) {
/* 55 */                O0IIiO1iiio0 o0IIiO1iiio0 = o0IIiil00lI.I00ilO0;
/* 57 */                o0IIiO1iiio0.getClass();
/* 63 */                this.I00iiI = 8 | this.I00iiI;
/* 65 */                this.I00ilO0 = o0IIiO1iiio0;
                    }
/* 73 */            if (!o0IIiil00lI.I00io1l.isEmpty()) {
/* 81 */                if (this.I00io1l.isEmpty()) {
/* 85 */                    this.I00io1l = o0IIiil00lI.I00io1l;
                            this.I00iiI &= -17;
                        } else {
/* 99 */                    if ((this.I00iiI & 16) != 16) {
/* 108 */                       this.I00io1l = new ArrayList(this.I00io1l);
                                this.I00iiI |= 16;
                            }
/* 119 */                   this.I00io1l.addAll(o0IIiil00lI.I00io1l);
                        }
                    }
/* 128 */           if (!o0IIiil00lI.I00l0I0l0lO1.isEmpty()) {
/* 136 */               if (this.I00ioIO.isEmpty()) {
/* 140 */                   this.I00ioIO = o0IIiil00lI.I00l0I0l0lO1;
                            this.I00iiI &= -33;
                        } else {
/* 154 */                   if ((this.I00iiI & 32) != 32) {
/* 163 */                       this.I00ioIO = new ArrayList(this.I00ioIO);
                                this.I00iiI |= 32;
                            }
/* 174 */                   this.I00ioIO.addAll(o0IIiil00lI.I00l0I0l0lO1);
                        }
                    }
/* 185 */           this.I00iOIl = this.I00iOIl.I0000O(o0IIiil00lI.I00iOIl);
                }

                public final Object clone() {
/* 1 */             O0IIiI o0IIiII000II = I000II();
/* 9 */             o0IIiII000II.I000O01llI0(I0001Ioi1lo());
/* 29 */            return o0IIiII000II;
                }
            }
