            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.regex.Matcher;
            
            public abstract class OillOO10 {
                public static final OOoiliiIoloI I00000oIO = new OOoiliiIoloI("\r\n|\r|\n");

                public static final void I00000oIO(Object obj, String str, StringBuilder sb) {
                    List listSingletonList;
/* 1 */             if (obj != null) {
/* 3 */                 String string = obj.toString();
/* 7 */                 OOoiliiIoloI oOoiliiIoloI = I00000oIO;
/* 9 */                 oOoiliiIoloI.getClass();
/* 12 */                int iEnd = 0;
/* 13 */                OlOoOIi0o.I00IlilI0i0i(0);
/* 18 */                Matcher matcher = oOoiliiIoloI.I00iOIl.matcher(string);
/* 26 */                if (matcher.find()) {
/* 41 */                    ArrayList arrayList = new ArrayList(10);
/* 67 */                    do {
/* 56 */                        arrayList.add(string.subSequence(iEnd, matcher.start()).toString());
/* 59 */                        iEnd = matcher.end();
/* 67 */                    } while (matcher.find());
/* 81 */                    arrayList.add(string.subSequence(iEnd, string.length()).toString());
/* 84 */                    listSingletonList = arrayList;
                        } else {
/* 32 */                    listSingletonList = Collections.singletonList(string.toString());
                        }
/* 87 */                Iterator it = listSingletonList.iterator();
/* 95 */                while (it.hasNext()) {
/* 125 */                   sb.append(str + ": " + ((String) it.next()) + "\r\n");
                        }
                    }
                }
            }
