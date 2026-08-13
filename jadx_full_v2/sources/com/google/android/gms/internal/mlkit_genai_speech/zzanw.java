            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzanw extends zzagg implements zzaho {
                private static final zzanw zzb;
                private static volatile zzahv zze;
                private int zzf;
                private float zzg;
                private float zzh;
                private int zzi;
                private float zzj;
                private float zzk;

                static {
/* 3 */             zzanw zzanwVar = new zzanw();
/* 6 */             zzb = zzanwVar;
/* 10 */            zzagg.zzD(zzanw.class, zzanwVar);
                }

                private zzanw() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return zzagg.zzA(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003᠌\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", zzanv.zza, "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzanw();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzanu(zzarwVar);
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
                    synchronized (zzanw.class) {
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
