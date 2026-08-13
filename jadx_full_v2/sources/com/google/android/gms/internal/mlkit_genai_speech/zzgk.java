            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Arrays;
            
            public final class zzgk {
                private final String zza;
                private final zzgj zzb;
                private zzgj zzc;
                private boolean zzd;

                public zzgk(String str, zzgl zzglVar) {
/* 6 */             zzgj zzgjVar = new zzgj();
/* 9 */             this.zzb = zzgjVar;
/* 11 */            this.zzc = zzgjVar;
/* 14 */            this.zzd = false;
/* 16 */            str.getClass();
/* 19 */            this.zza = str;
                }

                private final zzgj zzh() {
/* 3 */             zzgj zzgjVar = new zzgj();
/* 8 */             this.zzc.zzc = zzgjVar;
/* 10 */            this.zzc = zzgjVar;
/* 20 */            return zzgjVar;
                }

                private final zzgk zzi(String str, Object obj) {
/* 4 */             zzgi zzgiVar = new zzgi(null);
/* 9 */             this.zzc.zzc = zzgiVar;
/* 11 */            this.zzc = zzgiVar;
/* 13 */            zzgiVar.zzb = obj;
/* 15 */            zzgiVar.zza = str;
/* 37 */            return this;
                }

                public final String toString() {
/* 1 */             boolean z = this.zzd;
/* 7 */             StringBuilder sb = new StringBuilder(32);
/* 12 */            sb.append(this.zza);
/* 17 */            sb.append('{');
/* 24 */            String str = "";
/* 26 */            for (zzgj zzgjVar = this.zzb.zzc; zzgjVar != null; zzgjVar = zzgjVar.zzc) {
/* 28 */                boolean z2 = zzgjVar instanceof zzgi;
/* 30 */                Object obj = zzgjVar.zzb;
/* 32 */                if (z2 || obj != null || !z) {
/* 38 */                    sb.append(str);
/* 41 */                    String str2 = zzgjVar.zza;
/* 43 */                    if (str2 != null) {
/* 45 */                        sb.append(str2);
/* 50 */                        sb.append('=');
                            }
/* 53 */                    if (obj == null || !obj.getClass().isArray()) {
/* 84 */                        sb.append(obj);
                            } else {
/* 80 */                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                            }
/* 87 */                    str = ", ";
                        }
                    }
/* 94 */            sb.append('}');
/* 97 */            return sb.toString();
                }

                public final zzgk zza(String str, double d) {
/* 7 */             zzi("backoffMultiplier", String.valueOf(d));
/* 37 */            return this;
                }

                public final zzgk zzb(String str, int i) {
/* 5 */             zzi(str, String.valueOf(i));
/* 37 */            return this;
                }

                public final zzgk zzc(String str, long j) {
/* 5 */             zzi(str, String.valueOf(j));
/* 37 */            return this;
                }

                public final zzgk zzd(String str, Object obj) {
/* 1 */             zzgj zzgjVarZzh = zzh();
/* 5 */             zzgjVarZzh.zzb = obj;
/* 7 */             zzgjVarZzh.zza = str;
/* 37 */            return this;
                }

                public final zzgk zze(String str, boolean z) {
/* 5 */             zzi(str, String.valueOf(z));
/* 37 */            return this;
                }

                public final zzgk zzf(Object obj) {
/* 5 */             zzh().zzb = obj;
/* 29 */            return this;
                }

                public final zzgk zzg() {
/* 2 */             this.zzd = true;
/* 20 */            return this;
                }
            }
