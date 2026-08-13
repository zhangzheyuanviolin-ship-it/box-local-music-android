            package p000;

            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            
            public final class Il1I11oilOo {
                public static final Charset I0000O = StandardCharsets.US_ASCII;
                public static final String[] I0000oI00 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
                public static final int[] I0001Ioi1lo = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
                public final int I00000oIO;
                public final int I00000oOI;
                public final byte[] I0000Il00O;

                public Il1I11oilOo(byte[] bArr, int i, int i2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = bArr;
                }

                public static Il1I11oilOo I00000oIO(long j, ByteOrder byteOrder) {
/* 7 */             return I00000oOI(new long[]{j}, byteOrder);
                }

                public static Il1I11oilOo I00000oOI(long[] jArr, ByteOrder byteOrder) {
/* 10 */            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[I0001Ioi1lo[4] * jArr.length]);
/* 14 */            byteBufferWrap.order(byteOrder);
/* 19 */            for (long j : jArr) {
/* 24 */                byteBufferWrap.putInt((int) j);
                    }
/* 37 */            return new Il1I11oilOo(byteBufferWrap.array(), 4, jArr.length);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("(");
/* 14 */            sb.append(I0000oI00[this.I00000oIO]);
/* 19 */            sb.append(", data length:");
/* 27 */            return IIl001iO0Io.I000lI(this.I0000Il00O.length, ")", sb);
                }
            }
