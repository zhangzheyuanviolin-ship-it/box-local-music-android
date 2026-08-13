            package p000;

            import java.io.Serializable;
            import java.util.AbstractCollection;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Spliterator;
            import java.util.Spliterators;
            
/* 53 */    public abstract class io0I1oIiiili extends AbstractCollection implements Serializable {
                public static final Object[] I00iOIl = new Object[0];

                public abstract int I00000oOI(Object[] objArr);

                public int I0000O() {
/* 20 */            throw new UnsupportedOperationException();
                }

                public int I0000oI00() {
/* 20 */            throw new UnsupportedOperationException();
                }

                public abstract io0o00I1ol1o I0001Ioi1lo();

                public abstract boolean I000OOo1O();

                public Object[] I000OiO() {
/* 1 */             return null;
                }

                @Override
                public final boolean add(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final void clear() {
/* 20 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean remove(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Spliterator spliterator() {
/* 3 */             return Spliterators.spliterator(this, 1296);
                }

                @Override
                public final Object[] toArray(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             int size = size();
/* 8 */             int length = objArr.length;
/* 9 */             if (length < size) {
/* 11 */                Object[] objArrI000OiO = I000OiO();
/* 15 */                if (objArrI000OiO != null) {
/* 41 */                    return Arrays.copyOfRange(objArrI000OiO, I0000oI00(), I0000O(), objArr.getClass());
                        }
/* 17 */                if (length != 0) {
/* 20 */                    objArr = Arrays.copyOf(objArr, 0);
                        }
/* 24 */                objArr = Arrays.copyOf(objArr, size);
                    } else if (length > size) {
/* 49 */                objArr[size] = null;
                    }
/* 51 */            I00000oOI(objArr);
/* 77 */            return objArr;
                }

                @Override
/* 54 */        public final Object[] toArray() {
/* 55 */            return toArray(I00iOIl);
                }
            }
