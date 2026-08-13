            package p000;

            import java.util.Map;
            
            public final class OOol10IO0O1 extends Ioio0O {
                public final transient OOoli1l I00iio;
                public final transient Object[] I00ilI0I1;
                public final transient int I00ilO0;

                public OOol10IO0O1(OOoli1l oOoli1l, Object[] objArr, int i) {
/* 4 */             this.I00iio = oOoli1l;
/* 6 */             this.I00ilI0I1 = objArr;
/* 8 */             this.I00ilO0 = i;
                }

                @Override
                public final int I0000O(Object[] objArr) {
/* 5 */             return I00000oOI().I0000O(objArr);
                }

                @Override
                public final boolean I000OiO() {
/* 1 */             return true;
                }

                @Override
                public final OoiOOoOlo iterator() {
/* 6 */             return I00000oOI().listIterator(0);
                }

                @Override
                public final IoillO0OOoo I000oI1ioi() {
/* 3 */             return new OOol0lIiI(this);
                }

                @Override
                public final boolean contains(Object obj) {
/* 4 */             if (obj instanceof Map.Entry) {
/* 6 */                 Map.Entry entry = (Map.Entry) obj;
/* 8 */                 Object key = entry.getKey();
/* 12 */                Object value = entry.getValue();
/* 16 */                if (value != null && value.equals(this.I00iio.get(key))) {
/* 30 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00ilO0;
                }
            }
