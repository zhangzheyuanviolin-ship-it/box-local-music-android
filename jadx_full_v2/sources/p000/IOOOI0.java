            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.security.GeneralSecurityException;
            
/* 43 */    public abstract class IOOOI0 {
                public int I00000oIO;
                public Object I00000oOI;

                public IOOOI0(o10o1Oo o10o1oo, int i) {
/* 5 */             if (o10o1oo == null) {
/* 41 */                I000II.I000iOII("format options cannot be null");
/* 106 */               throw null;
                    }
/* 7 */             if (i < 0) {
/* 35 */                I000II.I000iOII(Oi010OO0.I00100l0(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
/* 38 */                throw null;
                    }
/* 9 */             this.I00000oIO = i;
/* 11 */            this.I00000oOI = o10o1oo;
                }

                public static int I0000O(int i) {
/* 6 */             return (-(i & 1)) ^ (i >>> 1);
                }

                public static long I0000oI00(long j) {
/* 8 */             return (-(j & 1)) ^ (j >>> 1);
                }

                public static IOOIliool I000OOo1O(byte[] bArr, int i, int i2, boolean z) {
/* 3 */             IOOIliool iOOIliool = new IOOIliool();
/* 9 */             iOOIliool.I000OOo1O = Integer.MAX_VALUE;
/* 11 */            iOOIliool.I0000Il00O = bArr;
/* 15 */            iOOIliool.I0000O = i + i2;
/* 17 */            iOOIliool.I0001Ioi1lo = i;
/* 19 */            iOOIliool.I000II = i;
/* 21 */            VarHandle.storeStoreFence();
                    try {
/* 24 */                iOOIliool.I000lI(i2);
/* 27 */                return iOOIliool;
                    } catch (O000oiiiOI0 e) {
/* 204 */               throw new IllegalArgumentException(e);
                    }
                }

                public static int I00IoIO0lI(int i) {
/* 6 */             return (i >>> 1) ^ (-(i & 1));
                }

                public static long I00IoO0(long j) {
/* 7 */             return (j >>> 1) ^ (-(1 & j));
                }

                public static ii01loI I00IoiI(int i, byte[] bArr) {
/* 3 */             ii01loI ii01loi = new ii01loI();
/* 9 */             ii01loi.I000O01llI0 = Integer.MAX_VALUE;
/* 11 */            ii01loi.I0000Il00O = bArr;
/* 13 */            ii01loi.I0000O = i;
/* 16 */            ii01loi.I0001Ioi1lo = 0;
/* 18 */            VarHandle.storeStoreFence();
                    try {
/* 21 */                ii01loi.I00OIl(i);
/* 24 */                return ii01loi;
                    } catch (ii0iI11ol e) {
/* 37 */                throw new IllegalArgumentException(e);
                    }
                }

                public static il0ilO I00Iooi00oi(byte[] bArr) {
/* 3 */             il0ilO il0ilo = new il0ilO();
/* 9 */             il0ilo.I000O01llI0 = Integer.MAX_VALUE;
/* 11 */            il0ilo.I0000Il00O = bArr;
/* 14 */            il0ilo.I0000O = 0;
/* 16 */            il0ilo.I0001Ioi1lo = 0;
/* 18 */            VarHandle.storeStoreFence();
                    try {
/* 21 */                il0ilo.I00OIl(0);
/* 24 */                return il0ilo;
                    } catch (ill0ll01OOOO e) {
/* 77 */                throw new IllegalArgumentException(e);
                    }
                }

                public ByteBuffer I00000oIO(int i, byte[] bArr) {
/* 5 */             int[] iArrI0000Il00O = I0000Il00O(IO0oi1.I0000Il00O(bArr), i);
/* 13 */            int[] iArr = (int[]) iArrI0000Il00O.clone();
/* 15 */            IO0oi1.I00000oOI(iArr);
/* 21 */            for (int i2 = 0; i2 < iArrI0000Il00O.length; i2++) {
/* 28 */                iArrI0000Il00O[i2] = iArrI0000Il00O[i2] + iArr[i2];
                    }
/* 41 */            ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
/* 51 */            byteBufferOrder.asIntBuffer().put(iArrI0000Il00O, 0, 16);
/* 106 */           return byteBufferOrder;
                }

                public abstract void I00000oOI(int i);

                public abstract int[] I0000Il00O(int[] iArr, int i);

                public abstract int I0001Ioi1lo(int i, int i2);

                public abstract int I000II();

                public abstract boolean I000O01llI0();

                public abstract int I000OiO();

                public abstract void I000iOII(int i);

                public void I000l1(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
/* 6 */             if (bArr.length != I000OiO()) {
/* 98 */                throw new GeneralSecurityException("The nonce length (in bytes) must be " + I000OiO());
                    }
/* 8 */             int iRemaining = byteBuffer2.remaining();
/* 12 */            int i = iRemaining / 64;
/* 14 */            int i2 = i + 1;
/* 17 */            for (int i3 = 0; i3 < i2; i3++) {
/* 22 */                ByteBuffer byteBufferI00000oIO = I00000oIO(this.I00000oIO + i3, bArr);
/* 28 */                if (i3 == i) {
/* 32 */                    iOiiIOilI1.I00000oOI(byteBuffer, byteBuffer2, byteBufferI00000oIO, iRemaining % 64);
                        } else {
/* 36 */                    iOiiIOilI1.I00000oOI(byteBuffer, byteBuffer2, byteBufferI00000oIO, 64);
                        }
                    }
                }

                public abstract int I000lI(int i);

                public abstract boolean I000o00OoI0I();

                public abstract IIO1i10I I000oI1ioi();

                public abstract IIO1ooI I00100l0();

                public abstract double I00100o1O0lo();

                public abstract int I0010I0i();

                public abstract int I0010o();

                public abstract long I00111O();

                public abstract float I001IIilI0O();

                public abstract int I001IO000();

                public abstract long I001i1O0Ol();

                public abstract int I001i1lo1io();

                public abstract long I001iOo1i0O();

                public abstract int I001l0I00();

                public abstract long I001lIiIIo1O();

                public abstract String I001lllioOl();

                public abstract String I001lloI();

                public abstract int I00II0Ol1O0l();

                public abstract int I00II0oii1o();

                public abstract long I00IO1();

                public abstract boolean I00IO1oi11O(int i);

                public void I00IOO() throws O0011oo {
                    int iI00II0Ol1O0l;
/* 28 */            do {
/* 1 */                 iI00II0Ol1O0l = I00II0Ol1O0l();
/* 5 */                 if (iI00II0Ol1O0l == 0) {
/* 30 */                    return;
                        }
/* 8 */                 int i = this.I00000oIO;
/* 12 */                if (i >= 100) {
/* 55 */                    throw new O0011oo("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        }
/* 16 */                this.I00000oIO = i + 1;
                        this.I00000oIO--;
/* 28 */            } while (I00IO1oi11O(iI00II0Ol1O0l));
                }

                public abstract void I00IioO0OiOi(int i);

                public abstract boolean I00IlilI0i0i();

                public abstract boolean I00Io1lO();

                public abstract boolean I00Io1o110i(int i);

                public abstract double I00O0i0ii();

                public abstract void I00O0o1oo(iOlI10l ioli10l, Object obj);

                public abstract void I00O10llo(iOlI10l ioli10l, Object obj);

                public abstract float I00OI1();

                public abstract int I00OIO1();

                public abstract int I00OIl(int i);

                public abstract int I00OIo();

                public abstract int I00OOll1();

                public abstract int I00OilO00Il();

                public abstract int I00Oio();

                public abstract int I00Ol00();

                public abstract int I00Ol10();

                public abstract int I00Ol1ll1();

                public abstract long I00OloOo();

                public abstract long I00i01iIIliI();

                public abstract long I00i0O();

                public abstract long I00i0ilIl0i();

                public abstract long I00i0oil();

                public abstract ii01iiOoo I00iIO();

                public abstract iiooOi11li I00iIi0i1o();

                public abstract String I00iOIl();

                public abstract String I00iiI();

                public abstract void I00iiO(int i);

/* 44 */        public IOOOI0(iOloO1 ioloo1, int i) {
                    if (ioloo1 == null) {
/* 50 */                I000II.I000iOII("format options cannot be null");
                        throw null;
                    }
                    if (i >= 0) {
/* 46 */                this.I00000oIO = i;
                        this.I00000oOI = ioloo1;
                    } else {
/* 49 */                I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "invalid index: "));
                        throw null;
                    }
                }

/* 50 */        public IOOOI0(int i, String str) {
                    this.I00000oIO = i;
                    this.I00000oOI = str;
                }
            }
