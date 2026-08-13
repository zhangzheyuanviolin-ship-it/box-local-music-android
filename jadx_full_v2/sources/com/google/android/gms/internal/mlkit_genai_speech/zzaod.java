            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaod extends zzagg implements zzaho {
                private static final zzaod zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private int zzh;
                private int zzi;
                private zzagl zzj = zzagg.zzu();

                static {
/* 3 */             zzaod zzaodVar = new zzaod();
/* 6 */             zzb = zzaodVar;
/* 10 */            zzagg.zzD(zzaod.class, zzaodVar);
                }

                private zzaod() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return zzagg.zzA(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0002\u0003$\u0004င\u0001", new Object[]{"zzf", "zzg", "zzi", "zzj", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzaod();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzaoc(zzarwVar);
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
                    synchronized (zzaod.class) {
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
