            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzarz extends zzagd implements zzaho {
                private static final zzarz zze;
                private static volatile zzahv zzf;
                private int zzg;
                private int zzh;
                private boolean zzi;
                private int zzj;
                private byte zzl = 2;
                private String zzk = "";

                static {
/* 3 */             zzarz zzarzVar = new zzarz();
/* 6 */             zze = zzarzVar;
/* 10 */            zzagg.zzD(zzarz.class, zzarzVar);
                }

                private zzarz() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 102 */               return Byte.valueOf(this.zzl);
                    }
/* 6 */             if (i2 == 2) {
/* 95 */                return zzagg.zzA(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဈ\u0003", new Object[]{"zzg", "zzh", zzasa.zza, "zzi", "zzj", zzary.zza, "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzarz();
                    }
/* 12 */            zzasj zzasjVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzarx(zzasjVar);
                    }
/* 16 */            if (i2 == 5) {
/* 58 */                return zze;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzl = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zzf;
/* 31 */            if (zzahvVar != null) {
/* 57 */                return zzahvVar;
                    }
                    synchronized (zzarz.class) {
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
