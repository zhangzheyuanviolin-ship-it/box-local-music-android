            package p000;

            import java.io.Serializable;
            import java.util.AbstractCollection;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Spliterator;
            import java.util.Spliterators;
            
/* 56 */    public abstract class IoilO0iiOo1 extends AbstractCollection implements Serializable {
                public static final Object[] I00iOIl = new Object[0];

                public abstract IoillO0OOoo I00000oOI();

                public abstract int I0000O(Object[] objArr);

                public Object[] I0000oI00() {
/* 1 */             return null;
                }

                public int I0001Ioi1lo() {
/* 20 */            throw new UnsupportedOperationException();
                }

                public int I000OOo1O() {
/* 20 */            throw new UnsupportedOperationException();
                }

                public abstract boolean I000OiO();

                @Override
                public abstract OoiOOoOlo iterator();

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
                public abstract boolean contains(Object obj);

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
/* 9 */             if (objArr.length < size) {
/* 11 */                Object[] objArrI0000oI00 = I0000oI00();
/* 15 */                if (objArrI0000oI00 != null) {
/* 29 */                    return Arrays.copyOfRange(objArrI0000oI00, I000OOo1O(), I0001Ioi1lo(), objArr.getClass());
                        }
/* 35 */                if (objArr.length != 0) {
/* 39 */                    objArr = Arrays.copyOf(objArr, 0);
                        }
/* 43 */                objArr = Arrays.copyOf(objArr, size);
                    } else if (objArr.length > size) {
/* 52 */                objArr[size] = null;
                    }
/* 54 */            I0000O(objArr);
/* 77 */            return objArr;
                }

                @Override
/* 57 */        public final Object[] toArray() {
/* 58 */            return toArray(I00iOIl);
                }
            }
