            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzad extends zzagg implements zzaho {
                private static final zzad zzb;
                private static volatile zzahv zze;
                private int zzf;
                private float zzg;
                private boolean zzh;

                static {
/* 3 */             zzad zzadVar = new zzad();
/* 6 */             zzb = zzadVar;
/* 10 */            zzagg.zzD(zzad.class, zzadVar);
                }

                private zzad() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 85 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 79 */                return zzagg.zzA(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0001", new Object[]{"zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzad();
                    }
/* 12 */            zzac zzacVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzab(zzacVar);
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
                    synchronized (zzad.class) {
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
