            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class ilo011li0I extends iloOil0O1 {
                public static final Class I0000Il00O = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

                public static List I0000O(Object obj, int i, long j) {
/* 5 */             List list = (List) l00iIli.I000II(obj, j);
/* 11 */            if (list.isEmpty()) {
/* 40 */                List illii0oi = list instanceof illlOI ? new illiI0OI(i) : ((list instanceof ioIIo0I101o) && (list instanceof iliiiioo)) ? ((iliiiioo) list).zzd(i) : new ArrayList(i);
/* 43 */                l00iIli.I000OiO(obj, j, illii0oi);
/* 46 */                return illii0oi;
                    }
/* 57 */            if (I0000Il00O.isAssignableFrom(list.getClass())) {
/* 66 */                ArrayList arrayList = new ArrayList(list.size() + i);
/* 69 */                arrayList.addAll(list);
/* 72 */                l00iIli.I000OiO(obj, j, arrayList);
/* 75 */                return arrayList;
                    }
/* 78 */            if (list instanceof iooo000ioI) {
/* 82 */                iooo000ioI iooo000ioi = (iooo000ioI) list;
/* 89 */                illiI0OI illii0oi2 = new illiI0OI(iooo000ioi.size() + i);
/* 98 */                illii0oi2.addAll(illii0oi2.I00iiI.size(), iooo000ioi);
/* 101 */               l00iIli.I000OiO(obj, j, illii0oi2);
/* 104 */               return illii0oi2;
                    }
/* 107 */           if ((list instanceof ioIIo0I101o) && (list instanceof iliiiioo)) {
/* 114 */               iliiiioo iliiiiooVar = (iliiiioo) list;
/* 121 */               if (!((iilOi0ioo1) iliiiiooVar).I00iOIl) {
/* 129 */                   iliiiioo iliiiiooVarZzd = iliiiiooVar.zzd(list.size() + i);
/* 133 */                   l00iIli.I000OiO(obj, j, iliiiiooVarZzd);
/* 136 */                   return iliiiiooVarZzd;
                        }
                    }
/* 408 */           return list;
                }

                @Override
                public final List I00000oIO(Object obj, long j) {
/* 3 */             return I0000O(obj, 10, j);
                }

                @Override
                public final void I00000oOI(long j, Object obj) {
                    Object objUnmodifiableList;
/* 5 */             List list = (List) l00iIli.I000II(obj, j);
/* 9 */             if (list instanceof illlOI) {
/* 13 */                objUnmodifiableList = ((illlOI) list).zze();
                    } else {
/* 28 */                if (I0000Il00O.isAssignableFrom(list.getClass())) {
/* 52 */                    return;
                        }
/* 33 */                if ((list instanceof ioIIo0I101o) && (list instanceof iliiiioo)) {
/* 41 */                    iilOi0ioo1 iiloi0ioo1 = (iilOi0ioo1) ((iliiiioo) list);
/* 43 */                    boolean z = iiloi0ioo1.I00iOIl;
/* 45 */                    if (z && z) {
/* 50 */                        iiloi0ioo1.I00iOIl = false;
/* 52 */                        return;
                            }
/* 52 */                    return;
                        }
/* 53 */                objUnmodifiableList = Collections.unmodifiableList(list);
                    }
/* 57 */            l00iIli.I000OiO(obj, j, objUnmodifiableList);
                }

                @Override
                public final void I0000Il00O(Object obj, long j, Object obj2) {
/* 5 */             List list = (List) l00iIli.I000II(obj2, j);
/* 11 */            List listI0000O = I0000O(obj, list.size(), j);
/* 15 */            int size = listI0000O.size();
/* 19 */            int size2 = list.size();
/* 23 */            if (size > 0 && size2 > 0) {
/* 27 */                listI0000O.addAll(list);
                    }
/* 30 */            if (size > 0) {
/* 32 */                list = listI0000O;
                    }
/* 33 */            l00iIli.I000OiO(obj, j, list);
                }
            }
