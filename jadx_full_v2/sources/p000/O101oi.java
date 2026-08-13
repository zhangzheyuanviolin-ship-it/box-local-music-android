            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class O101oi extends O101ol1lilo0 {
                public static final Class I0000Il00O = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

                public static List I0000O(Object obj, int i, long j) {
/* 5 */             List list = (List) Ooil11Oi.I000OiO(j, obj);
/* 11 */            if (list.isEmpty()) {
/* 40 */                List o0o1O1lill1 = list instanceof O0o1ioOoo00 ? new O0o1O1lill1(i) : ((list instanceof OOIOooII) && (list instanceof Iool0o0iOI)) ? ((Iool0o0iOI) list).I000O01llI0(i) : new ArrayList(i);
/* 43 */                Ooil11Oi.I00100o1O0lo(obj, j, o0o1O1lill1);
/* 46 */                return o0o1O1lill1;
                    }
/* 57 */            if (I0000Il00O.isAssignableFrom(list.getClass())) {
/* 66 */                ArrayList arrayList = new ArrayList(list.size() + i);
/* 69 */                arrayList.addAll(list);
/* 72 */                Ooil11Oi.I00100o1O0lo(obj, j, arrayList);
/* 75 */                return arrayList;
                    }
/* 78 */            if (list instanceof OoiOo01) {
/* 82 */                OoiOo01 ooiOo01 = (OoiOo01) list;
/* 91 */                O0o1O1lill1 o0o1O1lill12 = new O0o1O1lill1(ooiOo01.I00iOIl.size() + i);
/* 94 */                o0o1O1lill12.addAll(ooiOo01);
/* 97 */                Ooil11Oi.I00100o1O0lo(obj, j, o0o1O1lill12);
/* 100 */               return o0o1O1lill12;
                    }
/* 103 */           if ((list instanceof OOIOooII) && (list instanceof Iool0o0iOI)) {
/* 110 */               Iool0o0iOI iool0o0iOI = (Iool0o0iOI) list;
/* 117 */               if (!((I01Iol) iool0o0iOI).I00iOIl) {
/* 124 */                   Iool0o0iOI iool0o0iOII000O01llI0 = iool0o0iOI.I000O01llI0(list.size() + i);
/* 128 */                   Ooil11Oi.I00100o1O0lo(obj, j, iool0o0iOII000O01llI0);
/* 131 */                   return iool0o0iOII000O01llI0;
                        }
                    }
/* 215 */           return list;
                }

                @Override
                public final void I00000oIO(long j, Object obj) {
                    Object objUnmodifiableList;
/* 5 */             List list = (List) Ooil11Oi.I000OiO(j, obj);
/* 9 */             if (list instanceof O0o1ioOoo00) {
/* 13 */                objUnmodifiableList = ((O0o1ioOoo00) list).I00100l0();
                    } else {
/* 28 */                if (I0000Il00O.isAssignableFrom(list.getClass())) {
/* 50 */                    return;
                        }
/* 33 */                if ((list instanceof OOIOooII) && (list instanceof Iool0o0iOI)) {
/* 41 */                    I01Iol i01Iol = (I01Iol) ((Iool0o0iOI) list);
/* 45 */                    if (i01Iol.I00iOIl) {
/* 48 */                        i01Iol.I00iOIl = false;
/* 50 */                        return;
                            }
/* 50 */                    return;
                        }
/* 51 */                objUnmodifiableList = Collections.unmodifiableList(list);
                    }
/* 55 */            Ooil11Oi.I00100o1O0lo(obj, j, objUnmodifiableList);
                }

                @Override
                public final void I00000oOI(Object obj, long j, Object obj2) {
/* 5 */             List list = (List) Ooil11Oi.I000OiO(j, obj2);
/* 11 */            List listI0000O = I0000O(obj, list.size(), j);
/* 15 */            int size = listI0000O.size();
/* 19 */            int size2 = list.size();
/* 23 */            if (size > 0 && size2 > 0) {
/* 27 */                listI0000O.addAll(list);
                    }
/* 30 */            if (size > 0) {
/* 32 */                list = listI0000O;
                    }
/* 33 */            Ooil11Oi.I00100o1O0lo(obj, j, list);
                }

                @Override
                public final List I0000Il00O(long j, Object obj) {
/* 3 */             return I0000O(obj, 10, j);
                }
            }
