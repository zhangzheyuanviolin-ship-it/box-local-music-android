            package p000;

            import java.nio.ByteBuffer;
            
            public final class OoOl1ol1l {
                public static final ThreadLocal I0000O = new ThreadLocal();
                public int I00000oIO;
                public OillOo0 I00000oOI;
                public volatile int I0000Il00O;

                public final int I00000oIO(int i) {
/* 1 */             O1liI1Ii o1liI1IiI00000oOI = I00000oOI();
/* 7 */             int iI00000oIO = o1liI1IiI00000oOI.I00000oIO(16);
/* 11 */            if (iI00000oIO == 0) {
/* 35 */                return 0;
                    }
/* 15 */            ByteBuffer byteBuffer = (ByteBuffer) o1liI1IiI00000oOI.I00iiI;
/* 19 */            int i2 = iI00000oIO + o1liI1IiI00000oOI.I00iOIl;
/* 30 */            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
                }

                public final O1liI1Ii I00000oOI() {
/* 1 */             ThreadLocal threadLocal = I0000O;
/* 7 */             O1liI1Ii o1liI1Ii = (O1liI1Ii) threadLocal.get();
/* 10 */            if (o1liI1Ii == null) {
/* 14 */                o1liI1Ii = new O1liI1Ii(0);
/* 17 */                threadLocal.set(o1liI1Ii);
                    }
/* 24 */            O1liIlo o1liIlo = (O1liIlo) this.I00000oOI.I00iiI;
/* 26 */            int i = this.I00000oIO;
/* 29 */            int iI00000oIO = o1liIlo.I00000oIO(6);
/* 33 */            if (iI00000oIO != 0) {
/* 37 */                int i2 = iI00000oIO + o1liIlo.I00iOIl;
/* 51 */                int i3 = (i * 4) + ((ByteBuffer) o1liIlo.I00iiI).getInt(i2) + i2 + 4;
/* 60 */                int i4 = ((ByteBuffer) o1liIlo.I00iiI).getInt(i3) + i3;
/* 63 */                ByteBuffer byteBuffer = (ByteBuffer) o1liIlo.I00iiI;
/* 65 */                o1liI1Ii.I00iiI = byteBuffer;
/* 67 */                if (byteBuffer != null) {
/* 69 */                    o1liI1Ii.I00iOIl = i4;
/* 75 */                    int i5 = i4 - byteBuffer.getInt(i4);
/* 76 */                    o1liI1Ii.I00iiO = i5;
/* 86 */                    o1liI1Ii.I00iio = ((ByteBuffer) o1liI1Ii.I00iiI).getShort(i5);
/* 88 */                    return o1liI1Ii;
                        }
/* 89 */                o1liI1Ii.I00iOIl = 0;
/* 91 */                o1liI1Ii.I00iiO = 0;
/* 93 */                o1liI1Ii.I00iio = 0;
                    }
/* 110 */           return o1liI1Ii;
                }

                public final String toString() {
                    int i;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 15 */            sb.append(", id:");
/* 18 */            O1liI1Ii o1liI1IiI00000oOI = I00000oOI();
/* 23 */            int iI00000oIO = o1liI1IiI00000oOI.I00000oIO(4);
/* 47 */            sb.append(Integer.toHexString(iI00000oIO != 0 ? ((ByteBuffer) o1liI1IiI00000oOI.I00iiI).getInt(iI00000oIO + o1liI1IiI00000oOI.I00iOIl) : 0));
/* 52 */            sb.append(", codepoints:");
/* 55 */            O1liI1Ii o1liI1IiI00000oOI2 = I00000oOI();
/* 61 */            int iI00000oIO2 = o1liI1IiI00000oOI2.I00000oIO(16);
/* 65 */            if (iI00000oIO2 != 0) {
/* 69 */                int i2 = iI00000oIO2 + o1liI1IiI00000oOI2.I00iOIl;
/* 83 */                i = ((ByteBuffer) o1liI1IiI00000oOI2.I00iiI).getInt(((ByteBuffer) o1liI1IiI00000oOI2.I00iiI).getInt(i2) + i2);
                    } else {
/* 88 */                i = 0;
                    }
/* 89 */            for (int i3 = 0; i3 < i; i3++) {
/* 99 */                sb.append(Integer.toHexString(I00000oIO(i3)));
/* 104 */               sb.append(" ");
                    }
/* 110 */           return sb.toString();
                }
            }
