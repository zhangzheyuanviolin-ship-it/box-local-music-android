            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class OOil0lI {
                public final ArrayList I00000oIO;

                public OOil0lI(ArrayList arrayList) {
/* 9 */             this.I00000oIO = new ArrayList(arrayList);
                }

                public static void I0000O(OOil0lI oOil0lI) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             Iterator it = oOil0lI.I00000oIO.iterator();
/* 16 */            while (it.hasNext()) {
/* 32 */                arrayList.add(((OOiio1i) it.next()).getClass().getSimpleName());
                    }
/* 38 */            String.join(" | ", arrayList);
                }

                public final boolean I00000oIO(Class cls) {
/* 3 */             Iterator it = this.I00000oIO.iterator();
/* 11 */            while (it.hasNext()) {
/* 27 */                if (cls.isAssignableFrom(((OOiio1i) it.next()).getClass())) {
/* 29 */                    return true;
                        }
                    }
/* 31 */            return false;
                }

                public final OOiio1i I00000oOI(Class cls) {
/* 3 */             Iterator it = this.I00000oIO.iterator();
/* 11 */            while (it.hasNext()) {
/* 17 */                OOiio1i oOiio1i = (OOiio1i) it.next();
/* 23 */                if (oOiio1i.getClass() == cls) {
/* 25 */                    return oOiio1i;
                        }
                    }
/* 26 */            return null;
                }

                public final ArrayList I0000Il00O(Class cls) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             Iterator it = this.I00000oIO.iterator();
/* 16 */            while (it.hasNext()) {
/* 22 */                OOiio1i oOiio1i = (OOiio1i) it.next();
/* 32 */                if (cls.isAssignableFrom(oOiio1i.getClass())) {
/* 34 */                    arrayList.add(oOiio1i);
                        }
                    }
/* 77 */            return arrayList;
                }
            }
