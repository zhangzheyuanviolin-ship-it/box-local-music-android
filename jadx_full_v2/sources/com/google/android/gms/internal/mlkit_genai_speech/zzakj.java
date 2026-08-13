            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzakj extends zzagd implements zzaho {
                private static final zzakj zze;
                private static volatile zzahv zzf;
                private int zzg;
                private int zzh;
                private boolean zzi;
                private byte zzl = 2;
                private String zzj = "";
                private String zzk = "";

                static {
/* 3 */             zzakj zzakjVar = new zzakj();
/* 6 */             zze = zzakjVar;
/* 10 */            zzagg.zzD(zzakj.class, zzakjVar);
                }

                private zzakj() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 97 */                return Byte.valueOf(this.zzl);
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return zzagg.zzA(zze, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဈ\u0002\u0002ဈ\u0003\u0004င\u0000\u0007ဇ\u0001", new Object[]{"zzg", "zzj", "zzk", "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 68 */                return new zzakj();
                    }
/* 12 */            zzakk zzakkVar = null;
/* 13 */            if (i2 == 4) {
/* 62 */                return new zzaki(zzakkVar);
                    }
/* 16 */            if (i2 == 5) {
/* 57 */                return zze;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzl = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zzf;
/* 31 */            if (zzahvVar != null) {
/* 56 */                return zzahvVar;
                    }
                    synchronized (zzakj.class) {
                        try {
/* 36 */                    zzagbVar = zzf;
/* 38 */                    if (zzagbVar == null) {
/* 44 */                        zzagbVar = new zzagb(zze);
/* 47 */                        zzf = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 53 */            return zzagbVar;
                }
            }
