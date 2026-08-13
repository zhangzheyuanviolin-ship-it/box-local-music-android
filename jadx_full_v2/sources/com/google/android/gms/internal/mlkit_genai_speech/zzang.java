            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzang extends zzagg implements zzaho {
                private static final zzang zzb;
                private static volatile zzahv zze;
                private int zzf;
                private boolean zzg;
                private int zzh;
                private float zzi;
                private int zzj;
                private long zzk;
                private long zzl;

                static {
/* 3 */             zzang zzangVar = new zzang();
/* 6 */             zzb = zzangVar;
/* 10 */            zzagg.zzD(zzang.class, zzangVar);
                }

                private zzang() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return zzagg.zzA(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzang();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzanf(zzarwVar);
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
                    synchronized (zzang.class) {
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
