            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzakg extends zzagg implements zzaho {
                private static final zzakg zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private zzago zzh = zzagg.zzx();
                private boolean zzi;

                static {
/* 3 */             zzakg zzakgVar = new zzakg();
/* 6 */             zzb = zzakgVar;
/* 10 */            zzagg.zzD(zzakg.class, zzakgVar);
                }

                private zzakg() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return zzagg.zzA(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzf", "zzg", "zzh", zzake.class, "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzakg();
                    }
/* 12 */            zzakh zzakhVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzakf(zzakhVar);
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
                    synchronized (zzakg.class) {
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
