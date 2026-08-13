            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzame extends zzagg implements zzaho {
                private static final zzame zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private zzalz zzh;
                private zzalo zzi;
                private zzalh zzj;
                private zzafd zzk;
                private zzafd zzl;

                static {
/* 3 */             zzame zzameVar = new zzame();
/* 6 */             zzb = zzameVar;
/* 10 */            zzagg.zzD(zzame.class, zzameVar);
                }

                private zzame() {
/* 4 */             zzafd zzafdVar = zzafd.zza;
/* 6 */             this.zzk = zzafdVar;
/* 8 */             this.zzl = zzafdVar;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 96 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return zzagg.zzA(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ည\u0004\u0006ည\u0005", new Object[]{"zzf", "zzg", zzamd.zza, "zzh", "zzi", "zzj", "zzk", "zzl"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzame();
                    }
/* 12 */            zzamm zzammVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzamc(zzammVar);
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
                    synchronized (zzame.class) {
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
