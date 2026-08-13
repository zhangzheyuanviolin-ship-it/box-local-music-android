            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzapi extends zzagg implements zzaho {
                private static final zzapi zzb;
                private static volatile zzahv zze;
                private int zzf;
                private zzapg zzg;
                private zzaqt zzh;
                private zzarm zzi;
                private zzapk zzj;
                private int zzk;
                private zzagm zzl = zzagg.zzv();

                static {
/* 3 */             zzapi zzapiVar = new zzapi();
/* 6 */             zzb = zzapiVar;
/* 10 */            zzagg.zzD(zzapi.class, zzapiVar);
                }

                private zzapi() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 96 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return zzagg.zzA(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ࠞ", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzamn.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzapi();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzaph(zzarwVar);
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
                    synchronized (zzapi.class) {
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
