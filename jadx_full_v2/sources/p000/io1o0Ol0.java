            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class io1o0Ol0 extends io10ooI0OiIl {
                public final transient OOoli1l I00iiO;
                public final transient Object[] I00iio;
                public final transient int I00ilI0I1;

                public io1o0Ol0(OOoli1l oOoli1l, Object[] objArr, int i) {
/* 4 */             this.I00iiO = oOoli1l;
/* 6 */             this.I00iio = objArr;
/* 8 */             this.I00ilI0I1 = i;
                }

                @Override
                public final int I00000oOI(Object[] objArr) {
/* 5 */             return I0001Ioi1lo().I00000oOI(objArr);
                }

                @Override
                public final io0OIIlOli1 I000iOII() {
/* 3 */             return new io1iiIlo(this);
                }

                @Override
                public final boolean contains(Object obj) {
/* 4 */             if (obj instanceof Map.Entry) {
/* 6 */                 Map.Entry entry = (Map.Entry) obj;
/* 8 */                 Object key = entry.getKey();
/* 12 */                Object value = entry.getValue();
/* 16 */                if (value != null && value.equals(this.I00iiO.get(key))) {
/* 30 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public final Iterator iterator() {
/* 6 */             return I0001Ioi1lo().listIterator(0);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00ilI0I1;
                }
            }
