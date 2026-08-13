            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            
/* 18 */    public abstract class iIIoIiOoOoiO implements iO0iIIoO11, iIii1l00O1 {
                public final String I00iOIl;
                public final HashMap I00iiI = new HashMap();

                public iIIoIiOoOoiO(String str) {
/* 11 */            this.I00iOIl = str;
                }

                public abstract iO0iIIoO11 I00000oIO(OillOo0 oillOo0, List list);

                @Override
                public final iO0iIIoO11 I00000oOI(String str, OillOo0 oillOo0, ArrayList arrayList) {
                    return "toString".equals(str) ? new iOO00I0O(this.I00iOIl) : iIii1l00O1.I0001Ioi1lo(this, new iOO00I0O(str), oillOo0, arrayList);
                }

                @Override
                public final iO0iIIoO11 I0000O(String str) {
/* 1 */             HashMap map = this.I00iiI;
                    return map.containsKey(str) ? (iO0iIIoO11) map.get(str) : iO0iIIoO11.I00Ol1ll1;
                }

                @Override
                public final void I0000oI00(String str, iO0iIIoO11 io0iiioo11) {
/* 1 */             HashMap map = this.I00iiI;
/* 3 */             if (io0iiioo11 == null) {
/* 5 */                 map.remove(str);
                    } else {
/* 9 */                 map.put(str, io0iiioo11);
                    }
                }

                @Override
                public final boolean I000OOo1O(String str) {
/* 3 */             return this.I00iiI.containsKey(str);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 8 */             if (!(obj instanceof iIIoIiOoOoiO)) {
/* 7 */                 return false;
                    }
/* 11 */            iIIoIiOoOoiO iiioiiooooio = (iIIoIiOoOoiO) obj;
/* 13 */            String str = this.I00iOIl;
/* 15 */            if (str != null) {
/* 19 */                return str.equals(iiioiiooooio.I00iOIl);
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             String str = this.I00iOIl;
/* 3 */             if (str != null) {
/* 5 */                 return str.hashCode();
                    }
/* 10 */            return 0;
                }

                @Override
                public final String zzc() {
/* 1 */             return this.I00iOIl;
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
/* 7 */             Iterator it = this.I00iiI.keySet().iterator();
/* 13 */            iIOoIio1OoOo iiooiio1oooo = new iIOoIio1OoOo();
/* 16 */            iiooiio1oooo.I00iOIl = it;
/* 18 */            VarHandle.storeStoreFence();
/* 55 */            return iiooiio1oooo;
                }

                @Override
/* 19 */        public iO0iIIoO11 zzt() {
/* 20 */            return this;
                }
            }
