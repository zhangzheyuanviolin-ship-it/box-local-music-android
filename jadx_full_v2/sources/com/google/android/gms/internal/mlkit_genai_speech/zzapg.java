            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzapg extends zzagg implements zzaho {
                private static final zzapg zzb;
                private static volatile zzahv zze;
                private int zzf;
                private float zzi;
                private boolean zzj;
                private zzatq zzk;
                private boolean zzl;
                private boolean zzn;
                private String zzg = "";
                private String zzh = "";
                private String zzm = "";

                static {
/* 3 */             zzapg zzapgVar = new zzapg();
/* 6 */             zzb = zzapgVar;
/* 10 */            zzagg.zzD(zzapg.class, zzapgVar);
                }

                private zzapg() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 98 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 92 */                return zzagg.zzA(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzapg();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzapf(zzarwVar);
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
                    synchronized (zzapg.class) {
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
