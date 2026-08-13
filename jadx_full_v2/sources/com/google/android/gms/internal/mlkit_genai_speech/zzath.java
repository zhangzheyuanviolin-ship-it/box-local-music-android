            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzath extends zzagg implements zzaho {
                private static final zzath zzb;
                private static volatile zzahv zze;
                private zzagn zzf = zzagg.zzw();

                static {
/* 3 */             zzath zzathVar = new zzath();
/* 6 */             zzb = zzathVar;
/* 10 */            zzagg.zzD(zzath.class, zzathVar);
                }

                private zzath() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 81 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 75 */                return zzagg.zzA(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzath();
                    }
/* 12 */            zzatk zzatkVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzatg(zzatkVar);
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
                    synchronized (zzath.class) {
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
