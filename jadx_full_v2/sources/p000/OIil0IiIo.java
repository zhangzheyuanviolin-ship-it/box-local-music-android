            package p000;

            import java.util.RandomAccess;
            
            public final class OIil0IiIo extends I01IO0oio implements RandomAccess {
                public final IIOIIi1ilIO[] I00iOIl;
                public final int[] I00iiI;

                public OIil0IiIo(IIOIIi1ilIO[] iIOIIi1ilIOArr, int[] iArr) {
/* 4 */             this.I00iOIl = iIOIIi1ilIOArr;
/* 6 */             this.I00iiI = iArr;
                }

                @Override
                public final int I00000oOI() {
/* 3 */             return this.I00iOIl.length;
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             if (obj instanceof IIOIIi1ilIO) {
/* 9 */                 return super.contains((IIOIIi1ilIO) obj);
                    }
/* 5 */             return false;
                }

                @Override
                public final Object get(int i) {
/* 3 */             return this.I00iOIl[i];
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             if (obj instanceof IIOIIi1ilIO) {
/* 9 */                 return super.indexOf((IIOIIi1ilIO) obj);
                    }
/* 5 */             return -1;
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 3 */             if (obj instanceof IIOIIi1ilIO) {
/* 9 */                 return super.lastIndexOf((IIOIIi1ilIO) obj);
                    }
/* 5 */             return -1;
                }
            }
