            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzalt extends zzagg implements zzaho {
                private static final zzalt zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private zzamb zzh;
                private zzalz zzi;
                private zzalo zzj;
                private zzago zzk = zzagg.zzx();
                private String zzl = "";
                private long zzm;
                private int zzn;

                static {
/* 3 */             zzalt zzaltVar = new zzalt();
/* 6 */             zzb = zzaltVar;
/* 10 */            zzagg.zzD(zzalt.class, zzaltVar);
                }

                private zzalt() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 104 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 98 */                return zzagg.zzA(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဂ\u0005\u0006\u001b\u0007ဈ\u0004\b᠌\u0006", new Object[]{"zzf", "zzg", zzals.zza, "zzh", "zzi", "zzj", "zzm", "zzk", zzalr.class, "zzl", "zzn", zzalb.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzalt();
                    }
/* 12 */            zzamm zzammVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzalp(zzammVar);
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
                    synchronized (zzalt.class) {
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
