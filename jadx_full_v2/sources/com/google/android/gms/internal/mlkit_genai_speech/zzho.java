            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Objects;
            import java.util.Set;
            import java.util.SortedSet;
            import p000.OooioIOo1;
            
            public abstract class zzho extends zzhg implements Set {
                private transient zzhk zza;

                public static int zzg(int i) {
/* 2 */             int iMax = Math.max(i, 2);
/* 9 */             if (iMax >= 751619276) {
/* 40 */                zzgo.zzf(iMax < 1073741824, "collection too large");
/* 31 */                return 1073741824;
                    }
/* 12 */            int iI0000Il00O = OooioIOo1.I0000Il00O(iMax, -1);
/* 26 */            while (iI0000Il00O * 0.7d < iMax) {
/* 28 */                iI0000Il00O += iI0000Il00O;
                    }
/* 30 */            return iI0000Il00O;
                }

                public static zzho zzj(Collection collection) {
/* 3 */             if ((collection instanceof zzho) && !(collection instanceof SortedSet)) {
/* 10 */                zzho zzhoVar = (zzho) collection;
/* 16 */                if (!zzhoVar.zze()) {
/* 18 */                    return zzhoVar;
                        }
                    }
/* 19 */            Object[] array = collection.toArray();
/* 24 */            return zzm(array.length, array);
                }

                public static zzho zzk(Object obj) {
/* 3 */             return new zzia(obj);
                }

                private static zzho zzm(int i, Object... objArr) {
/* 1 */             if (i == 0) {
/* 120 */               return zzhy.zza;
                    }
/* 5 */             if (i == 1) {
/* 109 */               Object obj = objArr[0];
/* 111 */               Objects.requireNonNull(obj);
/* 116 */               return new zzia(obj);
                    }
/* 7 */             int iZzg = zzg(i);
/* 11 */            Object[] objArr2 = new Object[iZzg];
                    int i2 = iZzg - 1;
/* 16 */            int i3 = 0;
/* 17 */            int i4 = 0;
/* 18 */            for (int i5 = 0; i5 < i; i5++) {
/* 20 */                Object obj2 = objArr[i5];
/* 22 */                zzhr.zza(obj2, i5);
/* 25 */                int iHashCode = obj2.hashCode();
/* 29 */                int iZza = zzhd.zza(iHashCode);
                        while (true) {
/* 33 */                    int i6 = iZza & i2;
/* 35 */                    Object obj3 = objArr2[i6];
/* 37 */                    if (obj3 == null) {
/* 41 */                        objArr[i4] = obj2;
/* 43 */                        objArr2[i6] = obj2;
/* 45 */                        i3 += iHashCode;
/* 39 */                        i4++;
                                break;
                            }
/* 52 */                    if (!obj3.equals(obj2)) {
/* 54 */                        iZza++;
                            }
                        }
                    }
/* 61 */            Arrays.fill(objArr, i4, i, (Object) null);
/* 64 */            if (i4 == 1) {
/* 66 */                Object obj4 = objArr[0];
/* 68 */                Objects.requireNonNull(obj4);
/* 73 */                return new zzia(obj4);
                    }
/* 83 */            if (zzg(i4) < iZzg / 2) {
/* 85 */                return zzm(i4, objArr);
                    }
/* 90 */            int length = objArr.length;
/* 96 */            if (i4 < (length >> 1) + (length >> 2)) {
/* 98 */                objArr = Arrays.copyOf(objArr, i4);
                    }
/* 105 */           return new zzhy(objArr, i3, objArr2, i2, i4);
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if ((obj instanceof zzho) && zzl() && ((zzho) obj).zzl() && hashCode() != obj.hashCode()) {
/* 7 */                 return false;
                    }
/* 37 */            if (obj == this) {
/* 1 */                 return true;
                    }
/* 42 */            if (obj instanceof Set) {
/* 44 */                Set set = (Set) obj;
                        try {
/* 54 */                    if (size() == set.size()) {
                                return containsAll(set);
                            }
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
/* 7 */             return false;
                }

                @Override
                public int hashCode() {
/* 1 */             return zzhz.zza(this);
                }

                @Override
                public abstract zzib iterator();

                public final zzhk zzh() {
/* 1 */             zzhk zzhkVar = this.zza;
/* 3 */             if (zzhkVar != null) {
/* 20 */                return zzhkVar;
                    }
/* 5 */             zzhk zzhkVarZzi = zzi();
/* 9 */             this.zza = zzhkVarZzi;
/* 20 */            return zzhkVarZzi;
                }

                public zzhk zzi() {
/* 1 */             Object[] array = toArray();
/* 5 */             int i = zzhk.zzd;
/* 8 */             return zzhk.zzh(array, array.length);
                }

                public boolean zzl() {
/* 1 */             return false;
                }
            }
