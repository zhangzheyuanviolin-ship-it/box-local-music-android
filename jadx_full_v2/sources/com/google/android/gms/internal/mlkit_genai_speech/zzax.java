            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzax extends zzagg implements zzaho {
                private static final zzax zzb;
                private static volatile zzahv zze;
                private int zzf;
                private boolean zzg;
                private int zzh;
                private int zzi = 2;
                private int zzj = 2;
                private int zzk;
                private int zzl;

                static {
/* 3 */             zzax zzaxVar = new zzax();
/* 6 */             zzb = zzaxVar;
/* 10 */            zzagg.zzD(zzax.class, zzaxVar);
                }

                private zzax() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 100 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 94 */                return zzagg.zzA(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zzf", "zzg", "zzh", zzau.zza, "zzi", "zzj", "zzk", zzav.zza, "zzl", zzat.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzax();
                    }
/* 12 */            zzaw zzawVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzas(zzawVar);
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
                    synchronized (zzax.class) {
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
