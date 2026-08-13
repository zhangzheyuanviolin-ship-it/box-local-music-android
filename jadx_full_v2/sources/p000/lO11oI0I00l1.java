            package p000;
            
            public abstract class lO11oI0I00l1 {
                public static final int I00000oIO(Oii1O1l oii1O1l, byte b, int i, int i2) {
/* 2 */             if (i < 0 || i >= oii1O1l.I00000oIO()) {
/* 48 */                I000II.I0010I0i(String.valueOf(i));
/* 1 */                 return 0;
                    }
/* 10 */            if (i > i2 || i2 > oii1O1l.I00000oIO()) {
/* 40 */                I000II.I0010I0i(String.valueOf(i2));
/* 1 */                 return 0;
                    }
/* 18 */            int i3 = oii1O1l.I00000oOI;
/* 20 */            byte[] bArr = oii1O1l.I00000oIO;
/* 22 */            while (i < i2) {
/* 28 */                if (bArr[i3 + i] == b) {
/* 30 */                    return i;
                        }
/* 31 */                i++;
                    }
/* 34 */            return -1;
                }
            }
