            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaoz extends zzagg implements zzaho {
                private static final zzaoz zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private float zzh;

                static {
/* 3 */             zzaoz zzaozVar = new zzaoz();
/* 6 */             zzb = zzaozVar;
/* 10 */            zzagg.zzD(zzaoz.class, zzaozVar);
                }

                private zzaoz() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzagg.zzA(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001", new Object[]{"zzf", "zzg", zzaoy.zza, "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzaoz();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzaox(zzarwVar);
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
                    synchronized (zzaoz.class) {
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
