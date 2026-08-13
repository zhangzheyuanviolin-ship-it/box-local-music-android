            package p000;

            import java.io.InputStream;
            
            public final class Ioo00OOI0II implements OOlI0i1lo {
                public InputStream I00iOIl;

                @Override
                public final long I00II0oii1o(III1oo00i1li iII1oo00i1li, long j) {
/* 5 */             if (j == 0) {
/* 1 */                 return 0L;
                    }
/* 8 */             if (j < 0) {
/* 140 */               I000II.I0010I0i(IlIi0I0.I000l1(j, "byteCount (", ") < 0"));
/* 1 */                 return 0L;
                    }
/* 10 */            Oii1O1l oii1O1lI001i1lo1io = iII1oo00i1li.I001i1lo1io();
/* 14 */            byte[] bArr = oii1O1lI001i1lo1io.I00000oIO;
/* 28 */            long j2 = this.I00iOIl.read(bArr, oii1O1lI001i1lo1io.I0000Il00O, (int) Math.min(j, bArr.length - r2));
/* 41 */            int i = j2 == -1 ? 0 : (int) j2;
/* 43 */            if (i == 1) {
                        oii1O1lI001i1lo1io.I0000Il00O += i;
                        iII1oo00i1li.I00iiO += i;
/* 56 */                return j2;
                    }
/* 57 */            if (i >= 0) {
/* 59 */                int length = bArr.length;
/* 60 */                int i2 = oii1O1lI001i1lo1io.I0000Il00O;
/* 63 */                if (i <= length - i2) {
/* 65 */                    if (i != 0) {
/* 68 */                        oii1O1lI001i1lo1io.I0000Il00O = i2 + i;
                                iII1oo00i1li.I00iiO += i;
/* 76 */                        return j2;
                            }
/* 81 */                    if (oii1O1lI001i1lo1io.I00000oIO() == 0) {
/* 83 */                        Oii1O1l oii1O1l = iII1oo00i1li.I00iiI;
/* 85 */                        Oii1O1l oii1O1l2 = oii1O1l.I000II;
/* 87 */                        iII1oo00i1li.I00iiI = oii1O1l2;
/* 90 */                        if (oii1O1l2 == null) {
/* 92 */                            iII1oo00i1li.I00iOIl = null;
                                } else {
/* 95 */                            oii1O1l2.I0001Ioi1lo = null;
                                }
/* 97 */                        oii1O1l.I000II = null;
/* 99 */                        Oii1iIoiil0o.I00000oIO(oii1O1l);
                            }
/* 102 */                   return j2;
                        }
                    }
/* 107 */           StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Invalid number of bytes written: ", i, ". Should be in 0..");
/* 115 */           sbI00100o1O0lo.append(bArr.length - oii1O1lI001i1lo1io.I0000Il00O);
/* 131 */           throw new IllegalStateException(sbI00100o1O0lo.toString().toString());
                }

                @Override
                public final void close() {
/* 3 */             this.I00iOIl.close();
                }

                public final String toString() {
/* 18 */            return "RawSource(" + this.I00iOIl + ')';
                }
            }
