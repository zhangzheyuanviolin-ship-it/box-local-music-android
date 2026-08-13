            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.OooioIOo1;
            
            public final class zzahg {
                private final zzahf zza;

                private zzahg(zzaiz zzaizVar, Object obj, zzaiz zzaizVar2, Object obj2) {
/* 9 */             this.zza = new zzahf(zzaizVar, obj, zzaizVar2, obj2);
                }

                public static int zzb(zzahf zzahfVar, Object obj, Object obj2) {
/* 15 */            return zzafw.zza(zzahfVar.zza, 1, obj) + zzafw.zza(zzahfVar.zzc, 2, obj2);
                }

                public static zzahg zzd(zzaiz zzaizVar, Object obj, zzaiz zzaizVar2, Object obj2) {
/* 3 */             return new zzahg(zzaizVar, obj, zzaizVar2, obj2);
                }

                public static void zze(zzafm zzafmVar, zzahf zzahfVar, Object obj, Object obj2) {
/* 4 */             zzafw.zzk(zzafmVar, zzahfVar.zza, 1, obj);
/* 10 */            zzafw.zzk(zzafmVar, zzahfVar.zzc, 2, obj2);
                }

                public final int zza(int i, Object obj, Object obj2) {
/* 1 */             zzahf zzahfVar = this.zza;
/* 5 */             int iZzy = zzafm.zzy(i << 3);
/* 9 */             int iZzb = zzb(zzahfVar, obj, obj2);
/* 13 */            return OooioIOo1.I001l0I00(iZzb, iZzb, iZzy);
                }

                public final zzahf zzc() {
/* 1 */             return this.zza;
                }
            }
