            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzapu extends zzagg implements zzaho {
                private static final zzapu zzb;
                private static volatile zzahv zze;
                private int zzf;
                private Object zzh;
                private int zzg = 0;
                private String zzi = "";
                private String zzj = "";

                static {
/* 3 */             zzapu zzapuVar = new zzapu();
/* 6 */             zzb = zzapuVar;
/* 10 */            zzagg.zzD(zzapu.class, zzapuVar);
                }

                private zzapu() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 93 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 72 */                zzagk zzagkVar = zzapt.zza;
/* 87 */                return zzagg.zzA(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u083f\u0000\u0002\u083f\u0000\u0003ဈ\u0000\u0004ဈ\u0001", new Object[]{"zzh", "zzg", "zzf", zzagkVar, zzagkVar, "zzi", "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzapu();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzaps(zzarwVar);
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
                    synchronized (zzapu.class) {
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
