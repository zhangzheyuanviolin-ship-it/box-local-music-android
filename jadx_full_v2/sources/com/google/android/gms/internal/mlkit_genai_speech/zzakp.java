            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzakp extends zzagg implements zzaho {
                private static final zzakp zzb;
                private static volatile zzahv zze;
                private int zzf;
                private zzafd zzg = zzafd.zza;
                private zzaks zzh;
                private long zzi;
                private int zzj;
                private int zzk;

                static {
/* 3 */             zzakp zzakpVar = new zzakp();
/* 6 */             zzb = zzakpVar;
/* 10 */            zzagg.zzD(zzakp.class, zzakpVar);
                }

                private zzakp() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return zzagg.zzA(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", zzako.zza, "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzakp();
                    }
/* 12 */            zzakt zzaktVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzakn(zzaktVar);
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
                    synchronized (zzakp.class) {
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
