            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzj extends zzagg implements zzaho {
                private static final zzj zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzj;
                private int zzk;
                private int zzl;
                private String zzg = "";
                private boolean zzh = true;
                private zzago zzi = zzagg.zzx();
                private zzago zzm = zzagg.zzx();
                private boolean zzn = true;
                private String zzo = "";
                private String zzp = "";

                static {
/* 3 */             zzj zzjVar = new zzj();
/* 6 */             zzb = zzjVar;
/* 10 */            zzagg.zzD(zzj.class, zzjVar);
                }

                private zzj() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 104 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 98 */                return zzagg.zzA(zzb, "\u0004\n\u0000\u0001\u0003%\n\u0000\u0002\u0000\u0003င\u0002\u0004င\u0003\tဈ\u0000\fဇ\u0001\u000fင\u0004\u0011\u001a\u0017\u001b\u001eဇ\u0005$ဈ\u0006%ဈ\u0007", new Object[]{"zzf", "zzj", "zzk", "zzg", "zzh", "zzl", "zzi", "zzm", zzi.class, "zzn", "zzo", "zzp"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzj();
                    }
/* 12 */            zzk zzkVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zza(zzkVar);
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
                    synchronized (zzj.class) {
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
