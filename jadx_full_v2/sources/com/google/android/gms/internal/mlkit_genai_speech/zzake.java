            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzake extends zzagg implements zzaho {
                private static final zzake zzb;
                private static volatile zzahv zze;
                private int zzf;
                private Object zzh;
                private int zzg = 0;
                private String zzi = "";

                static {
/* 3 */             zzake zzakeVar = new zzake();
/* 6 */             zzb = zzakeVar;
/* 10 */            zzagg.zzD(zzake.class, zzakeVar);
                }

                private zzake() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 91 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 85 */                return zzagg.zzA(zzb, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzh", "zzg", "zzf", "zzi", zzajd.class, zzajd.class});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzake();
                    }
/* 12 */            zzakh zzakhVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzakd(zzakhVar);
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
                    synchronized (zzake.class) {
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
