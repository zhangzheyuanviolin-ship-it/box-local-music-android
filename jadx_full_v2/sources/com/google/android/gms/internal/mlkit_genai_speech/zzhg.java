            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.Serializable;
            import java.util.AbstractCollection;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Spliterator;
            import java.util.Spliterators;
            
/* 53 */    public abstract class zzhg extends AbstractCollection implements Serializable {
                private static final Object[] zza = new Object[0];

                @Override
                @Deprecated
                public final boolean add(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                @Deprecated
                public final boolean addAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                @Deprecated
                public final void clear() {
/* 20 */            throw new UnsupportedOperationException();
                }

                @Override
                public abstract boolean contains(Object obj);

                @Override
                @Deprecated
                public final boolean remove(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                @Deprecated
                public final boolean removeAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                @Deprecated
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
/* 10 */            if (length < size) {
/* 12 */                Object[] objArrZzf = zzf();
/* 16 */                if (objArrZzf != null) {
/* 41 */                    return Arrays.copyOfRange(objArrZzf, zzc(), zzb(), objArr.getClass());
                        }
/* 18 */                if (length != 0) {
/* 20 */                    objArr = Arrays.copyOf(objArr, 0);
                        }
/* 24 */                objArr = Arrays.copyOf(objArr, size);
                    } else if (length > size) {
/* 49 */                objArr[size] = null;
                    }
/* 51 */            zza(objArr, 0);
/* 77 */            return objArr;
                }

                public int zza(Object[] objArr, int i) {
/* 37 */            throw null;
                }

                public int zzb() {
/* 20 */            throw new UnsupportedOperationException();
                }

                public int zzc() {
/* 20 */            throw new UnsupportedOperationException();
                }

                @Override
                public abstract zzib iterator();

                public abstract boolean zze();

                public Object[] zzf() {
/* 1 */             return null;
                }

                @Override
/* 54 */        public final Object[] toArray() {
/* 55 */            return toArray(zza);
                }
            }
