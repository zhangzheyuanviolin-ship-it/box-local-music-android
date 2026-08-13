            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzane extends zzagg implements zzaho {
                private static final zzane zzb;
                private static volatile zzahv zze;
                private int zzf;
                private boolean zzg;
                private boolean zzh;
                private boolean zzi;
                private float zzj;
                private long zzk;
                private long zzl;
                private long zzm;
                private long zzn;
                private long zzo;
                private String zzp = "";
                private zzanb zzq;
                private boolean zzr;
                private zzand zzs;

                static {
/* 3 */             zzane zzaneVar = new zzane();
/* 6 */             zzb = zzaneVar;
/* 10 */            zzagg.zzD(zzane.class, zzaneVar);
                }

                private zzane() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 108 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 102 */               return zzagg.zzA(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဈ\t\u000bဉ\n\fဇ\u000b\rဉ\f", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzane();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzamz(zzarwVar);
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
                    synchronized (zzane.class) {
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
