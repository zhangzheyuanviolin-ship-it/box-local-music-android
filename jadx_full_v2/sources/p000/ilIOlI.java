            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class ilIOlI extends il0II0OO1 {
                public final ilIioOloollI I00iiO;

                public ilIOlI(ilIioOloollI iliiooloolli) {
/* 1 */             this.I00iiO = iliiooloolli;
                }

                @Override
                public final Object get(int i) {
/* 2 */             lil0iIo1Oiil.I00000oIO(i, 1);
/* 9 */             Object[] objArr = (Object[]) this.I00iiO.I00ilI0I1;
/* 11 */            int i2 = i + i;
/* 12 */            Object obj = objArr[i2];
/* 14 */            Objects.requireNonNull(obj);
/* 18 */            Object obj2 = objArr[i2 + 1];
/* 20 */            Objects.requireNonNull(obj2);
/* 25 */            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override
                public final int size() {
/* 1 */             return 1;
                }
            }
