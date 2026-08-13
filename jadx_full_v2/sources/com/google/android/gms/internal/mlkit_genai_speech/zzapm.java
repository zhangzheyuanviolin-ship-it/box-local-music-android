            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzapm extends zzagg implements zzaho {
                private static final zzapm zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private zzagl zzh = zzagg.zzu();
                private zzagn zzi = zzagg.zzw();

                static {
/* 3 */             zzapm zzapmVar = new zzapm();
/* 6 */             zzb = zzapmVar;
/* 10 */            zzagg.zzD(zzapm.class, zzapmVar);
                }

                private zzapm() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzagg.zzA(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u0013\u0003\u0014", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzapm();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzapl(zzarwVar);
                    }
/* 16 */            if (i2 == 5) {
/* 50 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 21 */            zzahv zzahvVar = zze;
/* 23 */            if (zzahvVar != null) {
/* 48 */                return zzahvVar;
                    }
                    synchronized (zzapm.class) {
                        try {
/* 28 */                    zzagbVar = zze;
/* 30 */                    if (zzagbVar == null) {
/* 36 */                        zzagbVar = new zzagb(zzb);
/* 39 */                        zze = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return zzagbVar;
                }
            }
