            package p000;

            import java.util.AbstractMap;
            
            public final class iiI100I0I extends iOiloii0i1io {
                public final iiIIO0lOllo1 I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iiI100I0I(iiIIO0lOllo1 iiiio0lollo1) {
/* 4 */             super(0);
/* 1 */             this.I00ilO0 = iiiio0lollo1;
                }

                @Override
                public final Object get(int i) {
/* 2 */             ll011oI.I00000oIO(i, 1);
/* 9 */             Object[] objArr = (Object[]) this.I00ilO0.I00ioIO;
/* 11 */            int i2 = i + i;
/* 12 */            Object obj = objArr[i2];
/* 14 */            obj.getClass();
/* 18 */            Object obj2 = objArr[i2 + 1];
/* 20 */            obj2.getClass();
/* 25 */            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override
                public final int size() {
/* 1 */             return 1;
                }
            }
