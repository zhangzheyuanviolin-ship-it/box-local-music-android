            package p000;

            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            
            public abstract class IOOOIO1O {
                public int I00000oIO;
                public int I00000oOI;
                public Object I0000Il00O;

                public static IOOOIO1O I00IO1oi11O(InputStream inputStream, int i) {
/* 1 */             if (i <= 0) {
/* 46 */                I000II.I000iOII("bufferSize must be > 0");
/* 49 */                return null;
                    }
/* 3 */             if (inputStream == null) {
/* 7 */                 return I00IOO(iI000IO.I00000oIO);
                    }
/* 14 */            i1lO0O1 i1lo0o1 = new i1lO0O1();
/* 20 */            i1lo0o1.I000iOII = Integer.MAX_VALUE;
/* 22 */            i1lo0o1.I0000O = inputStream;
/* 26 */            if (i < 8) {
/* 28 */                i = 8;
                    }
/* 31 */            i1lo0o1.I0000oI00 = new byte[i];
/* 34 */            i1lo0o1.I0001Ioi1lo = 0;
/* 36 */            i1lo0o1.I000O01llI0 = 0;
/* 38 */            i1lo0o1.I000OiO = 0;
/* 40 */            VarHandle.storeStoreFence();
/* 43 */            return i1lo0o1;
                }

                public static i1lIllO1 I00IOO(byte[] bArr) {
/* 3 */             i1lIllO1 i1lillo1 = new i1lIllO1();
/* 9 */             i1lillo1.I000OOo1O = Integer.MAX_VALUE;
/* 11 */            i1lillo1.I0000O = bArr;
/* 14 */            i1lillo1.I0000oI00 = 0;
/* 16 */            i1lillo1.I000II = 0;
/* 18 */            VarHandle.storeStoreFence();
                    try {
/* 21 */                i1lillo1.I001l0I00(0);
/* 24 */                return i1lillo1;
                    } catch (iI00lI e) {
/* 77 */                throw new IllegalArgumentException(e);
                    }
                }

                public static int I00IlilI0i0i(int i) {
/* 6 */             return (i >>> 1) ^ (-(i & 1));
                }

                public static long I00Io1lO(long j) {
/* 7 */             return (j >>> 1) ^ (-(1 & j));
                }

                public abstract void I00000oIO(int i);

                public abstract int I00000oOI();

                public abstract boolean I0000Il00O();

                public abstract void I0000O(int i);

                public abstract int I0000oI00(int i);

                public abstract boolean I0001Ioi1lo();

                public abstract IIO1lIii I000II();

                public abstract double I000O01llI0();

                public abstract int I000OOo1O();

                public abstract int I000OiO();

                public abstract long I000iOII();

                public abstract float I000l1();

                public abstract int I000lI();

                public abstract long I000o00OoI0I();

                public abstract int I000oI1ioi();

                public abstract long I00100l0();

                public abstract int I00100o1O0lo();

                public abstract long I0010I0i();

                public abstract String I0010o();

                public abstract String I00111O();

                public abstract int I001IIilI0O();

                public abstract int I001IO000();

                public abstract long I001i1O0Ol();

                public abstract boolean I001i1lo1io(int i);

                public void I001iOo1i0O() throws O0010I0o {
                    int iI001IIilI0O;
/* 31 */            do {
/* 1 */                 iI001IIilI0O = I001IIilI0O();
/* 5 */                 if (iI001IIilI0O == 0) {
/* 33 */                    return;
                        }
/* 8 */                 int i = this.I00000oIO;
/* 10 */                int i2 = this.I00000oOI;
/* 15 */                if (i + i2 >= 100) {
/* 55 */                    throw new O0010I0o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        }
/* 19 */                this.I00000oOI = i2 + 1;
                        this.I00000oOI--;
/* 31 */            } while (I001i1lo1io(iI001IIilI0O));
                }

                public abstract int I001l0I00(int i);

                public abstract void I001lIiIIo1O(int i);

                public abstract int I001lllioOl();

                public abstract boolean I001lloI();

                public abstract int I00II0Ol1O0l();

                public abstract int I00II0oii1o(byte[] bArr, int i, int i2);

                public abstract void I00IO1(int i);

                public void I00IioO0OiOi() throws iI00lI {
                    int iI00Io1o110i;
/* 31 */            do {
/* 1 */                 iI00Io1o110i = I00Io1o110i();
/* 5 */                 if (iI00Io1o110i == 0) {
/* 33 */                    return;
                        }
/* 8 */                 int i = this.I00000oIO;
/* 10 */                int i2 = this.I00000oOI;
/* 15 */                if (i + i2 >= 100) {
/* 36 */                    iilo0lOo110.I000II("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 55 */                    return;
                        } else {
/* 19 */                    this.I00000oOI = i2 + 1;
                            this.I00000oOI--;
                        }
/* 31 */            } while (I00IoO0(iI00Io1o110i));
                }

                public abstract int I00Io1o110i();

                public abstract void I00IoIO0lI(int i);

                public abstract boolean I00IoO0(int i);

                public abstract double I00IoiI();

                public abstract float I00Iooi00oi();

                public abstract long I00O0i0ii();

                public abstract long I00O0o1oo();

                public abstract int I00O10llo();

                public abstract long I00OI1();

                public abstract int I00OIO1();

                public abstract boolean I00OIl();

                public abstract String I00OIo();

                public abstract String I00OOll1();

                public abstract i1lI1O I00OilO00Il();

                public abstract byte[] I00Oio();

                public abstract int I00Ol00();

                public abstract int I00Ol10();

                public abstract int I00Ol1ll1();

                public abstract long I00OloOo();

                public abstract int I00i01iIIliI();

                public abstract long I00i0O();

                public abstract int I00i0ilIl0i();

                public abstract long I00i0oil();
            }
