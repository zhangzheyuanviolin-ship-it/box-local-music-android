            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Objects;
            import java.util.RandomAccess;
            
            public abstract class zzhk extends zzhg implements List, RandomAccess {
                private static final zzic zza = new zzhi(zzhs.zza, 0);
                public static final int zzd = 0;

                public static zzhk zzh(Object[] objArr, int i) {
                    return i == 0 ? zzhs.zza : new zzhs(objArr, i);
                }

                public static zzhk zzi(Collection collection) {
/* 1 */             Object[] array = collection.toArray();
/* 5 */             int length = array.length;
/* 6 */             zzhr.zzb(array, length);
/* 9 */             return zzh(array, length);
                }

                public static zzhk zzj() {
/* 1 */             return zzhs.zza;
                }

                public static zzhk zzk(Object obj) {
/* 1 */             Object[] objArr = {obj};
/* 6 */             zzhr.zzb(objArr, 1);
/* 9 */             return zzh(objArr, 1);
                }

                public static zzhk zzl(Object obj, Object obj2) {
/* 1 */             Object[] objArr = {obj, obj2};
/* 6 */             zzhr.zzb(objArr, 2);
/* 9 */             return zzh(objArr, 2);
                }

                public static zzhk zzm(Object obj, Object obj2, Object obj3) {
/* 1 */             Object[] objArr = {obj, obj2, obj3};
/* 6 */             zzhr.zzb(objArr, 3);
/* 9 */             return zzh(objArr, 3);
                }

                @Override
                @Deprecated
                public final void add(int i, Object obj) {
/* 37 */            throw new UnsupportedOperationException();
                }

                @Override
                @Deprecated
                public final boolean addAll(int i, Collection collection) {
/* 37 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean contains(Object obj) {
                    return indexOf(obj) >= 0;
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof List)) {
/* 7 */                 return false;
                    }
/* 11 */            List list = (List) obj;
/* 13 */            int size = size();
/* 21 */            if (size != list.size()) {
/* 7 */                 return false;
                    }
/* 26 */            if (list instanceof RandomAccess) {
/* 29 */                for (int i = 0; i < size; i++) {
/* 43 */                    if (!Objects.equals(get(i), list.get(i))) {
/* 7 */                         return false;
                            }
                        }
/* 1 */                 return true;
                    }
/* 50 */            Iterator it = iterator();
/* 54 */            Iterator it2 = list.iterator();
/* 62 */            while (it.hasNext()) {
/* 68 */                if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
/* 7 */                     return false;
                        }
                    }
                    return !it2.hasNext();
                }

                @Override
                public final int hashCode() {
/* 1 */             int size = size();
/* 6 */             int iHashCode = 1;
/* 7 */             for (int i = 0; i < size; i++) {
/* 19 */                iHashCode = (iHashCode * 31) + get(i).hashCode();
                    }
/* 55 */            return iHashCode;
                }

                @Override
                public final int indexOf(Object obj) {
/* 2 */             if (obj == null) {
/* 1 */                 return -1;
                    }
/* 5 */             int size = size();
/* 10 */            for (int i = 0; i < size; i++) {
/* 20 */                if (obj.equals(get(i))) {
/* 22 */                    return i;
                        }
                    }
/* 1 */             return -1;
                }

                @Override
                public final Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 2 */             if (obj == null) {
/* 1 */                 return -1;
                    }
/* 10 */            for (int size = size() - 1; size >= 0; size--) {
/* 20 */                if (obj.equals(get(size))) {
/* 22 */                    return size;
                        }
                    }
/* 1 */             return -1;
                }

                @Override
                public final ListIterator listIterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                @Deprecated
                public final Object remove(int i) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                @Deprecated
                public final Object set(int i, Object obj) {
/* 37 */            throw new UnsupportedOperationException();
                }

                @Override
                public int zza(Object[] objArr, int i) {
/* 1 */             int size = size();
/* 6 */             for (int i2 = 0; i2 < size; i2++) {
/* 14 */                objArr[i + i2] = get(i2);
                    }
/* 19 */            return i + size;
                }

                @Override
                public final zzib iterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public zzhk subList(int i, int i2) {
/* 5 */             zzgo.zzl(i, i2, size());
/* 8 */             int i3 = i2 - i;
                    return i3 == size() ? this : i3 == 0 ? zzhs.zza : new zzhj(this, i, i3);
                }

                @Override
                public final zzic listIterator(int i) {
/* 7 */             zzgo.zzb(i, size(), "index");
                    return isEmpty() ? zza : new zzhi(this, i);
                }
            }
