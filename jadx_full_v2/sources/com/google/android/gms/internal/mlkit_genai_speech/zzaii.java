            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.AbstractMap;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            import java.util.SortedMap;
            import java.util.TreeMap;
            import p000.OIiilo1Ool0o;
            
/* 9 */     class zzaii extends AbstractMap {
                private Object[] zza;
                private int zzb;
                private Map zzc;
                private boolean zzd;
                private volatile zzaig zze;
                private Map zzf;

                private zzaii() {
/* 4 */             Map map = Collections.EMPTY_MAP;
/* 6 */             this.zzc = map;
/* 8 */             this.zzf = map;
                }

                private final int zzl(Comparable comparable) {
/* 1 */             int i = this.zzb;
                    int i2 = i - 1;
/* 5 */             int i3 = 0;
/* 6 */             if (i2 >= 0) {
/* 18 */                int iCompareTo = comparable.compareTo(((zzaie) this.zza[i2]).zza());
/* 22 */                if (iCompareTo > 0) {
/* 26 */                    return -(i + 1);
                        }
/* 28 */                if (iCompareTo == 0) {
/* 31 */                    return i2;
                        }
                    }
/* 32 */            while (i3 <= i2) {
/* 36 */                int i4 = (i3 + i2) / 2;
/* 48 */                int iCompareTo2 = comparable.compareTo(((zzaie) this.zza[i4]).zza());
/* 52 */                if (iCompareTo2 < 0) {
                            i2 = i4 - 1;
                        } else {
/* 57 */                    if (iCompareTo2 <= 0) {
/* 62 */                        return i4;
                            }
/* 59 */                    i3 = i4 + 1;
                        }
                    }
/* 65 */            return -(i3 + 1);
                }

                private final Object zzm(int i) {
/* 1 */             zzo();
/* 10 */            Object value = ((zzaie) this.zza[i]).getValue();
/* 14 */            Object[] objArr = this.zza;
/* 23 */            System.arraycopy(objArr, i + 1, objArr, i, (this.zzb - i) - 1);
                    this.zzb--;
/* 38 */            if (!this.zzc.isEmpty()) {
/* 48 */                Iterator it = zzn().entrySet().iterator();
/* 52 */                Object[] objArr2 = this.zza;
/* 54 */                int i2 = this.zzb;
/* 62 */                Map.Entry entry = (Map.Entry) it.next();
/* 77 */                objArr2[i2] = new zzaie(this, (Comparable) entry.getKey(), entry.getValue());
                        this.zzb++;
/* 85 */                it.remove();
                    }
/* 168 */           return value;
                }

                private final SortedMap zzn() {
/* 1 */             zzo();
/* 10 */            if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
/* 20 */                TreeMap treeMap = new TreeMap();
/* 23 */                this.zzc = treeMap;
/* 29 */                this.zzf = treeMap.descendingMap();
                    }
/* 33 */            return (SortedMap) this.zzc;
                }

                private final void zzo() {
/* 3 */             if (this.zzd) {
/* 6 */                 OIiilo1Ool0o.I000lI();
                    }
                }

                @Override
                public final void clear() {
/* 1 */             zzo();
/* 6 */             if (this.zzb != 0) {
/* 9 */                 this.zza = null;
/* 12 */                this.zzb = 0;
                    }
/* 20 */            if (this.zzc.isEmpty()) {
/* 55 */                return;
                    }
/* 24 */            this.zzc.clear();
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
                    return zzl(comparable) >= 0 || this.zzc.containsKey(comparable);
                }

                @Override
                public final Set entrySet() {
/* 3 */             if (this.zze == null) {
/* 11 */                this.zze = new zzaig(this, null);
                    }
/* 13 */            return this.zze;
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzaii)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzaii zzaiiVar = (zzaii) obj;
/* 16 */            int size = size();
/* 25 */            if (size != zzaiiVar.size()) {
/* 24 */                return false;
                    }
