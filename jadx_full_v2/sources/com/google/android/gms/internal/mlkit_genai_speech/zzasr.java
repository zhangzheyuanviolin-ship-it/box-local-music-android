            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzasr extends zzagg implements zzaho {
                private static final zzasr zzb;
                private static volatile zzahv zze;
                private int zzf;
                private String zzg = "";
                private zzago zzh = zzagg.zzx();

                static {
/* 3 */             zzasr zzasrVar = new zzasr();
/* 6 */             zzb = zzasrVar;
/* 10 */            zzagg.zzD(zzasr.class, zzasrVar);
                }

                private zzasr() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzagg.zzA(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzf", "zzg", "zzh", zzast.class});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzasr();
                    }
/* 12 */            zzatk zzatkVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzasq(zzatkVar);
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
                    synchronized (zzasr.class) {
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
