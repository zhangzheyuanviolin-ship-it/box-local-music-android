            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaqj extends zzagg implements zzaho {
                private static final zzaqj zzb;
                private static volatile zzahv zze;
                private int zzf = 0;
                private Object zzg;

                static {
/* 3 */             zzaqj zzaqjVar = new zzaqj();
/* 6 */             zzb = zzaqjVar;
/* 10 */            zzagg.zzD(zzaqj.class, zzaqjVar);
                }

                private zzaqj() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 83 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 77 */                return zzagg.zzA(zzb, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00015\u0000\u00025\u0000", new Object[]{"zzg", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzaqj();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzaqi(zzarwVar);
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
                    synchronized (zzaqj.class) {
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
