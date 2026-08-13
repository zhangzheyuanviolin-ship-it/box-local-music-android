            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzfm extends zzagg implements zzaho {
                private static final zzfm zzb;
                private static volatile zzahv zze;
                private int zzf;
                private zzfu zzg;
                private zzba zzh;

                static {
/* 3 */             zzfm zzfmVar = new zzfm();
/* 6 */             zzb = zzfmVar;
/* 10 */            zzagg.zzD(zzfm.class, zzfmVar);
                }

                private zzfm() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 85 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 79 */                return zzagg.zzA(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzfm();
                    }
/* 12 */            zzfl zzflVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzfk(zzflVar);
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
                    synchronized (zzfm.class) {
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
