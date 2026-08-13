            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzant extends zzagg implements zzaho {
                private static final zzant zzb;
                private static volatile zzahv zze;
                private int zzf;
                private float zzg;
                private float zzh;
                private long zzi;

                static {
/* 3 */             zzant zzantVar = new zzant();
/* 6 */             zzb = zzantVar;
/* 10 */            zzagg.zzD(zzant.class, zzantVar);
                }

                private zzant() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzagg.zzA(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဂ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzant();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzans(zzarwVar);
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
                    synchronized (zzant.class) {
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
