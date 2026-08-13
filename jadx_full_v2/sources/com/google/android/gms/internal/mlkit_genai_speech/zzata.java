            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzata extends zzagg implements zzaho {
                private static final zzata zzb;
                private static volatile zzahv zze;
                private int zzf = 0;
                private Object zzg;

                static {
/* 3 */             zzata zzataVar = new zzata();
/* 6 */             zzb = zzataVar;
/* 10 */            zzagg.zzD(zzata.class, zzataVar);
                }

                private zzata() {
                }

                public static zzata zze() {
/* 1 */             return zzb;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return zzagg.zzA(zzb, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzg", "zzf", zzaso.class, zzatf.class, zzath.class});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzata();
                    }
/* 12 */            zzatk zzatkVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzasz(zzatkVar);
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
                    synchronized (zzata.class) {
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
