            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.InputStream;
            import java.util.concurrent.atomic.AtomicReferenceArray;
            import p000.IIl001iO0Io;
            
            public final class zzaxv {
                private final zzaxt zza;
                private final String zzb;
                private final String zzc;
                private final zzaxs zzd;
                private final zzaxs zze;
                private final boolean zzf;

                public zzaxv(zzaxt zzaxtVar, String str, zzaxs zzaxsVar, zzaxs zzaxsVar2, Object obj, boolean z, boolean z2, boolean z3, zzaxu zzaxuVar) {
/* 7 */             new AtomicReferenceArray(2);
/* 12 */            zzgo.zzc(zzaxtVar, "type");
/* 15 */            this.zza = zzaxtVar;
/* 19 */            zzgo.zzc(str, "fullMethodName");
/* 22 */            this.zzb = str;
/* 24 */            zzgo.zzc(str, "fullMethodName");
/* 29 */            int iLastIndexOf = str.lastIndexOf(47);
/* 43 */            this.zzc = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
/* 47 */            zzgo.zzc(zzaxsVar, "requestMarshaller");
/* 50 */            this.zzd = zzaxsVar;
/* 54 */            zzgo.zzc(zzaxsVar2, "responseMarshaller");
/* 57 */            this.zze = zzaxsVar2;
/* 59 */            this.zzf = z3;
                }

                public static zzaxr zza(zzaxs zzaxsVar, zzaxs zzaxsVar2) {
/* 4 */             zzaxr zzaxrVar = new zzaxr(null);
/* 7 */             zzaxrVar.zzb(null);
/* 10 */            zzaxrVar.zzc(null);
/* 37 */            return zzaxrVar;
                }

                public static String zze(String str, String str2) {
/* 3 */             zzgo.zzc(str, "fullServiceName");
/* 8 */             zzgo.zzc(str2, "methodName");
/* 13 */            StringBuilder sb = new StringBuilder();
/* 16 */            sb.append(str);
/* 21 */            return IIl001iO0Io.I00100l0(sb, "/", str2);
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("fullMethodName", this.zzb);
/* 16 */            zzgkVarZzb.zzd("type", this.zza);
/* 22 */            zzgkVarZzb.zze("idempotent", false);
/* 27 */            zzgkVarZzb.zze("safe", false);
/* 34 */            zzgkVarZzb.zze("sampledToLocalTracing", this.zzf);
/* 41 */            zzgkVarZzb.zzd("requestMarshaller", this.zzd);
/* 48 */            zzgkVarZzb.zzd("responseMarshaller", this.zze);
/* 54 */            zzgkVarZzb.zzd("schemaDescriptor", null);
/* 57 */            zzgkVarZzb.zzg();
/* 60 */            return zzgkVarZzb.toString();
                }

                public final zzaxt zzb() {
/* 1 */             return this.zza;
                }

                public final InputStream zzc(Object obj) {
/* 3 */             return this.zzd.zza(obj);
                }

                public final Object zzd(InputStream inputStream) {
/* 3 */             return this.zze.zzb(inputStream);
                }

                public final String zzf() {
/* 1 */             return this.zzb;
                }

                public final String zzg() {
/* 1 */             return this.zzc;
                }
            }
