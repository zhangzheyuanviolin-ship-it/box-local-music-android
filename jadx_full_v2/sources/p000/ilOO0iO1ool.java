            package p000;

            import java.io.File;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class ilOO0iO1ool {
                public static final int I00000oIO(String str) {
                    int iI001i1O0Ol;
/* 1 */             char c = File.separatorChar;
/* 5 */             int iI001i1O0Ol2 = OlOoOIi0o.I001i1O0Ol(str, c, 0, 4);
/* 10 */            if (iI001i1O0Ol2 == 0) {
/* 16 */                if (str.length() <= 1 || str.charAt(1) != c || (iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str, c, 2, 4)) < 0) {
/* 9 */                     return 1;
                        }
/* 32 */                int iI001i1O0Ol3 = OlOoOIi0o.I001i1O0Ol(str, c, iI001i1O0Ol + 1, 4);
                        return iI001i1O0Ol3 >= 0 ? iI001i1O0Ol3 + 1 : str.length();
                    }
/* 48 */            if (iI001i1O0Ol2 > 0 && str.charAt(iI001i1O0Ol2 - 1) == ':') {
/* 58 */                return iI001i1O0Ol2 + 1;
                    }
/* 61 */            if (iI001i1O0Ol2 == -1 && OlOoOIi0o.I0010I0i(str, ':')) {
/* 69 */                return str.length();
                    }
/* 3 */             return 0;
                }

                public static final IlIOooi00lO I00000oOI(File file) {
                    List list;
/* 1 */             String path = file.getPath();
/* 5 */             int iI00000oIO = I00000oIO(path);
/* 10 */            String strSubstring = path.substring(0, iI00000oIO);
/* 14 */            String strSubstring2 = path.substring(iI00000oIO);
/* 22 */            if (strSubstring2.length() == 0) {
/* 24 */                list = Il01100l.I00iOIl;
                    } else {
/* 34 */                List listI00Io1o110i = OlOoOIi0o.I00Io1o110i(strSubstring2, new char[]{File.separatorChar});
/* 48 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00Io1o110i, 10));
/* 51 */                Iterator it = listI00Io1o110i.iterator();
/* 59 */                while (it.hasNext()) {
/* 72 */                    arrayList.add(new File((String) it.next()));
                        }
/* 76 */                list = arrayList;
                    }
/* 84 */            return new IlIOooi00lO(new File(strSubstring), list);
                }
            }
