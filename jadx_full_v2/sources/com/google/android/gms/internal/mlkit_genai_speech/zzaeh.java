            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.Context;
            import p000.IIOO01;
            import p000.Il0IIil;
            import p000.Il10IiOO;
            import p000.OoI0o0oiol0l;
            import p000.OoIOil1iIO;
            import p000.OoIOlll0O;
            import p000.OoIOlo1001I;
            
            public final class zzaeh implements zzadu {
                private zzkh zza;
                private final zzkh zzb;
                private final zzadw zzc;

                public zzaeh(Context context, zzadw zzadwVar) {
/* 4 */             this.zzc = zzadwVar;
/* 6 */             IIOO01 iioo01 = IIOO01.I0000oI00;
/* 8 */             OoIOlo1001I.I00000oOI(context);
/* 15 */            final OoIOil1iIO ooIOil1iIOI0000Il00O = OoIOlo1001I.I00000oIO().I0000Il00O(iioo01);
/* 31 */            if (IIOO01.I0000O.contains(Il0IIil.I00000oIO("json"))) {
/* 43 */                this.zza = new zzju(new zzkh() {
                            @Override
                            public final Object zza() {
/* 18 */                        return ((OoIOil1iIO) ooIOil1iIOI0000Il00O).I00000oIO("FIREBASE_ML_SDK", Il0IIil.I00000oIO("json"), new OoI0o0oiol0l() {
                                    @Override
                                    public final Object apply(Object obj) {
/* 1 */                                 return (byte[]) obj;
                                    }
                                });
                            }
                        });
                    }
/* 55 */            this.zzb = new zzju(new zzkh() {
                        @Override
                        public final Object zza() {
/* 18 */                    return ((OoIOil1iIO) ooIOil1iIOI0000Il00O).I00000oIO("FIREBASE_ML_SDK", Il0IIil.I00000oIO("proto"), new OoI0o0oiol0l() {
                                @Override
                                public final Object apply(Object obj) {
/* 1 */                             return (byte[]) obj;
                                }
                            });
                        }
                    });
                }

                public static Il10IiOO zzb(zzadw zzadwVar, zzadt zzadtVar) {
/* 1 */             int iZza = zzadwVar.zza();
                    return zzadtVar.zza() != 0 ? Il10IiOO.I00000oIO(zzadtVar.zze(iZza, false)) : Il10IiOO.I00000oOI(zzadtVar.zze(iZza, false));
                }

                @Override
                public final void zza(zzadt zzadtVar) {
/* 1 */             zzadw zzadwVar = this.zzc;
/* 7 */             if (zzadwVar.zza() != 0) {
/* 39 */                ((OoIOlll0O) this.zzb.zza()).I00000oIO(zzb(zzadwVar, zzadtVar));
/* 77 */                return;
                    }
/* 9 */             zzkh zzkhVar = this.zza;
/* 11 */            if (zzkhVar != null) {
/* 23 */                ((OoIOlll0O) zzkhVar.zza()).I00000oIO(zzb(zzadwVar, zzadtVar));
                    }
                }
            }
