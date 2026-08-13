            package p000;
            
            public abstract class lO01oI1Io1 {
                public static final int I00000oIO(OiIIl0O1l0l oiIIl0O1l0l, String str) {
/* 1 */             int columnCount = oiIIl0O1l0l.getColumnCount();
/* 5 */             int i = 0;
/* 6 */             int i2 = 0;
                    while (true) {
/* 8 */                 if (i2 >= columnCount) {
/* 24 */                    i2 = -1;
                            break;
                        }
/* 18 */                if (str.equals(oiIIl0O1l0l.getColumnName(i2))) {
                            break;
                        }
/* 21 */                i2++;
                    }
/* 25 */            if (i2 >= 0) {
/* 27 */                return i2;
                    }
/* 32 */            String strI000iOII = IIl001iO0Io.I000iOII('`', "`", str);
/* 36 */            int columnCount2 = oiIIl0O1l0l.getColumnCount();
                    while (true) {
/* 40 */                if (i >= columnCount2) {
/* 56 */                    i = -1;
                            break;
                        }
/* 50 */                if (strI000iOII.equals(oiIIl0O1l0l.getColumnName(i))) {
                            break;
                        }
/* 53 */                i++;
                    }
/* 57 */            if (i >= 0) {
/* 59 */                return i;
                    }
/* 7 */             return -1;
                }
            }
