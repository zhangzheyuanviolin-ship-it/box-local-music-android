            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzamu extends zzagg implements zzaho {
                private static final zzamu zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg = 0;
                private Object zzh;
                private zzamw zzi;

                static {
/* 3 */             zzamu zzamuVar = new zzamu();
/* 6 */             zzb = zzamuVar;
/* 10 */            zzagg.zzD(zzamu.class, zzamuVar);
                }

                private zzamu() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 92 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 86 */                return zzagg.zzA(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000", new Object[]{"zzh", "zzg", "zzf", zzamp.class, zzams.class, "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzamu();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzamt(zzarwVar);
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
                    synchronized (zzamu.class) {
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
