            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzanr extends zzagg implements zzaho {
                private static final zzanr zzb;
                private static volatile zzahv zze;
                private int zzf = 0;
                private Object zzg;

                static {
/* 3 */             zzanr zzanrVar = new zzanr();
/* 6 */             zzb = zzanrVar;
/* 10 */            zzagg.zzD(zzanr.class, zzanrVar);
                }

                private zzanr() {
                }

                public static zzanr zze() {
/* 1 */             return zzb;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzagg.zzA(zzb, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzg", "zzf", zzanp.class, zzanm.class});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzanr();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzanq(zzarwVar);
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
                    synchronized (zzanr.class) {
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

                public final boolean zzf() {
                    return this.zzf == 2;
                }
            }
