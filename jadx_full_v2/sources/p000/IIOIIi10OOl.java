            package p000;

            import java.util.Arrays;
            
/* 7 */     public final class IIOIIi10OOl implements Comparable {
                public static final IIOIIi10OOl I00iiO = new IIOIIi10OOl(new byte[0]);
                public static final char[] I00iio = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                public final byte[] I00iOIl;
                public int I00iiI;

                public IIOIIi10OOl(byte[] bArr, int i, int i2) {
/* 5 */             this(I1IoiO1l.I00100l0(bArr, i, i2));
                }

                public final byte I00000oIO(int i) {
/* 1 */             byte[] bArr = this.I00iOIl;
/* 3 */             if (i >= 0 && i < bArr.length) {
/* 8 */                 return bArr[i];
                    }
/* 26 */            I000II.I0010o(Oi010OO0.I001i1lo1io(IlIi0I0.I00100o1O0lo("index (", i, ") is out of byte string bounds: [0.."), bArr.length, ')'));
/* 29 */            return (byte) 0;
                }

                @Override
                public final int compareTo(Object obj) {
/* 1 */             IIOIIi10OOl iIOIIi10OOl = (IIOIIi10OOl) obj;
/* 3 */             byte[] bArr = iIOIIi10OOl.I00iOIl;
/* 6 */             if (iIOIIi10OOl == this) {
/* 5 */                 return 0;
                    }
/* 9 */             byte[] bArr2 = this.I00iOIl;
/* 13 */            int iMin = Math.min(bArr2.length, bArr.length);
/* 17 */            for (int i = 0; i < iMin; i++) {
/* 27 */                int iI0000oI00 = O0000Ioio00.I0000oI00(bArr2[i] & 255, bArr[i] & 255);
/* 31 */                if (iI0000oI00 != 0) {
/* 33 */                    return iI0000oI00;
                        }
                    }
/* 39 */            return O0000Ioio00.I0000oI00(bArr2.length, bArr.length);
                }

                public final boolean equals(Object obj) {
                    int i;
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || IIOIIi10OOl.class != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 17 */            IIOIIi10OOl iIOIIi10OOl = (IIOIIi10OOl) obj;
/* 19 */            byte[] bArr = iIOIIi10OOl.I00iOIl;
/* 21 */            int length = bArr.length;
/* 22 */            byte[] bArr2 = this.I00iOIl;
/* 25 */            if (length != bArr2.length) {
/* 5 */                 return false;
                    }
/* 28 */            int i2 = iIOIIi10OOl.I00iiI;
/* 30 */            if (i2 == 0 || (i = this.I00iiI) == 0 || i2 == i) {
/* 39 */                return Arrays.equals(bArr2, bArr);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.I00iiI;
/* 3 */             if (i != 0) {
/* 29 */                return i;
                    }
/* 7 */             int iHashCode = Arrays.hashCode(this.I00iOIl);
/* 11 */            this.I00iiI = iHashCode;
/* 29 */            return iHashCode;
                }

                public final String toString() {
/* 1 */             byte[] bArr = this.I00iOIl;
/* 4 */             if (bArr.length == 0) {
/* 6 */                 return "ByteString(size=0)";
                    }
/* 10 */            String strValueOf = String.valueOf(bArr.length);
/* 26 */            StringBuilder sb = new StringBuilder((bArr.length * 2) + strValueOf.length() + 22);
/* 31 */            sb.append("ByteString(size=");
/* 34 */            sb.append(strValueOf);
/* 39 */            sb.append(" hex=");
/* 44 */            for (byte b : bArr) {
/* 52 */                char[] cArr = I00iio;
/* 56 */                sb.append(cArr[(b >>> 4) & 15]);
/* 63 */                sb.append(cArr[b & 15]);
                    }
/* 71 */            sb.append(')');
/* 74 */            return sb.toString();
                }

/* 8 */         public IIOIIi10OOl(int i, byte[] bArr) {
/* 9 */             this(bArr, 0, bArr.length);
                }

/* 9 */         public IIOIIi10OOl(byte[] bArr) {
/* 11 */            this.I00iOIl = bArr;
                }
            }
