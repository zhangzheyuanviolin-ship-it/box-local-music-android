            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzdj extends zzagg implements zzaho {
                private static final zzdj zzb;
                private static volatile zzahv zze;
                private int zzf;
                private zzar zzg;
                private int zzh;
                private int zzk;
                private zzbd zzl;
                private boolean zzm;
                private byte zzo = 2;
                private String zzi = "";
                private zzago zzj = zzagg.zzx();
                private String zzn = "";

                static {
/* 3 */             zzdj zzdjVar = new zzdj();
/* 6 */             zzb = zzdjVar;
/* 10 */            zzagg.zzD(zzdj.class, zzdjVar);
                }

                private zzdj() {
                }

                public static zzdi zza() {
/* 7 */             return (zzdi) zzb.zzo();
                }

                public static void zzd(zzdj zzdjVar, zzakm zzakmVar) {
/* 5 */             zzdjVar.zzh = zzakmVar.zza();
                    zzdjVar.zzf |= 2;
                }

                public static void zze(zzdj zzdjVar, zzar zzarVar) {
/* 1 */             zzarVar.getClass();
/* 4 */             zzdjVar.zzg = zzarVar;
                    zzdjVar.zzf |= 1;
                }

                public static void zzf(zzdj zzdjVar, zzbd zzbdVar) {
/* 1 */             zzbdVar.getClass();
/* 4 */             zzdjVar.zzl = zzbdVar;
                    zzdjVar.zzf |= 16;
                }

                public static void zzg(zzdj zzdjVar, String str) {
/* 1 */             str.getClass();
                    zzdjVar.zzf |= 4;
/* 10 */            zzdjVar.zzi = str;
                }

                public static void zzh(zzdj zzdjVar, zzm zzmVar) {
/* 5 */             zzdjVar.zzk = zzmVar.zza();
                    zzdjVar.zzf |= 8;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 114 */               return Byte.valueOf(this.zzo);
                    }
/* 6 */             if (i2 == 2) {
/* 107 */               return zzagg.zzA(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0001\u0001ဉ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ᐉ\u0004\u0007ဇ\u0005\bဈ\u0006", new Object[]{"zzf", "zzg", "zzh", zzakm.zzb(), "zzi", "zzj", "zzk", zzm.zzb(), "zzl", "zzm", "zzn"});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzdj();
                    }
/* 12 */            zzdq zzdqVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzdi(zzdqVar);
                    }
/* 16 */            if (i2 == 5) {
/* 58 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzo = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zze;
/* 31 */            if (zzahvVar != null) {
/* 57 */                return zzahvVar;
                    }
                    synchronized (zzdj.class) {
                        try {
/* 36 */                    zzagbVar = zze;
/* 38 */                    if (zzagbVar == null) {
/* 44 */                        zzagbVar = new zzagb(zzb);
/* 47 */                        zze = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
/* 54 */            return zzagbVar;
                }
            }
