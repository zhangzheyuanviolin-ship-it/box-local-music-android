            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            
            public final class IIOo0liIi {
                public int I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public String I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public ArrayList I000II;
                public HashMap I000O01llI0;
                public HashMap I000OOo1O;
                public HashMap I000OiO;
                public ArrayList I000iOII;
                public int I000l1;

                public static int I0000Il00O(int i, byte[] bArr) {
/* 2 */             int i2 = 0;
/* 3 */             for (int i3 = 0; i3 < i; i3++) {
/* 11 */                i2 = (i2 << 8) | (bArr[i3] & 255);
                    }
/* 89 */            return i2;
                }

                public final void I00000oIO(String str, byte[] bArr) {
/* 7 */             this.I000OOo1O.put(str, bArr.clone());
/* 12 */            int i = 0;
/* 13 */            for (byte b : bArr) {
/* 23 */                i = (i << 8) | ((b + 256) % Barcode.FORMAT_QR_CODE);
                    }
/* 33 */            this.I000O01llI0.put(Integer.valueOf(i), str);
/* 42 */            if (" ".equals(str)) {
/* 44 */                this.I000l1 = i;
                    }
                }

                public final int I00000oOI(int i) {
                    int i2;
/* 11 */            Integer num = (Integer) this.I000OiO.get(Integer.valueOf(i));
/* 13 */            if (num != null) {
/* 15 */                return num.intValue();
                    }
/* 22 */            Iterator it = this.I000iOII.iterator();
/* 30 */            while (it.hasNext()) {
/* 36 */                IIOlIlOl iIOlIlOl = (IIOlIlOl) it.next();
/* 38 */                char c = (char) i;
/* 39 */                char c2 = iIOlIlOl.I00000oIO;
/* 42 */                if (c2 > c || c > iIOlIlOl.I00000oOI) {
/* 53 */                    i2 = -1;
                        } else {
/* 51 */                    i2 = (c - c2) + iIOlIlOl.I0000Il00O;
                        }
/* 54 */                if (i2 != -1) {
/* 56 */                    return i2;
                        }
                    }
/* 57 */            return 0;
                }

                public final String toString() {
/* 1 */             return this.I00000oOI;
                }
            }
