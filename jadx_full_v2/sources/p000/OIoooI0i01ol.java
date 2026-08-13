            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OIoooI0i01ol {
                public String I00000oIO;
                public Il1OO1ilo0o1 I00000oOI;
                public ArrayList I0000Il00O;
                public ArrayList I0000O;

                public static ArrayList I00000oIO(i01IlOO i01iloo, List list) {
/* 1 */             if (list == null) {
/* 3 */                 return null;
                    }
/* 11 */            ArrayList arrayList = new ArrayList(list.size());
/* 14 */            Iterator it = list.iterator();
/* 22 */            while (it.hasNext()) {
/* 28 */                OIoooI0i01ol oIoooI0i01ol = (OIoooI0i01ol) it.next();
/* 48 */                arrayList.add(new i01I0IOOI10(i01iloo, oIoooI0i01ol.I00000oIO, oIoooI0i01ol.I00000oOI, oIoooI0i01ol.I0000Il00O, I00000oIO(i01iloo, oIoooI0i01ol.I0000O)));
                    }
/* 106 */           return arrayList;
                }
            }
