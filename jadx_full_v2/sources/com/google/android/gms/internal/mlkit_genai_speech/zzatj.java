            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzatj extends zzagd implements zzaho {
                private static final zzatj zze;
                private static volatile zzahv zzf;
                private int zzg;
                private zzatd zzi;
                private zzakg zzl;
                private zzakb zzm;
                private boolean zzn;
                private byte zzo = 2;
                private zzago zzh = zzagg.zzx();
                private String zzj = "";
                private zzago zzk = zzagg.zzx();

                static {
/* 3 */             zzatj zzatjVar = new zzatj();
/* 6 */             zze = zzatjVar;
/* 10 */            zzagg.zzD(zzatj.class, zzatjVar);
                }

                private zzatj() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 106 */               return Byte.valueOf(this.zzo);
                    }
/* 6 */             if (i2 == 2) {
/* 99 */                return zzagg.zzA(zze, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0001\u0004\u001a\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဇ\u0004", new Object[]{"zzg", "zzh", zzasy.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzatj();
                    }
/* 12 */            zzatk zzatkVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzati(zzatkVar);
                    }
/* 16 */            if (i2 == 5) {
/* 58 */                return zze;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzo = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zzf;
/* 31 */            if (zzahvVar != null) {
/* 57 */                return zzahvVar;
                    }
                    synchronized (zzatj.class) {
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
