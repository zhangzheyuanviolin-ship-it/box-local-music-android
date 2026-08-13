            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzag extends zzagg implements zzaho {
                private static final zzag zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private int zzh;
                private int zzi = 2;
                private boolean zzj = true;
                private boolean zzk;

                static {
/* 3 */             zzag zzagVar = new zzag();
/* 6 */             zzb = zzagVar;
/* 10 */            zzagg.zzD(zzag.class, zzagVar);
                }

                private zzag() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 92 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 86 */                return zzagg.zzA(zzb, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0004ဇ\u0003\u0005င\u0002\u0006ဇ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzj", "zzi", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzag();
                    }
/* 12 */            zzaf zzafVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzae(zzafVar);
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
                    synchronized (zzag.class) {
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
