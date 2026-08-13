            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaol extends zzagg implements zzaho {
                private static final zzaol zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private boolean zzh;
                private float zzi;
                private float zzj;

                static {
/* 3 */             zzaol zzaolVar = new zzaol();
/* 6 */             zzb = zzaolVar;
/* 10 */            zzagg.zzD(zzaol.class, zzaolVar);
                }

                private zzaol() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 92 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 86 */                return zzagg.zzA(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzf", "zzg", zzaok.zza, "zzh", "zzi", "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzaol();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzaoj(zzarwVar);
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
                    synchronized (zzaol.class) {
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
