            package p000;

            import java.util.AbstractCollection;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class iiIiiol0 {
                public static final void I00000oIO(AbstractCollection abstractCollection, Object obj) {
/* 1 */             if (obj != null) {
/* 3 */                 abstractCollection.add(obj);
                    }
                }

                public static final List I00000oOI(ArrayList arrayList) {
/* 1 */             int size = arrayList.size();
/* 5 */             if (size == 0) {
/* 23 */                return Il01100l.I00iOIl;
                    }
/* 8 */             if (size == 1) {
/* 18 */                return Collections.singletonList(IOOi0Ool1i.I001lllioOl(arrayList));
                    }
/* 10 */            arrayList.trimToSize();
/* 13 */            return arrayList;
                }
            }
