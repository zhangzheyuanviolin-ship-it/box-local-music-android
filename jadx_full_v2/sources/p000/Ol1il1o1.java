            package p000;

            import kotlin.jvm.functions.Function1;
            
            public abstract class Ol1il1o1 {
                public Ol1l0OoOo I00000oIO;
                public long I00000oOI;
                public boolean I0000Il00O;
                public int I0000O;

                public Ol1il1o1(long j, Ol1l0OoOo ol1l0OoOo) {
                    int iI00000oIO;
                    int iNumberOfTrailingZeros;
/* 4 */             this.I00000oIO = ol1l0OoOo;
/* 6 */             this.I00000oOI = j;
/* 8 */             OiioI1Io0o oiioI1Io0o = Ol1l1lI1Ili.I00000oIO;
/* 14 */            if (j != 0) {
/* 16 */                Ol1l0OoOo ol1l0OoOoI0000O = I0000O();
/* 20 */                long j2 = ol1l0OoOoI0000O.I00iiO;
/* 22 */                long[] jArr = ol1l0OoOoI0000O.I00iio;
/* 24 */                if (jArr != null) {
/* 27 */                    j = jArr[0];
                        } else {
/* 30 */                    long j3 = ol1l0OoOoI0000O.I00iiI;
/* 34 */                    if (j3 != 0) {
/* 36 */                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                            } else {
/* 43 */                        long j4 = ol1l0OoOoI0000O.I00iOIl;
/* 47 */                        if (j4 != 0) {
/* 51 */                            j2 += 64;
/* 52 */                            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                                }
                            }
/* 41 */                    j = iNumberOfTrailingZeros + j2;
                        }
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 62 */                    iI00000oIO = Ol1l1lI1Ili.I0001Ioi1lo.I00000oIO(j);
                        }
                    } else {
/* 71 */                iI00000oIO = -1;
                    }
/* 72 */            this.I0000O = iI00000oIO;
                }

                public static void I00100o1O0lo(Ol1il1o1 ol1il1o1) {
/* 3 */             Ol1l1lI1Ili.I00000oOI.I00IO1(ol1il1o1);
                }

                public final void I00000oIO() {
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 4 */                 I00000oOI();
/* 7 */                 I00100l0();
                    }
                }

                public void I00000oOI() {
/* 11 */            Ol1l1lI1Ili.I0000O = Ol1l1lI1Ili.I0000O.I0000O(I000II());
                }

                public abstract void I0000Il00O();

                public Ol1l0OoOo I0000O() {
/* 1 */             return this.I00000oIO;
                }

                public abstract Function1 I0000oI00();

                public abstract boolean I0001Ioi1lo();

                public long I000II() {
/* 1 */             return this.I00000oOI;
                }

                public int I000O01llI0() {
/* 1 */             return 0;
                }

                public abstract Function1 I000OOo1O();

                public final Ol1il1o1 I000OiO() {
/* 1 */             IOO000ilo iOO000ilo = Ol1l1lI1Ili.I00000oOI;
/* 7 */             Ol1il1o1 ol1il1o1 = (Ol1il1o1) iOO000ilo.I0010I0i();
/* 9 */             iOO000ilo.I00IO1(this);
/* 20 */            return ol1il1o1;
                }

                public abstract void I000iOII();

                public abstract void I000l1();

                public abstract void I000lI();

                public abstract void I000o00OoI0I(OlO11I0O1l olO11I0O1l);

                public final void I000oI1ioi() {
/* 1 */             int i = this.I0000O;
/* 3 */             if (i >= 0) {
/* 5 */                 Ol1l1lI1Ili.I00111O(i);
/* 9 */                 this.I0000O = -1;
                    }
                }

                public void I00100l0() {
/* 1 */             I000oI1ioi();
                }

                public void I0010I0i(Ol1l0OoOo ol1l0OoOo) {
/* 1 */             this.I00000oIO = ol1l0OoOo;
                }

                public void I0010o(long j) {
/* 1 */             this.I00000oOI = j;
                }

                public void I00111O(int i) {
/* 29 */            throw new IllegalStateException("Updating write count is not supported for this snapshot");
                }

                public abstract Ol1il1o1 I001IIilI0O(Function1 function1);
            }
