            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaji extends zzagg implements zzaho {
                private static final zzaji zzb;
                private static volatile zzahv zze;
                private int zzf;
                private Object zzh;
                private long zzi;
                private boolean zzl;
                private zzajg zzm;
                private boolean zzo;
                private int zzg = 0;
                private boolean zzj = true;
                private String zzk = "";
                private zzago zzn = zzagg.zzx();
                private int zzp = -1;

                static {
/* 3 */             zzaji zzajiVar = new zzaji();
/* 6 */             zzb = zzajiVar;
/* 10 */            zzagg.zzD(zzaji.class, zzajiVar);
                }

                private zzaji() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 102 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 96 */                return zzagg.zzA(zzb, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001ဂ\u0000\u0002:\u0000\u0003ဇ\u0001\u00044\u0000\u0006ဈ\u0002\u0007ဇ\u0003\bဉ\u0004\t\u001a\nဇ\u0005\u000bင\u0006", new Object[]{"zzh", "zzg", "zzf", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzaji();
                    }
/* 12 */            zzajj zzajjVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzajh(zzajjVar);
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
                    synchronized (zzaji.class) {
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
