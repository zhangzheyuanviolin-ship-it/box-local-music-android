            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentMap;
            import p000.IOOlIIilOl0;
            
            final class zzahw {
                private static final zzahw zza = new zzahw();
                private final ConcurrentMap zzc = new ConcurrentHashMap();
                private final zzaib zzb = new zzahe();

                private zzahw() {
                }

                public static zzahw zza() {
/* 1 */             return zza;
                }

                public final zzaia zzb(Class cls) {
/* 1 */             byte[] bArr = zzagp.zzb;
/* 3 */             if (cls == null) {
/* 34 */                IOOlIIilOl0.I000II("messageType");
/* 37 */                return null;
                    }
/* 5 */             ConcurrentMap concurrentMap = this.zzc;
/* 11 */            zzaia zzaiaVar = (zzaia) concurrentMap.get(cls);
/* 13 */            if (zzaiaVar != null) {
/* 31 */                return zzaiaVar;
                    }
/* 17 */            zzaia zzaiaVarZza = this.zzb.zza(cls);
/* 25 */            zzaia zzaiaVar2 = (zzaia) concurrentMap.putIfAbsent(cls, zzaiaVarZza);
                    return zzaiaVar2 != null ? zzaiaVar2 : zzaiaVarZza;
                }
            }
