            package p000;

            import java.util.AbstractMap;
            
            public final class o00iiIi00 extends liiOlOO01i {
                public final o0Il1iI0il I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o00iiIi00(o0Il1iI0il o0il1ii0il) {
/* 4 */             super(2);
/* 1 */             this.I00ilO0 = o0il1ii0il;
                }

                @Override
                public final Object get(int i) {
/* 2 */             lioi0i1II.I00000oIO(i, 1);
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
