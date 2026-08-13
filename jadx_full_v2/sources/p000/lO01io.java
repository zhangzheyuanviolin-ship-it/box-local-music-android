            package p000;

            import java.util.ArrayList;
            
            public abstract class lO01io {
                public static final int I00000oIO(OiIIl0O1l0l oiIIl0O1l0l, String str) {
/* 1 */             int iI00000oIO = lO01oI1Io1.I00000oIO(oiIIl0O1l0l, str);
/* 5 */             if (iI00000oIO >= 0) {
/* 7 */                 return iI00000oIO;
                    }
/* 8 */             int columnCount = oiIIl0O1l0l.getColumnCount();
/* 14 */            ArrayList arrayList = new ArrayList(columnCount);
/* 19 */            for (int i = 0; i < columnCount; i++) {
/* 25 */                arrayList.add(oiIIl0O1l0l.getColumnName(i));
                    }
/* 47 */            IioIoO10iOiI.I000iOII("Column '", str, "' does not exist. Available columns: [", IOOi0Ool1i.I00IlilI0i0i(arrayList, null, null, null, null, 63), 93);
/* 17 */            return 0;
                }
            }
