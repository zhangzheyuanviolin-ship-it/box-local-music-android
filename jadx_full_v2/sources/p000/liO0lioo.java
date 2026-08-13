            package p000;
            
            public abstract class liO0lioo {
                public static int I00000oIO(int i, byte[] bArr) {
/* 13 */            return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
                }

                public static int I00000oOI(int i, byte[] bArr) {
/* 31 */            return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
                }

                public static long I0000Il00O(int i, byte[] bArr) {
/* 20 */            return (I00000oIO(i, bArr) | (I00000oIO(i + 2, bArr) << 16)) & 4294967295L;
                }
            }
