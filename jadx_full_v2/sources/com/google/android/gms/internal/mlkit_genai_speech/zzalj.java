            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzalj extends zzagg implements zzaho {
                private static final zzalj zzb;
                private static volatile zzahv zze;
                private zzago zzf = zzagg.zzx();
                private zzago zzg = zzagg.zzx();
                private zzago zzh = zzagg.zzx();

                static {
/* 3 */             zzalj zzaljVar = new zzalj();
/* 6 */             zzb = zzaljVar;
/* 10 */            zzagg.zzD(zzalj.class, zzaljVar);
                }

                private zzalj() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 92 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 86 */                return zzagg.zzA(zzb, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"zzf", zzalt.class, "zzg", zzall.class, "zzh", zzame.class});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzalj();
                    }
/* 12 */            zzamm zzammVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzali(zzammVar);
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
                    synchronized (zzalj.class) {
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
