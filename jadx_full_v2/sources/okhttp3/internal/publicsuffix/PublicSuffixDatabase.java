            package okhttp3.internal.publicsuffix;

            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InterruptedIOException;
            import java.net.IDN;
            import java.nio.charset.StandardCharsets;
            import java.util.Collections;
            import java.util.List;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.Metadata;
            import p000.I000II;
            import p000.IOOi0Ool1i;
            import p000.Il01100l;
            import p000.Io11OiO1;
            import p000.O0000Ioio00;
            import p000.OO1I1IllO;
            import p000.OOliO0;
            import p000.OilO1oiooiII;
            import p000.OlOoOIi0o;
            import p000.l1l01I;
            import p000.lIiI0I1l;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "lIiI0I1l", "okhttp"}, m18k = 1, mv = {1, 8, 0}, xi = 48)
            public final class PublicSuffixDatabase {
                public static final byte[] I0000oI00 = {42};
                public static final List I0001Ioi1lo = Collections.singletonList("*");
                public static final PublicSuffixDatabase I000II = new PublicSuffixDatabase();
                public final AtomicBoolean I00000oIO = new AtomicBoolean(false);
                public final CountDownLatch I00000oOI = new CountDownLatch(1);
                public byte[] I0000Il00O;
                public byte[] I0000O;

                public static List I0000Il00O(String str) {
/* 9 */             List listI00Io1o110i = OlOoOIi0o.I00Io1o110i(str, new char[]{'.'});
                    return O0000Ioio00.I0000O(IOOi0Ool1i.I00Io1o110i(listI00Io1o110i), "") ? IOOi0Ool1i.I001l0I00(listI00Io1o110i) : listI00Io1o110i;
                }

                public final String I00000oIO(String str) throws InterruptedException {
                    String strI00000oIO;
                    String strI00000oIO2;
                    String strI00000oIO3;
                    List listI00Io1o110i;
                    int size;
                    int size2;
/* 5 */             List listI0000Il00O = I0000Il00O(IDN.toUnicode(str));
/* 9 */             List listI00Io1o110i2 = Il01100l.I00iOIl;
/* 19 */            if (this.I00000oIO.get() || !this.I00000oIO.compareAndSet(false, true)) {
                        try {
/* 79 */                    this.I00000oOI.await();
                        } catch (InterruptedException unused) {
/* 87 */                    Thread.currentThread().interrupt();
                        }
                    } else {
/* 29 */                boolean z = false;
                        while (true) {
                            try {
                                try {
/* 30 */                            I00000oOI();
                                    break;
                                } catch (InterruptedIOException unused2) {
/* 62 */                            Thread.interrupted();
/* 65 */                            z = true;
                                } catch (IOException e) {
/* 46 */                            OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 52 */                            OO1I1IllO.I00000oIO.getClass();
/* 56 */                            OO1I1IllO.I0001Ioi1lo("Failed to read public suffix list", e, 5);
/* 59 */                            if (z) {
                                    }
                                }
                            } finally {
/* 67 */                        if (z) {
/* 73 */                            Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
/* 93 */            if (this.I0000Il00O == null) {
/* 349 */               I000II.I001IO000("Unable to load publicsuffixes.gz resource from the classpath.");
/* 92 */                return null;
                    }
/* 95 */            int size3 = listI0000Il00O.size();
/* 99 */            byte[][] bArr = new byte[size3][];
/* 102 */           for (int i = 0; i < size3; i++) {
/* 116 */               bArr[i] = ((String) listI0000Il00O.get(i)).getBytes(StandardCharsets.UTF_8);
                    }
/* 121 */           int i2 = 0;
                    while (true) {
/* 124 */               if (i2 >= size3) {
/* 144 */                   strI00000oIO = null;
                            break;
                        }
/* 126 */               byte[] bArr2 = this.I0000Il00O;
/* 128 */               if (bArr2 == null) {
/* 140 */                   O0000Ioio00.I000OOo1O("publicSuffixListBytes");
/* 143 */                   throw null;
                        }
/* 130 */               strI00000oIO = lIiI0I1l.I00000oIO(bArr2, bArr, i2);
/* 134 */               if (strI00000oIO != null) {
                            break;
                        }
/* 137 */               i2++;
                    }
/* 145 */           if (size3 > 1) {
/* 151 */               byte[][] bArr3 = (byte[][]) bArr.clone();
/* 154 */               int length = bArr3.length - 1;
/* 156 */               for (int i3 = 0; i3 < length; i3++) {
/* 160 */                   bArr3[i3] = I0000oI00;
/* 162 */                   byte[] bArr4 = this.I0000Il00O;
/* 164 */                   if (bArr4 == null) {
/* 176 */                       O0000Ioio00.I000OOo1O("publicSuffixListBytes");
/* 179 */                       throw null;
                            }
/* 166 */                   strI00000oIO2 = lIiI0I1l.I00000oIO(bArr4, bArr3, i3);
/* 170 */                   if (strI00000oIO2 != null) {
                                break;
                            }
                        }
/* 180 */               strI00000oIO2 = null;
                    } else {
/* 180 */               strI00000oIO2 = null;
                    }
/* 181 */           if (strI00000oIO2 != null) {
/* 183 */               int i4 = size3 - 1;
/* 185 */               for (int i5 = 0; i5 < i4; i5++) {
/* 187 */                   byte[] bArr5 = this.I0000O;
/* 189 */                   if (bArr5 == null) {
/* 203 */                       O0000Ioio00.I000OOo1O("publicSuffixExceptionListBytes");
/* 206 */                       throw null;
                            }
/* 191 */                   strI00000oIO3 = lIiI0I1l.I00000oIO(bArr5, bArr, i5);
/* 195 */                   if (strI00000oIO3 != null) {
                                break;
                            }
                        }
/* 207 */               strI00000oIO3 = null;
                    } else {
/* 207 */               strI00000oIO3 = null;
                    }
/* 210 */           if (strI00000oIO3 != null) {
/* 222 */               listI00Io1o110i = OlOoOIi0o.I00Io1o110i("!".concat(strI00000oIO3), new char[]{'.'});
                    } else if (strI00000oIO == null && strI00000oIO2 == null) {
/* 231 */               listI00Io1o110i = I0001Ioi1lo;
                    } else {
/* 245 */               List listI00Io1o110i3 = strI00000oIO != null ? OlOoOIi0o.I00Io1o110i(strI00000oIO, new char[]{'.'}) : listI00Io1o110i2;
/* 246 */               if (strI00000oIO2 != null) {
/* 252 */                   listI00Io1o110i2 = OlOoOIi0o.I00Io1o110i(strI00000oIO2, new char[]{'.'});
                        }
/* 268 */               listI00Io1o110i = listI00Io1o110i3.size() > listI00Io1o110i2.size() ? listI00Io1o110i3 : listI00Io1o110i2;
                    }
/* 279 */           if (listI0000Il00O.size() == listI00Io1o110i.size() && ((String) listI00Io1o110i.get(0)).charAt(0) != '!') {
/* 92 */                return null;
                    }
/* 304 */           if (((String) listI00Io1o110i.get(0)).charAt(0) == '!') {
/* 306 */               size = listI0000Il00O.size();
/* 310 */               size2 = listI00Io1o110i.size();
                    } else {
/* 316 */               size = listI0000Il00O.size();
/* 324 */               size2 = listI00Io1o110i.size() + 1;
                    }
/* 342 */           return OilO1oiooiII.I000iOII(OilO1oiooiII.I0000oI00(IOOi0Ool1i.I001IO000(I0000Il00O(str)), size - size2), ".");
                }

                public final void I00000oOI() {
                    try {
/* 5 */                 InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
/* 9 */                 if (resourceAsStream != null) {
/* 28 */                    OOliO0 oOliO0 = new OOliO0(new Io11OiO1(l1l01I.I00000oIO(resourceAsStream)));
                            try {
/* 31 */                        long jI000II = oOliO0.I000II();
/* 36 */                        oOliO0.I00100o1O0lo(jI000II);
/* 41 */                        byte[] bArrI001l0I00 = oOliO0.I00iiI.I001l0I00(jI000II);
/* 45 */                        long jI000II2 = oOliO0.I000II();
/* 50 */                        oOliO0.I00100o1O0lo(jI000II2);
/* 55 */                        byte[] bArrI001l0I002 = oOliO0.I00iiI.I001l0I00(jI000II2);
/* 59 */                        oOliO0.close();
                                synchronized (this) {
/* 63 */                            this.I0000Il00O = bArrI001l0I00;
/* 65 */                            this.I0000O = bArrI001l0I002;
                                }
                            } finally {
                            }
                        }
                    } finally {
/* 83 */                this.I00000oOI.countDown();
                    }
                }
            }
