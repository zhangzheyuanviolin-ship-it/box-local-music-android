            package p000;
            
            public abstract class l10iI1 {
                public static final void I00000oIO(Object[] objArr, int i, int i2) {
/* 1 */             while (i < i2) {
/* 4 */                 objArr[i] = null;
/* 6 */                 i++;
                    }
                }

                public static final String I00000oOI(Object[] objArr, int i, int i2, I01Io000 i01Io000) {
/* 7 */             StringBuilder sb = new StringBuilder((i2 * 3) + 2);
/* 12 */            sb.append("[");
/* 16 */            for (int i3 = 0; i3 < i2; i3++) {
/* 18 */                if (i3 > 0) {
/* 22 */                    sb.append(", ");
                        }
/* 27 */                Object obj = objArr[i + i3];
/* 29 */                if (obj == i01Io000) {
/* 33 */                    sb.append("(this Collection)");
                        } else {
/* 37 */                    sb.append(obj);
                        }
                    }
/* 45 */            sb.append("]");
/* 48 */            return sb.toString();
                }
            }
