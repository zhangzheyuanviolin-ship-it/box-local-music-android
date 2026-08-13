            package p000;
            
            public abstract class iOiOoIiiI {
                public static IIOIIi1ilIO I00000oIO(String str) {
/* 7 */             if (str.length() % 2 != 0) {
/* 61 */                I000II.I0010I0i("Unexpected hex string: ".concat(str));
/* 64 */                return null;
                    }
/* 13 */            int length = str.length() / 2;
/* 15 */            byte[] bArr = new byte[length];
/* 18 */            for (int i = 0; i < length; i++) {
/* 20 */                int i2 = i * 2;
/* 44 */                bArr[i] = (byte) (iO1o0OlO01I.I00000oIO(str.charAt(i2 + 1)) + (iO1o0OlO01I.I00000oIO(str.charAt(i2)) << 4));
                    }
/* 51 */            return new IIOIIi1ilIO(bArr);
                }

                public static IIOIIi1ilIO I00000oOI(String str) {
/* 9 */             IIOIIi1ilIO iIOIIi1ilIO = new IIOIIi1ilIO(str.getBytes(IO1IOI.I00000oIO));
/* 12 */            iIOIIi1ilIO.I00iiO = str;
/* 49 */            return iIOIIi1ilIO;
                }
            }
