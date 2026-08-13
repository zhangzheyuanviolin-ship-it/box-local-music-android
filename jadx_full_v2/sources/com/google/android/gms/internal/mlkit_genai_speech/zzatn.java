            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzatn extends zzagg implements zzaho {
                private static final zzatn zzb;
                private static volatile zzahv zze;
                private int zzf;
                private float zzg;
                private float zzh;
                private float zzi;
                private float zzj;
                private float zzk;
                private float zzl;

                static {
/* 3 */             zzatn zzatnVar = new zzatn();
/* 6 */             zzb = zzatnVar;
/* 10 */            zzagg.zzD(zzatn.class, zzatnVar);
                }

                private zzatn() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return zzagg.zzA(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzatn();
                    }
/* 12 */            zzatp zzatpVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzatm(zzatpVar);
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
                    synchronized (zzatn.class) {
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
