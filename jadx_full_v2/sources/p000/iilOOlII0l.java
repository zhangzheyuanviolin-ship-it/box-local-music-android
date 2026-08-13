            package p000;

            import java.util.AbstractMap;
            
            public final class iilOOlII0l extends iiIIoOI {
                public final iiliIl0lo I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iilOOlII0l(iiliIl0lo iiliil0lo) {
/* 4 */             super(1);
/* 1 */             this.I00ilO0 = iiliil0lo;
                }

                @Override
                public final Object get(int i) {
/* 2 */             liOOlolooi.I00000oIO(i, 1);
/* 5 */             int i2 = i + i;
/* 10 */            Object[] objArr = (Object[]) this.I00ilO0.I00ioIO;
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