/* 27 */            int i = this.zzb;
/* 31 */            if (i != zzaiiVar.zzb) {
/* 74 */                return entrySet().equals(zzaiiVar.entrySet());
                    }
/* 34 */            for (int i2 = 0; i2 < i; i2++) {
/* 48 */                if (!zzg(i2).equals(zzaiiVar.zzg(i2))) {
/* 24 */                    return false;
                        }
                    }
/* 54 */            if (i != size) {
/* 60 */                return this.zzc.equals(zzaiiVar.zzc);
                    }
/* 1 */             return true;
                }

                @Override
                public final Object get(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
/* 3 */             int iZzl = zzl(comparable);
                    return iZzl >= 0 ? ((zzaie) this.zza[iZzl]).getValue() : this.zzc.get(comparable);
                }

                @Override
                public final int hashCode() {
/* 1 */             int i = this.zzb;
/* 4 */             int iHashCode = 0;
/* 5 */             for (int i2 = 0; i2 < i; i2++) {
/* 15 */                iHashCode += this.zza[i2].hashCode();
                    }
                    return this.zzc.size() > 0 ? this.zzc.hashCode() + iHashCode : iHashCode;
                }

                @Override
                public final Object remove(Object obj) {
/* 1 */             zzo();
/* 4 */             Comparable comparable = (Comparable) obj;
/* 6 */             int iZzl = zzl(comparable);
/* 10 */            if (iZzl >= 0) {
/* 12 */                return zzm(iZzl);
                    }
/* 23 */            if (this.zzc.isEmpty()) {
/* 25 */                return null;
                    }
/* 29 */            return this.zzc.remove(comparable);
                }

                @Override
                public final int size() {
/* 9 */             return this.zzc.size() + this.zzb;
                }

                public void zza() {
/* 3 */             if (this.zzd) {
/* 55 */                return;
                    }
/* 22 */            this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzc);
/* 41 */            this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzf);
/* 44 */            this.zzd = true;
                }

                public final int zzc() {
/* 1 */             return this.zzb;
                }

                public final Iterable zzd() {
                    return this.zzc.isEmpty() ? Collections.EMPTY_SET : this.zzc.entrySet();
                }

                @Override
                public final Object put(Comparable comparable, Object obj) {
/* 1 */             zzo();
/* 4 */             int iZzl = zzl(comparable);
/* 8 */             if (iZzl >= 0) {
/* 16 */                return ((zzaie) this.zza[iZzl]).setValue(obj);
                    }
/* 21 */            zzo();
/* 24 */            Object[] objArr = this.zza;
/* 28 */            if (objArr == null) {
/* 30 */                objArr = new Object[16];
/* 32 */                this.zza = objArr;
                    }
/* 36 */            int i = -(iZzl + 1);
/* 37 */            if (i >= 16) {
/* 43 */                return zzn().put(comparable, obj);
                    }
/* 50 */            if (this.zzb == 16) {
/* 56 */                zzaie zzaieVar = (zzaie) objArr[15];
/* 58 */                this.zzb = 15;
/* 72 */                zzn().put(zzaieVar.zza(), zzaieVar.getValue());
                    }
/* 75 */            Object[] objArr2 = this.zza;
/* 79 */            int length = objArr2.length;
/* 82 */            System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
/* 92 */            this.zza[i] = new zzaie(this, comparable, obj);
                    this.zzb++;
/* 100 */           return null;
                }

                public final Map.Entry zzg(int i) {
/* 3 */             if (i < this.zzb) {
/* 9 */                 return (zzaie) this.zza[i];
                    }
/* 29 */            throw new ArrayIndexOutOfBoundsException(i);
                }

                public final boolean zzj() {
/* 1 */             return this.zzd;
                }

/* 10 */        public zzaii(zzaih zzaihVar) {
/* 12 */            Map map = Collections.EMPTY_MAP;
                    this.zzc = map;
/* 13 */            this.zzf = map;
                }
            }
