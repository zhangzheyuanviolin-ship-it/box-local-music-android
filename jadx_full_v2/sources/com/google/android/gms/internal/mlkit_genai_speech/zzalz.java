            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzalz extends zzagg implements zzaho {
                private static final zzalz zzb;
                private static volatile zzahv zze;
                private int zzf;
                private zzaly zzg;
                private zzalw zzh;
                private String zzi = "";
                private int zzj;
                private int zzk;
                private int zzl;
                private boolean zzm;

                static {
/* 3 */             zzalz zzalzVar = new zzalz();
/* 6 */             zzb = zzalzVar;
/* 10 */            zzagg.zzD(zzalz.class, zzalzVar);
                }

                private zzalz() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 102 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 96 */                return zzagg.zzA(zzb, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဈ\u0002\u0005᠌\u0003\u0006᠌\u0004\u0007᠌\u0005\bဇ\u0006", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", zzalb.zza, "zzk", zzalc.zza, "zzl", zzald.zza, "zzm"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzalz();
                    }
/* 12 */            zzamm zzammVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzalu(zzammVar);
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
                    synchronized (zzalz.class) {
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
