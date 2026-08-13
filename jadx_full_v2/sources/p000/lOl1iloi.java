            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class lOl1iloi extends lOI1lll1l10 {
                public final lOlIO0oi I00iiO;

                public lOl1iloi(lOlIO0oi lolio0oi) {
/* 1 */             this.I00iiO = lolio0oi;
                }

                @Override
                public final boolean I000OOo1O() {
/* 1 */             return true;
                }

                @Override
                public final Object get(int i) {
/* 1 */             lOlIO0oi lolio0oi = this.I00iiO;
/* 5 */             ll0OlOllOl.I0000Il00O(i, lolio0oi.I00ilI0I1);
/* 8 */             Object[] objArr = lolio0oi.I00iio;
/* 10 */            int i2 = i + i;
/* 11 */            Object obj = objArr[i2];
/* 13 */            Objects.requireNonNull(obj);
/* 18 */            Object obj2 = objArr[i2 + 1];
/* 20 */            Objects.requireNonNull(obj2);
/* 25 */            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iiO.I00ilI0I1;
                }
            }
