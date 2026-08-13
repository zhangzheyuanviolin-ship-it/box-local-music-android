            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaql extends zzagd implements zzaho {
                private static final zzaql zze;
                private static volatile zzahv zzf;
                private int zzg;
                private zzarm zzj;
                private zzart zzk;
                private zzanj zzl;
                private byte zzm = 2;
                private zzago zzh = zzagg.zzx();
                private zzago zzi = zzagg.zzx();

                static {
/* 3 */             zzaql zzaqlVar = new zzaql();
/* 6 */             zze = zzaqlVar;
/* 10 */            zzagg.zzD(zzaql.class, zzaqlVar);
                }

                private zzaql() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 102 */               return Byte.valueOf(this.zzm);
                    }
/* 6 */             if (i2 == 2) {
/* 95 */                return zzagg.zzA(zze, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0001\u0001\u001a\u0002ဉ\u0000\u0003ဉ\u0001\u0004Л\u0006ဉ\u0002", new Object[]{"zzg", "zzh", "zzj", "zzk", "zzi", zzapr.class, "zzl"});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzaql();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzaqk(zzarwVar);
                    }
/* 16 */            if (i2 == 5) {
/* 58 */                return zze;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzm = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zzf;
/* 31 */            if (zzahvVar != null) {
/* 57 */                return zzahvVar;
                    }
                    synchronized (zzaql.class) {
                        try {
/* 36 */                    zzagbVar = zzf;
/* 38 */                    if (zzagbVar == null) {
/* 44 */                        zzagbVar = new zzagb(zze);
/* 47 */                        zzf = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
/* 54 */            return zzagbVar;
                }
            }
