            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzape extends zzagg implements zzaho {
                private static final zzape zzb;
                private static volatile zzahv zze;
                private int zzf;
                private boolean zzg;
                private int zzh;
                private long zzj;
                private long zzk;
                private int zzl;
                private boolean zzn;
                private zzahh zzm = zzahh.zza();
                private zzagm zzi = zzagg.zzv();

                static {
/* 3 */             zzape zzapeVar = new zzape();
/* 6 */             zzb = zzapeVar;
/* 10 */            zzagg.zzD(zzape.class, zzapeVar);
                }

                private zzape() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 100 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 94 */                return zzagg.zzA(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0001\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003'\u0004ဂ\u0002\u0005ဂ\u0003\u0006င\u0004\u00072\bဇ\u0005", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzapd.zza, "zzn"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzape();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzapc(zzarwVar);
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
                    synchronized (zzape.class) {
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
