            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzarm extends zzagg implements zzaho {
                private static final zzarm zzb;
                private static volatile zzahv zze;
                private int zzf;
                private boolean zzg;
                private float zzi;
                private boolean zzj;
                private float zzk;
                private zzahh zzl = zzahh.zza();
                private zzahh zzm = zzahh.zza();
                private String zzh = "";
                private zzago zzn = zzagg.zzx();

                static {
/* 3 */             zzarm zzarmVar = new zzarm();
/* 6 */             zzb = zzarmVar;
/* 10 */            zzagg.zzD(zzarm.class, zzarmVar);
                }

                private zzarm() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 102 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 96 */                return zzagg.zzA(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0002\u0001\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ဇ\u0003\u0005ခ\u0004\u00062\u00072\b\u001a", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzarl.zza, "zzm", zzark.zza, "zzn"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzarm();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzarj(zzarwVar);
                    }
/* 16 */            if (i2 == 5) {
/* 51 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 21 */            zzahv zzahvVar = zze;
/* 23 */            if (zzahvVar != null) {
/* 49 */                return zzahvVar;
                    }
                    synchronized (zzarm.class) {
                        try {
/* 28 */                    zzagbVar = zze;
/* 30 */                    if (zzagbVar == null) {
/* 36 */                        zzagbVar = new zzagb(zzb);
/* 39 */                        zze = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 48 */                    throw th;
                        }
                    }
/* 46 */            return zzagbVar;
                }
            }
