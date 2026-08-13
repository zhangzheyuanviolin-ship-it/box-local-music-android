            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            
            public class iIlIIIl11I1I implements iO0iIIoO11, iIii1l00O1 {
                public final HashMap I00iOIl = new HashMap();

                @Override
                public iO0iIIoO11 I00000oOI(String str, OillOo0 oillOo0, ArrayList arrayList) {
                    return "toString".equals(str) ? new iOO00I0O(toString()) : iIii1l00O1.I0001Ioi1lo(this, new iOO00I0O(str), oillOo0, arrayList);
                }

                @Override
                public final iO0iIIoO11 I0000O(String str) {
/* 1 */             HashMap map = this.I00iOIl;
                    return map.containsKey(str) ? (iO0iIIoO11) map.get(str) : iO0iIIoO11.I00Ol1ll1;
                }

                @Override
                public final void I0000oI00(String str, iO0iIIoO11 io0iiioo11) {
/* 1 */             HashMap map = this.I00iOIl;
/* 3 */             if (io0iiioo11 == null) {
/* 5 */                 map.remove(str);
                    } else {
/* 9 */                 map.put(str, io0iiioo11);
                    }
                }

                @Override
                public final boolean I000OOo1O(String str) {
/* 3 */             return this.I00iOIl.containsKey(str);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof iIlIIIl11I1I) {
/* 17 */                return this.I00iOIl.equals(((iIlIIIl11I1I) obj).I00iOIl);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("{");
/* 8 */             HashMap map = this.I00iOIl;
/* 14 */            if (!map.isEmpty()) {
/* 28 */                for (String str : map.keySet()) {
/* 50 */                    sb.append(String.format("%s: %s,", str, map.get(str)));
                        }
/* 60 */                sb.deleteCharAt(sb.lastIndexOf(","));
                    }
/* 65 */            sb.append("}");
/* 68 */            return sb.toString();
                }

                @Override
                public final String zzc() {
/* 1 */             return "[object Object]";
                }

                @Override
                public final Double zzd() {
/* 3 */             return Double.valueOf(Double.NaN);
                }

                @Override
                public final Boolean zze() {
/* 1 */             return Boolean.TRUE;
                }

                @Override
                public final Iterator zzf() {
/* 7 */             Iterator it = this.I00iOIl.keySet().iterator();
/* 13 */            iIOoIio1OoOo iiooiio1oooo = new iIOoIio1OoOo();
/* 16 */            iiooiio1oooo.I00iOIl = it;
/* 18 */            VarHandle.storeStoreFence();
/* 55 */            return iiooiio1oooo;
                }

                @Override
                public final iO0iIIoO11 zzt() {
/* 3 */             iIlIIIl11I1I iiliiil11i1i = new iIlIIIl11I1I();
/* 20 */            for (Map.Entry entry : this.I00iOIl.entrySet()) {
/* 32 */                boolean z = entry.getValue() instanceof iIii1l00O1;
/* 34 */                HashMap map = iiliiil11i1i.I00iOIl;
/* 36 */                if (z) {
/* 50 */                    map.put((String) entry.getKey(), (iO0iIIoO11) entry.getValue());
                        } else {
/* 70 */                    map.put((String) entry.getKey(), ((iO0iIIoO11) entry.getValue()).zzt());
                        }
                    }
/* 110 */           return iiliiil11i1i;
                }
            }
