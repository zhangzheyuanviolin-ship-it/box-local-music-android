            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzfs extends zzagg implements zzaho {
                private static final zzfs zzb;
                private static volatile zzahv zze;
                private int zzf;
                private String zzg = "";
                private String zzh = "";

                static {
/* 3 */             zzfs zzfsVar = new zzfs();
/* 6 */             zzb = zzfsVar;
/* 10 */            zzagg.zzD(zzfs.class, zzfsVar);
                }

                private zzfs() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 85 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 79 */                return zzagg.zzA(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzfs();
                    }
/* 12 */            zzft zzftVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzfr(zzftVar);
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
                    synchronized (zzfs.class) {
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
