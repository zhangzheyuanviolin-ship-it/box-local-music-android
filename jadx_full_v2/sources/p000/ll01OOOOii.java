            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public abstract class ll01OOOOii {
                public static iO0iIIoO11 I00000oIO(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return iO0iIIoO11.I00OloOo;
                    }
/* 8 */             if (obj instanceof String) {
/* 14 */                return new iOO00I0O((String) obj);
                    }
/* 20 */            if (obj instanceof Double) {
/* 26 */                return new iII01l((Double) obj);
                    }
/* 32 */            if (obj instanceof Long) {
/* 46 */                return new iII01l(Double.valueOf(((Long) obj).doubleValue()));
                    }
/* 52 */            if (obj instanceof Integer) {
/* 66 */                return new iII01l(Double.valueOf(((Integer) obj).doubleValue()));
                    }
/* 72 */            if (obj instanceof Boolean) {
/* 78 */                return new iI0io0OI1IOo((Boolean) obj);
                    }
/* 84 */            if (!(obj instanceof Map)) {
/* 138 */               if (!(obj instanceof List)) {
/* 176 */                   I000II.I000iOII("Invalid value type");
/* 179 */                   return null;
                        }
/* 142 */               i1ollIol0I0 i1olliol0i0 = new i1ollIol0I0();
/* 147 */               Iterator it = ((List) obj).iterator();
/* 155 */               while (it.hasNext()) {
/* 169 */                   i1olliol0i0.I000oI1ioi(i1olliol0i0.I000lI(), I00000oIO(it.next()));
                        }
/* 173 */               return i1olliol0i0;
                    }
/* 88 */            iIlIIIl11I1I iiliiil11i1i = new iIlIIIl11I1I();
/* 91 */            Map map = (Map) obj;
/* 105 */           for (Object string : map.keySet()) {
/* 115 */               iO0iIIoO11 io0iiioo11I00000oIO = I00000oIO(map.get(string));
/* 119 */               if (string != null) {
/* 123 */                   if (!(string instanceof String)) {
/* 125 */                       string = string.toString();
                            }
/* 131 */                   iiliiil11i1i.I0000oI00((String) string, io0iiioo11I00000oIO);
                        }
                    }
/* 135 */           return iiliiil11i1i;
                }

                public static iO0iIIoO11 I00000oOI(l1OoioI11o1l l1ooioi11o1l) {
/* 1 */             if (l1ooioi11o1l == null) {
/* 3 */                 return iO0iIIoO11.I00Ol1ll1;
                    }
                    int iI001lllioOl = l1ooioi11o1l.I001lllioOl() - 1;
/* 13 */            if (iI001lllioOl == 1) {
                        return l1ooioi11o1l.I001IO000() ? new iOO00I0O(l1ooioi11o1l.I001i1O0Ol()) : iO0iIIoO11.I00iIi0i1o;
                    }
/* 17 */            if (iI001lllioOl == 2) {
                        return l1ooioi11o1l.I001l0I00() ? new iII01l(Double.valueOf(l1ooioi11o1l.I001lIiIIo1O())) : new iII01l(null);
                    }
/* 20 */            if (iI001lllioOl == 3) {
                        return l1ooioi11o1l.I001i1lo1io() ? new iI0io0OI1IOo(Boolean.valueOf(l1ooioi11o1l.I001iOo1i0O())) : new iI0io0OI1IOo(null);
                    }
/* 23 */            if (iI001lllioOl != 4) {
/* 85 */                I000II.I000iOII("Unknown type found. Cannot convert entity");
/* 16 */                return null;
                    }
/* 25 */            List listI00111O = l1ooioi11o1l.I00111O();
/* 31 */            ArrayList arrayList = new ArrayList();
/* 34 */            Iterator it = listI00111O.iterator();
/* 42 */            while (it.hasNext()) {
/* 54 */                arrayList.add(I00000oOI((l1OoioI11o1l) it.next()));
                    }
/* 58 */            String strI001IIilI0O = l1ooioi11o1l.I001IIilI0O();
/* 64 */            iO11IOo0II io11ioo0ii = new iO11IOo0II();
/* 67 */            io11ioo0ii.I00iOIl = strI001IIilI0O;
/* 71 */            ArrayList arrayList2 = new ArrayList();
/* 74 */            io11ioo0ii.I00iiI = arrayList2;
/* 76 */            arrayList2.addAll(arrayList);
/* 79 */            VarHandle.storeStoreFence();
/* 82 */            return io11ioo0ii;
                }
            }
