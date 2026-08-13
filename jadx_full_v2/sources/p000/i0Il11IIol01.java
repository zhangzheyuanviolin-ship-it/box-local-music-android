            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class i0Il11IIol01 extends i0Ii1O10ol0 {
                public final transient i0IlI0lloio I00o0iI0io1;
                public final transient Object[] I00o0l1o1o0;
                public final transient int I00o101lO;

                public i0Il11IIol01(i0IlI0lloio i0ili0lloio, Object[] objArr, int i) {
/* 2 */             super(0);
/* 5 */             this.I00o0iI0io1 = i0ili0lloio;
/* 7 */             this.I00o0l1o1o0 = objArr;
/* 9 */             this.I00o101lO = i;
                }

                @Override
                public final int I00000oOI(Object[] objArr) {
/* 1 */             i0IOo0 i0ioo0I001lIiIIo1O = this.I00lll10;
/* 3 */             if (i0ioo0I001lIiIIo1O == null) {
/* 5 */                 i0ioo0I001lIiIIo1O = I001lIiIIo1O();
/* 9 */                 this.I00lll10 = i0ioo0I001lIiIIo1O;
                    }
/* 11 */            return i0ioo0I001lIiIIo1O.I00000oOI(objArr);
                }

                public final i0IOo0 I001lIiIIo1O() {
/* 3 */             return new i0Il0O1llil(this);
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
/* 1 */             i0IOo0 i0ioo0I001lIiIIo1O = this.I00lll10;
/* 3 */             if (i0ioo0I001lIiIIo1O == null) {
/* 5 */                 i0ioo0I001lIiIIo1O = I001lIiIIo1O();
/* 9 */                 this.I00lll10 = i0ioo0I001lIiIIo1O;
                    }
/* 12 */            return i0ioo0I001lIiIIo1O.listIterator(0);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o101lO;
                }
            }
