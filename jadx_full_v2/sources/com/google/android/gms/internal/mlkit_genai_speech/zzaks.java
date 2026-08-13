            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaks extends zzagg implements zzaho {
                private static final zzaks zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg = 1;
                private int zzh;
                private int zzi;

                static {
/* 3 */             zzaks zzaksVar = new zzaks();
/* 6 */             zzb = zzaksVar;
/* 10 */            zzagg.zzD(zzaks.class, zzaksVar);
                }

                private zzaks() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return zzagg.zzA(zzb, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002᠌\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"zzf", "zzg", zzakr.zza, "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzaks();
                    }
/* 12 */            zzakt zzaktVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzakq(zzaktVar);
                    }
/* 16 */            if (i2 == 5) {
/* 50 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 21 */            zzahv zzahvVar = zze;
/* 23 */            if (zzahvVar != null) {
/* 48 */                return zzahvVar;
                    }
                    synchronized (zzaks.class) {
                        try {
/* 28 */                    zzagbVar = zze;
/* 30 */                    if (zzagbVar == null) {
/* 36 */                        zzagbVar = new zzagb(zzb);
/* 39 */                        zze = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return zzagbVar;
                }
            }
