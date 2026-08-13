            package p000;

            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class ii0I1Il {
                public static final Logger I00000oOI = Logger.getLogger(ii0I1Il.class.getName());
                public static final boolean I0000Il00O = ii10Oo1I0.I0000oI00;
                public i0OI1l1Oo I00000oIO;

                public static int I00000oIO(String str) {
                    int length;
                    try {
/* 1 */                 length = ii10i1o.I0000Il00O(str);
                    } catch (ii10OoO1o unused) {
/* 12 */                length = str.getBytes(ii0i1ll10I0.I00000oIO).length;
                    }
/* 17 */            return I00000oOI(length) + length;
                }

                public static int I00000oOI(int i) {
/* 9 */             return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
                }

                public static int I0000Il00O(long j) {
/* 9 */             return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
                }

                public final void I0000O(String str, ii10OoO1o ii10ooo1o) throws IOO1IOl1O10 {
/* 12 */            I00000oOI.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ii10ooo1o);
/* 17 */            byte[] bytes = str.getBytes(ii0i1ll10I0.I00000oIO);
                    try {
/* 21 */                int length = bytes.length;
/* 22 */                I001iOo1i0O(length);
/* 26 */                I000O01llI0(bytes, 0, length);
                    } catch (IndexOutOfBoundsException e) {
/* 37 */                throw new IOO1IOl1O10(e);
                    }
                }

                public abstract void I0000oI00(byte b);

                public abstract void I0001Ioi1lo(int i, boolean z);

                public abstract void I000II(int i, byte[] bArr);

                public abstract void I000O01llI0(byte[] bArr, int i, int i2);

                public abstract void I000OOo1O(int i, ii01lO0l11ii ii01lo0l11ii);

                public abstract void I000OiO(ii01lO0l11ii ii01lo0l11ii);

                public abstract void I000iOII(int i, int i2);

                public abstract void I000l1(int i);

                public abstract void I000lI(int i, long j);

                public abstract void I000o00OoI0I(long j);

                public abstract void I000oI1ioi(int i, int i2);

                public abstract void I00100l0(int i);

                public abstract void I00100o1O0lo(int i, ii00oo ii00ooVar, ii0oioOi00i ii0oiooi00i);

                public abstract void I0010I0i(ii00oo ii00ooVar);

                public abstract void I0010o(int i, ii00oo ii00ooVar);

                public abstract void I00111O(int i, ii01lO0l11ii ii01lo0l11ii);

                public abstract void I001IIilI0O(int i, String str);

                public abstract void I001IO000(String str);

                public abstract void I001i1O0Ol(int i, int i2);

                public abstract void I001i1lo1io(int i, int i2);

                public abstract void I001iOo1i0O(int i);

                public abstract void I001l0I00(int i, long j);

                public abstract void I001lIiIIo1O(long j);
            }
