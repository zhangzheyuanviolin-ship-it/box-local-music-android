            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.AbstractList;
            import java.util.Collection;
            import java.util.List;
            import java.util.RandomAccess;
            import p000.OIiilo1Ool0o;
            
/* 7 */     abstract class zzaer extends AbstractList implements zzago {
                private boolean zza;

                public zzaer(boolean z) {
/* 4 */             this.zza = z;
                }

                @Override
                public boolean add(Object obj) {
/* 1 */             zza();
/* 4 */             return super.add(obj);
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 1 */             zza();
/* 4 */             return super.addAll(i, collection);
                }

                @Override
                public final void clear() {
/* 1 */             zza();
/* 4 */             super.clear();
                }

                @Override
                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof List)) {
/* 7 */                 return false;
                    }
/* 13 */            if (!(obj instanceof RandomAccess)) {
/* 15 */                return super.equals(obj);
                    }
/* 20 */            List list = (List) obj;
/* 22 */            int size = size();
/* 30 */            if (size != list.size()) {
/* 7 */                 return false;
                    }
/* 33 */            for (int i = 0; i < size; i++) {
/* 47 */                if (!get(i).equals(list.get(i))) {
/* 7 */                     return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override
                public int hashCode() {
/* 1 */             int size = size();
/* 6 */             int iHashCode = 1;
/* 7 */             for (int i = 0; i < size; i++) {
/* 19 */                iHashCode = (iHashCode * 31) + get(i).hashCode();
                    }
/* 55 */            return iHashCode;
                }

                @Override
                public final boolean remove(Object obj) {
/* 1 */             zza();
/* 4 */             int iIndexOf = indexOf(obj);
/* 9 */             if (iIndexOf == -1) {
/* 11 */                return false;
                    }
/* 13 */            remove(iIndexOf);
/* 16 */            return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 1 */             zza();
/* 4 */             return super.removeAll(collection);
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 1 */             zza();
/* 4 */             return super.retainAll(collection);
                }

                @Override
                public Object set(int i, Object obj) {
/* 1 */             zza();
/* 4 */             return super.set(i, obj);
                }

                public final void zza() {
/* 3 */             if (this.zza) {
/* 5 */                 return;
                    }
/* 6 */             OIiilo1Ool0o.I000lI();
                }

                @Override
                public final void zzb() {
/* 3 */             if (this.zza) {
/* 6 */                 this.zza = false;
                    }
                }

                @Override
                public final boolean zzc() {
/* 1 */             return this.zza;
                }

                @Override
/* 8 */         public void add(int i, Object obj) {
/* 9 */             zza();
/* 10 */            super.add(i, obj);
                }

                @Override
/* 8 */         public boolean addAll(Collection collection) {
/* 9 */             zza();
/* 10 */            return super.addAll(collection);
                }

                @Override
/* 17 */        public Object remove(int i) {
/* 18 */            zza();
/* 19 */            return super.remove(i);
                }
            }
