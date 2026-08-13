            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.ArrayList;
            import java.util.concurrent.atomic.AtomicLong;
            
/* 13 */    public final class Io1OIO1l0o implements OIi0011o {
                public final int I00iOIl;
                public long I00iiI;
                public Object I00iiO;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public Io1OIO1l0o(OIilII oIilII, int i) {
/* 11 */            this(0L, (i & 1) != 0 ? null : oIilII);
/* 2 */             this.I00iOIl = 2;
                }

                public static long I00000oOI(Io1OIO1l0o io1OIO1l0o, long j, float f) {
/* 3 */             long jI000II = OIOlIiiioi.I000II(io1OIO1l0o.I00iiI, j);
/* 7 */             io1OIO1l0o.I00iiI = jI000II;
/* 24 */            float fI0000oI00 = ((OIilII) io1OIO1l0o.I00iiO) == null ? OIOlIiiioi.I0000oI00(jI000II) : Math.abs(io1OIO1l0o.I0000Il00O(jI000II));
/* 31 */            if (fI0000oI00 <= 0.0f || fI0000oI00 < f) {
/* 140 */               return 9205357640488583168L;
                    }
/* 39 */            OIilII oIilII = (OIilII) io1OIO1l0o.I00iiO;
/* 41 */            long j2 = io1OIO1l0o.I00iiI;
/* 43 */            if (oIilII == null) {
/* 59 */                return OIOlIiiioi.I0001Ioi1lo(io1OIO1l0o.I00iiI, OIOlIiiioi.I000O01llI0(f, OIOlIiiioi.I0000Il00O(OIOlIiiioi.I0000oI00(j2), j2)));
                    }
/* 79 */            float fI0000Il00O = io1OIO1l0o.I0000Il00O(j2) - (Math.signum(io1OIO1l0o.I0000Il00O(io1OIO1l0o.I00iiI)) * f);
/* 80 */            long j3 = io1OIO1l0o.I00iiI;
/* 84 */            OIilII oIilII2 = (OIilII) io1OIO1l0o.I00iiO;
/* 86 */            OIilII oIilII3 = OIilII.I00iiI;
/* 99 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (oIilII2 == oIilII3 ? j3 & 4294967295L : j3 >> 32));
/* 110 */           if (((OIilII) io1OIO1l0o.I00iiO) == oIilII3) {
/* 124 */               return (Float.floatToRawIntBits(fI0000Il00O) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
                    }
/* 138 */           return (Float.floatToRawIntBits(fI0000Il00O) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                }

                public int I00000oIO(InputStream inputStream, int i) throws IOException {
/* 3 */             ArrayList arrayList = (ArrayList) this.I00iiO;
/* 6 */             if (i <= 0) {
/* 5 */                 return 0;
                    }
/* 9 */             long j = this.I00iiI;
/* 12 */            long j2 = i + j;
/* 26 */            int size = (((int) ((j2 - 1) >> 9)) - arrayList.size()) + 1;
/* 29 */            for (int i2 = 0; i2 < size; i2++) {
/* 35 */                arrayList.add(new byte[Barcode.FORMAT_UPC_A]);
                    }
/* 41 */            this.I00iiI = j2;
/* 45 */            int i3 = (int) (j >> 9);
/* 49 */            int i4 = (int) (j & 511);
/* 50 */            int i5 = 0;
/* 51 */            while (i > 0) {
/* 57 */                byte[] bArr = (byte[]) arrayList.get(i3);
/* 61 */                int iMin = Math.min(512 - i4, i);
/* 65 */                i -= iMin;
/* 66 */                i5 += iMin;
/* 67 */                while (iMin > 0) {
/* 69 */                    int i6 = inputStream.read(bArr, i4, iMin);
/* 73 */                    if (i6 < 0) {
                                this.I00iiI -= i - i5;
/* 82 */                        return i5;
                            }
/* 83 */                    iMin -= i6;
/* 84 */                    i4 += i6;
                        }
/* 86 */                i3++;
/* 88 */                i4 = 0;
                    }
/* 551 */           return i5;
                }

                public float I0000Il00O(long j) {
/* 14 */            return Float.intBitsToFloat((int) (((OIilII) this.I00iiO) == OIilII.I00iiI ? j >> 32 : j & 4294967295L));
                }

                public Io1Io0OOi011 I0000O() {
/* 5 */             ArrayList arrayList = new ArrayList(20);
                    while (true) {
/* 14 */                String strI00IoO0 = ((IIIIlO11I0lO) this.I00iiO).I00IoO0(this.I00iiI);
                        this.I00iiI -= strI00IoO0.length();
/* 33 */                if (strI00IoO0.length() == 0) {
/* 45 */                    return new Io1Io0OOi011((String[]) arrayList.toArray(new String[0]));
                        }
/* 53 */                int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(strI00IoO0, ':', 1, 4);
/* 58 */                if (iI001i1O0Ol != -1) {
/* 60 */                    String strSubstring = strI00IoO0.substring(0, iI001i1O0Ol);
/* 66 */                    String strSubstring2 = strI00IoO0.substring(iI001i1O0Ol + 1);
/* 70 */                    arrayList.add(strSubstring);
/* 81 */                    arrayList.add(OlOoOIi0o.I00OIo(strSubstring2).toString());
                        } else if (strI00IoO0.charAt(0) == ':') {
/* 93 */                    String strSubstring3 = strI00IoO0.substring(1);
/* 97 */                    arrayList.add("");
/* 108 */                   arrayList.add(OlOoOIi0o.I00OIo(strSubstring3).toString());
                        } else {
/* 112 */                   arrayList.add("");
/* 123 */                   arrayList.add(OlOoOIi0o.I00OIo(strI00IoO0).toString());
                        }
                    }
                }

                @Override
                public void onFailure(Exception exc) {
                    switch (this.I00iOIl) {
                        case 3:
/* 106 */                   OlilOlOiI olilOlOiI = (OlilOlOiI) this.I00iiO;
/* 114 */                   ((AtomicLong) olilOlOiI.I00iio).set(this.I00iiI);
                            break;
                        case 4:
/* 94 */                    li1Io1I1li li1io1i1li = (li1Io1I1li) this.I00iiO;
/* 100 */                   li1io1i1li.I00000oOI.set(this.I00iiI);
                            break;
                        case 5:
/* 80 */                    OoIol00Ool ooIol00Ool = (OoIol00Ool) this.I00iiO;
/* 88 */                    ((AtomicLong) ooIol00Ool.I00iiO).set(this.I00iiI);
                            break;
                        case 6:
/* 68 */                    loOoI0llOO0I loooi0lloo0i = (loOoI0llOO0I) this.I00iiO;
/* 74 */                    loooi0lloo0i.I00000oOI.set(this.I00iiI);
                            break;
                        case 7:
/* 56 */                    loiOiiIIo00l loioiiiio00l = (loiOiiIIo00l) this.I00iiO;
/* 62 */                    loioiiiio00l.I00000oOI.set(this.I00iiI);
                            break;
                        case 8:
/* 44 */                    loiOiI01lli loioii01lli = (loiOiI01lli) this.I00iiO;
/* 50 */                    loioii01lli.I00000oOI.set(this.I00iiI);
                            break;
                        case 9:
/* 32 */                    loo0I11ii loo0i11ii = (loo0I11ii) this.I00iiO;
/* 38 */                    loo0i11ii.I00000oOI.set(this.I00iiI);
                            break;
                        case 10:
/* 20 */                    o0OOlo o0oolo = (o0OOlo) this.I00iiO;
/* 26 */                    o0oolo.I00000oOI.set(this.I00iiI);
                            break;
                        default:
/* 8 */                     o0OlOl111 o0olol111 = (o0OlOl111) this.I00iiO;
/* 14 */                    o0olol111.I00000oOI.set(this.I00iiI);
                            break;
                    }
                }

/* 14 */        public Io1OIO1l0o(int i) {
/* 15 */            this.I00iOIl = i;
                }

/* 15 */        public Io1OIO1l0o(long j, OIilII oIilII) {
                    this.I00iOIl = 2;
/* 17 */            this.I00iiO = oIilII;
/* 18 */            this.I00iiI = j;
                }
            }
