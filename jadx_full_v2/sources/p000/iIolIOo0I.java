            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class iIolIOo0I extends iIOoi0 {
                public final transient OOoli1l I00o0iI0io1;
                public final transient Object[] I00o0l1o1o0;
                public final transient int I00o101lO;

                public iIolIOo0I(OOoli1l oOoli1l, Object[] objArr, int i) {
/* 2 */             super(2);
/* 5 */             this.I00o0iI0io1 = oOoli1l;
/* 7 */             this.I00o0l1o1o0 = objArr;
/* 9 */             this.I00o101lO = i;
                }

                @Override
                public final int I000o00OoI0I(Object[] objArr) {
/* 1 */             iI0l1iOio0 iilol1liiiil = this.I00lll10;
/* 3 */             if (iilol1liiiil == null) {
/* 7 */                 iilol1liiiil = new iIlol1lIIIIl(this);
/* 10 */                this.I00lll10 = iilol1liiiil;
                    }
/* 12 */            return iilol1liiiil.I000o00OoI0I(objArr);
                }

                @Override
                public final boolean contains(Object obj) {
/* 4 */             if (obj instanceof Map.Entry) {
/* 6 */                 Map.Entry entry = (Map.Entry) obj;
/* 8 */                 Object key = entry.getKey();
/* 12 */                Object value = entry.getValue();
/* 16 */                if (value != null && value.equals(this.I00o0iI0io1.get(key))) {
/* 30 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public final Iterator iterator() {
/* 1 */             iI0l1iOio0 iilol1liiiil = this.I00lll10;
/* 3 */             if (iilol1liiiil == null) {
/* 7 */                 iilol1liiiil = new iIlol1lIIIIl(this);
/* 10 */                this.I00lll10 = iilol1liiiil;
                    }
/* 13 */            return iilol1liiiil.listIterator(0);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o101lO;
                }
            }
