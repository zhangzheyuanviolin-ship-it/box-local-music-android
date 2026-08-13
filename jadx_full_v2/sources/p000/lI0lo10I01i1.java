            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class lI0lo10I01i1 {
                public static ArrayList I00000oIO(List list) {
/* 5 */             ArrayList arrayList = new ArrayList();
/* 16 */            for (Object obj : list) {
/* 27 */                if (((OOiIO0oi) obj) != OOiIO0oi.HTTP_1_0) {
/* 29 */                    arrayList.add(obj);
                        }
                    }
/* 41 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 44 */            Iterator it = arrayList.iterator();
/* 52 */            while (it.hasNext()) {
/* 62 */                arrayList2.add(((OOiIO0oi) it.next()).I00iOIl);
                    }
/* 186 */           return arrayList2;
                }

                public static byte[] I00000oOI(List list) {
/* 3 */             III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 10 */            Iterator it = I00000oIO(list).iterator();
/* 18 */            while (it.hasNext()) {
/* 24 */                String str = (String) it.next();
/* 30 */                iII1o0lOio0.I00lll10(str.length());
/* 33 */                iII1o0lOio0.I00oo1iO0ll(str);
                    }
/* 39 */            return iII1o0lOio0.I001l0I00(iII1o0lOio0.I00iiI);
                }

                public static boolean I0000Il00O() {
/* 9 */             return "Dalvik".equals(System.getProperty("java.vm.name"));
                }
            }
