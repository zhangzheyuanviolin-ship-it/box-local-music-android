            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzalo extends zzagg implements zzaho {
                private static final zzalo zzb;
                private static volatile zzahv zze;
                private int zzf;
                private long zzg;
                private zzahh zzh = zzahh.zza();

                static {
/* 3 */             zzalo zzaloVar = new zzalo();
/* 6 */             zzb = zzaloVar;
/* 10 */            zzagg.zzD(zzalo.class, zzaloVar);
                }

                private zzalo() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzagg.zzA(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဂ\u0000\u00022", new Object[]{"zzf", "zzg", "zzh", zzaln.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzalo();
                    }
/* 12 */            zzamm zzammVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzalm(zzammVar);
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
                    synchronized (zzalo.class) {
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
