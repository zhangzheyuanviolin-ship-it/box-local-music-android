            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzamy extends zzagg implements zzaho {
                private static final zzamy zzb;
                private static volatile zzahv zze;
                private int zzf;
                private boolean zzg;
                private boolean zzh;
                private zzang zzi;
                private zzagl zzj = zzagg.zzu();
                private zzagl zzk = zzagg.zzu();
                private zzagl zzl = zzagg.zzu();
                private int zzm;
                private float zzn;

                static {
/* 3 */             zzamy zzamyVar = new zzamy();
/* 6 */             zzb = zzamyVar;
/* 10 */            zzagg.zzD(zzamy.class, zzamyVar);
                }

                private zzamy() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 98 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 92 */                return zzagg.zzA(zzb, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0003\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004$\u0005$\u0006$\bင\u0003\tခ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzamy();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzamx(zzarwVar);
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
                    synchronized (zzamy.class) {
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
