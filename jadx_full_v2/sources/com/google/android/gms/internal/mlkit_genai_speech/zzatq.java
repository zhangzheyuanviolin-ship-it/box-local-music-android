            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzatq extends zzagg implements zzaho {
                private static final zzatq zzb;
                private static volatile zzahv zze;
                private int zzf;
                private boolean zzg;
                private int zzh;
                private int zzi;
                private int zzj;
                private zzatn zzk;
                private boolean zzl;

                static {
/* 3 */             zzatq zzatqVar = new zzatq();
/* 6 */             zzb = zzatqVar;
/* 10 */            zzagg.zzD(zzatq.class, zzatqVar);
                }

                private zzatq() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 96 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return zzagg.zzA(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဇ\u0005", new Object[]{"zzf", "zzg", "zzh", zzato.zza, "zzi", "zzj", "zzk", "zzl"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzatq();
                    }
/* 12 */            zzatp zzatpVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzatl(zzatpVar);
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
                    synchronized (zzatq.class) {
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
