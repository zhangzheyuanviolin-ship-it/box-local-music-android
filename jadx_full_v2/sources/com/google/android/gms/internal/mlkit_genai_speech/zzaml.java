            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaml extends zzagg implements zzaho {
                private static final zzaml zzb;
                private static volatile zzahv zze;
                private zzago zzf = zzagg.zzx();

                static {
/* 3 */             zzaml zzamlVar = new zzaml();
/* 6 */             zzb = zzamlVar;
/* 10 */            zzagg.zzD(zzaml.class, zzamlVar);
                }

                private zzaml() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 83 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 77 */                return zzagg.zzA(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzf", zzamj.class});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzaml();
                    }
/* 12 */            zzamm zzammVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzamh(zzammVar);
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
                    synchronized (zzaml.class) {
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
