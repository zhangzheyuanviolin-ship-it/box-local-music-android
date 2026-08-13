            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.nio.charset.StandardCharsets;
            import p000.O01IiIi1l;
            import p000.lII0I0I000I;
            
            public final class zzaec implements zzadt {
                private final zzxr zza;
                private zzact zzb = new zzact();
                private final int zzc;

                private zzaec(zzxr zzxrVar, int i) {
/* 11 */            this.zza = zzxrVar;
/* 13 */            zzael.zza();
/* 16 */            this.zzc = i;
                }

                public static zzadt zzf(zzxr zzxrVar) {
/* 4 */             return new zzaec(zzxrVar, 0);
                }

                public static zzadt zzg(zzxr zzxrVar, int i) {
/* 4 */             return new zzaec(zzxrVar, 1);
                }

                @Override
                public final int zza() {
/* 1 */             return this.zzc;
                }

                @Override
                public final zzadt zzb(zzxq zzxqVar) {
/* 3 */             this.zza.zzb(zzxqVar);
/* 29 */            return this;
                }

                @Override
                public final zzadt zzc(zzact zzactVar) {
/* 1 */             this.zzb = zzactVar;
/* 29 */            return this;
                }

                @Override
                public final String zzd() {
/* 7 */             zzacv zzacvVarZze = this.zza.zzg().zze();
/* 11 */            if (zzacvVarZze == null || zzgt.zzc(zzacvVarZze.zzk())) {
/* 31 */                return "NA";
                    }
/* 23 */            String strZzk = zzacvVarZze.zzk();
/* 27 */            lII0I0I000I.I000II(strZzk);
/* 30 */            return strZzk;
                }

                @Override
                public final byte[] zze(int i, boolean z) {
/* 15 */            this.zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
/* 22 */            this.zzb.zze(Boolean.FALSE);
/* 27 */            zzacv zzacvVarZzm = this.zzb.zzm();
/* 31 */            zzxr zzxrVar = this.zza;
/* 33 */            zzxrVar.zzf(zzacvVarZzm);
/* 36 */            zzael.zza();
/* 39 */            if (i != 0) {
/* 72 */                zzxt zzxtVarZzg = zzxrVar.zzg();
/* 78 */                zzke zzkeVar = new zzke();
/* 83 */                zzvn.zza.configure(zzkeVar);
/* 90 */                return zzkeVar.zza().zza(zzxtVarZzg);
                    }
/* 41 */            zzxt zzxtVarZzg2 = zzxrVar.zzg();
/* 47 */            O01IiIi1l o01IiIi1l = new O01IiIi1l();
/* 52 */            zzvn.zza.configure(o01IiIi1l);
/* 55 */            o01IiIi1l.I0000O = true;
/* 67 */            return o01IiIi1l.I00000oIO().I000l1(zzxtVarZzg2).getBytes(StandardCharsets.UTF_8);
                }
            }
