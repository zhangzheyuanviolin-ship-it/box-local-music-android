            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.Serializable;
            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            import p000.I000II;
            import p000.Oi010OO0;
            import p000.OooioIOo1;
            
            public abstract class zzhn implements Map, Serializable {
                private transient zzho zza;
                private transient zzho zzb;
                private transient zzhg zzc;

                public static zzhn zzc(Iterable iterable) {
/* 16 */            zzhm zzhmVar = new zzhm(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
/* 19 */            zzhmVar.zza(iterable);
/* 22 */            zzhl zzhlVar = zzhmVar.zzc;
/* 24 */            if (zzhlVar != null) {
/* 77 */                throw zzhlVar.zza();
                    }
/* 30 */            zzhx zzhxVarZzi = zzhx.zzi(zzhmVar.zzb, zzhmVar.zza, zzhmVar);
/* 34 */            zzhl zzhlVar2 = zzhmVar.zzc;
/* 36 */            if (zzhlVar2 == null) {
/* 38 */                return zzhxVarZzi;
                    }
/* 43 */            throw zzhlVar2.zza();
                }

                public static zzhn zzd() {
/* 1 */             return zzhx.zza;
                }

                public static zzhn zze(Object obj, Object obj2) {
/* 5 */             zzhc.zza("optional-module-barcode", "com.google.android.gms.vision.barcode");
/* 14 */            return zzhx.zzi(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
                }

                @Override
                @Deprecated
                public final void clear() {
/* 20 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean containsKey(Object obj) {
                    return get(obj) != null;
                }

                @Override
                public final boolean containsValue(Object obj) {
/* 5 */             return values().contains(obj);
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof Map) {
/* 21 */                return entrySet().equals(((Map) obj).entrySet());
                    }
/* 9 */             return false;
                }

                @Override
                public abstract Object get(Object obj);

                @Override
                public final Object getOrDefault(Object obj, Object obj2) {
/* 1 */             Object obj3 = get(obj);
                    return obj3 != null ? obj3 : obj2;
                }

                @Override
                public final int hashCode() {
/* 5 */             return zzhz.zza(entrySet());
                }

                @Override
                public final boolean isEmpty() {
                    return size() == 0;
                }

                @Override
                public final Set keySet() {
/* 1 */             zzho zzhoVar = this.zzb;
/* 3 */             if (zzhoVar != null) {
/* 20 */                return zzhoVar;
                    }
/* 5 */             zzho zzhoVarZzg = zzg();
/* 9 */             this.zzb = zzhoVarZzg;
/* 20 */            return zzhoVarZzg;
                }

                @Override
                @Deprecated
                public final Object put(Object obj, Object obj2) {
/* 37 */            throw new UnsupportedOperationException();
                }

                @Override
                @Deprecated
                public final void putAll(Map map) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                @Deprecated
                public final Object remove(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                public final String toString() {
/* 1 */             int size = size();
/* 5 */             if (size < 0) {
/* 80 */                I000II.I000iOII(Oi010OO0.I000oI1ioi(size, "size cannot be negative but was: "));
/* 83 */                return null;
                    }
/* 21 */            StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
/* 26 */            sb.append('{');
/* 37 */            boolean z = true;
/* 42 */            for (Map.Entry entry : entrySet()) {
/* 50 */                if (!z) {
/* 54 */                    sb.append(", ");
                        }
/* 59 */                OooioIOo1.I00111O(entry, sb, '=');
/* 62 */                z = false;
                    }
/* 66 */            sb.append('}');
/* 69 */            return sb.toString();
                }

                public abstract zzhg zza();

                @Override
                public final zzhg values() {
/* 1 */             zzhg zzhgVar = this.zzc;
/* 3 */             if (zzhgVar != null) {
/* 20 */                return zzhgVar;
                    }
/* 5 */             zzhg zzhgVarZza = zza();
/* 9 */             this.zzc = zzhgVarZza;
/* 20 */            return zzhgVarZza;
                }

                public abstract zzho zzf();

                public abstract zzho zzg();

                @Override
                public final zzho entrySet() {
/* 1 */             zzho zzhoVar = this.zza;
/* 3 */             if (zzhoVar != null) {
/* 20 */                return zzhoVar;
                    }
/* 5 */             zzho zzhoVarZzf = zzf();
/* 9 */             this.zza = zzhoVarZzf;
/* 20 */            return zzhoVarZzf;
                }
            }
