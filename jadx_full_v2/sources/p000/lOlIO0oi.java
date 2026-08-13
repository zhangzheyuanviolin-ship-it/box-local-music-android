            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class lOlIO0oi extends lOO110IoOiI {
                public final transient lOliil I00iiO;
                public final transient Object[] I00iio;
                public final transient int I00ilI0I1;

                public lOlIO0oi(lOliil loliil, Object[] objArr, int i) {
/* 4 */             this.I00iiO = loliil;
/* 6 */             this.I00iio = objArr;
/* 8 */             this.I00ilI0I1 = i;
                }

                @Override
                public final int I000OiO(Object[] objArr) {
/* 5 */             return I0001Ioi1lo().I000OiO(objArr);
                }

                @Override
                public final OoiOOoOlo I000iOII() {
/* 6 */             return I0001Ioi1lo().listIterator(0);
                }

                @Override
                public final lOI1lll1l10 I000o00OoI0I() {
/* 3 */             return new lOl1iloi(this);
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
