            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzasd extends zzagg implements zzaho {
                private static final zzasd zzb;
                private static volatile zzahv zze;
                private int zzf;
                private zzahh zzg = zzahh.zza();
                private String zzh = "";

                static {
/* 3 */             zzasd zzasdVar = new zzasd();
/* 6 */             zzb = zzasdVar;
/* 10 */            zzagg.zzD(zzasd.class, zzasdVar);
                }

                private zzasd() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzagg.zzA(zzb, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0001\u0000\u0000\u00032\u0004ဈ\u0000", new Object[]{"zzf", "zzg", zzasc.zza, "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzasd();
                    }
/* 12 */            zzasj zzasjVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzasb(zzasjVar);
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
                    synchronized (zzasd.class) {
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
