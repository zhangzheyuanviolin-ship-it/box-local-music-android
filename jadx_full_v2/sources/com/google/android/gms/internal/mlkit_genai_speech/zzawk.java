            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Arrays;
            import java.util.List;
            
            public final class zzawk {
                private final List zza;
                private final zzatu zzb;
                private final Object[][] zzc;

                public zzawk(List list, zzatu zzatuVar, Object[][] objArr, zzaww zzawwVar) {
/* 6 */             zzgo.zzc(list, "addresses are not set");
/* 11 */            this.zza = list;
/* 15 */            zzgo.zzc(zzatuVar, "attrs");
/* 18 */            this.zzb = zzatuVar;
/* 22 */            zzgo.zzc(objArr, "customOptions");
/* 25 */            this.zzc = objArr;
                }

                public static zzawi zzb() {
/* 3 */             return new zzawi();
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("addrs", this.zza);
/* 16 */            zzgkVarZzb.zzd("attrs", this.zzb);
/* 27 */            zzgkVarZzb.zzd("customOptions", Arrays.deepToString(this.zzc));
/* 30 */            return zzgkVarZzb.toString();
                }

                public final zzatu zza() {
/* 1 */             return this.zzb;
                }

                public final Object zzc(zzawj zzawjVar) {
/* 2 */             int i = 0;
                    while (true) {
/* 3 */                 Object[][] objArr = this.zzc;
/* 6 */                 if (i >= objArr.length) {
/* 1 */                     return zzawjVar.zzb;
                        }
/* 16 */                if (zzawjVar.equals(objArr[i][0])) {
/* 21 */                    return objArr[i][1];
                        }
/* 24 */                i++;
                    }
                }

                public final List zzd() {
/* 1 */             return this.zza;
                }
            }
