            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class ioolil0I extends ioOoI0l00I {
                public final transient OOoli1l I00o0iI0io1;
                public final transient Object[] I00o0l1o1o0;
                public final transient int I00o101lO;

                public ioolil0I(OOoli1l oOoli1l, Object[] objArr, int i) {
/* 3 */             super(10);
/* 6 */             this.I00o0iI0io1 = oOoli1l;
/* 8 */             this.I00o0l1o1o0 = objArr;
/* 10 */            this.I00o101lO = i;
                }

                @Override
                public final int I000o00OoI0I(Object[] objArr) {
/* 1 */             ioIl00 ioil00I001lIiIIo1O = this.I00lll10;
/* 3 */             if (ioil00I001lIiIIo1O == null) {
/* 5 */                 ioil00I001lIiIIo1O = I001lIiIIo1O();
/* 9 */                 this.I00lll10 = ioil00I001lIiIIo1O;
                    }
/* 11 */            return ioil00I001lIiIIo1O.I000o00OoI0I(objArr);
                }

                public final ioIl00 I001lIiIIo1O() {
/* 3 */             return new iooiOoiI0iI(this);
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
/* 1 */             ioIl00 ioil00I001lIiIIo1O = this.I00lll10;
/* 3 */             if (ioil00I001lIiIIo1O == null) {
/* 5 */                 ioil00I001lIiIIo1O = I001lIiIIo1O();
/* 9 */                 this.I00lll10 = ioil00I001lIiIIo1O;
                    }
/* 12 */            return ioil00I001lIiIIo1O.listIterator(0);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o101lO;
                }
            }
