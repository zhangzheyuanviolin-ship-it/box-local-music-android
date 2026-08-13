            package p000;

            import java.io.IOException;
            import java.util.Enumeration;
            import java.util.Iterator;
            
            public final class O0iol1I1Ol extends I00OOll1 {
                public byte[] I00iiO;

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) {
                    byte[] bArr;
                    synchronized (this) {
/* 2 */                 bArr = this.I00iiO;
                    }
/* 5 */             if (bArr != null) {
/* 9 */                 o1OIll00i.I00Ol10(48, z, bArr);
                    } else {
/* 17 */                super.I001IO000().I000oI1ioi(o1OIll00i, z);
                    }
                }

                @Override
                public final int I0010I0i(boolean z) {
                    byte[] bArr;
                    synchronized (this) {
/* 2 */                 bArr = this.I00iiO;
                    }
                    return bArr != null ? O1OIll00i.I00O10llo(bArr.length, z) : super.I001IO000().I0010I0i(z);
                }

                @Override
                public final I00OIO1 I001IIilI0O() {
/* 1 */             I00IlilI0i0i();
/* 4 */             return super.I001IIilI0O();
                }

                @Override
                public final I00OIO1 I001IO000() {
/* 1 */             I00IlilI0i0i();
/* 4 */             return super.I001IO000();
                }

                @Override
                public final I00IO1oi11O I001lloI(int i) {
/* 1 */             I00IlilI0i0i();
/* 6 */             return this.I00iOIl[i];
                }

                @Override
                public final Enumeration I00II0Ol1O0l() {
                    byte[] bArr;
                    synchronized (this) {
/* 2 */                 bArr = this.I00iiO;
                    }
/* 5 */             if (bArr == null) {
/* 27 */                return super.I00II0Ol1O0l();
                    }
/* 9 */             O0ioi0 o0ioi0 = new O0ioi0();
/* 18 */            o0ioi0.I00000oIO = new I00Io1o110i(0, bArr);
/* 24 */            o0ioi0.I00000oOI = o0ioi0.I00000oIO();
/* 26 */            return o0ioi0;
                }

                @Override
                public final I001lloI I00II0oii1o() {
/* 7 */             return ((I00OOll1) I001IO000()).I00II0oii1o();
                }

                @Override
                public final I00O0o1oo I00IO1() {
/* 7 */             return ((I00OOll1) I001IO000()).I00IO1();
                }

                @Override
                public final I00OilO00Il I00IO1oi11O() {
/* 7 */             return ((I00OOll1) I001IO000()).I00IO1oi11O();
                }

                public final synchronized void I00IlilI0i0i() {
                    I00IOO i00ioo;
/* 6 */             if (this.I00iiO != null) {
/* 13 */                I00Io1o110i i00Io1o110i = new I00Io1o110i(0, this.I00iiO);
                        try {
/* 16 */                    I00OIO1 i00oio1I000l1 = i00Io1o110i.I000l1();
/* 20 */                    if (i00oio1I000l1 == null) {
/* 24 */                        i00ioo = new I00IOO(0);
                            } else {
/* 30 */                        I00IOO i00ioo2 = new I00IOO(0, false);
/* 40 */                        do {
/* 33 */                            i00ioo2.I0000O(i00oio1I000l1);
/* 36 */                            i00oio1I000l1 = i00Io1o110i.I000l1();
/* 40 */                        } while (i00oio1I000l1 != null);
/* 42 */                        i00ioo = i00ioo2;
                            }
/* 43 */                    i00Io1o110i.close();
/* 50 */                    this.I00iOIl = i00ioo.I000OiO();
/* 53 */                    this.I00iiO = null;
                        } catch (IOException e) {
/* 76 */                    throw new I00OI1("malformed ASN.1: " + e, e);
                        }
                    }
                }

                @Override
                public final int hashCode() {
/* 1 */             I00IlilI0i0i();
/* 4 */             return super.hashCode();
                }

                @Override
                public final Iterator iterator() {
/* 1 */             I00IlilI0i0i();
/* 4 */             return super.iterator();
                }

                @Override
                public final int size() {
/* 1 */             I00IlilI0i0i();
/* 6 */             return this.I00iOIl.length;
                }
            }
